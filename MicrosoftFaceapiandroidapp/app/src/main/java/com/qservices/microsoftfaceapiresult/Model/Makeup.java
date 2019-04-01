package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Makeup {

    @SerializedName("eyeMakeup")
    @Expose
    private Boolean eyeMakeup;
    @SerializedName("lipMakeup")
    @Expose
    private Boolean lipMakeup;

    public Boolean getEyeMakeup() {
        return eyeMakeup;
    }

    public void setEyeMakeup(Boolean eyeMakeup) {
        this.eyeMakeup = eyeMakeup;
    }

    public Boolean getLipMakeup() {
        return lipMakeup;
    }

    public void setLipMakeup(Boolean lipMakeup) {
        this.lipMakeup = lipMakeup;
    }

}