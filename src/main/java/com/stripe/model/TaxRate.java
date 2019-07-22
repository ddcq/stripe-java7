// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TaxRateCreateParams;
import com.stripe.param.TaxRateListParams;
import com.stripe.param.TaxRateRetrieveParams;
import com.stripe.param.TaxRateUpdateParams;
import java.math.BigDecimal;
import java.util.Map;

public class TaxRate extends ApiResource implements HasId, MetadataStore<TaxRate> {
  /**
   * Defaults to `true`. When set to `false`, this tax rate cannot be applied to objects in the API,
   * but will still be applied to subscriptions and invoices that already have it set.
   */
  @SerializedName("active")
  Boolean active;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible
   * to your customers.
   */
  @SerializedName("description")
  String description;
  /**
   * The display name of the tax rates as it will appear to your customer on their receipt email,
   * PDF, and the hosted invoice page.
   */
  @SerializedName("display_name")
  String displayName;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * This specifies if the tax rate is inclusive or exclusive.
   */
  @SerializedName("inclusive")
  Boolean inclusive;
  /**
   * The jurisdiction for the tax rate.
   */
  @SerializedName("jurisdiction")
  String jurisdiction;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * This represents the tax rate percent out of 100.
   */
  @SerializedName("percentage")
  BigDecimal percentage;

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return requestCollection(url, params, TaxRateCollection.class, options);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(TaxRateListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most
   * recently created tax rates appearing first.
   */
  public static TaxRateCollection list(TaxRateListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return requestCollection(url, params, TaxRateCollection.class, options);
  }

  /**
   * Retrieves a tax rate with the given ID.
   */
  public static TaxRate retrieve(String taxRate) throws StripeException {
    return retrieve(taxRate, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a tax rate with the given ID.
   */
  public static TaxRate retrieve(String taxRate, RequestOptions options) throws StripeException {
    return retrieve(taxRate, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a tax rate with the given ID.
   */
  public static TaxRate retrieve(String taxRate, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate)));
    return request(ApiResource.RequestMethod.GET, url, params, TaxRate.class, options);
  }

  /**
   * Retrieves a tax rate with the given ID.
   */
  public static TaxRate retrieve(String taxRate, TaxRateRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(taxRate)));
    return request(ApiResource.RequestMethod.GET, url, params, TaxRate.class, options);
  }

  /**
   * Creates a new tax rate.
   */
  public static TaxRate create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new tax rate.
   */
  public static TaxRate create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /**
   * Creates a new tax rate.
   */
  public static TaxRate create(TaxRateCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new tax rate.
   */
  public static TaxRate create(TaxRateCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tax_rates");
    return request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /**
   * Updates an existing tax rate.
   */
  @Override
  public TaxRate update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing tax rate.
   */
  @Override
  public TaxRate update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /**
   * Updates an existing tax rate.
   */
  public TaxRate update(TaxRateUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing tax rate.
   */
  public TaxRate update(TaxRateUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tax_rates/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, TaxRate.class, options);
  }

  /**
   * Defaults to `true`. When set to `false`, this tax rate cannot be applied to objects in the API,
   * but will still be applied to subscriptions and invoices that already have it set.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getActive() {
    return this.active;
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
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible
   * to your customers.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDescription() {
    return this.description;
  }

  /**
   * The display name of the tax rates as it will appear to your customer on their receipt email,
   * PDF, and the hosted invoice page.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDisplayName() {
    return this.displayName;
  }

  /**
   * This specifies if the tax rate is inclusive or exclusive.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getInclusive() {
    return this.inclusive;
  }

  /**
   * The jurisdiction for the tax rate.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getJurisdiction() {
    return this.jurisdiction;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getObject() {
    return this.object;
  }

  /**
   * This represents the tax rate percent out of 100.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BigDecimal getPercentage() {
    return this.percentage;
  }

  /**
   * Defaults to `true`. When set to `false`, this tax rate cannot be applied to objects in the API,
   * but will still be applied to subscriptions and invoices that already have it set.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setActive(final Boolean active) {
    this.active = active;
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
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible
   * to your customers.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * The display name of the tax rates as it will appear to your customer on their receipt email,
   * PDF, and the hosted invoice page.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
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
   * This specifies if the tax rate is inclusive or exclusive.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setInclusive(final Boolean inclusive) {
    this.inclusive = inclusive;
  }

  /**
   * The jurisdiction for the tax rate.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setJurisdiction(final String jurisdiction) {
    this.jurisdiction = jurisdiction;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * This represents the tax rate percent out of 100.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPercentage(final BigDecimal percentage) {
    this.percentage = percentage;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof TaxRate)) return false;
    final TaxRate other = (TaxRate) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$active = this.getActive();
    final java.lang.Object other$active = other.getActive();
    if (this$active == null ? other$active != null : !this$active.equals(other$active)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$displayName = this.getDisplayName();
    final java.lang.Object other$displayName = other.getDisplayName();
    if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$inclusive = this.getInclusive();
    final java.lang.Object other$inclusive = other.getInclusive();
    if (this$inclusive == null ? other$inclusive != null : !this$inclusive.equals(other$inclusive)) return false;
    final java.lang.Object this$jurisdiction = this.getJurisdiction();
    final java.lang.Object other$jurisdiction = other.getJurisdiction();
    if (this$jurisdiction == null ? other$jurisdiction != null : !this$jurisdiction.equals(other$jurisdiction)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$percentage = this.getPercentage();
    final java.lang.Object other$percentage = other.getPercentage();
    if (this$percentage == null ? other$percentage != null : !this$percentage.equals(other$percentage)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof TaxRate;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $active = this.getActive();
    result = result * PRIME + ($active == null ? 43 : $active.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $displayName = this.getDisplayName();
    result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $inclusive = this.getInclusive();
    result = result * PRIME + ($inclusive == null ? 43 : $inclusive.hashCode());
    final java.lang.Object $jurisdiction = this.getJurisdiction();
    result = result * PRIME + ($jurisdiction == null ? 43 : $jurisdiction.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $percentage = this.getPercentage();
    result = result * PRIME + ($percentage == null ? 43 : $percentage.hashCode());
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