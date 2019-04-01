package com.qservices.microsoftfaceapiresult;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sahil on 26-Mar-19.
 */

public class RestClient {
    private static ApiService apiService = null;
    private static Retrofit retrofit = null;


    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    okhttp3.Response response = chain.proceed(request);

                    //  deal with the issues the way you need to
                    if (response.code() == 500) {
                        Log.e("error", "data1");
                        return response;
                    }
                    if (response.cacheControl() != null) {
                        Log.e("error", "cacheControl ");
                    } else if (response.networkResponse() != null) {
                        Log.e("error", "networkResponse1 ");
                    }else {
                        Log.e("error", "networkResponse2 ");
                    }
                    Log.e("error", "data2 " + response.body());

                    long tx = response.sentRequestAtMillis();
                    long rx = response.receivedResponseAtMillis();
                    System.out.println("response time : "+(rx - tx)+" ms");

                    return response;
                }
            })
            .build();
}
