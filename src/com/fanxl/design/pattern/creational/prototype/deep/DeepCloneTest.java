package com.fanxl.design.pattern.creational.prototype.deep;

import java.io.IOException;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 10:45
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        WeeklyLog weeklyLog = new WeeklyLog();
        Attachment attachment = new Attachment();
        attachment.setName("my-test.txt");
        weeklyLog.setAttachment(attachment);

        try {
            WeeklyLog weeklyLog1 = weeklyLog.deepClone();
            System.out.println(weeklyLog == weeklyLog1);
            System.out.println(weeklyLog.getAttachment() == weeklyLog1.getAttachment());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
