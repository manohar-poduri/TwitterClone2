package com.poduri.manohar.twitterclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("b3DyegpIx7FyLapayd1MAOpbXsT4PnaLXWZviKKU")
                // if defined
                .clientKey("z7ASsfOWTrhgpdBktC1YfE835mue4zzI6GCd4DoE")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}


