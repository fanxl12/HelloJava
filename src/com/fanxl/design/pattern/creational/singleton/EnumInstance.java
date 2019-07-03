package com.fanxl.design.pattern.creational.singleton;

/**
 * @description 枚举类型的单例
 * 天然的支持序列化和反序列一致，天然的不能反射，从而解决反射攻击, 天然的支持多线程
 * @author: fanxl
 * @date: 2019/2/17 0017 12:23
 */
public enum  EnumInstance {

    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("print test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
