package com.simplemobiletools.applauncher.helpers

import android.content.Context
import com.simplemobiletools.applauncher.R
import com.simplemobiletools.commons.helpers.BaseConfig

class Config(context: Context) : BaseConfig(context) {
    companion object {
        fun newInstance(context: Context) = Config(context)
    }

    var wasRemoveInfoShown: Boolean
        get() = prefs.getBoolean(WAS_REMOVE_INFO_SHOWN, false)
        set(wasRemoveInfoShown) = prefs.edit().putBoolean(WAS_REMOVE_INFO_SHOWN, wasRemoveInfoShown).apply()

    var closeApp: Boolean
        get() = prefs.getBoolean(CLOSE_APP, true)
        set(closeApp) = prefs.edit().putBoolean(CLOSE_APP, closeApp).apply()

    var columnCnt: Int
        get() = prefs.getInt(COLUMN_CNT, context.resources.getInteger(R.integer.column_count))
        set(columnCnt) = prefs.edit().putInt(COLUMN_CNT, columnCnt).apply()
}
