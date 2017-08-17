package com.example.newapp.services;

import com.example.newapp.enteties.HistoryItem;

/**
 * Created by eglushchenko on 17.08.2017.
 */
public interface IHistoryItemFactory {
    public HistoryItem getHistoryItem(Integer age, String gender, Float height, Float weight, float bmi, float pi, String kind);
}
