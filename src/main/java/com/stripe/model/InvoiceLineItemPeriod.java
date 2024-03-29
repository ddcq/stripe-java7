// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class InvoiceLineItemPeriod extends StripeObject {
  /**
   * End of the line item's billing period.
   */
  @SerializedName("end")
  Long end;
  /**
   * Start of the line item's billing period.
   */
  @SerializedName("start")
  Long start;

  /**
   * End of the line item's billing period.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getEnd() {
    return this.end;
  }

  /**
   * Start of the line item's billing period.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getStart() {
    return this.start;
  }

  /**
   * End of the line item's billing period.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setEnd(final Long end) {
    this.end = end;
  }

  /**
   * Start of the line item's billing period.
   */
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
    if (!(o instanceof InvoiceLineItemPeriod)) return false;
    final InvoiceLineItemPeriod other = (InvoiceLineItemPeriod) o;
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
    return other instanceof InvoiceLineItemPeriod;
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
