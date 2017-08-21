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

package com.antonioleiva.mvpexample.app.main

/**
 * Interface of actions the MainView must adhere to.
 */
internal interface MainView {

    /**
     * Displays a progress indicator while items are fetched.
     */
    fun showProgress()

    /**
     * Removes the progress indicator.
     */
    fun hideProgress()

    /**
     * Sets the items for the home screen to display.
     * @param items The items to display.
     */
    fun setItems(items: List<String>)

    /**
     * Displays a message on the home screen.
     * @param message The message to show.
     */
    fun showMessage(message: String)
}
