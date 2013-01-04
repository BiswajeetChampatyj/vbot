package com.varun.codefactory.vbot.util;

import android.content.Context;
import android.content.SharedPreferences;

public final class Prefs {
    public static SharedPreferences get(Context context) {
        return context.getSharedPreferences("VBOT_PREFS", 0);
    }
}
