package com.example.appintrro;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VollySingleton {
    private static VollySingleton mInstance;
    private RequestQueue mRequestQueue;

    public VollySingleton(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());

    }

    public static synchronized VollySingleton getInstance(Context context){

        if (mInstance == null){
            mInstance = new VollySingleton(context);
        }
        return mInstance;
    }

    public RequestQueue getmRequestQueue(){
        return mRequestQueue;
    }

}
