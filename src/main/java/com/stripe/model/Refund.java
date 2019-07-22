// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.RefundCreateParams;
import com.stripe.param.RefundListParams;
import com.stripe.param.RefundRetrieveParams;
import com.stripe.param.RefundUpdateParams;
import java.util.Map;

public class Refund extends ApiResource implements BalanceTransactionSource, MetadataStore<Refund> {
  /**
   * Amount, in %s.
   */
  @SerializedName("amount")
  Long amount;
  /**
   * Balance transaction that describes the impact on your account balance.
   */
  @SerializedName("balance_transaction")
  ExpandableField<BalanceTransaction> balanceTransaction;
  /**
   * ID of the charge that was refunded.
   */
  @SerializedName("charge")
  ExpandableField<Charge> charge;
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
   * An arbitrary string attached to the object. Often useful for displaying to users. (Available on
   * non-card refunds only)
   */
  @SerializedName("description")
  String description;
  /**
   * If the refund failed, this balance transaction describes the adjustment made on your account
   * balance that reverses the initial balance transaction.
   */
  @SerializedName("failure_balance_transaction")
  ExpandableField<BalanceTransaction> failureBalanceTransaction;
  /**
   * If the refund failed, the reason for refund failure if known. Possible values are
   * `lost_or_stolen_card`, `expired_or_canceled_card`, or `unknown`.
   */
  @SerializedName("failure_reason")
  String failureReason;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
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
   * Reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
   * `requested_by_customer`.
   */
  @SerializedName("reason")
  String reason;
  /**
   * This is the transaction number that appears on email receipts sent for this refund.
   */
  @SerializedName("receipt_number")
  String receiptNumber;
  /**
   * The transfer reversal that is associated with the refund. Only present if the charge came from
   * another Stripe account. See the Connect documentation for details.
   */
  @SerializedName("source_transfer_reversal")
  ExpandableField<TransferReversal> sourceTransferReversal;
  /**
   * Status of the refund. For credit card refunds, this can be `pending`, `succeeded`, or `failed`.
   * For other types of refunds, it can be `pending`, `succeeded`, `failed`, or `canceled`. Refer to
   * our [refunds](https://stripe.com/docs/refunds#failed-refunds) documentation for more details.
   */
  @SerializedName("status")
  String status;
  /**
   * If the accompanying transfer was reversed, the transfer reversal object. Only applicable if the
   * charge was created using the destination parameter.
   */
  @SerializedName("transfer_reversal")
  ExpandableField<TransferReversal> transferReversal;

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
   * Get id of expandable `charge` object.
   */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /**
   * Get expanded `charge`.
   */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
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
   * Get id of expandable `sourceTransferReversal` object.
   */
  public String getSourceTransferReversal() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getId() : null;
  }

  public void setSourceTransferReversal(String id) {
    this.sourceTransferReversal = ApiResource.setExpandableFieldId(id, this.sourceTransferReversal);
  }

  /**
   * Get expanded `sourceTransferReversal`.
   */
  public TransferReversal getSourceTransferReversalObject() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getExpanded() : null;
  }

  public void setSourceTransferReversalObject(TransferReversal expandableObject) {
    this.sourceTransferReversal = new ExpandableField<TransferReversal>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `transferReversal` object.
   */
  public String getTransferReversal() {
    return (this.transferReversal != null) ? this.transferReversal.getId() : null;
  }

  public void setTransferReversal(String id) {
    this.transferReversal = ApiResource.setExpandableFieldId(id, this.transferReversal);
  }

  /**
   * Get expanded `transferReversal`.
   */
  public TransferReversal getTransferReversalObject() {
    return (this.transferReversal != null) ? this.transferReversal.getExpanded() : null;
  }

  public void setTransferReversalObject(TransferReversal expandableObject) {
    this.transferReversal = new ExpandableField<TransferReversal>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return requestCollection(url, params, RefundCollection.class, options);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(RefundListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(RefundListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return requestCollection(url, params, RefundCollection.class, options);
  }

  /**
   * Create a refund.
   */
  public static Refund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a refund.
   */
  public static Refund create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Create a refund.
   */
  public static Refund create(RefundCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a refund.
   */
  public static Refund create(RefundCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Retrieves the details of an existing refund.
   */
  public static Refund retrieve(String refund) throws StripeException {
    return retrieve(refund, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing refund.
   */
  public static Refund retrieve(String refund, RequestOptions options) throws StripeException {
    return retrieve(refund, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing refund.
   */
  public static Refund retrieve(String refund, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund)));
    return request(ApiResource.RequestMethod.GET, url, params, Refund.class, options);
  }

  /**
   * Retrieves the details of an existing refund.
   */
  public static Refund retrieve(String refund, RefundRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund)));
    return request(ApiResource.RequestMethod.GET, url, params, Refund.class, options);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  @Override
  public Refund update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  @Override
  public Refund update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  public Refund update(RefundUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  public Refund update(RefundUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Amount, in %s.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
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
   * An arbitrary string attached to the object. Often useful for displaying to users. (Available on
   * non-card refunds only)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDescription() {
    return this.description;
  }

  /**
   * If the refund failed, the reason for refund failure if known. Possible values are
   * `lost_or_stolen_card`, `expired_or_canceled_card`, or `unknown`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getFailureReason() {
    return this.failureReason;
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
   * Reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
   * `requested_by_customer`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getReason() {
    return this.reason;
  }

  /**
   * This is the transaction number that appears on email receipts sent for this refund.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getReceiptNumber() {
    return this.receiptNumber;
  }

  /**
   * Status of the refund. For credit card refunds, this can be `pending`, `succeeded`, or `failed`.
   * For other types of refunds, it can be `pending`, `succeeded`, `failed`, or `canceled`. Refer to
   * our [refunds](https://stripe.com/docs/refunds#failed-refunds) documentation for more details.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatus() {
    return this.status;
  }

  /**
   * Amount, in %s.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
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
   * An arbitrary string attached to the object. Often useful for displaying to users. (Available on
   * non-card refunds only)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * If the refund failed, the reason for refund failure if known. Possible values are
   * `lost_or_stolen_card`, `expired_or_canceled_card`, or `unknown`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setFailureReason(final String failureReason) {
    this.failureReason = failureReason;
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
   * Reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
   * `requested_by_customer`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setReason(final String reason) {
    this.reason = reason;
  }

  /**
   * This is the transaction number that appears on email receipts sent for this refund.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setReceiptNumber(final String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  /**
   * Status of the refund. For credit card refunds, this can be `pending`, `succeeded`, or `failed`.
   * For other types of refunds, it can be `pending`, `succeeded`, `failed`, or `canceled`. Refer to
   * our [refunds](https://stripe.com/docs/refunds#failed-refunds) documentation for more details.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatus(final String status) {
    this.status = status;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Refund)) return false;
    final Refund other = (Refund) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$balanceTransaction = this.getBalanceTransaction();
    final java.lang.Object other$balanceTransaction = other.getBalanceTransaction();
    if (this$balanceTransaction == null ? other$balanceTransaction != null : !this$balanceTransaction.equals(other$balanceTransaction)) return false;
    final java.lang.Object this$charge = this.getCharge();
    final java.lang.Object other$charge = other.getCharge();
    if (this$charge == null ? other$charge != null : !this$charge.equals(other$charge)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$failureBalanceTransaction = this.getFailureBalanceTransaction();
    final java.lang.Object other$failureBalanceTransaction = other.getFailureBalanceTransaction();
    if (this$failureBalanceTransaction == null ? other$failureBalanceTransaction != null : !this$failureBalanceTransaction.equals(other$failureBalanceTransaction)) return false;
    final java.lang.Object this$failureReason = this.getFailureReason();
    final java.lang.Object other$failureReason = other.getFailureReason();
    if (this$failureReason == null ? other$failureReason != null : !this$failureReason.equals(other$failureReason)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$reason = this.getReason();
    final java.lang.Object other$reason = other.getReason();
    if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
    final java.lang.Object this$receiptNumber = this.getReceiptNumber();
    final java.lang.Object other$receiptNumber = other.getReceiptNumber();
    if (this$receiptNumber == null ? other$receiptNumber != null : !this$receiptNumber.equals(other$receiptNumber)) return false;
    final java.lang.Object this$sourceTransferReversal = this.getSourceTransferReversal();
    final java.lang.Object other$sourceTransferReversal = other.getSourceTransferReversal();
    if (this$sourceTransferReversal == null ? other$sourceTransferReversal != null : !this$sourceTransferReversal.equals(other$sourceTransferReversal)) return false;
    final java.lang.Object this$status = this.getStatus();
    final java.lang.Object other$status = other.getStatus();
    if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
    final java.lang.Object this$transferReversal = this.getTransferReversal();
    final java.lang.Object other$transferReversal = other.getTransferReversal();
    if (this$transferReversal == null ? other$transferReversal != null : !this$transferReversal.equals(other$transferReversal)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Refund;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $balanceTransaction = this.getBalanceTransaction();
    result = result * PRIME + ($balanceTransaction == null ? 43 : $balanceTransaction.hashCode());
    final java.lang.Object $charge = this.getCharge();
    result = result * PRIME + ($charge == null ? 43 : $charge.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $failureBalanceTransaction = this.getFailureBalanceTransaction();
    result = result * PRIME + ($failureBalanceTransaction == null ? 43 : $failureBalanceTransaction.hashCode());
    final java.lang.Object $failureReason = this.getFailureReason();
    result = result * PRIME + ($failureReason == null ? 43 : $failureReason.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $reason = this.getReason();
    result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
    final java.lang.Object $receiptNumber = this.getReceiptNumber();
    result = result * PRIME + ($receiptNumber == null ? 43 : $receiptNumber.hashCode());
    final java.lang.Object $sourceTransferReversal = this.getSourceTransferReversal();
    result = result * PRIME + ($sourceTransferReversal == null ? 43 : $sourceTransferReversal.hashCode());
    final java.lang.Object $status = this.getStatus();
    result = result * PRIME + ($status == null ? 43 : $status.hashCode());
    final java.lang.Object $transferReversal = this.getTransferReversal();
    result = result * PRIME + ($transferReversal == null ? 43 : $transferReversal.hashCode());
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