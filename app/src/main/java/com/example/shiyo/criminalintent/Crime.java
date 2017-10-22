package com.example.shiyo.criminalintent;

import java.util.UUID;

/**
 * Created by shiyo on 2017/10/22.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
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
}
