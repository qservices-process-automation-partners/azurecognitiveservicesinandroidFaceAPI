package com.qservices.microsoftfaceapiresult;

/**
 * Created by Sahil on 26-Mar-19.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://*******.api.cognitive.microsoft.com/";
    public static ApiService getAPIService() {
        return RestClient.getClient(BASE_URL).create(ApiService.class);
    }
}
