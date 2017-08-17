package com.example.bmicalculatortapestry.enteties;

import org.apache.tapestry5.beaneditor.Validate;

import java.util.Date;

/**
 * Created by eglushchenko on 17.08.2017.
 */
public class HistoryItem {
    
    @Validate("required")
    public int id;

    @Validate("required")
    public Date date;

    @Validate("required")
    public int age;

    @Validate("required")
    public String gender;

    @Validate("required")
    public float height;

    @Validate("required")
    public float weight;

    @Validate("required")
    public float bmi;

    @Validate("required")
    public float pi;

    @Validate("required")
    public String kind;

    public HistoryItem(int id, Date date, int age, String gender, float height, float weight, float bmi, float pi, String kind) {
        this.id = id;
        this.date = date;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.pi = pi;
        this.kind = kind;
    }
}
