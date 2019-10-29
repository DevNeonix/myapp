package com.example.midas.utils

import android.os.Handler


fun setTimeOut(process: () -> Unit, delay: Long ) {
    Handler().postDelayed({
        process()
    }, delay)
}

