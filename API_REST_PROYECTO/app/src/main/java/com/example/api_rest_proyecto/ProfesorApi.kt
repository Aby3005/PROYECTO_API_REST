package com.example.api_rest_proyecto

import retrofit2.Call
import retrofit2.http.*

interface ProfesorApi {

    @GET("profesor.php")
    fun obtenerProfesores(): Call<List<Profesor>>

    @GET("profesor.php/{id}")
    fun obtenerProfesorPorId(@Path("id") id: Int): Call<Profesor>

    @POST("profesor.php")
    fun crearProfesor(@Body profesor: Profesor): Call<Profesor>

    @PUT("profesor.php")
    fun actualizarProfesor(@Query("id") id: Int, @Body profesor: Profesor): Call<Profesor>

    @DELETE("profesor.php")
    fun eliminarProfesor(@Query("id") id: Int): Call<Void>
}