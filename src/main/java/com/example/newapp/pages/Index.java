package com.example.newapp.pages;


import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.Validate;


public class Index {

    
    @Property
    private int age;
    @Property
    private double weight;
    @Property
    private double height;
    @Property
    private String gender;
}