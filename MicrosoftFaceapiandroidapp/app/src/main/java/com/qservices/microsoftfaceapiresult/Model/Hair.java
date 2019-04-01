package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hair {

    @SerializedName("bald")
    @Expose
    private Double bald;
    @SerializedName("invisible")
    @Expose
    private Boolean invisible;
    @SerializedName("hairColor")
    @Expose
    private List<HairColor> hairColor = null;

    public Double getBald() {
        return bald;
    }

    public void setBald(Double bald) {
        this.bald = bald;
    }

    public Boolean getInvisible() {
        return invisible;
    }

    public void setInvisible(Boolean invisible) {
        this.invisible = invisible;
    }

    public List<HairColor> getHairColor() {
        return hairColor;
    }

    public void setHairColor(List<HairColor> hairColor) {
        this.hairColor = hairColor;
    }

}