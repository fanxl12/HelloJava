package com.fanxl.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description lock的基本使用
 * @author: fanxl
 * @date: 2020/11/1 0001 15:23
 */
public class Counter {

    private Lock lock = new ReentrantLock();

    private volatile int count;

    public void incr() {
        lock.lock();
        try {
            count += 1;
            System.out.println("结果:" + count);
        }catch (Exception e){
            e.fillInStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

}
