package alzaichsank.retrofitcode.SystemRetrofit

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.*

/**
 * Created by alzaichsank on 1/22/18.
 */
interface BaseApiServices {
//login

    @FormUrlEncoded
    @POST(APIConfig.LOGIN)
    fun postLogin(@Field("email") email: String,
                  @Field("password") password: String): Call<ResponseBody>



}