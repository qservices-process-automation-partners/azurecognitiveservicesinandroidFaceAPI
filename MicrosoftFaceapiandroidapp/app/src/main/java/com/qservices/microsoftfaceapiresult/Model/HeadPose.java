package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeadPose {

    @SerializedName("pitch")
    @Expose
    private Integer pitch;
    @SerializedName("roll")
    @Expose
    private Double roll;
    @SerializedName("yaw")
    @Expose
    private Double yaw;

    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Double getYaw() {
        return yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

}