package com.qservices.microsoftfaceapiresult.Model;

/**
 * Created by Sahil on 25-Mar-19.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FaceRectangle {

    @SerializedName("top")
    @Expose
    private Integer top;
    @SerializedName("left")
    @Expose
    private Integer left;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}