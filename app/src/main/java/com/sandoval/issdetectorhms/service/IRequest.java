package com.sandoval.issdetectorhms.service;

import com.sandoval.issdetectorhms.data.ResponseISSLocation;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRequest {

    @GET("iss-now.json")
    Call<ResponseISSLocation> getISSLocation();
}
