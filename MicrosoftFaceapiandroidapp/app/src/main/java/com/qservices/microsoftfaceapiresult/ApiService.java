package com.qservices.microsoftfaceapiresult;

import com.qservices.microsoftfaceapiresult.Model.Mainmodel;
import com.qservices.microsoftfaceapiresult.Model.User;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Sahil on 26-Mar-19.
 */

public interface ApiService {

    // Image from url

    @Headers({
            "Content-Type: application/json",
            "Ocp-Apim-Subscription-Key: d063f56b30f94d61b923e61ec****",
    })
    @POST("face/v1.0/detect?returnFaceId=true&returnFaceAttributes=age,gender,glasses,emotion,hair,makeup,occlusion,accessories,headPose,noise")
    Call<List<Mainmodel>> getdata(@Body User user);

    // Image from local
   /* @Multipart
    @Headers({
            "Content-Type: multipart/form-data",
            "Ocp-Apim-Subscription-Key: d063f56b30f94d61b923e61ec****",
    })
    @POST("face/v1.0/detect?returnFaceId=true&returnFaceAttributes=age,gender,glasses,emotion,hair,makeup,occlusion,accessories,headPose,noise")
    Call<List<Mainmodel>> getdata( @Part MultipartBody.Part image);*/
}
