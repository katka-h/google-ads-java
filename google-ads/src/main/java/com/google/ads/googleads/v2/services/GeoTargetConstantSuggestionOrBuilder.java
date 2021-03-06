// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/geo_target_constant_service.proto

package com.google.ads.googleads.v2.services;

public interface GeoTargetConstantSuggestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.GeoTargetConstantSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The language this GeoTargetConstantSuggestion is currently translated to.
   * It affects the name of geo target fields. For example, if locale=en, then
   * name=Spain. If locale=es, then name=España. The default locale will be
   * returned if no translation exists for the locale in the request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 1;</code>
   * @return Whether the locale field is set.
   */
  boolean hasLocale();
  /**
   * <pre>
   * The language this GeoTargetConstantSuggestion is currently translated to.
   * It affects the name of geo target fields. For example, if locale=en, then
   * name=Spain. If locale=es, then name=España. The default locale will be
   * returned if no translation exists for the locale in the request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 1;</code>
   * @return The locale.
   */
  com.google.protobuf.StringValue getLocale();
  /**
   * <pre>
   * The language this GeoTargetConstantSuggestion is currently translated to.
   * It affects the name of geo target fields. For example, if locale=en, then
   * name=Spain. If locale=es, then name=España. The default locale will be
   * returned if no translation exists for the locale in the request.
   * </pre>
   *
   * <code>.google.protobuf.StringValue locale = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLocaleOrBuilder();

  /**
   * <pre>
   * Approximate user population that will be targeted, rounded to the
   * nearest 100.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reach = 2;</code>
   * @return Whether the reach field is set.
   */
  boolean hasReach();
  /**
   * <pre>
   * Approximate user population that will be targeted, rounded to the
   * nearest 100.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reach = 2;</code>
   * @return The reach.
   */
  com.google.protobuf.Int64Value getReach();
  /**
   * <pre>
   * Approximate user population that will be targeted, rounded to the
   * nearest 100.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value reach = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getReachOrBuilder();

  /**
   * <pre>
   * If the request searched by location name, this is the location name that
   * matched the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 3;</code>
   * @return Whether the searchTerm field is set.
   */
  boolean hasSearchTerm();
  /**
   * <pre>
   * If the request searched by location name, this is the location name that
   * matched the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 3;</code>
   * @return The searchTerm.
   */
  com.google.protobuf.StringValue getSearchTerm();
  /**
   * <pre>
   * If the request searched by location name, this is the location name that
   * matched the geo target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue search_term = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSearchTermOrBuilder();

  /**
   * <pre>
   * The GeoTargetConstant result.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant = 4;</code>
   * @return Whether the geoTargetConstant field is set.
   */
  boolean hasGeoTargetConstant();
  /**
   * <pre>
   * The GeoTargetConstant result.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant = 4;</code>
   * @return The geoTargetConstant.
   */
  com.google.ads.googleads.v2.resources.GeoTargetConstant getGeoTargetConstant();
  /**
   * <pre>
   * The GeoTargetConstant result.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant = 4;</code>
   */
  com.google.ads.googleads.v2.resources.GeoTargetConstantOrBuilder getGeoTargetConstantOrBuilder();

  /**
   * <pre>
   * The list of parents of the geo target constant.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant_parents = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v2.resources.GeoTargetConstant> 
      getGeoTargetConstantParentsList();
  /**
   * <pre>
   * The list of parents of the geo target constant.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant_parents = 5;</code>
   */
  com.google.ads.googleads.v2.resources.GeoTargetConstant getGeoTargetConstantParents(int index);
  /**
   * <pre>
   * The list of parents of the geo target constant.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant_parents = 5;</code>
   */
  int getGeoTargetConstantParentsCount();
  /**
   * <pre>
   * The list of parents of the geo target constant.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant_parents = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.resources.GeoTargetConstantOrBuilder> 
      getGeoTargetConstantParentsOrBuilderList();
  /**
   * <pre>
   * The list of parents of the geo target constant.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.GeoTargetConstant geo_target_constant_parents = 5;</code>
   */
  com.google.ads.googleads.v2.resources.GeoTargetConstantOrBuilder getGeoTargetConstantParentsOrBuilder(
      int index);
}
