package com.gustavorayo.customlist;

/**
 * Created by Gustavo on 26/03/2015.
 */
public class Color {

    private String mName;
    private String mCode;

    public Color(String name, String code) {
        mName = name;
        mCode = code;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }


    public String getCode() {
        return mCode;
    }

    public void setCode(String mCode) {
        this.mCode = mCode;
    }


}
