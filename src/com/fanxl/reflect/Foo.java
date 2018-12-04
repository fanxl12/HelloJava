package com.fanxl.reflect;

class Foo {

    private String name;

    public Foo() {

    }

    public Foo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}