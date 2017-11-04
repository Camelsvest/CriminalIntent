package com.example.shiyo.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shiyo on 2017/10/22.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Generate unique identifier
        this(UUID.randomUUID());
        //mId = UUID.randomUUID();
        //mDate = new Date();
    }

    public Crime(UUID uuid) {
        mId = uuid;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
