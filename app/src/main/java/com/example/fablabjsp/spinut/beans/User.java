package com.example.fablabjsp.spinut.beans;

/**
 * Created by Isaque Ferreira on 19/09/2017.
 */

public abstract class User {

    private String email;
    private String password;
    private String name;
    private Address address;
    private long id;

    public User(String email, String password, String name, Address address){
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.id = 0;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if(obj == null)
            return false;
        if(!(obj instanceof User))
            return false;
        else if(this.email == ((User) obj).getEmail())
            result = true;

        return result;
    }

    void setId(long id){
        this.id = id;
    }

    public long getId(){
      return this.id;
    };
}
