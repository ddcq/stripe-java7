// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class SourceMandateNotification extends StripeObject implements HasId {
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  @SerializedName("amount")
  Long amount;
  @SerializedName("bacs_debit")
  BacsDebitData bacsDebit;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
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
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  @SerializedName("reason")
  String reason;
  @SerializedName("sepa_debit")
  SepaDebitData sepaDebit;
  @SerializedName("source")
  Source source;
  /**
   * The status of the mandate notification. Valid statuses are `pending` or `submitted`.
   */
  @SerializedName("status")
  String status;
  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  @SerializedName("type")
  String type;


  public static class BacsDebitData extends StripeObject {
    /**
     * Last 4 digits of the account number associated with the debit.
     */
    @SerializedName("last4")
    String last4;

    /**
     * Last 4 digits of the account number associated with the debit.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getLast4() {
      return this.last4;
    }

    /**
     * Last 4 digits of the account number associated with the debit.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setLast4(final String last4) {
      this.last4 = last4;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceMandateNotification.BacsDebitData)) return false;
      final SourceMandateNotification.BacsDebitData other = (SourceMandateNotification.BacsDebitData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$last4 = this.getLast4();
      final java.lang.Object other$last4 = other.getLast4();
      if (this$last4 == null ? other$last4 != null : !this$last4.equals(other$last4)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceMandateNotification.BacsDebitData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $last4 = this.getLast4();
      result = result * PRIME + ($last4 == null ? 43 : $last4.hashCode());
      return result;
    }
  }


  public static class SepaDebitData extends StripeObject {
    /** SEPA creditor ID. */
    @SerializedName("creditor_identifier")
    String creditorIdentifier;
    /** Last 4 digits of the account number associated with the debit. */
    @SerializedName("last4")
    String last4;
    /** Mandate reference associated with the debit. */
    @SerializedName("mandate_reference")
    String mandateReference;

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getCreditorIdentifier() {
      return this.creditorIdentifier;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getLast4() {
      return this.last4;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getMandateReference() {
      return this.mandateReference;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setCreditorIdentifier(final String creditorIdentifier) {
      this.creditorIdentifier = creditorIdentifier;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setLast4(final String last4) {
      this.last4 = last4;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setMandateReference(final String mandateReference) {
      this.mandateReference = mandateReference;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceMandateNotification.SepaDebitData)) return false;
      final SourceMandateNotification.SepaDebitData other = (SourceMandateNotification.SepaDebitData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$creditorIdentifier = this.getCreditorIdentifier();
      final java.lang.Object other$creditorIdentifier = other.getCreditorIdentifier();
      if (this$creditorIdentifier == null ? other$creditorIdentifier != null : !this$creditorIdentifier.equals(other$creditorIdentifier)) return false;
      final java.lang.Object this$last4 = this.getLast4();
      final java.lang.Object other$last4 = other.getLast4();
      if (this$last4 == null ? other$last4 != null : !this$last4.equals(other$last4)) return false;
      final java.lang.Object this$mandateReference = this.getMandateReference();
      final java.lang.Object other$mandateReference = other.getMandateReference();
      if (this$mandateReference == null ? other$mandateReference != null : !this$mandateReference.equals(other$mandateReference)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceMandateNotification.SepaDebitData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $creditorIdentifier = this.getCreditorIdentifier();
      result = result * PRIME + ($creditorIdentifier == null ? 43 : $creditorIdentifier.hashCode());
      final java.lang.Object $last4 = this.getLast4();
      result = result * PRIME + ($last4 == null ? 43 : $last4.hashCode());
      final java.lang.Object $mandateReference = this.getMandateReference();
      result = result * PRIME + ($mandateReference == null ? 43 : $mandateReference.hashCode());
      return result;
    }
  }

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BacsDebitData getBacsDebit() {
    return this.bacsDebit;
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
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getReason() {
    return this.reason;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public SepaDebitData getSepaDebit() {
    return this.sepaDebit;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Source getSource() {
    return this.source;
  }

  /**
   * The status of the mandate notification. Valid statuses are `pending` or `submitted`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatus() {
    return this.status;
  }

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBacsDebit(final BacsDebitData bacsDebit) {
    this.bacsDebit = bacsDebit;
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
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setReason(final String reason) {
    this.reason = reason;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSepaDebit(final SepaDebitData sepaDebit) {
    this.sepaDebit = sepaDebit;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSource(final Source source) {
    this.source = source;
  }

  /**
   * The status of the mandate notification. Valid statuses are `pending` or `submitted`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatus(final String status) {
    this.status = status;
  }

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setType(final String type) {
    this.type = type;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof SourceMandateNotification)) return false;
    final SourceMandateNotification other = (SourceMandateNotification) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$bacsDebit = this.getBacsDebit();
    final java.lang.Object other$bacsDebit = other.getBacsDebit();
    if (this$bacsDebit == null ? other$bacsDebit != null : !this$bacsDebit.equals(other$bacsDebit)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$reason = this.getReason();
    final java.lang.Object other$reason = other.getReason();
    if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
    final java.lang.Object this$sepaDebit = this.getSepaDebit();
    final java.lang.Object other$sepaDebit = other.getSepaDebit();
    if (this$sepaDebit == null ? other$sepaDebit != null : !this$sepaDebit.equals(other$sepaDebit)) return false;
    final java.lang.Object this$source = this.getSource();
    final java.lang.Object other$source = other.getSource();
    if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
    final java.lang.Object this$status = this.getStatus();
    final java.lang.Object other$status = other.getStatus();
    if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof SourceMandateNotification;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $bacsDebit = this.getBacsDebit();
    result = result * PRIME + ($bacsDebit == null ? 43 : $bacsDebit.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $reason = this.getReason();
    result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
    final java.lang.Object $sepaDebit = this.getSepaDebit();
    result = result * PRIME + ($sepaDebit == null ? 43 : $sepaDebit.hashCode());
    final java.lang.Object $source = this.getSource();
    result = result * PRIME + ($source == null ? 43 : $source.hashCode());
    final java.lang.Object $status = this.getStatus();
    result = result * PRIME + ($status == null ? 43 : $status.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
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
