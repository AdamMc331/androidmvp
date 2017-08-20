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

package com.antonioleiva.mvpexample.app.main;

/**
 * Presenter for the home view.
 */
interface MainPresenter {

    /**
     * Called when the home view comes back into focus.
     */
    void onResume();

    /**
     * Called when an item on the home screen is clicked.
     * @param position The index of the item in the list.
     */
    void onItemClicked(int position);

    /**
     * Called when the home screen view goes away.
     */
    void onDestroy();
}
