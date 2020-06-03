package io.ajarara.base_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.ajarara.lib.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyClass()
        setContentView(R.layout.activity_main)
    }
}
