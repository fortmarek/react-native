/**
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @format
 * @flow
 */

'use strict';

import * as React from 'react';
import {Pressable, Text, View} from 'react-native';
import RNTMyNativeView from '../../../NativeComponentExample/js/MyNativeView';
import MyWrapperView from '../../../NativeComponentExample/js/MyWrapperViewNativeComponent';

exports.title = 'New Architecture Examples';
exports.description =
  'Codegen discovery must be enabled for iOS. See Podfile for more details. Simple component using the new architecture.';
exports.examples = [
  {
    title: 'New Architecture Renderer',
    description: 'Click to change background and opacity',
    render(): React.Element<any> {
      return (
        <>
          <View style={{flex: 1}}>
            {/* On Android, this view has a red background as it it was not migrated to Fabric (which it should be) */}
            {/* On iOS, if you press the Pressable, nothing happens (whereas without MyWrapperView, it works as expcted) */}
            <MyWrapperView>
              <Pressable
                onPress={() => {
                  console.log('Pressed!');
                }}>
                <Text style={{color: 'black'}}>Press me!</Text>
              </Pressable>
            </MyWrapperView>
          </View>
        </>
      );
    },
  },
];
