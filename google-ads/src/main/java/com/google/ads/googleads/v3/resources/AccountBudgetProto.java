// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/account_budget.proto

package com.google.ads.googleads.v3.resources;

public final class AccountBudgetProto {
  private AccountBudgetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AccountBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AccountBudget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_AccountBudget_PendingAccountBudgetProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v3/resources/acco" +
      "unt_budget.proto\022!google.ads.googleads.v" +
      "3.resources\032@google/ads/googleads/v3/enu" +
      "ms/account_budget_proposal_type.proto\0329g" +
      "oogle/ads/googleads/v3/enums/account_bud" +
      "get_status.proto\0327google/ads/googleads/v" +
      "3/enums/spending_limit_type.proto\032-googl" +
      "e/ads/googleads/v3/enums/time_type.proto" +
      "\032\031google/api/resource.proto\032\036google/prot" +
      "obuf/wrappers.proto\032\034google/api/annotati" +
      "ons.proto\"\253\024\n\rAccountBudget\022\025\n\rresource_" +
      "name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google.protobuf" +
      ".Int64Value\0223\n\rbilling_setup\030\003 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022Z\n\006status\030\004 \001(\016" +
      "2J.google.ads.googleads.v3.enums.Account" +
      "BudgetStatusEnum.AccountBudgetStatus\022*\n\004" +
      "name\030\005 \001(\0132\034.google.protobuf.StringValue" +
      "\022>\n\030proposed_start_date_time\030\006 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022>\n\030approved_sta" +
      "rt_date_time\030\007 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022=\n\030total_adjustments_micros\030\022 \001" +
      "(\0132\033.google.protobuf.Int64Value\0229\n\024amoun" +
      "t_served_micros\030\023 \001(\0132\033.google.protobuf." +
      "Int64Value\022;\n\025purchase_order_number\030\024 \001(" +
      "\0132\034.google.protobuf.StringValue\022+\n\005notes" +
      "\030\025 \001(\0132\034.google.protobuf.StringValue\022g\n\020" +
      "pending_proposal\030\026 \001(\0132M.google.ads.goog" +
      "leads.v3.resources.AccountBudget.Pending" +
      "AccountBudgetProposal\022>\n\026proposed_end_da" +
      "te_time\030\010 \001(\0132\034.google.protobuf.StringVa" +
      "lueH\000\022V\n\026proposed_end_time_type\030\t \001(\01624." +
      "google.ads.googleads.v3.enums.TimeTypeEn" +
      "um.TimeTypeH\000\022>\n\026approved_end_date_time\030" +
      "\n \001(\0132\034.google.protobuf.StringValueH\001\022V\n" +
      "\026approved_end_time_type\030\013 \001(\01624.google.a" +
      "ds.googleads.v3.enums.TimeTypeEnum.TimeT" +
      "ypeH\001\022E\n\036proposed_spending_limit_micros\030" +
      "\014 \001(\0132\033.google.protobuf.Int64ValueH\002\022n\n\034" +
      "proposed_spending_limit_type\030\r \001(\0162F.goo" +
      "gle.ads.googleads.v3.enums.SpendingLimit" +
      "TypeEnum.SpendingLimitTypeH\002\022E\n\036approved" +
      "_spending_limit_micros\030\016 \001(\0132\033.google.pr" +
      "otobuf.Int64ValueH\003\022n\n\034approved_spending" +
      "_limit_type\030\017 \001(\0162F.google.ads.googleads" +
      ".v3.enums.SpendingLimitTypeEnum.Spending" +
      "LimitTypeH\003\022E\n\036adjusted_spending_limit_m" +
      "icros\030\020 \001(\0132\033.google.protobuf.Int64Value" +
      "H\004\022n\n\034adjusted_spending_limit_type\030\021 \001(\016" +
      "2F.google.ads.googleads.v3.enums.Spendin" +
      "gLimitTypeEnum.SpendingLimitTypeH\004\032\234\006\n\034P" +
      "endingAccountBudgetProposal\022=\n\027account_b" +
      "udget_proposal\030\001 \001(\0132\034.google.protobuf.S" +
      "tringValue\022m\n\rproposal_type\030\002 \001(\0162V.goog" +
      "le.ads.googleads.v3.enums.AccountBudgetP" +
      "roposalTypeEnum.AccountBudgetProposalTyp" +
      "e\022*\n\004name\030\003 \001(\0132\034.google.protobuf.String" +
      "Value\0225\n\017start_date_time\030\004 \001(\0132\034.google." +
      "protobuf.StringValue\022;\n\025purchase_order_n" +
      "umber\030\t \001(\0132\034.google.protobuf.StringValu" +
      "e\022+\n\005notes\030\n \001(\0132\034.google.protobuf.Strin" +
      "gValue\0228\n\022creation_date_time\030\013 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\0225\n\rend_date_tim" +
      "e\030\005 \001(\0132\034.google.protobuf.StringValueH\000\022" +
      "M\n\rend_time_type\030\006 \001(\01624.google.ads.goog" +
      "leads.v3.enums.TimeTypeEnum.TimeTypeH\000\022<" +
      "\n\025spending_limit_micros\030\007 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueH\001\022e\n\023spending_limit_t" +
      "ype\030\010 \001(\0162F.google.ads.googleads.v3.enum" +
      "s.SpendingLimitTypeEnum.SpendingLimitTyp" +
      "eH\001B\n\n\010end_timeB\020\n\016spending_limit:a\352A^\n&" +
      "googleads.googleapis.com/AccountBudget\0224" +
      "customers/{customer}/accountBudgets/{acc" +
      "ount_budget}B\023\n\021proposed_end_timeB\023\n\021app" +
      "roved_end_timeB\031\n\027proposed_spending_limi" +
      "tB\031\n\027approved_spending_limitB\031\n\027adjusted" +
      "_spending_limitB\377\001\n%com.google.ads.googl" +
      "eads.v3.resourcesB\022AccountBudgetProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v3/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V3::Resourcesb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.AccountBudgetProposalTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.AccountBudgetStatusProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.SpendingLimitTypeProto.getDescriptor(),
          com.google.ads.googleads.v3.enums.TimeTypeProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v3_resources_AccountBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_AccountBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AccountBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "BillingSetup", "Status", "Name", "ProposedStartDateTime", "ApprovedStartDateTime", "TotalAdjustmentsMicros", "AmountServedMicros", "PurchaseOrderNumber", "Notes", "PendingProposal", "ProposedEndDateTime", "ProposedEndTimeType", "ApprovedEndDateTime", "ApprovedEndTimeType", "ProposedSpendingLimitMicros", "ProposedSpendingLimitType", "ApprovedSpendingLimitMicros", "ApprovedSpendingLimitType", "AdjustedSpendingLimitMicros", "AdjustedSpendingLimitType", "ProposedEndTime", "ApprovedEndTime", "ProposedSpendingLimit", "ApprovedSpendingLimit", "AdjustedSpendingLimit", });
    internal_static_google_ads_googleads_v3_resources_AccountBudget_PendingAccountBudgetProposal_descriptor =
      internal_static_google_ads_googleads_v3_resources_AccountBudget_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_AccountBudget_PendingAccountBudgetProposal_descriptor,
        new java.lang.String[] { "AccountBudgetProposal", "ProposalType", "Name", "StartDateTime", "PurchaseOrderNumber", "Notes", "CreationDateTime", "EndDateTime", "EndTimeType", "SpendingLimitMicros", "SpendingLimitType", "EndTime", "SpendingLimit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.AccountBudgetProposalTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.AccountBudgetStatusProto.getDescriptor();
    com.google.ads.googleads.v3.enums.SpendingLimitTypeProto.getDescriptor();
    com.google.ads.googleads.v3.enums.TimeTypeProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}