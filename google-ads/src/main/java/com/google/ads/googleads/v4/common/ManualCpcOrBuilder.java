// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/bidding.proto

package com.google.ads.googleads.v4.common;

public interface ManualCpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.ManualCpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   * @return Whether the enhancedCpcEnabled field is set.
   */
  boolean hasEnhancedCpcEnabled();
  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   * @return The enhancedCpcEnabled.
   */
  com.google.protobuf.BoolValue getEnhancedCpcEnabled();
  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnhancedCpcEnabledOrBuilder();
}