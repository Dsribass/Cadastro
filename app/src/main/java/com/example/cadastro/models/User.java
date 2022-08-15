package com.example.cadastro.models;

public class User {
    public User(
            String fullName,
            String phone,
            String email,
            Boolean shouldJoinMailingList,
            Gender gender,
            String city,
            States states
    ) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.shouldJoinMailingList = shouldJoinMailingList;
        this.gender = gender;
        this.city = city;
        this.states = states;
    }

    final String fullName;
    final String phone;
    final String email;
    final Boolean shouldJoinMailingList;
    final Gender gender;
    final String city;
    final States states;

    enum Gender {
        MALE,
        FEMALE
    }
}

