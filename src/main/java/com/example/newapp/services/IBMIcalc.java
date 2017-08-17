package com.example.newapp.services;

/**
 * Created by eglushchenko on 16.08.2017.
 */
public interface IBMIcalc {
    public String makePrediction(Integer age, float bmi);
    public float calculatePI(Float weight, float heightMiters);
    public float calculateBmi(Float weight, float heightMiters);
    public float convertCMHeightToMiters(Float height);
}
