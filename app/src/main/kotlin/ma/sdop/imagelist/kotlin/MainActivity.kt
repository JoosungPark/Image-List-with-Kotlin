package ma.sdop.imagelist.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use Elvis operator to give an alternative in case the object is null.
        var artist: Artist? = null
        val name = artist?.name ?: "empty"

        Log.d("", name)
    }
}

data class Artist(var name: String) {

}