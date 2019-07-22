// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class BitcoinTransaction extends StripeObject implements HasId {
  /**
   * The amount of `currency` that the transaction was converted to in real-time.
   */
  @SerializedName("amount")
  Long amount;
  /**
   * The amount of bitcoin contained in the transaction.
   */
  @SerializedName("bitcoin_amount")
  Long bitcoinAmount;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which this
   * transaction was converted.
   */
  @SerializedName("currency")
  String currency;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * The receiver to which this transaction was sent.
   */
  @SerializedName("receiver")
  String receiver;

  /**
   * The amount of `currency` that the transaction was converted to in real-time.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
  }

  /**
   * The amount of bitcoin contained in the transaction.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getBitcoinAmount() {
    return this.bitcoinAmount;
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
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which this
   * transaction was converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCurrency() {
    return this.currency;
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
   * The receiver to which this transaction was sent.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getReceiver() {
    return this.receiver;
  }

  /**
   * The amount of `currency` that the transaction was converted to in real-time.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
  }

  /**
   * The amount of bitcoin contained in the transaction.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBitcoinAmount(final Long bitcoinAmount) {
    this.bitcoinAmount = bitcoinAmount;
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
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which this
   * transaction was converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCurrency(final String currency) {
    this.currency = currency;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * The receiver to which this transaction was sent.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setReceiver(final String receiver) {
    this.receiver = receiver;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof BitcoinTransaction)) return false;
    final BitcoinTransaction other = (BitcoinTransaction) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$bitcoinAmount = this.getBitcoinAmount();
    final java.lang.Object other$bitcoinAmount = other.getBitcoinAmount();
    if (this$bitcoinAmount == null ? other$bitcoinAmount != null : !this$bitcoinAmount.equals(other$bitcoinAmount)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$receiver = this.getReceiver();
    final java.lang.Object other$receiver = other.getReceiver();
    if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof BitcoinTransaction;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $bitcoinAmount = this.getBitcoinAmount();
    result = result * PRIME + ($bitcoinAmount == null ? 43 : $bitcoinAmount.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $receiver = this.getReceiver();
    result = result * PRIME + ($receiver == null ? 43 : $receiver.hashCode());
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
