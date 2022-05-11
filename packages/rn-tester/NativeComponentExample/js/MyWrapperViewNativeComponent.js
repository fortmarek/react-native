/**
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @flow strict-local
 * @format
 */

 import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';
 import codegenNativeCommands from 'react-native/Libraries/Utilities/codegenNativeCommands';
 import type {HostComponent} from 'react-native/Libraries/Renderer/shims/ReactNativeTypes';
 import type {ViewProps} from 'react-native/Libraries/Components/View/ViewPropTypes';
 import * as React from 'react';
 
 type NativeProps = $ReadOnly<{|
   ...ViewProps,
 |}>;

 interface NativeCommands {}

export const Commands: NativeCommands = codegenNativeCommands<NativeCommands>({
  supportedCommands: [],
});

 export type MyWrapperViewType = HostComponent<NativeProps>;
 
 export default (codegenNativeComponent<NativeProps>(
   'MyWrapperView',
 ): MyWrapperViewType);
 