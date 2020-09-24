package com.fanxl.design.pattern.behavior.duty;

public class Middle extends Handler {
    // 中级工程师可以处理难度等级为2的请求
    Middle() {
        super(Handler.Difficulty_LEVEL_2_REQUEST);
    }

    // 处理结果
    @Override
    protected void response(IRequest request) {
        System.out.println("--------难度级别为2的请求-------");
        System.out.println(request.getRequest());
        System.out.println("中级工程师处理结果: 已处理\n");
    }
}