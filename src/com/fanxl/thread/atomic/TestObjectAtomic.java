package com.fanxl.thread.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class TestObjectAtomic {

    public static void main(String[] args) {
        Student student = new Student("范饭", 120);
        AtomicReference<Student> ref = new AtomicReference<>(student);

        student = new Student("yinwenjie" , 70);
        Student oldStudent = ref.getAndSet(student);

        System.out.println(student + "和" + oldStudent + "是两个对象");
        System.out.println("AtomicReference保证了赋值时的原子操作性");
    }

}
