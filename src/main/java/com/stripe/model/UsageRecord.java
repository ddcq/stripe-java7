// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.UsageRecordCreateOnSubscriptionItemParams;
import java.util.Map;

public class UsageRecord extends ApiResource implements HasId {
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * The usage quantity for the specified date.
   */
  @SerializedName("quantity")
  Long quantity;
  /**
   * The ID of the subscription item this usage record contains data for.
   */
  @SerializedName("subscription_item")
  String subscriptionItem;
  /**
   * The timestamp when this usage occurred.
   */
  @SerializedName("timestamp")
  Long timestamp;

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide <code>quantity</code> information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the <code>quantity</code> values of the
   * usage records within a billing period. You can change this default behavior with the billing
   * plan’s <code>aggregate_usage</code> <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the <code>quantity
   * </code> values together. In most cases, this is the desired resolution, however, you can change
   * this behavior with the <code>action</code> parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(String subscriptionItem, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/subscription_items/%s/usage_records", ApiResource.urlEncodeId(subscriptionItem)));
    return request(ApiResource.RequestMethod.POST, url, params, UsageRecord.class, options);
  }

  /**
   * Creates a usage record for a specified subscription item and date, and fills it with a
   * quantity.
   *
   * <p>Usage records provide <code>quantity</code> information that Stripe uses to track how much a
   * customer is using your service. With usage information and the pricing model set up by the <a
   * href="https://stripe.com/docs/billing/subscriptions/metered-billing">metered billing</a> plan,
   * Stripe helps you send accurate invoices to your customers.
   *
   * <p>The default calculation for usage is to add up all the <code>quantity</code> values of the
   * usage records within a billing period. You can change this default behavior with the billing
   * plan’s <code>aggregate_usage</code> <a
   * href="https://stripe.com/docs/api/plans/create#create_plan-aggregate_usage">parameter</a>. When
   * there is more than one usage record with the same timestamp, Stripe adds the <code>quantity
   * </code> values together. In most cases, this is the desired resolution, however, you can change
   * this behavior with the <code>action</code> parameter.
   *
   * <p>The default pricing model for metered billing is <a
   * href="https://stripe.com/docs/api/plans/object#plan_object-billing_scheme">per-unit
   * pricing</a>. For finer granularity, you can configure metered billing to have a <a
   * href="https://stripe.com/docs/billing/subscriptions/tiers">tiered pricing</a> model.
   */
  public static UsageRecord createOnSubscriptionItem(String subscriptionItem, UsageRecordCreateOnSubscriptionItemParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/subscription_items/%s/usage_records", ApiResource.urlEncodeId(subscriptionItem)));
    return request(ApiResource.RequestMethod.POST, url, params, UsageRecord.class, options);
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
   * The usage quantity for the specified date.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getQuantity() {
    return this.quantity;
  }

  /**
   * The ID of the subscription item this usage record contains data for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSubscriptionItem() {
    return this.subscriptionItem;
  }

  /**
   * The timestamp when this usage occurred.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getTimestamp() {
    return this.timestamp;
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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setLivemode(final Boolean livemode) {
    this.livemode = livemode;
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
   * The usage quantity for the specified date.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setQuantity(final Long quantity) {
    this.quantity = quantity;
  }

  /**
   * The ID of the subscription item this usage record contains data for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSubscriptionItem(final String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
  }

  /**
   * The timestamp when this usage occurred.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setTimestamp(final Long timestamp) {
    this.timestamp = timestamp;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof UsageRecord)) return false;
    final UsageRecord other = (UsageRecord) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$quantity = this.getQuantity();
    final java.lang.Object other$quantity = other.getQuantity();
    if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
    final java.lang.Object this$subscriptionItem = this.getSubscriptionItem();
    final java.lang.Object other$subscriptionItem = other.getSubscriptionItem();
    if (this$subscriptionItem == null ? other$subscriptionItem != null : !this$subscriptionItem.equals(other$subscriptionItem)) return false;
    final java.lang.Object this$timestamp = this.getTimestamp();
    final java.lang.Object other$timestamp = other.getTimestamp();
    if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof UsageRecord;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $quantity = this.getQuantity();
    result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
    final java.lang.Object $subscriptionItem = this.getSubscriptionItem();
    result = result * PRIME + ($subscriptionItem == null ? 43 : $subscriptionItem.hashCode());
    final java.lang.Object $timestamp = this.getTimestamp();
    result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
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
}
