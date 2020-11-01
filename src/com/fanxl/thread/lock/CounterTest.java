package com.fanxl.thread.lock;

/**
 * @description
 * @author: fanxl
 * @date: 2020/11/1 0001 15:26
 */
public class CounterTest {

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i=0; i<100; i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {
                    counter.incr();
                }
            };
            thread.start();
        }
    }
}
