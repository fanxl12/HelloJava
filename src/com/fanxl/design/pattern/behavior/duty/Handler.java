package com.fanxl.design.pattern.behavior.duty;

public abstract class Handler {

    final static int Difficulty_LEVEL_1_REQUEST = 1; // 难度级别为1

    final static int Difficulty_LEVEL_2_REQUEST = 2; // 难度级别为2

    final static int Difficulty_LEVEL_3_REQUEST = 3; // 难度级别为3

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个责任人是谁
    protected Handler nextHandler;

    // 每个类都要说明一下自己能处理哪些请求
    Handler(int level) {
        this.level = level;
    }

    // 负责Request的请求处理，final关键字声明不允许被子类覆盖
    final void handleMessage(IRequest iRequest) {
        if (iRequest.getRequestLevel() <= level) {
            response(iRequest);
        } else {
            if (nextHandler != null) {
                nextHandler.handleMessage(iRequest);
            } else {
                System.out.println("--------难度级别为" + iRequest.getRequestLevel() + "的请求-------");
                System.out.println("---抱歉，没有工程师可以处理---\n");
            }
        }
    }

    /*
     * 如果不属于你处理的请求，你应该让请求路由到下一个环节的责任人
     */
    void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 有请示那当然要回应
    protected abstract void response(IRequest request);

}
