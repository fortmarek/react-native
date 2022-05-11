/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#import "MyWrapperViewComponentView.h"

#import <react/renderer/components/MyNativeViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/MyNativeViewSpec/EventEmitters.h>
#import <react/renderer/components/MyNativeViewSpec/Props.h>
#import <react/renderer/components/MyNativeViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"

using namespace facebook::react;

@interface MyWrapperViewComponentView () <RCTMyWrapperViewViewProtocol>
@end

@implementation MyWrapperViewComponentView {
  UIView *_view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
  return concreteComponentDescriptorProvider<MyWrapperViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const MyWrapperViewProps>();
    _props = defaultProps;

    _view = [[UIView alloc] init];

    self.contentView = _view;
  }

  return self;
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
  [super updateProps:props oldProps:oldProps];
}

- (void)onChange:(UIView *)sender
{
  // No-op
  //  std::dynamic_pointer_cast<const ViewEventEmitter>(_eventEmitter)
  //      ->onChange(ViewEventEmitter::OnChange{.value = static_cast<bool>(sender.on)});
}

@end

Class<RCTComponentViewProtocol> MyWrapperViewCls(void)
{
  return MyWrapperViewComponentView.class;
}
