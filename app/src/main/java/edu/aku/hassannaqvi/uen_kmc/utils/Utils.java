package edu.aku.hassannaqvi.uen_kmc.utils;

import android.content.Context;
import android.widget.Toast;

import java.lang.reflect.Method;

import edu.aku.hassannaqvi.uen_kmc.BuildConfig;

public class Utils {

    private Utils() {
        // This class is not publicly instantiable
    }


    public static void showDebugDBAddressLogToast(Context context) {
        if (BuildConfig.DEBUG) {
            try {
                Class<?> debugDB = Class.forName("com.amitshekhar.DebugDB");
                Method getAddressLog = debugDB.getMethod("getAddressLog");
                Object value = getAddressLog.invoke(null);
                Toast.makeText(context, (String) value, Toast.LENGTH_LONG).show();
            } catch (Exception ignore) {

            }
        }
    }
}
