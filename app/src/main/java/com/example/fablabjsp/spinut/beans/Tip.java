package com.example.fablabjsp.spinut.beans;

import java.time.LocalDateTime;

/**
 * Created by Isaque Ferreira on 19/09/2017.
 */

public class Tip {

    private String title;
    private String content;
    private LocalDateTime timePost;
    private long userId;
    private long clientId;
    private long id;

    private static long nextId = 1;

    public Tip(String title, String content, long userId, long clientId){
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.clientId = clientId;
        this.timePost = LocalDateTime.now();
        setId(nextId);
        Tip.nextId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimePost() {
        return timePost;
    }

    public void setTimePost(LocalDateTime timePost) {
        this.timePost = timePost;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }
}
