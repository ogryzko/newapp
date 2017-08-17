package com.example.bmicalculatortapestry.pages;


import com.example.bmicalculatortapestry.enteties.HistoryItem;
import com.example.bmicalculatortapestry.services.IBMIcalc;
import com.example.bmicalculatortapestry.services.IHistoryItemFactory;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class Index {

    @Property
    private int age;
    @Property
    private float weight;
    @Property
    private float height;
    @Property
    private String gender;

    @Property
    private String title;

    @Inject
    private IHistoryItemFactory historyItemFactory;

    @Persist(PersistenceConstants.SESSION)
    @Property
    private HistoryItem historyItem;

    @Property
    @Persist(PersistenceConstants.SESSION)
    private List<HistoryItem> history;

    @Inject
    private IBMIcalc bmiCalc;

    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;

    @InjectComponent
    private Zone result;

    void onSuccess(){
        float heightMiters = bmiCalc.convertCMHeightToMiters(height);
        float bmi = bmiCalc.calculateBmi(weight, heightMiters);
        float pi = bmiCalc.calculatePI(weight, heightMiters);
        String kind = bmiCalc.makePrediction(age, bmi);

        historyItem = historyItemFactory.getHistoryItem(age, gender, height, weight, bmi, pi,kind);
        if(history == null){
            history = new ArrayList<HistoryItem>();
        }
        history.add(historyItem);

        ajaxResponseRenderer.addRender(result);
    }

}