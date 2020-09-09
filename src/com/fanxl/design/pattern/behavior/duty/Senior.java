package com.fanxl.design.pattern.behavior.duty;

public class Senior extends Handler {
    // 高级工程师可以处理难度级别为3的请求
    Senior() {
        super(Handler.Difficulty_LEVEL_3_REQUEST);
    }

    // 处理结果
    @Override
    protected void response(IRequest request) {
        System.out.println("--------难度级别为3的请求-------");
        System.out.println(request.getRequest());
        System.out.println("高级工程师处理结果: 已处理\n");
    }
}