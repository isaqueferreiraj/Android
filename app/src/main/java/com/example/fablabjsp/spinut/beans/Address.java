package com.example.fablabjsp.spinut.beans;

/**
 * Created by Isaque Ferreira on 20/09/2017.
 */

public class Address {

    private String street;
    private String neighborhood;
    private int number;
    private String numberComplement;
    private String cep;
    private String city;
    private String State;
    private String Country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumberComplement() {
        return numberComplement;
    }

    public void setNumberComplement(String numberComplement) {
        this.numberComplement = numberComplement;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
