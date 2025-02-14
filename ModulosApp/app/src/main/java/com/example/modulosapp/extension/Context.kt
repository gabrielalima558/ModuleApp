package com.example.modulosapp.extension

import android.content.Context
import android.widget.Toast

inline fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
