package burak.ceylan.artbookwithunittest.api

import burak.ceylan.artbookwithunittest.model.ImageResponse
import burak.ceylan.artbookwithunittest.util.Const.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = API_KEY
    ) : Response<ImageResponse>
}