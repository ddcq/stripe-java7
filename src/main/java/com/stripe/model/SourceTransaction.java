// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class SourceTransaction extends StripeObject implements HasId {
  @SerializedName("ach_credit_transfer")
  AchCreditTransferData achCreditTransfer;
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount your customer has pushed to
   * the receiver.
   */
  @SerializedName("amount")
  Long amount;
  @SerializedName("chf_credit_transfer")
  ChfCreditTransferData chfCreditTransfer;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;
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
  @SerializedName("paper_check")
  PaperCheckData paperCheck;
  @SerializedName("sepa_credit_transfer")
  SepaCreditTransferData sepaCreditTransfer;
  /**
   * The ID of the source this transaction is attached to.
   */
  @SerializedName("source")
  String source;
  /**
   * The status of the transaction, one of `succeeded`, `pending`, or `failed`.
   */
  @SerializedName("status")
  String status;
  /**
   * The type of source this transaction is attached to.
   */
  @SerializedName("type")
  String type;
  @SerializedName("uk_credit_transfer")
  UKCreditTransferData ukCreditTransfer;


  public static class AchCreditTransferData extends StripeObject {
    /**
     * Customer data associated with the transfer.
     */
    @SerializedName("customer_data")
    String customerData;
    /**
     * Bank account fingerprint associated with the transfer.
     */
    @SerializedName("fingerprint")
    String fingerprint;
    /**
     * Last 4 digits of the account number associated with the transfer.
     */
    @SerializedName("last4")
    String last4;
    /**
     * Routing number associated with the transfer.
     */
    @SerializedName("routing_number")
    String routingNumber;

    /**
     * Customer data associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getCustomerData() {
      return this.customerData;
    }

    /**
     * Bank account fingerprint associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getFingerprint() {
      return this.fingerprint;
    }

    /**
     * Last 4 digits of the account number associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getLast4() {
      return this.last4;
    }

    /**
     * Routing number associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getRoutingNumber() {
      return this.routingNumber;
    }

    /**
     * Customer data associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setCustomerData(final String customerData) {
      this.customerData = customerData;
    }

    /**
     * Bank account fingerprint associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setFingerprint(final String fingerprint) {
      this.fingerprint = fingerprint;
    }

    /**
     * Last 4 digits of the account number associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setLast4(final String last4) {
      this.last4 = last4;
    }

    /**
     * Routing number associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setRoutingNumber(final String routingNumber) {
      this.routingNumber = routingNumber;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceTransaction.AchCreditTransferData)) return false;
      final SourceTransaction.AchCreditTransferData other = (SourceTransaction.AchCreditTransferData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$customerData = this.getCustomerData();
      final java.lang.Object other$customerData = other.getCustomerData();
      if (this$customerData == null ? other$customerData != null : !this$customerData.equals(other$customerData)) return false;
      final java.lang.Object this$fingerprint = this.getFingerprint();
      final java.lang.Object other$fingerprint = other.getFingerprint();
      if (this$fingerprint == null ? other$fingerprint != null : !this$fingerprint.equals(other$fingerprint)) return false;
      final java.lang.Object this$last4 = this.getLast4();
      final java.lang.Object other$last4 = other.getLast4();
      if (this$last4 == null ? other$last4 != null : !this$last4.equals(other$last4)) return false;
      final java.lang.Object this$routingNumber = this.getRoutingNumber();
      final java.lang.Object other$routingNumber = other.getRoutingNumber();
      if (this$routingNumber == null ? other$routingNumber != null : !this$routingNumber.equals(other$routingNumber)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceTransaction.AchCreditTransferData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $customerData = this.getCustomerData();
      result = result * PRIME + ($customerData == null ? 43 : $customerData.hashCode());
      final java.lang.Object $fingerprint = this.getFingerprint();
      result = result * PRIME + ($fingerprint == null ? 43 : $fingerprint.hashCode());
      final java.lang.Object $last4 = this.getLast4();
      result = result * PRIME + ($last4 == null ? 43 : $last4.hashCode());
      final java.lang.Object $routingNumber = this.getRoutingNumber();
      result = result * PRIME + ($routingNumber == null ? 43 : $routingNumber.hashCode());
      return result;
    }
  }


  public static class ChfCreditTransferData extends StripeObject {
    /**
     * Reference associated with the transfer.
     */
    @SerializedName("reference")
    String reference;
    /**
     * Sender's country address.
     */
    @SerializedName("sender_address_country")
    String senderAddressCountry;
    /**
     * Sender's line 1 address.
     */
    @SerializedName("sender_address_line1")
    String senderAddressLine1;
    /**
     * Sender's bank account IBAN.
     */
    @SerializedName("sender_iban")
    String senderIban;
    /**
     * Sender's name.
     */
    @SerializedName("sender_name")
    String senderName;

    /**
     * Reference associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getReference() {
      return this.reference;
    }

    /**
     * Sender's country address.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderAddressCountry() {
      return this.senderAddressCountry;
    }

    /**
     * Sender's line 1 address.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderAddressLine1() {
      return this.senderAddressLine1;
    }

    /**
     * Sender's bank account IBAN.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderIban() {
      return this.senderIban;
    }

    /**
     * Sender's name.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderName() {
      return this.senderName;
    }

    /**
     * Reference associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setReference(final String reference) {
      this.reference = reference;
    }

    /**
     * Sender's country address.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderAddressCountry(final String senderAddressCountry) {
      this.senderAddressCountry = senderAddressCountry;
    }

    /**
     * Sender's line 1 address.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderAddressLine1(final String senderAddressLine1) {
      this.senderAddressLine1 = senderAddressLine1;
    }

    /**
     * Sender's bank account IBAN.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderIban(final String senderIban) {
      this.senderIban = senderIban;
    }

    /**
     * Sender's name.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderName(final String senderName) {
      this.senderName = senderName;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceTransaction.ChfCreditTransferData)) return false;
      final SourceTransaction.ChfCreditTransferData other = (SourceTransaction.ChfCreditTransferData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$reference = this.getReference();
      final java.lang.Object other$reference = other.getReference();
      if (this$reference == null ? other$reference != null : !this$reference.equals(other$reference)) return false;
      final java.lang.Object this$senderAddressCountry = this.getSenderAddressCountry();
      final java.lang.Object other$senderAddressCountry = other.getSenderAddressCountry();
      if (this$senderAddressCountry == null ? other$senderAddressCountry != null : !this$senderAddressCountry.equals(other$senderAddressCountry)) return false;
      final java.lang.Object this$senderAddressLine1 = this.getSenderAddressLine1();
      final java.lang.Object other$senderAddressLine1 = other.getSenderAddressLine1();
      if (this$senderAddressLine1 == null ? other$senderAddressLine1 != null : !this$senderAddressLine1.equals(other$senderAddressLine1)) return false;
      final java.lang.Object this$senderIban = this.getSenderIban();
      final java.lang.Object other$senderIban = other.getSenderIban();
      if (this$senderIban == null ? other$senderIban != null : !this$senderIban.equals(other$senderIban)) return false;
      final java.lang.Object this$senderName = this.getSenderName();
      final java.lang.Object other$senderName = other.getSenderName();
      if (this$senderName == null ? other$senderName != null : !this$senderName.equals(other$senderName)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceTransaction.ChfCreditTransferData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $reference = this.getReference();
      result = result * PRIME + ($reference == null ? 43 : $reference.hashCode());
      final java.lang.Object $senderAddressCountry = this.getSenderAddressCountry();
      result = result * PRIME + ($senderAddressCountry == null ? 43 : $senderAddressCountry.hashCode());
      final java.lang.Object $senderAddressLine1 = this.getSenderAddressLine1();
      result = result * PRIME + ($senderAddressLine1 == null ? 43 : $senderAddressLine1.hashCode());
      final java.lang.Object $senderIban = this.getSenderIban();
      result = result * PRIME + ($senderIban == null ? 43 : $senderIban.hashCode());
      final java.lang.Object $senderName = this.getSenderName();
      result = result * PRIME + ($senderName == null ? 43 : $senderName.hashCode());
      return result;
    }
  }


  public static class PaperCheckData extends StripeObject {
    /**
     * String unix time for the available date.
     */
    @SerializedName("available_at")
    String availableAt;
    /**
     * Invoice ID associated with the paper check.
     */
    @SerializedName("invoices")
    String invoices;

    /**
     * String unix time for the available date.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getAvailableAt() {
      return this.availableAt;
    }

    /**
     * Invoice ID associated with the paper check.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getInvoices() {
      return this.invoices;
    }

    /**
     * String unix time for the available date.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setAvailableAt(final String availableAt) {
      this.availableAt = availableAt;
    }

    /**
     * Invoice ID associated with the paper check.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setInvoices(final String invoices) {
      this.invoices = invoices;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceTransaction.PaperCheckData)) return false;
      final SourceTransaction.PaperCheckData other = (SourceTransaction.PaperCheckData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$availableAt = this.getAvailableAt();
      final java.lang.Object other$availableAt = other.getAvailableAt();
      if (this$availableAt == null ? other$availableAt != null : !this$availableAt.equals(other$availableAt)) return false;
      final java.lang.Object this$invoices = this.getInvoices();
      final java.lang.Object other$invoices = other.getInvoices();
      if (this$invoices == null ? other$invoices != null : !this$invoices.equals(other$invoices)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceTransaction.PaperCheckData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $availableAt = this.getAvailableAt();
      result = result * PRIME + ($availableAt == null ? 43 : $availableAt.hashCode());
      final java.lang.Object $invoices = this.getInvoices();
      result = result * PRIME + ($invoices == null ? 43 : $invoices.hashCode());
      return result;
    }
  }


  public static class SepaCreditTransferData extends StripeObject {
    /**
     * Reference associated with the transfer.
     */
    @SerializedName("reference")
    String reference;
    /**
     * Sender's bank account IBAN.
     */
    @SerializedName("sender_iban")
    String senderIban;
    /**
     * Sender's name.
     */
    @SerializedName("sender_name")
    String senderName;

    /**
     * Reference associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getReference() {
      return this.reference;
    }

    /**
     * Sender's bank account IBAN.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderIban() {
      return this.senderIban;
    }

    /**
     * Sender's name.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderName() {
      return this.senderName;
    }

    /**
     * Reference associated with the transfer.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setReference(final String reference) {
      this.reference = reference;
    }

    /**
     * Sender's bank account IBAN.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderIban(final String senderIban) {
      this.senderIban = senderIban;
    }

    /**
     * Sender's name.
     */
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderName(final String senderName) {
      this.senderName = senderName;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceTransaction.SepaCreditTransferData)) return false;
      final SourceTransaction.SepaCreditTransferData other = (SourceTransaction.SepaCreditTransferData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$reference = this.getReference();
      final java.lang.Object other$reference = other.getReference();
      if (this$reference == null ? other$reference != null : !this$reference.equals(other$reference)) return false;
      final java.lang.Object this$senderIban = this.getSenderIban();
      final java.lang.Object other$senderIban = other.getSenderIban();
      if (this$senderIban == null ? other$senderIban != null : !this$senderIban.equals(other$senderIban)) return false;
      final java.lang.Object this$senderName = this.getSenderName();
      final java.lang.Object other$senderName = other.getSenderName();
      if (this$senderName == null ? other$senderName != null : !this$senderName.equals(other$senderName)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceTransaction.SepaCreditTransferData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $reference = this.getReference();
      result = result * PRIME + ($reference == null ? 43 : $reference.hashCode());
      final java.lang.Object $senderIban = this.getSenderIban();
      result = result * PRIME + ($senderIban == null ? 43 : $senderIban.hashCode());
      final java.lang.Object $senderName = this.getSenderName();
      result = result * PRIME + ($senderName == null ? 43 : $senderName.hashCode());
      return result;
    }
  }


  public static class UKCreditTransferData extends StripeObject {
    /** Bank account fingerprint associated with the transfer. */
    @SerializedName("fingerprint")
    String fingerprint;
    /** Last 4 digits of account number associated with the transfer. */
    @SerializedName("last4")
    String last4;
    /** Sender name associated with the transfer. */
    @SerializedName("sender_name")
    String senderName;
    /** Sort code associated with the transfer. */
    @SerializedName("sort_code")
    String sortCode;

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getFingerprint() {
      return this.fingerprint;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getLast4() {
      return this.last4;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSenderName() {
      return this.senderName;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public String getSortCode() {
      return this.sortCode;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setFingerprint(final String fingerprint) {
      this.fingerprint = fingerprint;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setLast4(final String last4) {
      this.last4 = last4;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSenderName(final String senderName) {
      this.senderName = senderName;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public void setSortCode(final String sortCode) {
      this.sortCode = sortCode;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public boolean equals(final java.lang.Object o) {
      if (o == this) return true;
      if (!(o instanceof SourceTransaction.UKCreditTransferData)) return false;
      final SourceTransaction.UKCreditTransferData other = (SourceTransaction.UKCreditTransferData) o;
      if (!other.canEqual((java.lang.Object) this)) return false;
      final java.lang.Object this$fingerprint = this.getFingerprint();
      final java.lang.Object other$fingerprint = other.getFingerprint();
      if (this$fingerprint == null ? other$fingerprint != null : !this$fingerprint.equals(other$fingerprint)) return false;
      final java.lang.Object this$last4 = this.getLast4();
      final java.lang.Object other$last4 = other.getLast4();
      if (this$last4 == null ? other$last4 != null : !this$last4.equals(other$last4)) return false;
      final java.lang.Object this$senderName = this.getSenderName();
      final java.lang.Object other$senderName = other.getSenderName();
      if (this$senderName == null ? other$senderName != null : !this$senderName.equals(other$senderName)) return false;
      final java.lang.Object this$sortCode = this.getSortCode();
      final java.lang.Object other$sortCode = other.getSortCode();
      if (this$sortCode == null ? other$sortCode != null : !this$sortCode.equals(other$sortCode)) return false;
      return true;
    }

    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    protected boolean canEqual(final java.lang.Object other) {
      return other instanceof SourceTransaction.UKCreditTransferData;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    // @lombok.Generated
    public int hashCode() {
      final int PRIME = 59;
      int result = 1;
      final java.lang.Object $fingerprint = this.getFingerprint();
      result = result * PRIME + ($fingerprint == null ? 43 : $fingerprint.hashCode());
      final java.lang.Object $last4 = this.getLast4();
      result = result * PRIME + ($last4 == null ? 43 : $last4.hashCode());
      final java.lang.Object $senderName = this.getSenderName();
      result = result * PRIME + ($senderName == null ? 43 : $senderName.hashCode());
      final java.lang.Object $sortCode = this.getSortCode();
      result = result * PRIME + ($sortCode == null ? 43 : $sortCode.hashCode());
      return result;
    }
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public AchCreditTransferData getAchCreditTransfer() {
    return this.achCreditTransfer;
  }

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount your customer has pushed to
   * the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public ChfCreditTransferData getChfCreditTransfer() {
    return this.chfCreditTransfer;
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
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCurrency() {
    return this.currency;
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
  public PaperCheckData getPaperCheck() {
    return this.paperCheck;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public SepaCreditTransferData getSepaCreditTransfer() {
    return this.sepaCreditTransfer;
  }

  /**
   * The ID of the source this transaction is attached to.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSource() {
    return this.source;
  }

  /**
   * The status of the transaction, one of `succeeded`, `pending`, or `failed`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatus() {
    return this.status;
  }

  /**
   * The type of source this transaction is attached to.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public UKCreditTransferData getUkCreditTransfer() {
    return this.ukCreditTransfer;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAchCreditTransfer(final AchCreditTransferData achCreditTransfer) {
    this.achCreditTransfer = achCreditTransfer;
  }

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount your customer has pushed to
   * the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setChfCreditTransfer(final ChfCreditTransferData chfCreditTransfer) {
    this.chfCreditTransfer = chfCreditTransfer;
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
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
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
  public void setPaperCheck(final PaperCheckData paperCheck) {
    this.paperCheck = paperCheck;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSepaCreditTransfer(final SepaCreditTransferData sepaCreditTransfer) {
    this.sepaCreditTransfer = sepaCreditTransfer;
  }

  /**
   * The ID of the source this transaction is attached to.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSource(final String source) {
    this.source = source;
  }

  /**
   * The status of the transaction, one of `succeeded`, `pending`, or `failed`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatus(final String status) {
    this.status = status;
  }

  /**
   * The type of source this transaction is attached to.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setType(final String type) {
    this.type = type;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUkCreditTransfer(final UKCreditTransferData ukCreditTransfer) {
    this.ukCreditTransfer = ukCreditTransfer;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof SourceTransaction)) return false;
    final SourceTransaction other = (SourceTransaction) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$achCreditTransfer = this.getAchCreditTransfer();
    final java.lang.Object other$achCreditTransfer = other.getAchCreditTransfer();
    if (this$achCreditTransfer == null ? other$achCreditTransfer != null : !this$achCreditTransfer.equals(other$achCreditTransfer)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$chfCreditTransfer = this.getChfCreditTransfer();
    final java.lang.Object other$chfCreditTransfer = other.getChfCreditTransfer();
    if (this$chfCreditTransfer == null ? other$chfCreditTransfer != null : !this$chfCreditTransfer.equals(other$chfCreditTransfer)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$paperCheck = this.getPaperCheck();
    final java.lang.Object other$paperCheck = other.getPaperCheck();
    if (this$paperCheck == null ? other$paperCheck != null : !this$paperCheck.equals(other$paperCheck)) return false;
    final java.lang.Object this$sepaCreditTransfer = this.getSepaCreditTransfer();
    final java.lang.Object other$sepaCreditTransfer = other.getSepaCreditTransfer();
    if (this$sepaCreditTransfer == null ? other$sepaCreditTransfer != null : !this$sepaCreditTransfer.equals(other$sepaCreditTransfer)) return false;
    final java.lang.Object this$source = this.getSource();
    final java.lang.Object other$source = other.getSource();
    if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
    final java.lang.Object this$status = this.getStatus();
    final java.lang.Object other$status = other.getStatus();
    if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final java.lang.Object this$ukCreditTransfer = this.getUkCreditTransfer();
    final java.lang.Object other$ukCreditTransfer = other.getUkCreditTransfer();
    if (this$ukCreditTransfer == null ? other$ukCreditTransfer != null : !this$ukCreditTransfer.equals(other$ukCreditTransfer)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof SourceTransaction;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $achCreditTransfer = this.getAchCreditTransfer();
    result = result * PRIME + ($achCreditTransfer == null ? 43 : $achCreditTransfer.hashCode());
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $chfCreditTransfer = this.getChfCreditTransfer();
    result = result * PRIME + ($chfCreditTransfer == null ? 43 : $chfCreditTransfer.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $paperCheck = this.getPaperCheck();
    result = result * PRIME + ($paperCheck == null ? 43 : $paperCheck.hashCode());
    final java.lang.Object $sepaCreditTransfer = this.getSepaCreditTransfer();
    result = result * PRIME + ($sepaCreditTransfer == null ? 43 : $sepaCreditTransfer.hashCode());
    final java.lang.Object $source = this.getSource();
    result = result * PRIME + ($source == null ? 43 : $source.hashCode());
    final java.lang.Object $status = this.getStatus();
    result = result * PRIME + ($status == null ? 43 : $status.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final java.lang.Object $ukCreditTransfer = this.getUkCreditTransfer();
    result = result * PRIME + ($ukCreditTransfer == null ? 43 : $ukCreditTransfer.hashCode());
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