package com.fanxl.design.pattern.behavior.duty;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<IRequest> arrayList = new ArrayList<>();
        arrayList.add(new Request(Handler.Difficulty_LEVEL_1_REQUEST, "1+1=？"));
        arrayList.add(new Request(Handler.Difficulty_LEVEL_2_REQUEST, "3*4=？"));
        arrayList.add(new Request(Handler.Difficulty_LEVEL_3_REQUEST, "87834*765=？"));
        arrayList.add(new Request(4, "765343/767*232=？"));
        // 定义三个责任人对象
        Handler primary = new Primary();
        Handler middle = new Middle();
        Handler senior = new Senior();
        // 设置链的调用顺序
        primary.setNextHandler(middle);
        middle.setNextHandler(senior);
        for (IRequest request : arrayList) {
            // 责任链中处理该请求
            primary.handleMessage(request);
        }
    }

}
