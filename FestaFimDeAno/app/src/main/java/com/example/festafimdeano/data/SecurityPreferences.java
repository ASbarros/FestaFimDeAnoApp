package com.example.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private SharedPreferences nSharedPreferences;

    public SecurityPreferences(Context mContext){
        this.nSharedPreferences = mContext.getSharedPreferences("FestaFimAno",Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value){
        this.nSharedPreferences.edit().putString(key,value).apply();
    }

    public String getStoredString(String key){
        return this.nSharedPreferences.getString(key,"");
    }
}
