package com.fanxl.annotation;

/**
 * @author fanxl12
 * @description
 * @date 2020/1/18 16:27
 */
@Table("person")
public class Person {

    @Column("name")
    private String name;

    @Column("age")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
