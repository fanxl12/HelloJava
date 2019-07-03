package com.fanxl.design.pattern.creational.builder.play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 14:54
 */
public class CompleteModeBuilder extends VideoBuilder {


    @Override
    public void showMenu() {
        videoPlay.setShowMenu(true);
    }

    @Override
    public void showList() {
        videoPlay.setShowList(true);
    }

    @Override
    public void showMain() {
        videoPlay.setShowMain(true);
    }

    @Override
    public void showControl() {
        videoPlay.setShowControl(true);
    }

    @Override
    public void showCollection() {
        videoPlay.setShowCollection(true);
    }
}
