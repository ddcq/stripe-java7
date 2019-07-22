// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.issuing.TransactionListParams;
import com.stripe.param.issuing.TransactionRetrieveParams;
import com.stripe.param.issuing.TransactionUpdateParams;
import java.util.Map;

public class Transaction extends ApiResource implements BalanceTransactionSource, MetadataStore<Transaction> {
  @SerializedName("amount")
  Long amount;
  /**
   * The `Authorization` object that led to this transaction.
   */
  @SerializedName("authorization")
  ExpandableField<Authorization> authorization;
  @SerializedName("balance_transaction")
  ExpandableField<BalanceTransaction> balanceTransaction;
  /**
   * The card used to make this transaction.
   */
  @SerializedName("card")
  ExpandableField<Card> card;
  /**
   * The cardholder to whom this transaction belongs.
   */
  @SerializedName("cardholder")
  ExpandableField<Cardholder> cardholder;
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
  @SerializedName("dispute")
  ExpandableField<Dispute> dispute;
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
  @SerializedName("merchant_amount")
  Long merchantAmount;
  @SerializedName("merchant_currency")
  String merchantCurrency;
  @SerializedName("merchant_data")
  MerchantData merchantData;
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
   * One of `capture`, `refund`, `cash_withdrawal`, `refund_reversal`, `dispute`, or `dispute_loss`.
   */
  @SerializedName("type")
  String type;

  /**
   * Get id of expandable `authorization` object.
   */
  public String getAuthorization() {
    return (this.authorization != null) ? this.authorization.getId() : null;
  }

  public void setAuthorization(String id) {
    this.authorization = ApiResource.setExpandableFieldId(id, this.authorization);
  }

  /**
   * Get expanded `authorization`.
   */
  public Authorization getAuthorizationObject() {
    return (this.authorization != null) ? this.authorization.getExpanded() : null;
  }

  public void setAuthorizationObject(Authorization expandableObject) {
    this.authorization = new ExpandableField<Authorization>(expandableObject.getId(), expandableObject);
  }

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
   * Get id of expandable `card` object.
   */
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String id) {
    this.card = ApiResource.setExpandableFieldId(id, this.card);
  }

  /**
   * Get expanded `card`.
   */
  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card expandableObject) {
    this.card = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `cardholder` object.
   */
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String id) {
    this.cardholder = ApiResource.setExpandableFieldId(id, this.cardholder);
  }

  /**
   * Get expanded `cardholder`.
   */
  public Cardholder getCardholderObject() {
    return (this.cardholder != null) ? this.cardholder.getExpanded() : null;
  }

  public void setCardholderObject(Cardholder expandableObject) {
    this.cardholder = new ExpandableField<Cardholder>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `dispute` object.
   */
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String id) {
    this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
  }

  /**
   * Get expanded `dispute`.
   */
  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute expandableObject) {
    this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/transactions");
    return requestCollection(url, params, TransactionCollection.class, options);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in
   * descending order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/issuing/transactions");
    return requestCollection(url, params, TransactionCollection.class, options);
  }

  /**
   * Retrieves an Issuing <code>Transaction</code> object.
   */
  public static Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves an Issuing <code>Transaction</code> object.
   */
  public static Transaction retrieve(String transaction, RequestOptions options) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves an Issuing <code>Transaction</code> object.
   */
  public static Transaction retrieve(String transaction, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return request(ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /**
   * Retrieves an Issuing <code>Transaction</code> object.
   */
  public static Transaction retrieve(String transaction, TransactionRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return request(ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing <code>Transaction</code> object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getLivemode() {
    return this.livemode;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getMerchantAmount() {
    return this.merchantAmount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getMerchantCurrency() {
    return this.merchantCurrency;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public MerchantData getMerchantData() {
    return this.merchantData;
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
   * One of `capture`, `refund`, `cash_withdrawal`, `refund_reversal`, `dispute`, or `dispute_loss`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setLivemode(final Boolean livemode) {
    this.livemode = livemode;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMerchantAmount(final Long merchantAmount) {
    this.merchantAmount = merchantAmount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMerchantCurrency(final String merchantCurrency) {
    this.merchantCurrency = merchantCurrency;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMerchantData(final MerchantData merchantData) {
    this.merchantData = merchantData;
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
   * One of `capture`, `refund`, `cash_withdrawal`, `refund_reversal`, `dispute`, or `dispute_loss`.
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
    if (!(o instanceof Transaction)) return false;
    final Transaction other = (Transaction) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$authorization = this.getAuthorization();
    final java.lang.Object other$authorization = other.getAuthorization();
    if (this$authorization == null ? other$authorization != null : !this$authorization.equals(other$authorization)) return false;
    final java.lang.Object this$balanceTransaction = this.getBalanceTransaction();
    final java.lang.Object other$balanceTransaction = other.getBalanceTransaction();
    if (this$balanceTransaction == null ? other$balanceTransaction != null : !this$balanceTransaction.equals(other$balanceTransaction)) return false;
    final java.lang.Object this$card = this.getCard();
    final java.lang.Object other$card = other.getCard();
    if (this$card == null ? other$card != null : !this$card.equals(other$card)) return false;
    final java.lang.Object this$cardholder = this.getCardholder();
    final java.lang.Object other$cardholder = other.getCardholder();
    if (this$cardholder == null ? other$cardholder != null : !this$cardholder.equals(other$cardholder)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$dispute = this.getDispute();
    final java.lang.Object other$dispute = other.getDispute();
    if (this$dispute == null ? other$dispute != null : !this$dispute.equals(other$dispute)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$merchantAmount = this.getMerchantAmount();
    final java.lang.Object other$merchantAmount = other.getMerchantAmount();
    if (this$merchantAmount == null ? other$merchantAmount != null : !this$merchantAmount.equals(other$merchantAmount)) return false;
    final java.lang.Object this$merchantCurrency = this.getMerchantCurrency();
    final java.lang.Object other$merchantCurrency = other.getMerchantCurrency();
    if (this$merchantCurrency == null ? other$merchantCurrency != null : !this$merchantCurrency.equals(other$merchantCurrency)) return false;
    final java.lang.Object this$merchantData = this.getMerchantData();
    final java.lang.Object other$merchantData = other.getMerchantData();
    if (this$merchantData == null ? other$merchantData != null : !this$merchantData.equals(other$merchantData)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Transaction;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $authorization = this.getAuthorization();
    result = result * PRIME + ($authorization == null ? 43 : $authorization.hashCode());
    final java.lang.Object $balanceTransaction = this.getBalanceTransaction();
    result = result * PRIME + ($balanceTransaction == null ? 43 : $balanceTransaction.hashCode());
    final java.lang.Object $card = this.getCard();
    result = result * PRIME + ($card == null ? 43 : $card.hashCode());
    final java.lang.Object $cardholder = this.getCardholder();
    result = result * PRIME + ($cardholder == null ? 43 : $cardholder.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $dispute = this.getDispute();
    result = result * PRIME + ($dispute == null ? 43 : $dispute.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $merchantAmount = this.getMerchantAmount();
    result = result * PRIME + ($merchantAmount == null ? 43 : $merchantAmount.hashCode());
    final java.lang.Object $merchantCurrency = this.getMerchantCurrency();
    result = result * PRIME + ($merchantCurrency == null ? 43 : $merchantCurrency.hashCode());
    final java.lang.Object $merchantData = this.getMerchantData();
    result = result * PRIME + ($merchantData == null ? 43 : $merchantData.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
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