/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.ionic.chathead.impl;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.ContextThemeWrapper;

import org.sunbird.app.R;

import org.sunbird.app.R;
import io.ionic.chathead.HoverMenu;
import io.ionic.chathead.HoverView;
import io.ionic.chathead.window.HoverMenuService;

/**
 * Demo {@link HoverMenuService}.
 */
public class DemoHoverMenuService extends HoverMenuService {

    private static final String TAG = "DemoHoverMenuService";
    private static DevconData devconData;

    public static void showFloatingMenu(Context context, DevconData devconData) {
        DemoHoverMenuService.devconData = devconData;
        context.startService(new Intent(context, DemoHoverMenuService.class));
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected Context getContextForHoverMenu() {
        return new ContextThemeWrapper(this, R.style.AppTheme);
    }

    @Override
    protected void onHoverMenuLaunched(@NonNull Intent intent, @NonNull HoverView hoverView) {
        hoverView.setMenu(createHoverMenu());
        hoverView.collapse();
    }

    @NonNull
    private HoverMenu createHoverMenu() {
        return new DemoHoverMenu(getApplicationContext(), "nonfullscreen", DemoHoverMenuService.devconData);
    }
}
