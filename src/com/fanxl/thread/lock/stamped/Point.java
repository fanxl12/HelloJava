package com.fanxl.thread.lock.stamped;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock提供了乐观读锁，可取代ReadWriteLock以进一步提升并发性能
 * StampedLock是不可重入锁
 * **/
public class Point {

    private final StampedLock stampedLock = new StampedLock();

    private double x;

    private double y;

    public void move(double mX, double mY) {
        // 获取写锁
        long version = stampedLock.writeLock();
        try {
            x += mX;
            y += mY;
        }finally {
            stampedLock.unlock(version);
        }
    }

    public double distanceFromOrigin() {
        // 获取一个乐观读锁
        long version = stampedLock.tryOptimisticRead();
        // 注意下面两行代码不是原子操作
        // 假设x,y = (100,200)
        double currentX = x;
        // 此处已读取到x=100，但x,y可能被写线程修改为(300,400)
        double currentY = y;
        // 此处已读取到y，如果没有写入，读取是正确的(100,200)
        // 如果有写入，读取是错误的(100,400)
        // 检查乐观读锁后是否有其他写锁发生
        if (!stampedLock.validate(version)) {
            // 获取一个悲观读锁
            version = stampedLock.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                // 释放悲观读锁
                stampedLock.unlockRead(version);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }

}
