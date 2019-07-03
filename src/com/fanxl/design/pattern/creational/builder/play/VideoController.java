package com.fanxl.design.pattern.creational.builder.play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 14:59
 */
public class VideoController {

    public VideoPlay build(VideoBuilder builder) {
        builder.showMenu();
        builder.showList();
        builder.showMain();
        builder.showControl();
        builder.showCollection();
        return builder.createVideoPlay();
    }

}
