/*
 *
 *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.antonioleiva.mvpexample.app.login;

/**
 * Interface that defines how the user can interact with the login view.
 */
interface LoginInteractor {

    interface OnLoginFinishedListener {
        /**
         * Called if there's an issue with the username entered.
         */
        void onUsernameError();

        /**
         * Called if there's an issue with the password entered.
         */
        void onPasswordError();

        /**
         * Called when a login completes without error.
         */
        void onSuccess();
    }

    /**
     * Performs the login action for a user.
     * @param username The user's username.
     * @param password The user's password.
     * @param listener The callback to use when login completes.
     */
    void login(String username, String password, OnLoginFinishedListener listener);
}
