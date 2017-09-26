package com.example.fablabjsp.spinut.beans;

/**
 * Created by Isaque Ferreira on 19/09/2017.
 */

public class Person extends User {

    private static long nextId = 1;

    public Person(String name, String email, String password, Address address){
        super(email, password, name, address);
        setId(nextId);
        Person.nextId++;
    }
}
