package com.example.testscreen

import android.view.View
import com.google.android.material.snackbar.Snackbar

class SnackShowEvent : View.OnClickListener {

    override fun onClick(view: View?) {
        if (view != null) {
            Snackbar.make(view, "Prueba", Snackbar.LENGTH_SHORT).show()
        }
    }
}