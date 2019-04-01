package com.qservices.microsoftfaceapiresult.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.projectoxford.face.contract.FaceRectangle;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sahil on 25-Mar-19.
 */

public class Mainmodel {

        @SerializedName("faceId")
        @Expose
        private String faceId;
        @SerializedName("faceRectangle")
        @Expose
        private FaceRectangle faceRectangle;
        @SerializedName("faceAttributes")
        @Expose
        //List<FaceAttributes> faceAttributes = new ArrayList<>();
        private FaceAttributes faceAttributes;

        public String getFaceId() {
            return faceId;
        }

        public void setFaceId(String faceId) {
            this.faceId = faceId;
        }

        public FaceRectangle getFaceRectangle() {
            return faceRectangle;
        }

    public FaceAttributes getFaceAttributes() {
        return faceAttributes;
    }
}

