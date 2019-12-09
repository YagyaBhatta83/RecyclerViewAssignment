package com.yagya.recyclerviewassignment;

public class Telegram {
    private String name;
    private String message;
    private  int time;
    private int imageId;

    //Constructor

    public Telegram(String name, String message, int time, int imageId) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.imageId = imageId;
    }
}
