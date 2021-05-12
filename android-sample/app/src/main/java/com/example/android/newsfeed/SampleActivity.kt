package com.example.android.newsfeed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sdk.whatfix.editor.Whatfix

class SampleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Whatfix.setEditorMode(true)
        Whatfix.initialize(application, "maya")

    }
}