package com.example.ex4_bottomnavigation.model;

import java.util.ArrayList;

public class Account {
    private int rsImg;
    private String name;
    private int age;
    private ArrayList<Message> messages = new ArrayList<>();

    public Account(int rsImg, String name, int age, ArrayList<Message> messages) {
        this.rsImg = rsImg;
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    public int getRsImg() {
        return rsImg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
