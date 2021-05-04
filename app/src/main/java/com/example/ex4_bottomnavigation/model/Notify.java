package com.example.ex4_bottomnavigation.model;

public class Notify {
    private String content;
    private int rsImg;
    private String name;
    private String date;

    public Notify(String content,String name, int rsImg, String date) {
        this.content = content;
        this.name = name;
        this.rsImg = rsImg;
        this.date = date;
    }
    public String getName(){
        return this.name;
    }
    public String getContent() {
        return content;
    }

    public int getRsImg() {
        return rsImg;
    }

    public String getDate() {
        return date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
