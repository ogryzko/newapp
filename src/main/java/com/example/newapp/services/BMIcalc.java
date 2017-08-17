package com.example.newapp.services;


public class BMIcalc implements IBMIcalc {
    public BMIcalc() {
    }

    public String makePrediction(Integer age, float bmi) {
        String kind;
        if (age > 18) {
            if (bmi <= 16)
                kind = "Выраженный дефицит массы тела";
            else if (bmi <= 18.5)
                kind = "Недостаточная масса тела";
            else if (bmi <= 24.99)
                kind = "Норма";
            else if (bmi <= 30)
                kind = "Избыточная масса тела (предожирение)";
            else if (bmi <= 35)
                kind = "Ожирение первой степени";
            else if (bmi <= 40)
                kind = "Ожирение второй степени";
            else
                kind = "Ожирение третьей степени (морбидное)";
        } else {
            kind = "Младше 18, данные не доступны...";
        }
        return kind;
    }

    public float calculatePI(Float weight, float heightMiters) {
        return (float) (weight / Math.pow(heightMiters, 3));
    }

    public float calculateBmi(Float weight, float heightMiters) {
        return (float) (weight / Math.pow(heightMiters, 2));
    }

    public float convertCMHeightToMiters(Float height) {
        return (float) (height / 100);
    }
}