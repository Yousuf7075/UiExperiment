package com.example.uiexp.utils

import android.app.Activity
import android.content.Intent
import com.example.uiexp.spinner.SpinnerActivity

object ScreenNavigator {

    fun navigateSpinnerActivity(activity: Activity){
        activity.startActivity(Intent(activity, SpinnerActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK))
        activity.finish()
    }

}