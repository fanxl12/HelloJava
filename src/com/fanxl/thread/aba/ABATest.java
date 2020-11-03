package com.fanxl.thread.aba;

import java.util.concurrent.atomic.AtomicReference;

public class ABATest {

    private static final String A = "A";

    private static final String B = "B";

    private static final AtomicReference<String> ar = new AtomicReference<>(A);

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(Math.abs((int) (Math.random() * 100)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ar.compareAndSet(A, B)) {
                System.out.println("我是线程1,我成功将A改成了B");
            }
        }).start();

        new Thread(() -> {
            if (ar.compareAndSet(A, B)) {
                System.out.println("我是线程2,我成功将A改成了B");
            }
        }).start();

        new Thread(() -> {
            if (ar.compareAndSet(B,A)) {
                System.out.println("我是线程3,我成功将B改成了A");
            }
        }).start();
    }

}
