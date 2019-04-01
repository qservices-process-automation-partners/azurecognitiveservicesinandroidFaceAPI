package com.qservices.microsoftfaceapiresult.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil on 26-Mar-19.
 */

public class User {
    @SerializedName("url")
    @Expose
    private String url;

    public User(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
