package com.example.ex4_bottomnavigation.model;

import java.sql.Time;

public class Message {
    private int hour, minute;
    private int rsImg;
    private String name;
    private String[] messageContent;

    public Message(int hour, int minute,String name, int rsImg, String[] messageContent) {
        this.hour = hour;
        this.name = name;
        this.minute = minute;
        this.rsImg = rsImg;
        this.messageContent = messageContent;
    }
    public String getName(){
        return this.name;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getRsImg() {
        return rsImg;
    }
    public String[] getMessageContent() {
        return messageContent;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }

    public void setMessageContent(String[] messageContent) {
        this.messageContent = messageContent;
    }
}
