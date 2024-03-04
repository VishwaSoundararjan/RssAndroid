package com.example.rssandroid

class RssAndroid {


    private var instance: RssAndroid? = null

    // This function will provide access to the singleton instance
    fun getInstance(): RssAndroid {
        // If the instance is null, create a new instance
        if (instance == null) {
            instance = RssAndroid()
        }
        return instance!!
    }

    fun getString(): String {
        return "RssAndroid - 1.0.0"
    }
}