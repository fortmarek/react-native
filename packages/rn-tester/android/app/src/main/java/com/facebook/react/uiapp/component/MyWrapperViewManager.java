/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.uiapp.component;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.MyWrapperViewManagerDelegate;
import com.facebook.react.viewmanagers.MyWrapperViewManagerInterface;

/** View manager for {@link MyWrapperView} components. */
@ReactModule(name = MyWrapperViewManager.REACT_CLASS)
public class MyWrapperViewManager extends ViewGroupManager<MyWrapperView>
    implements MyWrapperViewManagerInterface<MyWrapperView> {

  public static final String REACT_CLASS = "MyWrapperView";

  private final ViewManagerDelegate<MyWrapperView> mDelegate;

  public MyWrapperViewManager() {
    mDelegate = new MyWrapperViewManagerDelegate<>(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<MyWrapperView> getDelegate() {
    return mDelegate;
  }

  @NonNull
  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @NonNull
  @Override
  protected MyWrapperView createViewInstance(@NonNull ThemedReactContext reactContext) {
    return new MyWrapperView(reactContext);
  }

  @Override
  public void receiveCommand(
      @NonNull MyWrapperView view, String commandName, @Nullable ReadableArray args) {
    mDelegate.receiveCommand(view, commandName, args);
  }
}
