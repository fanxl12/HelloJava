package com.fanxl.design.pattern.creational.builder.play;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/3 14:42
 */
public class VideoPlay {

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

    public boolean isShowMenu() {
        return showMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public boolean isShowList() {
        return showList;
    }

    public void setShowList(boolean showList) {
        this.showList = showList;
    }

    public boolean isShowMain() {
        return showMain;
    }

    public void setShowMain(boolean showMain) {
        this.showMain = showMain;
    }

    public boolean isShowControl() {
        return showControl;
    }

    public void setShowControl(boolean showControl) {
        this.showControl = showControl;
    }

    public boolean isShowCollection() {
        return showCollection;
    }

    public void setShowCollection(boolean showCollection) {
        this.showCollection = showCollection;
    }
}
