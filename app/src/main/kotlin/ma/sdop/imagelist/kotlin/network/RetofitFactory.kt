package ma.sdop.imagelist.kotlin.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient

/**
 * Created by parkjoosung on 2017. 4. 12..
 */

fun <Target> createAdapter(clazz: Class<Target>, baseUrl: String, interceptor: Interceptor?) {

}

private fun createOkHttpClient(interceptor: Interceptor?) =
        OkHttpClient.Builder().apply {

        }