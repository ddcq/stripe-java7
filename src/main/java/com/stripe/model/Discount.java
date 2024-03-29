// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiResource;

public class Discount extends StripeObject {
  @SerializedName("coupon")
  Coupon coupon;
  @SerializedName("customer")
  ExpandableField<Customer> customer;
  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;
  /**
   * If the coupon has a duration of `repeating`, the date that this discount will end. If the
   * coupon has a duration of `once` or `forever`, this attribute will be null.
   */
  @SerializedName("end")
  Long end;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * Date that the coupon was applied.
   */
  @SerializedName("start")
  Long start;
  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  @SerializedName("subscription")
  String subscription;

  /**
   * Get id of expandable `customer` object.
   */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /**
   * Get expanded `customer`.
   */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Coupon getCoupon() {
    return this.coupon;
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
   * If the coupon has a duration of `repeating`, the date that this discount will end. If the
   * coupon has a duration of `once` or `forever`, this attribute will be null.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getEnd() {
    return this.end;
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
   * Date that the coupon was applied.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getStart() {
    return this.start;
  }

  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSubscription() {
    return this.subscription;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCoupon(final Coupon coupon) {
    this.coupon = coupon;
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
   * If the coupon has a duration of `repeating`, the date that this discount will end. If the
   * coupon has a duration of `once` or `forever`, this attribute will be null.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setEnd(final Long end) {
    this.end = end;
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
   * Date that the coupon was applied.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStart(final Long start) {
    this.start = start;
  }

  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSubscription(final String subscription) {
    this.subscription = subscription;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Discount)) return false;
    final Discount other = (Discount) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$coupon = this.getCoupon();
    final java.lang.Object other$coupon = other.getCoupon();
    if (this$coupon == null ? other$coupon != null : !this$coupon.equals(other$coupon)) return false;
    final java.lang.Object this$customer = this.getCustomer();
    final java.lang.Object other$customer = other.getCustomer();
    if (this$customer == null ? other$customer != null : !this$customer.equals(other$customer)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$end = this.getEnd();
    final java.lang.Object other$end = other.getEnd();
    if (this$end == null ? other$end != null : !this$end.equals(other$end)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$start = this.getStart();
    final java.lang.Object other$start = other.getStart();
    if (this$start == null ? other$start != null : !this$start.equals(other$start)) return false;
    final java.lang.Object this$subscription = this.getSubscription();
    final java.lang.Object other$subscription = other.getSubscription();
    if (this$subscription == null ? other$subscription != null : !this$subscription.equals(other$subscription)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Discount;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $coupon = this.getCoupon();
    result = result * PRIME + ($coupon == null ? 43 : $coupon.hashCode());
    final java.lang.Object $customer = this.getCustomer();
    result = result * PRIME + ($customer == null ? 43 : $customer.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $end = this.getEnd();
    result = result * PRIME + ($end == null ? 43 : $end.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $start = this.getStart();
    result = result * PRIME + ($start == null ? 43 : $start.hashCode());
    final java.lang.Object $subscription = this.getSubscription();
    result = result * PRIME + ($subscription == null ? 43 : $subscription.hashCode());
    return result;
  }
}
