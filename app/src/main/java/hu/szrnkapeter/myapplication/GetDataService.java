package hu.szrnkapeter.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("data?list=englishmonarchs&format=json")
    Call<List<King>> listKings();
}
