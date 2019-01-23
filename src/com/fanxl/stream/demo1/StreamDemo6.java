package com.fanxl.stream.demo1;


import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2019/1/14 0014 22:59
 */
public class StreamDemo6 {

    public static void main(String[] args) {

        List<Student> last = new ArrayList<>();
        for (int i=0 ;  i< 10000; i++) {
            last.add(new Student("s" + i, i +1, i % 2 ==0 ? Gender.FEMALE : Gender.MALE, Grade.ONE));
        }

        List<Student> list = new ArrayList<>();
        for (int i=100 ;  i< 200; i++) {
            list.add(new Student("s" + i, i + 10, i % 2 ==0 ? Gender.FEMALE : Gender.MALE, Grade.ONE));
        }
        long start = System.currentTimeMillis();

        List<Student> dataList = new ArrayList<>();
        for (Student parent: list) {
            for (Student child : last) {
                if (child.getName().equalsIgnoreCase(parent.getName())) {
                    parent.setAge(10);
                    dataList.add(parent);
                    System.out.println(Thread.currentThread().getName() + "---" + parent.getName());
                    break;
                }
            }
        }

//        ForkJoinPool pool = new ForkJoinPool(20);
//        pool.submit(() -> {
//
//        });
//
//        pool.shutdown();

//        List<Student> dataList = list.stream().parallel().peek(item -> {
//
//            for (Student student : last) {
//                if (student.getName().equalsIgnoreCase(item.getName())) {
//                    System.out.println(Thread.currentThread().getName() + "---" + item.getName());
//                    item.setAge(10);
//                    break;
//                }
//            }
//
//        }).collect(Collectors.toList());

//        for (Student item : dataList) {
//            System.out.println(item.toString());
//        }

        long end = System.currentTimeMillis();

        System.out.println("time:" + (end - start));


    }



}
