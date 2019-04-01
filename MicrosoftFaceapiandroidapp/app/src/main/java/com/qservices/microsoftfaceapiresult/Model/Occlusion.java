package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Occlusion {

    @SerializedName("foreheadOccluded")
    @Expose
    private Boolean foreheadOccluded;
    @SerializedName("eyeOccluded")
    @Expose
    private Boolean eyeOccluded;
    @SerializedName("mouthOccluded")
    @Expose
    private Boolean mouthOccluded;

    public Boolean getForeheadOccluded() {
        return foreheadOccluded;
    }

    public void setForeheadOccluded(Boolean foreheadOccluded) {
        this.foreheadOccluded = foreheadOccluded;
    }

    public Boolean getEyeOccluded() {
        return eyeOccluded;
    }

    public void setEyeOccluded(Boolean eyeOccluded) {
        this.eyeOccluded = eyeOccluded;
    }

    public Boolean getMouthOccluded() {
        return mouthOccluded;
    }

    public void setMouthOccluded(Boolean mouthOccluded) {
        this.mouthOccluded = mouthOccluded;
    }

}