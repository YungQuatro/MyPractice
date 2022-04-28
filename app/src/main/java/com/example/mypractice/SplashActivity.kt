package com.example.mypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Parcel
import android.os.Parcelable

class SplashActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        Handler().postDelayed({
            val intent = Intent(this, Authorization::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SplashActivity> {
        override fun createFromParcel(parcel: Parcel): SplashActivity {
            return SplashActivity(parcel)
        }

        override fun newArray(size: Int): Array<SplashActivity?> {
            return arrayOfNulls(size)
        }
    }
}