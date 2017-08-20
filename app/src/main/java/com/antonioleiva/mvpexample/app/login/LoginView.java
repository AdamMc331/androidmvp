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
 * Interface that handles all of the actions the View must adhere to.
 */
interface LoginView {
    /**
     * Displays a progress indicator while the user is logging in.
     */
    void showProgress();

    /**
     * Removes any progress indicator.
     */
    void hideProgress();

    /**
     * Displays an error for an incorrect username.
     */
    void setUsernameError();

    /**
     * Displays an error for an incorrect password.
     */
    void setPasswordError();

    /**
     * Navigates beyond the login screen to the home screen.
     */
    void navigateToHome();
}
