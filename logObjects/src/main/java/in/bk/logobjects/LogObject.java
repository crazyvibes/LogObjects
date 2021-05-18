package in.bk.logobjects;

import android.content.Context;
import android.util.Log;


import com.google.gson.Gson;

import static android.content.ContentValues.TAG;

public class LogObject {
    public static void logObject(Context mContext, Object object) {
        Gson gson = new Gson();
        String json = gson.toJson(object);
        Log.d(TAG, json);
    }
}
