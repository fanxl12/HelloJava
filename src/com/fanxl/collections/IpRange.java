package com.fanxl.collections;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/20 9:28
 */
public class IpRange {

    private Integer start;

    private Integer end;

    public IpRange(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
