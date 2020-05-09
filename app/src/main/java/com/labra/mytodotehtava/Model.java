package com.labra.mytodotehtava;

/**
 * Created by ankit on 22/1/18.
 */

public class Model {
    public String mId, mTitle, mDesc, mTehty;

    public Model() {

    }

    public Model(String mId, String mTitle, String mDesc, String mTehty) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mDesc = mDesc;
        this.mTehty = mTehty;



    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getmTehty() { return mTehty; }

    public void setmTehty(String mTehty) {this.mTehty = mTehty;}
}