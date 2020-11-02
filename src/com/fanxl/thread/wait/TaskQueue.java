package com.fanxl.thread.wait;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 使用Lock实现的一版
 * {@link com.fanxl.thread.lock.TaskQueueCondition}
 * **/
public class TaskQueue {

    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String task) {
        queue.add(task);
        // 将唤醒所有当前正在this锁等待的线程
        this.notifyAll();
        // notify()只会唤醒其中一个（具体哪个依赖操作系统，有一定的随机性）
//        this.notify();
    }

    public synchronized String getTask() {
        while (queue.isEmpty()) {
            try {
                // 当队列是空的，如果没有wait，就会执行死循环，
                // 线程会在getTask()中因为死循环而100%占用CPU资源
                // wait()方法必须在当前获取的锁对象上调用
                // 调用wait()方法后，线程进入等待状态，并且会释放锁
                // 注意 wait()方法返回时需要重新获得this锁，线程重新竞争
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.remove();
    }

}
