package com.fanxl.group;

public class GroupIndex {

    private int start;

    private int end;

    public int getNumber() {
        return end - start;
    }

    public GroupIndex(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
