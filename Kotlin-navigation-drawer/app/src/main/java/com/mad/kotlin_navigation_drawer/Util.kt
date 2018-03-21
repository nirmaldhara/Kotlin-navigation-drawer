package com.mad.kotlin_navigation_drawer

import android.app.Fragment
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity

/**
 * Created by nir21 on 23-01-2018.
 */
fun AppCompatActivity.replaceFragmenty(fragment: Fragment,
                                       allowStateLoss: Boolean = false,
                                       @IdRes containerViewId: Int) {
    val ft = fragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment)
    if (!supportFragmentManager.isStateSaved) {
        ft.commit()
    } else if (allowStateLoss) {
        ft.commitAllowingStateLoss()
    }
}