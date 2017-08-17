package com.example.bmicalculatortapestry.services;

import com.example.bmicalculatortapestry.enteties.HistoryItem;

/**
 * Created by eglushchenko on 17.08.2017.
 */
public interface IHistoryItemFactory {
    public HistoryItem getHistoryItem(Integer age, String gender, Float height, Float weight, float bmi, float pi, String kind);
}
