// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.radar.ValueListCreateParams;
import com.stripe.param.radar.ValueListListParams;
import com.stripe.param.radar.ValueListRetrieveParams;
import com.stripe.param.radar.ValueListUpdateParams;
import java.util.Map;

public class ValueList extends ApiResource implements HasId, MetadataStore<ValueList> {
  /**
   * The name of the value list for use in rules.
   */
  @SerializedName("alias")
  String alias;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * The name or email address of the user who created this value list.
   */
  @SerializedName("created_by")
  String createdBy;
  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
   * `ip_address`, `country`, `string`, or `case_sensitive_string`.
   */
  @SerializedName("item_type")
  String itemType;
  /**
   * List of items contained within this value list.
   */
  @SerializedName("list_items")
  ValueListItemCollection listItems;
  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;
  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;
  /**
   * The name of the value list.
   */
  @SerializedName("name")
  String name;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return requestCollection(url, params, ValueListCollection.class, options);
  }

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(ValueListListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.
   */
  public static ValueListCollection list(ValueListListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return requestCollection(url, params, ValueListCollection.class, options);
  }

  /**
   * Retrieves a <code>ValueList</code> object.
   */
  public static ValueList retrieve(String valueList) throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a <code>ValueList</code> object.
   */
  public static ValueList retrieve(String valueList, RequestOptions options) throws StripeException {
    return retrieve(valueList, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a <code>ValueList</code> object.
   */
  public static ValueList retrieve(String valueList, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(valueList)));
    return request(ApiResource.RequestMethod.GET, url, params, ValueList.class, options);
  }

  /**
   * Retrieves a <code>ValueList</code> object.
   */
  public static ValueList retrieve(String valueList, ValueListRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(valueList)));
    return request(ApiResource.RequestMethod.GET, url, params, ValueList.class, options);
  }

  /**
   * Creates a new <code>ValueList</code> object, which can then be referenced in rules.
   */
  public static ValueList create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>ValueList</code> object, which can then be referenced in rules.
   */
  public static ValueList create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Creates a new <code>ValueList</code> object, which can then be referenced in rules.
   */
  public static ValueList create(ValueListCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>ValueList</code> object, which can then be referenced in rules.
   */
  public static ValueList create(ValueListCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/radar/value_lists");
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  @Override
  public ValueList update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  @Override
  public ValueList update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  public ValueList update(ValueListUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged. Note that <code>item_type</code> is immutable.
   */
  public ValueList update(ValueListUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, ValueList.class, options);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a <code>ValueList</code> object, also deleting any items contained within the value
   * list. To be deleted, a value list must not be referenced in any rules.
   */
  public ValueList delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/radar/value_lists/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, ValueList.class, options);
  }

  /**
   * The name of the value list for use in rules.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getAlias() {
    return this.alias;
  }

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getCreated() {
    return this.created;
  }

  /**
   * The name or email address of the user who created this value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Always true for a deleted object.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getDeleted() {
    return this.deleted;
  }

  /**
   * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
   * `ip_address`, `country`, `string`, or `case_sensitive_string`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getItemType() {
    return this.itemType;
  }

  /**
   * List of items contained within this value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public ValueListItemCollection getListItems() {
    return this.listItems;
  }

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getLivemode() {
    return this.livemode;
  }

  /**
   * The name of the value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getObject() {
    return this.object;
  }

  /**
   * The name of the value list for use in rules.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAlias(final String alias) {
    this.alias = alias;
  }

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCreated(final Long created) {
    this.created = created;
  }

  /**
   * The name or email address of the user who created this value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCreatedBy(final String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Always true for a deleted object.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDeleted(final Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   * Unique identifier for the object.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `email`,
   * `ip_address`, `country`, `string`, or `case_sensitive_string`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setItemType(final String itemType) {
    this.itemType = itemType;
  }

  /**
   * List of items contained within this value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setListItems(final ValueListItemCollection listItems) {
    this.listItems = listItems;
  }

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setLivemode(final Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMetadata(final Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * The name of the value list.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ValueList)) return false;
    final ValueList other = (ValueList) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$alias = this.getAlias();
    final java.lang.Object other$alias = other.getAlias();
    if (this$alias == null ? other$alias != null : !this$alias.equals(other$alias)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$createdBy = this.getCreatedBy();
    final java.lang.Object other$createdBy = other.getCreatedBy();
    if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$itemType = this.getItemType();
    final java.lang.Object other$itemType = other.getItemType();
    if (this$itemType == null ? other$itemType != null : !this$itemType.equals(other$itemType)) return false;
    final java.lang.Object this$listItems = this.getListItems();
    final java.lang.Object other$listItems = other.getListItems();
    if (this$listItems == null ? other$listItems != null : !this$listItems.equals(other$listItems)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ValueList;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $alias = this.getAlias();
    result = result * PRIME + ($alias == null ? 43 : $alias.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $createdBy = this.getCreatedBy();
    result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $itemType = this.getItemType();
    result = result * PRIME + ($itemType == null ? 43 : $itemType.hashCode());
    final java.lang.Object $listItems = this.getListItems();
    result = result * PRIME + ($listItems == null ? 43 : $listItems.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    return result;
  }

  /**
   * Unique identifier for the object.
   */
  @Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getId() {
    return this.id;
  }

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Map<String, String> getMetadata() {
    return this.metadata;
  }
}
