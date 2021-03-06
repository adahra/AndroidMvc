/*
 * Copyright 2016 Kejun Xia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shipdream.lib.android.mvc.view.event2v.controller;

import com.shipdream.lib.android.mvc.FragmentController;
import com.shipdream.lib.android.mvc.UiView;

public class V2VTestController extends FragmentController<Void, V2VTestController.View> {
    public interface View extends UiView{
        void updateDialogButton(String text);
    }

    @Override
    public Class modelType() {
        return null;
    }

    public void updateDialogButton(String text) {
        view.updateDialogButton(text);
    }
}
