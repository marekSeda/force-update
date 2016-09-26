package net.skoumal.forceupdate;

import android.util.Log;

/**
 * Created by gingo on 26.9.2016.
 */
public class ForceUpdateLogger {

    private static final String TAG = "ForceUpdate";

    public static boolean isWarnEnabled() {
        return true;
    }

    public static void w(String gMsg, Exception gException) {
        Log.w(TAG, gMsg, gException);
    }
}
