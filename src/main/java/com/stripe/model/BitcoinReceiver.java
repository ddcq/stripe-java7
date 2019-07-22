// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BitcoinReceiverListParams;
import com.stripe.param.BitcoinReceiverRetrieveParams;
import java.util.Map;

public class BitcoinReceiver extends ApiResource implements PaymentSource {
  /**
   * True when this bitcoin receiver has received a non-zero amount of bitcoin.
   */
  @SerializedName("active")
  Boolean active;
  /**
   * The amount of `currency` that you are collecting as payment.
   */
  @SerializedName("amount")
  Long amount;
  /**
   * The amount of `currency` to which `bitcoin_amount_received` has been converted.
   */
  @SerializedName("amount_received")
  Long amountReceived;
  /**
   * The amount of bitcoin that the customer should send to fill the receiver. The `bitcoin_amount`
   * is denominated in Satoshi: there are 10^8 Satoshi in one bitcoin.
   */
  @SerializedName("bitcoin_amount")
  Long bitcoinAmount;
  /**
   * The amount of bitcoin that has been sent by the customer to this receiver.
   */
  @SerializedName("bitcoin_amount_received")
  Long bitcoinAmountReceived;
  /**
   * This URI can be displayed to the customer as a clickable link (to activate their bitcoin
   * client) or as a QR code (for mobile wallets).
   */
  @SerializedName("bitcoin_uri")
  String bitcoinUri;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which the
   * bitcoin will be converted.
   */
  @SerializedName("currency")
  String currency;
  @SerializedName("customer")
  String customer;
  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @SerializedName("description")
  String description;
  /**
   * The customer's email address, set by the API call that creates the receiver.
   */
  @SerializedName("email")
  String email;
  /**
   * This flag is initially false and updates to true when the customer sends the `bitcoin_amount`
   * to this receiver.
   */
  @SerializedName("filled")
  Boolean filled;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this
   * address to fill the receiver.
   */
  @SerializedName("inbound_address")
  String inboundAddress;
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
   * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with
   * a publishable key.
   */
  @SerializedName("payment")
  String payment;
  @SerializedName("refund_address")
  String refundAddress;
  /**
   * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when
   * viewing the receiver with a publishable key.
   */
  @SerializedName("transactions")
  BitcoinTransactionCollection transactions;
  /**
   * This receiver contains uncaptured funds that can be used for a payment or refunded.
   */
  @SerializedName("uncaptured_funds")
  Boolean uncapturedFunds;
  @SerializedName("used_for_payment")
  Boolean usedForPayment;

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/bitcoin/receivers");
    return requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(BitcoinReceiverListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most
   * recently created receivers appearing first.
   */
  public static BitcoinReceiverCollection list(BitcoinReceiverListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/bitcoin/receivers");
    return requestCollection(url, params, BitcoinReceiverCollection.class, options);
  }

  /**
   * Retrieves the Bitcoin receiver with the given ID.
   */
  public static BitcoinReceiver retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the Bitcoin receiver with the given ID.
   */
  public static BitcoinReceiver retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the Bitcoin receiver with the given ID.
   */
  public static BitcoinReceiver retrieve(String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/bitcoin/receivers/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, BitcoinReceiver.class, options);
  }

  /**
   * Retrieves the Bitcoin receiver with the given ID.
   */
  public static BitcoinReceiver retrieve(String id, BitcoinReceiverRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/bitcoin/receivers/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, BitcoinReceiver.class, options);
  }

  /**
   * True when this bitcoin receiver has received a non-zero amount of bitcoin.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getActive() {
    return this.active;
  }

  /**
   * The amount of `currency` that you are collecting as payment.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
  }

  /**
   * The amount of `currency` to which `bitcoin_amount_received` has been converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmountReceived() {
    return this.amountReceived;
  }

  /**
   * The amount of bitcoin that the customer should send to fill the receiver. The `bitcoin_amount`
   * is denominated in Satoshi: there are 10^8 Satoshi in one bitcoin.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getBitcoinAmount() {
    return this.bitcoinAmount;
  }

  /**
   * The amount of bitcoin that has been sent by the customer to this receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getBitcoinAmountReceived() {
    return this.bitcoinAmountReceived;
  }

  /**
   * This URI can be displayed to the customer as a clickable link (to activate their bitcoin
   * client) or as a QR code (for mobile wallets).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getBitcoinUri() {
    return this.bitcoinUri;
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
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which the
   * bitcoin will be converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCurrency() {
    return this.currency;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCustomer() {
    return this.customer;
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDescription() {
    return this.description;
  }

  /**
   * The customer's email address, set by the API call that creates the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getEmail() {
    return this.email;
  }

  /**
   * This flag is initially false and updates to true when the customer sends the `bitcoin_amount`
   * to this receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getFilled() {
    return this.filled;
  }

  /**
   * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this
   * address to fill the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getInboundAddress() {
    return this.inboundAddress;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Map<String, String> getMetadata() {
    return this.metadata;
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
   * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with
   * a publishable key.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getPayment() {
    return this.payment;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getRefundAddress() {
    return this.refundAddress;
  }

  /**
   * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when
   * viewing the receiver with a publishable key.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BitcoinTransactionCollection getTransactions() {
    return this.transactions;
  }

  /**
   * This receiver contains uncaptured funds that can be used for a payment or refunded.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getUncapturedFunds() {
    return this.uncapturedFunds;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getUsedForPayment() {
    return this.usedForPayment;
  }

  /**
   * True when this bitcoin receiver has received a non-zero amount of bitcoin.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setActive(final Boolean active) {
    this.active = active;
  }

  /**
   * The amount of `currency` that you are collecting as payment.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
  }

  /**
   * The amount of `currency` to which `bitcoin_amount_received` has been converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmountReceived(final Long amountReceived) {
    this.amountReceived = amountReceived;
  }

  /**
   * The amount of bitcoin that the customer should send to fill the receiver. The `bitcoin_amount`
   * is denominated in Satoshi: there are 10^8 Satoshi in one bitcoin.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBitcoinAmount(final Long bitcoinAmount) {
    this.bitcoinAmount = bitcoinAmount;
  }

  /**
   * The amount of bitcoin that has been sent by the customer to this receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBitcoinAmountReceived(final Long bitcoinAmountReceived) {
    this.bitcoinAmountReceived = bitcoinAmountReceived;
  }

  /**
   * This URI can be displayed to the customer as a clickable link (to activate their bitcoin
   * client) or as a QR code (for mobile wallets).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBitcoinUri(final String bitcoinUri) {
    this.bitcoinUri = bitcoinUri;
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
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) to which the
   * bitcoin will be converted.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCurrency(final String currency) {
    this.currency = currency;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCustomer(final String customer) {
    this.customer = customer;
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * The customer's email address, set by the API call that creates the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * This flag is initially false and updates to true when the customer sends the `bitcoin_amount`
   * to this receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setFilled(final Boolean filled) {
    this.filled = filled;
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
   * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this
   * address to fill the receiver.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setInboundAddress(final String inboundAddress) {
    this.inboundAddress = inboundAddress;
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
   * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with
   * a publishable key.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPayment(final String payment) {
    this.payment = payment;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setRefundAddress(final String refundAddress) {
    this.refundAddress = refundAddress;
  }

  /**
   * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when
   * viewing the receiver with a publishable key.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setTransactions(final BitcoinTransactionCollection transactions) {
    this.transactions = transactions;
  }

  /**
   * This receiver contains uncaptured funds that can be used for a payment or refunded.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUncapturedFunds(final Boolean uncapturedFunds) {
    this.uncapturedFunds = uncapturedFunds;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUsedForPayment(final Boolean usedForPayment) {
    this.usedForPayment = usedForPayment;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof BitcoinReceiver)) return false;
    final BitcoinReceiver other = (BitcoinReceiver) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$active = this.getActive();
    final java.lang.Object other$active = other.getActive();
    if (this$active == null ? other$active != null : !this$active.equals(other$active)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$amountReceived = this.getAmountReceived();
    final java.lang.Object other$amountReceived = other.getAmountReceived();
    if (this$amountReceived == null ? other$amountReceived != null : !this$amountReceived.equals(other$amountReceived)) return false;
    final java.lang.Object this$bitcoinAmount = this.getBitcoinAmount();
    final java.lang.Object other$bitcoinAmount = other.getBitcoinAmount();
    if (this$bitcoinAmount == null ? other$bitcoinAmount != null : !this$bitcoinAmount.equals(other$bitcoinAmount)) return false;
    final java.lang.Object this$bitcoinAmountReceived = this.getBitcoinAmountReceived();
    final java.lang.Object other$bitcoinAmountReceived = other.getBitcoinAmountReceived();
    if (this$bitcoinAmountReceived == null ? other$bitcoinAmountReceived != null : !this$bitcoinAmountReceived.equals(other$bitcoinAmountReceived)) return false;
    final java.lang.Object this$bitcoinUri = this.getBitcoinUri();
    final java.lang.Object other$bitcoinUri = other.getBitcoinUri();
    if (this$bitcoinUri == null ? other$bitcoinUri != null : !this$bitcoinUri.equals(other$bitcoinUri)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$customer = this.getCustomer();
    final java.lang.Object other$customer = other.getCustomer();
    if (this$customer == null ? other$customer != null : !this$customer.equals(other$customer)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$email = this.getEmail();
    final java.lang.Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final java.lang.Object this$filled = this.getFilled();
    final java.lang.Object other$filled = other.getFilled();
    if (this$filled == null ? other$filled != null : !this$filled.equals(other$filled)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$inboundAddress = this.getInboundAddress();
    final java.lang.Object other$inboundAddress = other.getInboundAddress();
    if (this$inboundAddress == null ? other$inboundAddress != null : !this$inboundAddress.equals(other$inboundAddress)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$payment = this.getPayment();
    final java.lang.Object other$payment = other.getPayment();
    if (this$payment == null ? other$payment != null : !this$payment.equals(other$payment)) return false;
    final java.lang.Object this$refundAddress = this.getRefundAddress();
    final java.lang.Object other$refundAddress = other.getRefundAddress();
    if (this$refundAddress == null ? other$refundAddress != null : !this$refundAddress.equals(other$refundAddress)) return false;
    final java.lang.Object this$transactions = this.getTransactions();
    final java.lang.Object other$transactions = other.getTransactions();
    if (this$transactions == null ? other$transactions != null : !this$transactions.equals(other$transactions)) return false;
    final java.lang.Object this$uncapturedFunds = this.getUncapturedFunds();
    final java.lang.Object other$uncapturedFunds = other.getUncapturedFunds();
    if (this$uncapturedFunds == null ? other$uncapturedFunds != null : !this$uncapturedFunds.equals(other$uncapturedFunds)) return false;
    final java.lang.Object this$usedForPayment = this.getUsedForPayment();
    final java.lang.Object other$usedForPayment = other.getUsedForPayment();
    if (this$usedForPayment == null ? other$usedForPayment != null : !this$usedForPayment.equals(other$usedForPayment)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof BitcoinReceiver;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $active = this.getActive();
    result = result * PRIME + ($active == null ? 43 : $active.hashCode());
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $amountReceived = this.getAmountReceived();
    result = result * PRIME + ($amountReceived == null ? 43 : $amountReceived.hashCode());
    final java.lang.Object $bitcoinAmount = this.getBitcoinAmount();
    result = result * PRIME + ($bitcoinAmount == null ? 43 : $bitcoinAmount.hashCode());
    final java.lang.Object $bitcoinAmountReceived = this.getBitcoinAmountReceived();
    result = result * PRIME + ($bitcoinAmountReceived == null ? 43 : $bitcoinAmountReceived.hashCode());
    final java.lang.Object $bitcoinUri = this.getBitcoinUri();
    result = result * PRIME + ($bitcoinUri == null ? 43 : $bitcoinUri.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $customer = this.getCustomer();
    result = result * PRIME + ($customer == null ? 43 : $customer.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final java.lang.Object $filled = this.getFilled();
    result = result * PRIME + ($filled == null ? 43 : $filled.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $inboundAddress = this.getInboundAddress();
    result = result * PRIME + ($inboundAddress == null ? 43 : $inboundAddress.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $payment = this.getPayment();
    result = result * PRIME + ($payment == null ? 43 : $payment.hashCode());
    final java.lang.Object $refundAddress = this.getRefundAddress();
    result = result * PRIME + ($refundAddress == null ? 43 : $refundAddress.hashCode());
    final java.lang.Object $transactions = this.getTransactions();
    result = result * PRIME + ($transactions == null ? 43 : $transactions.hashCode());
    final java.lang.Object $uncapturedFunds = this.getUncapturedFunds();
    result = result * PRIME + ($uncapturedFunds == null ? 43 : $uncapturedFunds.hashCode());
    final java.lang.Object $usedForPayment = this.getUsedForPayment();
    result = result * PRIME + ($usedForPayment == null ? 43 : $usedForPayment.hashCode());
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