package com.utp.viacosta.agregates.retrofit;

import com.utp.viacosta.agregates.respuesta.ReniecRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ReniecService {
    @GET("/v2/reniec/dni")
    Call<ReniecRespuesta> getDatosPersona(@Header("Authorization") String toquen, @Query("numero") String numero);

}
