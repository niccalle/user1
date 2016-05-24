package com.example.nicolascalle.user1;

import com.firebase.client.Firebase;

/**
 * Created by Nicolas Calle on 5/24/2016.
 */
public class FirebaseContext extends android.app.Application{
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
