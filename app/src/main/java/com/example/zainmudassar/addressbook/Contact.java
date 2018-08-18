package com.example.zainmudassar.addressbook;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Contact {


    //private variables
    int _id;
    String _name;
    String _phone_number;
    String _email;
    String _address;

    // Empty constructor
    public Contact(){

    }

    public Contact(String _name, String _phone_number, String _email, String _address) {
        this._id = _id;
        this._name = _name;
        this._phone_number = _phone_number;
        this._email = _email;
        this._address = _address;
    }

    public Contact(int _id, String _name, String _phone_number, String _email, String _address) {
        this._id = _id;
        this._name = _name;
        this._phone_number = _phone_number;
        this._email = _email;
        this._address = _address;

    }

    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }

    // getting phone number
    public String getPhoneNumber(){
        return this._phone_number;
    }

    // setting phone number
    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    } public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }



}

