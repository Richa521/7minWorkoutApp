package com.comp.a7minutesworkout

import android.app.Application

class WorkOutApp:Application() {

    val db:HistoryDatabase by lazy{
        HistoryDatabase.getInstance(this)
    }

}