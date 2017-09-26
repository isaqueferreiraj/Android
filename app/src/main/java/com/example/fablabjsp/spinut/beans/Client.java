package com.example.fablabjsp.spinut.beans;

/**
 * Created by Isaque Ferreira on 19/09/2017.
 */

public class Client extends User {

    private static long nextId = 1;

    public Client(String name, String email, String password, Address address){
        super(email, password, name, address);
        setId(nextId);
        Client.nextId++;
    }
}
