package com.fanxl.design.pattern.creational.builder.play.v2;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 15:13
 */
public class VideoV2Builder {

    /**
     * 是否显示菜单
     */
    private boolean showMenu;

    /**
     * 是否显示播放列表
     */
    private boolean showList;

    /**
     * 是否显示主窗口
     */
    private boolean showMain;

    /**
     * 是否显示控制条
     */
    private boolean showControl;

    /**
     * 是否显示收藏列表
     */
    private boolean showCollection;

    public VideoV2Builder showMenu(boolean showMenu) {
        this.showMenu = showMenu;
        return this;
    }

    public VideoV2Builder showList(boolean showList) {
        this.showList = showList;
        return this;
    }

    public VideoV2Builder showMain(boolean showMain) {
        this.showMain = showMain;
        return this;
    }

    public VideoV2Builder showControl(boolean showControl) {
        this.showControl = showControl;
        return this;
    }

    public VideoV2Builder showCollection(boolean showCollection) {
        this.showCollection = showCollection;
        return this;
    }

    public VideoV2Play build() {
        VideoV2Play videoV2Play = new VideoV2Play();
        videoV2Play.setShowMenu(showMenu);
        videoV2Play.setShowList(showList);
        videoV2Play.setShowMain(showMain);
        videoV2Play.setShowControl(showControl);
        videoV2Play.setShowCollection(showCollection);
        return videoV2Play;
    }



}
