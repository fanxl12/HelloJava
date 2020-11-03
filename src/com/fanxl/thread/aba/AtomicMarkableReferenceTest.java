package com.fanxl.thread.aba;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicMarkableReferenceTest {

    private static final String A = "A";

    private static final String B = "B";

    private static final AtomicMarkableReference<String> ar = new AtomicMarkableReference<>(A, false);

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(Math.abs((int) (Math.random() * 100)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ar.compareAndSet(A, B, false, true)) {
                System.out.println("我是线程1,我成功将A改成了B");
            } else {
                System.out.println("我是线程1,数据已修改,不能被更新");
            }
        }).start();

        new Thread(() -> {
            if (ar.compareAndSet(A, B, false, true)) {
                System.out.println("我是线程2,我成功将A改成了B");
            }
        }).start();

        new Thread(() -> {
            if (ar.compareAndSet(B, A, ar.isMarked(), true)) {
                System.out.println("我是线程3,我成功将B改成了A");
            }
        }).start();
    }


}
