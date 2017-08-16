package com.example.newapp.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by eglushchenko on 16.08.2017.
 */
public class GameOver {
    @Property
    @Persist
    private int target, guessCount;

    void setup(int target, int guessCount)
    {
        this.target = target;
        this.guessCount = guessCount;
    }
}
