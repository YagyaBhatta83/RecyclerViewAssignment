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

    //Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
