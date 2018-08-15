package com.example.commonlog

import java.text.SimpleDateFormat
import java.util.*


fun toCalendar(date: String): Calendar {
    val from = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val dateFromString = from.parse(date)
    val cal = Calendar.getInstance()
    cal.time = dateFromString

//    val year = cal.get(Calendar.YEAR)
//    val month = cal.get(Calendar.JANUARY)
//    val day = cal.get(Calendar.DAY_OF_MONTH)
//    val hour = cal.get(Calendar.HOUR)
//    val minute = cal.get(Calendar.MINUTE)


    return cal
}

fun isPast(calendar: Calendar) : Boolean{

    val bol = if ( Calendar.getInstance().get(Calendar.DAY_OF_YEAR) > calendar.get(Calendar.DAY_OF_YEAR) ) return  true else false
    return bol
}

fun isToday (calendar: Calendar): Boolean{

    val bol = if ( Calendar.getInstance().get(Calendar.DAY_OF_YEAR) == calendar.get(Calendar.DAY_OF_YEAR) ) return  true else false
    return bol
}