/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.testing;

import android.content.Context;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;

public interface ReactTestFactory {
  public static interface ReactInstanceEasyBuilder {
    ReactInstanceEasyBuilder setContext(Context context);
    ReactInstanceEasyBuilder addNativeModule(NativeModule module);
    ReactInstanceEasyBuilder addJSModule(Class moduleInterfaceClass);
    CatalystInstance build();
  }

  ReactInstanceEasyBuilder getCatalystInstanceBuilder();
  ReactInstanceManager.Builder getReactInstanceManagerBuilder();
}
