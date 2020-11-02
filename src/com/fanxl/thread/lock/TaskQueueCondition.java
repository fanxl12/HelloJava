package com.fanxl.thread.lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskQueueCondition {

    Lock lock = new ReentrantLock();

    Condition condition = lock.newCondition();

    Queue<String> queue = new LinkedList<>();

    public void addTask(String task) {
        lock.lock();
        try {
            queue.add(task);
            // signalAll() 将唤醒所有当前正在this锁等待的线程
            condition.signalAll();
            // signal()只会唤醒其中一个（具体哪个依赖操作系统，有一定的随机性）
            condition.signal();
        }catch (Exception e) {
            e.fillInStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public String getTask() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                condition.await();

//                if (condition.await(1, TimeUnit.SECONDS)) {
//                    // 被其他线程唤醒
//                } else {
//                    //在指定的时间内没有被唤醒，可以自己醒来
//                }
            }
        }catch (Exception e) {
            e.fillInStackTrace();
        }finally {
            lock.unlock();
        }
        return queue.remove();
    }

}
