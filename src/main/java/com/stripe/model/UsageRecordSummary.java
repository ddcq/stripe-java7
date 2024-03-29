// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class UsageRecordSummary extends StripeObject implements HasId {
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * The invoice in which this usage period has been billed for.
   */
  @SerializedName("invoice")
  String invoice;
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
  @SerializedName("period")
  Period period;
  /**
   * The ID of the subscription item this summary is describing.
   */
  @SerializedName("subscription_item")
  String subscriptionItem;
  /**
   * The total usage within this usage period.
   */
  @SerializedName("total_usage")
  Long totalUsage;


  public static class Period extends StripeObject {
    /**
     * The end date of this usage period. All usage up to and including this point in time is
     * included.
     */
    @SerializedName("end")
    Long end;
    /** The start date of this usage period. All usage after this point in time is included. */
    @SerializedName("start")
    Long start;

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public Long getEnd() {
      return this.end;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public Long getStart() {
      return this.start;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setEnd(final Long end) {
      this.end = end;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setStart(final Long start) {
      this.start = start;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof UsageRecordSummary.Period)) return false;
      final UsageRecordSummary.Period other = (UsageRecordSummary.Period) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$end = this.getEnd();
      final java.lang.Object other$end = other.getEnd();
      if (this$end == null ? other$end != null : !this$end.equals(other$end)) return false;
      final java.lang.Object this$start = this.getStart();
      final java.lang.Object other$start = other.getStart();
      if (this$start == null ? other$start != null : !this$start.equals(other$start)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof UsageRecordSummary.Period;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $end = this.getEnd();
      result = result * PRIME + ($end == null ? 43 : $end.hashCode());
      final java.lang.Object $start = this.getStart();
      result = result * PRIME + ($start == null ? 43 : $start.hashCode());
      return result;
    }
  }

  /**
   * The invoice in which this usage period has been billed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getInvoice() {
    return this.invoice;
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

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Period getPeriod() {
    return this.period;
  }

  /**
   * The ID of the subscription item this summary is describing.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSubscriptionItem() {
    return this.subscriptionItem;
  }

  /**
   * The total usage within this usage period.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getTotalUsage() {
    return this.totalUsage;
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
   * The invoice in which this usage period has been billed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setInvoice(final String invoice) {
    this.invoice = invoice;
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

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPeriod(final Period period) {
    this.period = period;
  }

  /**
   * The ID of the subscription item this summary is describing.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSubscriptionItem(final String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
  }

  /**
   * The total usage within this usage period.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setTotalUsage(final Long totalUsage) {
    this.totalUsage = totalUsage;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof UsageRecordSummary)) return false;
    final UsageRecordSummary other = (UsageRecordSummary) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$invoice = this.getInvoice();
    final java.lang.Object other$invoice = other.getInvoice();
    if (this$invoice == null ? other$invoice != null : !this$invoice.equals(other$invoice)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$period = this.getPeriod();
    final java.lang.Object other$period = other.getPeriod();
    if (this$period == null ? other$period != null : !this$period.equals(other$period)) return false;
    final java.lang.Object this$subscriptionItem = this.getSubscriptionItem();
    final java.lang.Object other$subscriptionItem = other.getSubscriptionItem();
    if (this$subscriptionItem == null ? other$subscriptionItem != null : !this$subscriptionItem.equals(other$subscriptionItem)) return false;
    final java.lang.Object this$totalUsage = this.getTotalUsage();
    final java.lang.Object other$totalUsage = other.getTotalUsage();
    if (this$totalUsage == null ? other$totalUsage != null : !this$totalUsage.equals(other$totalUsage)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof UsageRecordSummary;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $invoice = this.getInvoice();
    result = result * PRIME + ($invoice == null ? 43 : $invoice.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $period = this.getPeriod();
    result = result * PRIME + ($period == null ? 43 : $period.hashCode());
    final java.lang.Object $subscriptionItem = this.getSubscriptionItem();
    result = result * PRIME + ($subscriptionItem == null ? 43 : $subscriptionItem.hashCode());
    final java.lang.Object $totalUsage = this.getTotalUsage();
    result = result * PRIME + ($totalUsage == null ? 43 : $totalUsage.hashCode());
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
