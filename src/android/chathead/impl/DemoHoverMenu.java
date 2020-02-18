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
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.View;

import org.sunbird.app.R;

import java.util.Collections;
import java.util.List;

import io.ionic.chathead.HoverMenu;

/**
 * A HoverMenu provides the Sections that are displayed in the HoverMenuView. Each Section has an
 * ID, tab View, and visual content.
 */
public class DemoHoverMenu extends HoverMenu {

    private final Context mContext;
    private final String mMenuId;
    private final Section mSection;

    public DemoHoverMenu(@NonNull Context context, @NonNull String menuId, DevconData devconData) {
        mContext = context.getApplicationContext();
        mMenuId = menuId;
        mSection = new Section(
                new SectionId("0"),
                createTabView(),
                new NonFullscreenContent(context, devconData)
        );
    }

    private View createTabView() {
        Resources resources = mContext.getResources();

        DemoTabView view = new DemoTabView(
                mContext,
                resources.getDrawable(R.drawable.ic_launcher),
                resources.getDrawable(R.drawable.transparent)
        );
        view.setTabBackgroundColor(0xFA9A9A9);
        view.setTabForegroundColor(null);
        return view;
    }

    @Override
    public String getId() {
        return mMenuId;
    }

    @Override
    public int getSectionCount() {
        return 1;
    }

    @Nullable
    @Override
    public Section getSection(int index) {
        return mSection;
    }

    @Nullable
    @Override
    public Section getSection(@NonNull SectionId sectionId) {
        return mSection;
    }

    @NonNull
    @Override
    public List<Section> getSections() {
        return Collections.singletonList(mSection);
    }
}
