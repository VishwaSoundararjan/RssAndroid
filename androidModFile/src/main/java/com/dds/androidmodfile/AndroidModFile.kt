package com.dds.androidmodfile

class AndroidModFile {
    private var instance: AndroidModFile? = null
    fun getInstance(): AndroidModFile {
        if (instance == null) {
            instance = AndroidModFile()
        }
        return instance!!
    }

    fun getString(): String {
        return "**android mod file - 0101***"
    }
}