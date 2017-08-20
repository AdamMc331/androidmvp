package com.antonioleiva.mvpexample.app.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Implementation of the LoginInteractor interface.
 */
class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {

                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                } else if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                } else {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
