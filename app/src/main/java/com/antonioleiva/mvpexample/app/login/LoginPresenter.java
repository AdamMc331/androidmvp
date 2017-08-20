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
 * Presenter that handles the logic of the login view.
 */
interface LoginPresenter {
    /**
     * Ensures the credentials entered match a user.
     * @param username The user's username.
     * @param password The user's password.
     */
    void validateCredentials(String username, String password);

    /**
     * Handles the clearing of the view when it goes away.
     */
    void onDestroy();
}
