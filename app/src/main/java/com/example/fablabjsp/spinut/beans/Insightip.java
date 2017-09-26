package com.example.fablabjsp.spinut.beans;

/**
 * Created by Isaque Ferreira on 19/09/2017.
 */

public class Insightip extends Tip {

    private static long nextId = 1;

    public Insightip(String title, String content, long userId, long clientId){
        super(title, content, userId, clientId);
        setId(nextId);
        Insightip.nextId++;
    }
}
