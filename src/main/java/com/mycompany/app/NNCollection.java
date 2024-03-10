package com.mycompany.app;

public class NNCollection {
    //Array of Class Object NameNumber, length of Array of 100
    //Instance the array of Object
    private NameNumber[] nnArray = new NameNumber[100];
    //private NameNumber nnArray[] = new NameNumber[100];
    private int free;

    //Constructor
    public NNCollection() {free = 0;}
    //Method insert Number if Name is not found
    public void insert(NameNumber n) {
        int index = 0;
        for (int i = free++;
        i != 0 && 
        nnArray[i-1].getLastName().compareTo(n.getLastName()) > 0;
        i--) {
            nnArray[i] = nnArray[i-1];
            index = i;
        }
        nnArray[index] = n;
    }
    //Method to find tel number
    public String findNumber(String lName) {
        for (int i = 0; i != free; i++)
            if (nnArray[i].getLastName().equals(lName))
            	return nnArray[i].getTelNumber();
        return new String("Name not found");
    }

}
