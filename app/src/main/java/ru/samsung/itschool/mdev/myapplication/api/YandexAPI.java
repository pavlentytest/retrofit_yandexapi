package ru.samsung.itschool.mdev.myapplication.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.samsung.itschool.mdev.myapplication.model.Answer;

public interface YandexAPI {

    /*
    https://predictor.yandex.net/api/v1/predict.json/complete?
    key=pdct.1.1.20220412T145449Z.ed53b660ddacdc8e.353ee4c0c5adc174b6be636450d97faa6e34a072
    &
    q=cat
    &
    lang=en
    &
    limit=5
     */

    @GET("/api/v1/predict.json/complete")
    Call<Answer> getData(@Query("key") String key,
                         @Query("q") String query,
                         @Query("lang") String lang,
                         @Query("limit") Integer limit);

}
