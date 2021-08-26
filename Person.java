package com.bl;

import java.util.Scanner;

public class Person {

    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNum;


    void setPerson(String fname, String lname, String address, String city, String state, int zip, String phoneNum){
        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNum=phoneNum;
    }


    void setFName(String fname){this.fname=fname;}
    void setLName(String lname){this.lname=lname;}
    void setAddress(String address){this.address=address;}
    void setCity(String city){this.city=city;}
    void setState(String state){this.state=state;}
    void setZip(int zip){this.zip=zip;}
    void setPhoneNum(String phoneNum){this.phoneNum=phoneNum;}


    String getFName(){return fname;}
    String getLName(){return lname;}
    String getAddress(){return address;}
    String getCity(){return city;}
    String getState(){return state;}
    int getZip(){return zip;}
    String getPhoneNum(){return phoneNum;}


   @Override
    public String toString(){
        return "\nFirst Name: "+fname+
                "\nLast Name: "+lname+
                "\nAddress: "+address+
                "\nCity: "+city+
                "\nState: "+state+
                "\nZip: "+zip+
                "\nPhone Number: "+phoneNum;
    }
}
