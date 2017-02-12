package com.example.domain;

/**
 * Created by kimjihye on 2017. 2. 12..
 */

public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;

    public Customer(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId(){
        return this.id;
    }
}
