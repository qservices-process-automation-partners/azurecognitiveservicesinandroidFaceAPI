package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.projectoxford.face.contract.Hair;
import com.microsoft.projectoxford.face.contract.HeadPose;
import com.microsoft.projectoxford.face.contract.Makeup;
import com.microsoft.projectoxford.face.contract.Noise;
import com.microsoft.projectoxford.face.contract.Occlusion;

public class FaceAttributes {

    @SerializedName("headPose")
    @Expose
    private HeadPose headPose;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("glasses")
    @Expose
    private String glasses;
    @SerializedName("emotion")
    @Expose
    private Emotion emotion;
    @SerializedName("noise")
    @Expose
    private Noise noise;
    @SerializedName("makeup")
    @Expose
    private Makeup makeup;
    @SerializedName("accessories")
    @Expose
    private List<Object> accessories = null;
    @SerializedName("occlusion")
    @Expose
    private Occlusion occlusion;
    @SerializedName("hair")
    @Expose
    private Hair hair;

    public HeadPose getHeadPose() {
        return headPose;
    }

    public void setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public Noise getNoise() {
        return noise;
    }

    public void setNoise(Noise noise) {
        this.noise = noise;
    }

    public Makeup getMakeup() {
        return makeup;
    }

    public void setMakeup(Makeup makeup) {
        this.makeup = makeup;
    }

    public List<Object> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Object> accessories) {
        this.accessories = accessories;
    }

    public Occlusion getOcclusion() {
        return occlusion;
    }

    public void setOcclusion(Occlusion occlusion) {
        this.occlusion = occlusion;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

}