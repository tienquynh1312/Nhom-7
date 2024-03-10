package com.mycompany.app;

public class NameNumber {
    private String lastName;
    private String telNumber;

    NameNumber() {
    }

    // set name and number to NameNumber
    public NameNumber(String name, String num) {
        this.lastName = name;
        this.telNumber = num;
    }

    // get Lastname
    public String getLastName() {
        return lastName;
    }

    // get String of "tel number"
    public String getTelNumber() {
        return telNumber;
    }
}
