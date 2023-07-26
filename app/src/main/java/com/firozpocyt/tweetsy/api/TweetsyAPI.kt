package com.firozpocyt.tweetsy.api

import com.firozpocyt.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/64c0a4ac9d312622a385209b?meta=false")
    suspend fun getTweets(@Header("X-JSON-path") category: String) : Response<List<TweetListItem>>

    @GET("/v3/b/64c0a4ac9d312622a385209b?meta=false")
    @Headers("X-JSON-path: tweets..category")
    suspend fun getCategories(): Response<List<String>>
}