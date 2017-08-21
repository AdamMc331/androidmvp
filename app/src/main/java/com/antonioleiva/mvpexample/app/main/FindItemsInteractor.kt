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
 * Interface for finding items to display on the home screen.
 */
internal interface FindItemsInteractor {

    interface OnFinishedListener {
        /**
         * Called when all of the items have been retrieved.
         *
         * @param items The items that were collected.
         */
        fun onFinished(items: List<String>)
    }

    /**
     * Finds a list of items.
     *
     * @param listener The callback to use once items are found.
     */
    fun findItems(listener: OnFinishedListener)
}
