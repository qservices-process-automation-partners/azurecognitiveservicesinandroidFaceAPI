package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HairColor {

    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("confidence")
    @Expose
    private Double confidence;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

}