// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/simulation.proto

package com.google.ads.googleads.v2.common;

public final class SimulationProto {
  private SimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPointList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_BidModifierSimulationPointList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPointList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CpcBidSimulationPointList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPointList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CpvBidSimulationPointList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPointList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPointList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_BidModifierSimulationPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CpcBidSimulationPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_CpvBidSimulationPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v2/common/simulat" +
      "ion.proto\022\036google.ads.googleads.v2.commo" +
      "n\032\036google/protobuf/wrappers.proto\032\034googl" +
      "e/api/annotations.proto\"l\n\036BidModifierSi" +
      "mulationPointList\022J\n\006points\030\001 \003(\0132:.goog" +
      "le.ads.googleads.v2.common.BidModifierSi" +
      "mulationPoint\"b\n\031CpcBidSimulationPointLi" +
      "st\022E\n\006points\030\001 \003(\01325.google.ads.googlead" +
      "s.v2.common.CpcBidSimulationPoint\"b\n\031Cpv" +
      "BidSimulationPointList\022E\n\006points\030\001 \003(\01325" +
      ".google.ads.googleads.v2.common.CpvBidSi" +
      "mulationPoint\"h\n\034TargetCpaSimulationPoin" +
      "tList\022H\n\006points\030\001 \003(\01328.google.ads.googl" +
      "eads.v2.common.TargetCpaSimulationPoint\"" +
      "\322\006\n\032BidModifierSimulationPoint\0222\n\014bid_mo" +
      "difier\030\001 \001(\0132\034.google.protobuf.DoubleVal" +
      "ue\022:\n\024biddable_conversions\030\002 \001(\0132\034.googl" +
      "e.protobuf.DoubleValue\022@\n\032biddable_conve" +
      "rsions_value\030\003 \001(\0132\034.google.protobuf.Dou" +
      "bleValue\022+\n\006clicks\030\004 \001(\0132\033.google.protob" +
      "uf.Int64Value\0220\n\013cost_micros\030\005 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\0220\n\013impressions\030\006" +
      " \001(\0132\033.google.protobuf.Int64Value\0229\n\024top" +
      "_slot_impressions\030\007 \001(\0132\033.google.protobu" +
      "f.Int64Value\022A\n\033parent_biddable_conversi" +
      "ons\030\010 \001(\0132\034.google.protobuf.DoubleValue\022" +
      "G\n!parent_biddable_conversions_value\030\t \001" +
      "(\0132\034.google.protobuf.DoubleValue\0222\n\rpare" +
      "nt_clicks\030\n \001(\0132\033.google.protobuf.Int64V" +
      "alue\0227\n\022parent_cost_micros\030\013 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\0227\n\022parent_impressi" +
      "ons\030\014 \001(\0132\033.google.protobuf.Int64Value\022@" +
      "\n\033parent_top_slot_impressions\030\r \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\022B\n\035parent_requi" +
      "red_budget_micros\030\016 \001(\0132\033.google.protobu" +
      "f.Int64Value\"\226\003\n\025CpcBidSimulationPoint\0223" +
      "\n\016cpc_bid_micros\030\001 \001(\0132\033.google.protobuf" +
      ".Int64Value\022:\n\024biddable_conversions\030\002 \001(" +
      "\0132\034.google.protobuf.DoubleValue\022@\n\032bidda" +
      "ble_conversions_value\030\003 \001(\0132\034.google.pro" +
      "tobuf.DoubleValue\022+\n\006clicks\030\004 \001(\0132\033.goog" +
      "le.protobuf.Int64Value\0220\n\013cost_micros\030\005 " +
      "\001(\0132\033.google.protobuf.Int64Value\0220\n\013impr" +
      "essions\030\006 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\0229\n\024top_slot_impressions\030\007 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\"\334\001\n\025CpvBidSimulati" +
      "onPoint\0223\n\016cpv_bid_micros\030\001 \001(\0132\033.google" +
      ".protobuf.Int64Value\0220\n\013cost_micros\030\002 \001(" +
      "\0132\033.google.protobuf.Int64Value\0220\n\013impres" +
      "sions\030\003 \001(\0132\033.google.protobuf.Int64Value" +
      "\022*\n\005views\030\004 \001(\0132\033.google.protobuf.Int64V" +
      "alue\"\234\003\n\030TargetCpaSimulationPoint\0226\n\021tar" +
      "get_cpa_micros\030\001 \001(\0132\033.google.protobuf.I" +
      "nt64Value\022:\n\024biddable_conversions\030\002 \001(\0132" +
      "\034.google.protobuf.DoubleValue\022@\n\032biddabl" +
      "e_conversions_value\030\003 \001(\0132\034.google.proto" +
      "buf.DoubleValue\022+\n\006clicks\030\004 \001(\0132\033.google" +
      ".protobuf.Int64Value\0220\n\013cost_micros\030\005 \001(" +
      "\0132\033.google.protobuf.Int64Value\0220\n\013impres" +
      "sions\030\006 \001(\0132\033.google.protobuf.Int64Value" +
      "\0229\n\024top_slot_impressions\030\007 \001(\0132\033.google." +
      "protobuf.Int64ValueB\352\001\n\"com.google.ads.g" +
      "oogleads.v2.commonB\017SimulationProtoP\001ZDg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v2/common;common\242\002\003GAA\252\002\036Goog" +
      "le.Ads.GoogleAds.V2.Common\312\002\036Google\\Ads\\" +
      "GoogleAds\\V2\\Common\352\002\"Google::Ads::Googl" +
      "eAds::V2::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPointList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPointList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_BidModifierSimulationPointList_descriptor,
        new java.lang.String[] { "Points", });
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPointList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPointList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CpcBidSimulationPointList_descriptor,
        new java.lang.String[] { "Points", });
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPointList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPointList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CpvBidSimulationPointList_descriptor,
        new java.lang.String[] { "Points", });
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPointList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPointList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPointList_descriptor,
        new java.lang.String[] { "Points", });
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPoint_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_common_BidModifierSimulationPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_BidModifierSimulationPoint_descriptor,
        new java.lang.String[] { "BidModifier", "BiddableConversions", "BiddableConversionsValue", "Clicks", "CostMicros", "Impressions", "TopSlotImpressions", "ParentBiddableConversions", "ParentBiddableConversionsValue", "ParentClicks", "ParentCostMicros", "ParentImpressions", "ParentTopSlotImpressions", "ParentRequiredBudgetMicros", });
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPoint_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v2_common_CpcBidSimulationPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CpcBidSimulationPoint_descriptor,
        new java.lang.String[] { "CpcBidMicros", "BiddableConversions", "BiddableConversionsValue", "Clicks", "CostMicros", "Impressions", "TopSlotImpressions", });
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPoint_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v2_common_CpvBidSimulationPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_CpvBidSimulationPoint_descriptor,
        new java.lang.String[] { "CpvBidMicros", "CostMicros", "Impressions", "Views", });
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPoint_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_TargetCpaSimulationPoint_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "BiddableConversions", "BiddableConversionsValue", "Clicks", "CostMicros", "Impressions", "TopSlotImpressions", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
