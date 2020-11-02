package com.fanxl.thread.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture 可以通过回调形式获取异步的结果
 * **/
public class SimpleUse {

    public static void main(String[] args) throws Exception {
        // 创建异步执行任务
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(SimpleUse::fetchPrice);
        // 如果成功
        cf.thenAccept(result -> {
            System.out.print("price:" + result);
        });
        // 如果异常了
        cf.exceptionally(throwable -> {
            throwable.fillInStackTrace();
            return (double) 0;
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(200);
    }

    static Double fetchPrice() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }

}
