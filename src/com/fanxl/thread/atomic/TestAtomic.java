package com.fanxl.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * java.util.concurrent.atomic：线程安全的原子操作包
 */
public class TestAtomic {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        // 进行atomicInteger的原子化操作：增加1并且获取这个增加后的新值
        atomicInteger.incrementAndGet();
    }

}
