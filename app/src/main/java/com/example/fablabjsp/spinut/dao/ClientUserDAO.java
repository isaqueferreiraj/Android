package com.example.fablabjsp.spinut.dao;
import com.example.fablabjsp.spinut.beans.Address;
import com.example.fablabjsp.spinut.beans.Client;

/**
 * Created by Isaque Ferreira on 22/09/2017.
 */

public class ClientUserDAO {

    public boolean create(String name, String email, String password, Address address){
        boolean created = false;

        Client client = new Client(name, email, password, address);



        return created;
    }


}
