// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/common/ad_type_infos.proto

package com.google.ads.googleads.v3.common;

public interface VideoTrueViewInStreamAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.common.VideoTrueViewInStreamAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_button_label = 1;</code>
   * @return Whether the actionButtonLabel field is set.
   */
  boolean hasActionButtonLabel();
  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_button_label = 1;</code>
   * @return The actionButtonLabel.
   */
  com.google.protobuf.StringValue getActionButtonLabel();
  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_button_label = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getActionButtonLabelOrBuilder();

  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_headline = 2;</code>
   * @return Whether the actionHeadline field is set.
   */
  boolean hasActionHeadline();
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_headline = 2;</code>
   * @return The actionHeadline.
   */
  com.google.protobuf.StringValue getActionHeadline();
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>.google.protobuf.StringValue action_headline = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getActionHeadlineOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue companion_banner = 3;</code>
   * @return Whether the companionBanner field is set.
   */
  boolean hasCompanionBanner();
  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue companion_banner = 3;</code>
   * @return The companionBanner.
   */
  com.google.protobuf.StringValue getCompanionBanner();
  /**
   * <pre>
   * The MediaFile resource name of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue companion_banner = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCompanionBannerOrBuilder();
}
