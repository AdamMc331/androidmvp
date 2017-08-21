package com.antonioleiva.mvpexample.app.login

import android.os.Handler
import android.text.TextUtils

/**
 * Implementation of the LoginInteractor interface.
 */
internal class LoginInteractorImpl : LoginInteractor {

    override fun login(username: String, password: String, listener: LoginInteractor.OnLoginFinishedListener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        Handler().postDelayed({
            when {
                TextUtils.isEmpty(username) -> listener.onUsernameError()
                TextUtils.isEmpty(password) -> listener.onPasswordError()
                else -> listener.onSuccess()
            }
        }, 2000)
    }
}
