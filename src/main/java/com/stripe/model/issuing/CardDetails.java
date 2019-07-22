// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;

public class CardDetails extends StripeObject {
  @SerializedName("card")
  Card card;
  /**
   * The CVC number for the card.
   */
  @SerializedName("cvc")
  String cvc;
  /**
   * The expiration month of the card.
   */
  @SerializedName("exp_month")
  Long expMonth;
  /**
   * The expiration year of the card.
   */
  @SerializedName("exp_year")
  Long expYear;
  /**
   * The card number.
   */
  @SerializedName("number")
  String number;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Card getCard() {
    return this.card;
  }

  /**
   * The CVC number for the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCvc() {
    return this.cvc;
  }

  /**
   * The expiration month of the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getExpMonth() {
    return this.expMonth;
  }

  /**
   * The expiration year of the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getExpYear() {
    return this.expYear;
  }

  /**
   * The card number.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getNumber() {
    return this.number;
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
  public void setCard(final Card card) {
    this.card = card;
  }

  /**
   * The CVC number for the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCvc(final String cvc) {
    this.cvc = cvc;
  }

  /**
   * The expiration month of the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setExpMonth(final Long expMonth) {
    this.expMonth = expMonth;
  }

  /**
   * The expiration year of the card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setExpYear(final Long expYear) {
    this.expYear = expYear;
  }

  /**
   * The card number.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setNumber(final String number) {
    this.number = number;
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
    if (!(o instanceof CardDetails)) return false;
    final CardDetails other = (CardDetails) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$card = this.getCard();
    final java.lang.Object other$card = other.getCard();
    if (this$card == null ? other$card != null : !this$card.equals(other$card)) return false;
    final java.lang.Object this$cvc = this.getCvc();
    final java.lang.Object other$cvc = other.getCvc();
    if (this$cvc == null ? other$cvc != null : !this$cvc.equals(other$cvc)) return false;
    final java.lang.Object this$expMonth = this.getExpMonth();
    final java.lang.Object other$expMonth = other.getExpMonth();
    if (this$expMonth == null ? other$expMonth != null : !this$expMonth.equals(other$expMonth)) return false;
    final java.lang.Object this$expYear = this.getExpYear();
    final java.lang.Object other$expYear = other.getExpYear();
    if (this$expYear == null ? other$expYear != null : !this$expYear.equals(other$expYear)) return false;
    final java.lang.Object this$number = this.getNumber();
    final java.lang.Object other$number = other.getNumber();
    if (this$number == null ? other$number != null : !this$number.equals(other$number)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof CardDetails;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $card = this.getCard();
    result = result * PRIME + ($card == null ? 43 : $card.hashCode());
    final java.lang.Object $cvc = this.getCvc();
    result = result * PRIME + ($cvc == null ? 43 : $cvc.hashCode());
    final java.lang.Object $expMonth = this.getExpMonth();
    result = result * PRIME + ($expMonth == null ? 43 : $expMonth.hashCode());
    final java.lang.Object $expYear = this.getExpYear();
    result = result * PRIME + ($expYear == null ? 43 : $expYear.hashCode());
    final java.lang.Object $number = this.getNumber();
    result = result * PRIME + ($number == null ? 43 : $number.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    return result;
  }
}