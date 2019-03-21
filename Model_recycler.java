package com.example.faizanmalik.sjbxsj.Model;

public class Model_recycler {

    private int img;
    private String name,desc;

    public Model_recycler(int img, String name, String desc) {
        this.img = img;
        this.name = name;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
