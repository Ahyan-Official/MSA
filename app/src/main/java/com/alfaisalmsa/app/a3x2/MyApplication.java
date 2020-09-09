package com.alfaisalmsa.app.a3x2;

import android.app.Application;

import com.onesignal.OneSignal;


public class MyApplication extends Application {



    private static MyApplication mInstense;




    public MyApplication(){


        mInstense = this;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        mInstense = this;

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }



    public static synchronized  MyApplication getmInstense(){

        return mInstense;
    }





}
