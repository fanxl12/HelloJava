package com.fanxl.design.pattern.creational.builder.play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 14:47
 */
public abstract class VideoBuilder {

    protected VideoPlay videoPlay = new VideoPlay();

    public abstract void showMenu();

    public abstract void showList();

    public abstract void showMain();

    public abstract void showControl();

    public abstract void showCollection();

    public VideoPlay createVideoPlay() {
        return videoPlay;
    }

}
