package com.rajendra.foodapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/foodapp/";

    public static Retrofit getRetrofitInstance(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;

    }

}
