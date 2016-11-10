package com.example.android.sunshine;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by agus.umriadi on 09/11/2016.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Jakarta");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
