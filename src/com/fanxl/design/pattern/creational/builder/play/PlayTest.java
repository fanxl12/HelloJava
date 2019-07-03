package com.fanxl.design.pattern.creational.builder.play;

import com.fanxl.design.pattern.creational.builder.play.v2.VideoV2Builder;
import com.fanxl.design.pattern.creational.builder.play.v2.VideoV2Play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 15:01
 */
public class PlayTest {

    public static void main(String[] args) {
        VideoBuilder videoBuilder = new CompleteModeBuilder();
        VideoController videoController = new VideoController();
        VideoPlay videoPlay = videoController.build(videoBuilder);

        VideoV2Play videoV2Play = new VideoV2Builder().showMenu(true)
                .showControl(false)
                .showCollection(true)
                .showList(false)
                .showMain(true)
                .build();
    }
}
