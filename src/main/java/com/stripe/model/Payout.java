// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PayoutCancelParams;
import com.stripe.param.PayoutCreateParams;
import com.stripe.param.PayoutListParams;
import com.stripe.param.PayoutRetrieveParams;
import com.stripe.param.PayoutUpdateParams;
import java.util.Map;

public class Payout extends ApiResource implements BalanceTransactionSource, MetadataStore<Payout> {
  /**
   * Amount (in %s) to be transferred to your bank account or debit card.
   */
  @SerializedName("amount")
  Long amount;
  /**
   * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank
   * holidays.
   */
  @SerializedName("arrival_date")
  Long arrivalDate;
  /**
   * Returns `true` if the payout was created by an [automated payout
   * schedule](https://stripe.com/docs/payouts#payout-schedule), and `false` if it was [requested
   * manually](https://stripe.com/docs/payouts#manual-payouts).
   */
  @SerializedName("automatic")
  Boolean automatic;
  /**
   * ID of the balance transaction that describes the impact of this payout on your account balance.
   */
  @SerializedName("balance_transaction")
  ExpandableField<BalanceTransaction> balanceTransaction;
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @SerializedName("description")
  String description;
  /**
   * ID of the bank account or card the payout was sent to.
   */
  @SerializedName("destination")
  ExpandableField<ExternalAccount> destination;
  /**
   * If the payout failed or was canceled, this will be the ID of the balance transaction that
   * reversed the initial balance transaction, and puts the funds from the failed payout back in
   * your balance.
   */
  @SerializedName("failure_balance_transaction")
  ExpandableField<BalanceTransaction> failureBalanceTransaction;
  /**
   * Error code explaining reason for payout failure if available. See [Types of payout
   * failures](https://stripe.com/docs/api#payout_failures) for a list of failure codes.
   */
  @SerializedName("failure_code")
  String failureCode;
  /**
   * Message to user further explaining reason for payout failure if available.
   */
  @SerializedName("failure_message")
  String failureMessage;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;
  /**
   * The method used to send this payout, which can be `standard` or `instant`. `instant` is only
   * supported for payouts to debit cards. (See [Instant payouts for
   * marketplaces](/blog/instant-payouts-for-marketplaces) for more information.)
   */
  @SerializedName("method")
  String method;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * The source balance this payout came from. One of `card` or `bank_account`.
   */
  @SerializedName("source_type")
  String sourceType;
  /**
   * Extra information about a payout to be displayed on the user's bank statement.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;
  /**
   * Current status of the payout (`paid`, `pending`, `in_transit`, `canceled` or `failed`). A
   * payout will be `pending` until it is submitted to the bank, at which point it becomes
   * `in_transit`. It will then change to `paid` if the transaction goes through. If it does not go
   * through successfully, its status will change to `failed` or `canceled`.
   */
  @SerializedName("status")
  String status;
  /**
   * Can be `bank_account` or `card`.
   */
  @SerializedName("type")
  String type;

  /**
   * Get id of expandable `balanceTransaction` object.
   */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /**
   * Get expanded `balanceTransaction`.
   */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `destination` object.
   */
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String id) {
    this.destination = ApiResource.setExpandableFieldId(id, this.destination);
  }

  /**
   * Get expanded `destination`.
   */
  public ExternalAccount getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(ExternalAccount expandableObject) {
    this.destination = new ExpandableField<ExternalAccount>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `failureBalanceTransaction` object.
   */
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
  }

  public void setFailureBalanceTransaction(String id) {
    this.failureBalanceTransaction = ApiResource.setExpandableFieldId(id, this.failureBalanceTransaction);
  }

  /**
   * Get expanded `failureBalanceTransaction`.
   */
  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getExpanded() : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.failureBalanceTransaction = new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, RequestOptions options) throws StripeException {
    return retrieve(payout, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout)));
    return request(ApiResource.RequestMethod.GET, url, params, Payout.class, options);
  }

  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list, and Stripe will return the corresponding payout
   * information.
   */
  public static Payout retrieve(String payout, PayoutRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(payout)));
    return request(ApiResource.RequestMethod.GET, url, params, Payout.class, options);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return requestCollection(url, params, PayoutCollection.class, options);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(PayoutListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or that Stripe has sent
   * you. The payouts are returned in sorted order, with the most recently created payouts appearing
   * first.
   */
  public static PayoutCollection list(PayoutListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return requestCollection(url, params, PayoutCollection.class, options);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To send funds to your own bank account, you create a new payout object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the payout amount, or you’ll receive
   * an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though everything else will
   * occur as if in live mode.
   *
   * <p>If you are creating a manual payout on a Stripe account that uses multiple payment source
   * types, you’ll need to specify the source type balance that the payout should draw from. The <a
   * href="#balance_object">balance object</a> details available and pending amounts by source type.
   */
  public static Payout create(PayoutCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payouts");
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  @Override
  public Payout update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified payout by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. This request accepts only the metadata as arguments.
   */
  public Payout update(PayoutUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * A previously created payout can be canceled if it has not yet been paid out. Funds will be
   * refunded to your available balance. You may not cancel automatic Stripe payouts.
   */
  public Payout cancel(PayoutCancelParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Payout.class, options);
  }

  /**
   * Amount (in %s) to be transferred to your bank account or debit card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
  }

  /**
   * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank
   * holidays.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getArrivalDate() {
    return this.arrivalDate;
  }

  /**
   * Returns `true` if the payout was created by an [automated payout
   * schedule](https://stripe.com/docs/payouts#payout-schedule), and `false` if it was [requested
   * manually](https://stripe.com/docs/payouts#manual-payouts).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getAutomatic() {
    return this.automatic;
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDescription() {
    return this.description;
  }

  /**
   * Error code explaining reason for payout failure if available. See [Types of payout
   * failures](https://stripe.com/docs/api#payout_failures) for a list of failure codes.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getFailureCode() {
    return this.failureCode;
  }

  /**
   * Message to user further explaining reason for payout failure if available.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getFailureMessage() {
    return this.failureMessage;
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
   * The method used to send this payout, which can be `standard` or `instant`. `instant` is only
   * supported for payouts to debit cards. (See [Instant payouts for
   * marketplaces](/blog/instant-payouts-for-marketplaces) for more information.)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getMethod() {
    return this.method;
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
   * The source balance this payout came from. One of `card` or `bank_account`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSourceType() {
    return this.sourceType;
  }

  /**
   * Extra information about a payout to be displayed on the user's bank statement.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatementDescriptor() {
    return this.statementDescriptor;
  }

  /**
   * Current status of the payout (`paid`, `pending`, `in_transit`, `canceled` or `failed`). A
   * payout will be `pending` until it is submitted to the bank, at which point it becomes
   * `in_transit`. It will then change to `paid` if the transaction goes through. If it does not go
   * through successfully, its status will change to `failed` or `canceled`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatus() {
    return this.status;
  }

  /**
   * Can be `bank_account` or `card`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  /**
   * Amount (in %s) to be transferred to your bank account or debit card.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
  }

  /**
   * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank
   * holidays.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setArrivalDate(final Long arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  /**
   * Returns `true` if the payout was created by an [automated payout
   * schedule](https://stripe.com/docs/payouts#payout-schedule), and `false` if it was [requested
   * manually](https://stripe.com/docs/payouts#manual-payouts).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAutomatic(final Boolean automatic) {
    this.automatic = automatic;
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
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Error code explaining reason for payout failure if available. See [Types of payout
   * failures](https://stripe.com/docs/api#payout_failures) for a list of failure codes.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setFailureCode(final String failureCode) {
    this.failureCode = failureCode;
  }

  /**
   * Message to user further explaining reason for payout failure if available.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setFailureMessage(final String failureMessage) {
    this.failureMessage = failureMessage;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMetadata(final Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * The method used to send this payout, which can be `standard` or `instant`. `instant` is only
   * supported for payouts to debit cards. (See [Instant payouts for
   * marketplaces](/blog/instant-payouts-for-marketplaces) for more information.)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMethod(final String method) {
    this.method = method;
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
   * The source balance this payout came from. One of `card` or `bank_account`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSourceType(final String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Extra information about a payout to be displayed on the user's bank statement.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatementDescriptor(final String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  /**
   * Current status of the payout (`paid`, `pending`, `in_transit`, `canceled` or `failed`). A
   * payout will be `pending` until it is submitted to the bank, at which point it becomes
   * `in_transit`. It will then change to `paid` if the transaction goes through. If it does not go
   * through successfully, its status will change to `failed` or `canceled`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatus(final String status) {
    this.status = status;
  }

  /**
   * Can be `bank_account` or `card`.
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
    if (!(o instanceof Payout)) return false;
    final Payout other = (Payout) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$arrivalDate = this.getArrivalDate();
    final java.lang.Object other$arrivalDate = other.getArrivalDate();
    if (this$arrivalDate == null ? other$arrivalDate != null : !this$arrivalDate.equals(other$arrivalDate)) return false;
    final java.lang.Object this$automatic = this.getAutomatic();
    final java.lang.Object other$automatic = other.getAutomatic();
    if (this$automatic == null ? other$automatic != null : !this$automatic.equals(other$automatic)) return false;
    final java.lang.Object this$balanceTransaction = this.getBalanceTransaction();
    final java.lang.Object other$balanceTransaction = other.getBalanceTransaction();
    if (this$balanceTransaction == null ? other$balanceTransaction != null : !this$balanceTransaction.equals(other$balanceTransaction)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$destination = this.getDestination();
    final java.lang.Object other$destination = other.getDestination();
    if (this$destination == null ? other$destination != null : !this$destination.equals(other$destination)) return false;
    final java.lang.Object this$failureBalanceTransaction = this.getFailureBalanceTransaction();
    final java.lang.Object other$failureBalanceTransaction = other.getFailureBalanceTransaction();
    if (this$failureBalanceTransaction == null ? other$failureBalanceTransaction != null : !this$failureBalanceTransaction.equals(other$failureBalanceTransaction)) return false;
    final java.lang.Object this$failureCode = this.getFailureCode();
    final java.lang.Object other$failureCode = other.getFailureCode();
    if (this$failureCode == null ? other$failureCode != null : !this$failureCode.equals(other$failureCode)) return false;
    final java.lang.Object this$failureMessage = this.getFailureMessage();
    final java.lang.Object other$failureMessage = other.getFailureMessage();
    if (this$failureMessage == null ? other$failureMessage != null : !this$failureMessage.equals(other$failureMessage)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$method = this.getMethod();
    final java.lang.Object other$method = other.getMethod();
    if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$sourceType = this.getSourceType();
    final java.lang.Object other$sourceType = other.getSourceType();
    if (this$sourceType == null ? other$sourceType != null : !this$sourceType.equals(other$sourceType)) return false;
    final java.lang.Object this$statementDescriptor = this.getStatementDescriptor();
    final java.lang.Object other$statementDescriptor = other.getStatementDescriptor();
    if (this$statementDescriptor == null ? other$statementDescriptor != null : !this$statementDescriptor.equals(other$statementDescriptor)) return false;
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
    return other instanceof Payout;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $arrivalDate = this.getArrivalDate();
    result = result * PRIME + ($arrivalDate == null ? 43 : $arrivalDate.hashCode());
    final java.lang.Object $automatic = this.getAutomatic();
    result = result * PRIME + ($automatic == null ? 43 : $automatic.hashCode());
    final java.lang.Object $balanceTransaction = this.getBalanceTransaction();
    result = result * PRIME + ($balanceTransaction == null ? 43 : $balanceTransaction.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $destination = this.getDestination();
    result = result * PRIME + ($destination == null ? 43 : $destination.hashCode());
    final java.lang.Object $failureBalanceTransaction = this.getFailureBalanceTransaction();
    result = result * PRIME + ($failureBalanceTransaction == null ? 43 : $failureBalanceTransaction.hashCode());
    final java.lang.Object $failureCode = this.getFailureCode();
    result = result * PRIME + ($failureCode == null ? 43 : $failureCode.hashCode());
    final java.lang.Object $failureMessage = this.getFailureMessage();
    result = result * PRIME + ($failureMessage == null ? 43 : $failureMessage.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $method = this.getMethod();
    result = result * PRIME + ($method == null ? 43 : $method.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $sourceType = this.getSourceType();
    result = result * PRIME + ($sourceType == null ? 43 : $sourceType.hashCode());
    final java.lang.Object $statementDescriptor = this.getStatementDescriptor();
    result = result * PRIME + ($statementDescriptor == null ? 43 : $statementDescriptor.hashCode());
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