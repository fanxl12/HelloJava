package com.fanxl.design.pattern.behavior.duty;

public class Request implements IRequest{

    /**
     * 难度级别1--初级工程师解决
     * 难度级别2--中级工程师解决
     * 难度级别3--高级工程师解决
     */
    private int level;

    // 要请求的内容或要解决的问题
    private String request = "";

    Request(int _level, String _request) {
        this.level = _level;
        switch (this.level) {
            case 1:
                this.request = "难度级别为1的请求是：" + _request;
                break;
            case 2:
                this.request = "难度级别为2的请求是：" + _request;
                break;
            case 3:
                this.request = "难度级别为3的请求是：" + _request;
                break;
        }
    }


    @Override
    public int getRequestLevel() {
        return this.level;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
