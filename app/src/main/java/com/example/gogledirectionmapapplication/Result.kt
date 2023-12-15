package com.example.gogledirectionmapapplication

import okhttp3.Route

data class Result(
    var status:String,
    var routes:List<Route>
)
