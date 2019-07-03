package com.fanxl.design.pattern.creational.builder.play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 14:54
 */
public class SimpleModeBuilder extends VideoBuilder {


    @Override
    public void showMenu() {
        videoPlay.setShowMenu(false);
    }

    @Override
    public void showList() {
        videoPlay.setShowList(false);
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
        videoPlay.setShowCollection(false);
    }
}
