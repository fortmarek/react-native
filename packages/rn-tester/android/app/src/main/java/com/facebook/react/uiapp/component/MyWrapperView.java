/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.uiapp.component;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.FabricViewStateManager;
import com.facebook.react.views.view.ReactViewGroup;

class MyWrapperView extends ReactViewGroup implements FabricViewStateManager.HasFabricViewStateManager {
  private final FabricViewStateManager mFabricViewStateManager;

  public MyWrapperView(Context context) {
    super(context);
    mFabricViewStateManager = new FabricViewStateManager();
  }

  @Override
  public FabricViewStateManager getFabricViewStateManager() {
      return mFabricViewStateManager;
  }
}
