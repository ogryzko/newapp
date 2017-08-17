package com.example.newapp.services;

import com.example.newapp.enteties.HistoryItem;

import java.util.Date;

/**
 * Created by eglushchenko on 14.08.2017.
 */
public class HistoryItemFactory implements IHistoryItemFactory {
    private int currentId = 1;
    private Date date;

    public HistoryItem getHistoryItem(Integer age, String gender, Float height, Float weight, float bmi, float pi, String kind) {
        date = new Date();
        HistoryItem item = new HistoryItem(currentId, date, age, gender, height, weight, bmi, pi, kind);
        currentId++;
        return item;
    }
}
