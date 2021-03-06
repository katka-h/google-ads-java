// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/batch_job.proto

package com.google.ads.googleads.v4.resources;

public final class BatchJobProto {
  private BatchJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_BatchJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_BatchJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_BatchJob_BatchJobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_BatchJob_BatchJobMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v4/resources/batc" +
      "h_job.proto\022!google.ads.googleads.v4.res" +
      "ources\0324google/ads/googleads/v4/enums/ba" +
      "tch_job_status.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032\036google/protobuf/wrappers.proto\032\034google" +
      "/api/annotations.proto\"\334\006\n\010BatchJob\022@\n\rr" +
      "esource_name\030\001 \001(\tB)\340A\005\372A#\n!googleads.go" +
      "ogleapis.com/BatchJob\022,\n\002id\030\002 \001(\0132\033.goog" +
      "le.protobuf.Int64ValueB\003\340A\003\022B\n\027next_add_" +
      "sequence_token\030\003 \001(\0132\034.google.protobuf.S" +
      "tringValueB\003\340A\003\022S\n\010metadata\030\004 \001(\0132<.goog" +
      "le.ads.googleads.v4.resources.BatchJob.B" +
      "atchJobMetadataB\003\340A\003\022U\n\006status\030\005 \001(\0162@.g" +
      "oogle.ads.googleads.v4.enums.BatchJobSta" +
      "tusEnum.BatchJobStatusB\003\340A\003\022A\n\026long_runn" +
      "ing_operation\030\006 \001(\0132\034.google.protobuf.St" +
      "ringValueB\003\340A\003\032\330\002\n\020BatchJobMetadata\022=\n\022c" +
      "reation_date_time\030\001 \001(\0132\034.google.protobu" +
      "f.StringValueB\003\340A\003\022?\n\024completion_date_ti" +
      "me\030\002 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\003\022E\n\032estimated_completion_ratio\030\003 \001(\0132" +
      "\034.google.protobuf.DoubleValueB\003\340A\003\0229\n\017op" +
      "eration_count\030\004 \001(\0132\033.google.protobuf.In" +
      "t64ValueB\003\340A\003\022B\n\030executed_operation_coun" +
      "t\030\005 \001(\0132\033.google.protobuf.Int64ValueB\003\340A" +
      "\003:R\352AO\n!googleads.googleapis.com/BatchJo" +
      "b\022*customers/{customer}/batchJobs/{batch" +
      "_job}B\372\001\n%com.google.ads.googleads.v4.re" +
      "sourcesB\rBatchJobProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v4" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V4.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V4\\Resources\352\002%Google::Ads::Google" +
      "Ads::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.enums.BatchJobStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_BatchJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_BatchJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_BatchJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "NextAddSequenceToken", "Metadata", "Status", "LongRunningOperation", });
    internal_static_google_ads_googleads_v4_resources_BatchJob_BatchJobMetadata_descriptor =
      internal_static_google_ads_googleads_v4_resources_BatchJob_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_BatchJob_BatchJobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_BatchJob_BatchJobMetadata_descriptor,
        new java.lang.String[] { "CreationDateTime", "CompletionDateTime", "EstimatedCompletionRatio", "OperationCount", "ExecutedOperationCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.enums.BatchJobStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
