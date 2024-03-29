// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundUpdateParams;
import java.util.Map;

public class FeeRefund extends ApiResource implements BalanceTransactionSource, MetadataStore<FeeRefund> {
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
   * ID of the application fee that was refunded.
   */
  @SerializedName("fee")
  ExpandableField<ApplicationFee> fee;
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
   * Get id of expandable `fee` object.
   */
  public String getFee() {
    return (this.fee != null) ? this.fee.getId() : null;
  }

  public void setFee(String id) {
    this.fee = ApiResource.setExpandableFieldId(id, this.fee);
  }

  /**
   * Get expanded `fee`.
   */
  public ApplicationFee getFeeObject() {
    return (this.fee != null) ? this.fee.getExpanded() : null;
  }

  public void setFeeObject(ApplicationFee expandableObject) {
    this.fee = new ExpandableField<ApplicationFee>(expandableObject.getId(), expandableObject);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  @Override
  public FeeRefund update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  @Override
  public FeeRefund update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getFee() != null) {
      url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/application_fees/%s/refunds/%s", ApiResource.urlEncodeId(this.getFee()), ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException("Unable to construct url because [fee] field(s) are all null", null, null, null, 0, null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(FeeRefundUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified application fee refund by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.
   *
   * <p>This request only accepts metadata as an argument.
   */
  public FeeRefund update(FeeRefundUpdateParams params, RequestOptions options) throws StripeException {
    String url;
    if (this.getFee() != null) {
      url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/application_fees/%s/refunds/%s", ApiResource.urlEncodeId(this.getFee()), ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException("Unable to construct url because [fee] field(s) are all null", null, null, null, 0, null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, FeeRefund.class, options);
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getObject() {
    return this.object;
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

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof FeeRefund)) return false;
    final FeeRefund other = (FeeRefund) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$balanceTransaction = this.getBalanceTransaction();
    final java.lang.Object other$balanceTransaction = other.getBalanceTransaction();
    if (this$balanceTransaction == null ? other$balanceTransaction != null : !this$balanceTransaction.equals(other$balanceTransaction)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$fee = this.getFee();
    final java.lang.Object other$fee = other.getFee();
    if (this$fee == null ? other$fee != null : !this$fee.equals(other$fee)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof FeeRefund;
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
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $fee = this.getFee();
    result = result * PRIME + ($fee == null ? 43 : $fee.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
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
