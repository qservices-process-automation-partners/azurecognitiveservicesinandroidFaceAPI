package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Noise {

    @SerializedName("noiseLevel")
    @Expose
    private String noiseLevel;
    @SerializedName("value")
    @Expose
    private Integer value;

    public String getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(String noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}