// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.InvoiceItemCreateParams;
import com.stripe.param.InvoiceItemListParams;
import com.stripe.param.InvoiceItemRetrieveParams;
import com.stripe.param.InvoiceItemUpdateParams;
import java.util.List;
import java.util.Map;

public class InvoiceItem extends ApiResource implements HasId, MetadataStore<InvoiceItem> {
  /**
   * Amount (in the `currency` specified) of the invoice item. This should always be equal to
   * `unit_amount * quantity`.
   */
  @SerializedName("amount")
  Long amount;
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;
  /**
   * The ID of the customer who will be billed when this invoice item is billed.
   */
  @SerializedName("customer")
  ExpandableField<Customer> customer;
  @SerializedName("date")
  Long date;
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
   * If true, discounts will apply to this invoice item. Always false for prorations.
   */
  @SerializedName("discountable")
  Boolean discountable;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * The ID of the invoice this invoice item belongs to.
   */
  @SerializedName("invoice")
  ExpandableField<Invoice> invoice;
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
  @SerializedName("period")
  InvoiceLineItemPeriod period;
  /**
   * If the invoice item is a proration, the plan of the subscription that the proration was
   * computed for.
   */
  @SerializedName("plan")
  Plan plan;
  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer
   * switched plans.
   */
  @SerializedName("proration")
  Boolean proration;
  /**
   * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the
   * subscription that the proration was computed for.
   */
  @SerializedName("quantity")
  Long quantity;
  /**
   * The subscription that this invoice item has been created for, if any.
   */
  @SerializedName("subscription")
  ExpandableField<Subscription> subscription;
  @SerializedName("subscription_item")
  String subscriptionItem;
  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice
   * do not apply to this invoice item.
   */
  @SerializedName("tax_rates")
  List<TaxRate> taxRates;
  /**
   * For prorations this indicates whether Stripe automatically grouped multiple related debit and
   * credit line items into a single combined line item.
   */
  @SerializedName("unified_proration")
  Boolean unifiedProration;
  /**
   * Unit Amount (in the `currency` specified) of the invoice item.
   */
  @SerializedName("unit_amount")
  Long unitAmount;

  /**
   * Get id of expandable `customer` object.
   */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /**
   * Get expanded `customer`.
   */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `invoice` object.
   */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /**
   * Get expanded `invoice`.
   */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `subscription` object.
   */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /**
   * Get expanded `subscription`.
   */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription = new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoiceitems");
    return requestCollection(url, params, InvoiceItemCollection.class, options);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(InvoiceItemListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with
   * the most recently created invoice items appearing first.
   */
  public static InvoiceItemCollection list(InvoiceItemListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoiceitems");
    return requestCollection(url, params, InvoiceItemCollection.class, options);
  }

  /**
   * Creates an item to be added to a draft invoice. If no invoice is specified, the item will be on
   * the next invoice created for the customer specified.
   */
  public static InvoiceItem create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an item to be added to a draft invoice. If no invoice is specified, the item will be on
   * the next invoice created for the customer specified.
   */
  public static InvoiceItem create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoiceitems");
    return request(ApiResource.RequestMethod.POST, url, params, InvoiceItem.class, options);
  }

  /**
   * Creates an item to be added to a draft invoice. If no invoice is specified, the item will be on
   * the next invoice created for the customer specified.
   */
  public static InvoiceItem create(InvoiceItemCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an item to be added to a draft invoice. If no invoice is specified, the item will be on
   * the next invoice created for the customer specified.
   */
  public static InvoiceItem create(InvoiceItemCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/invoiceitems");
    return request(ApiResource.RequestMethod.POST, url, params, InvoiceItem.class, options);
  }

  /**
   * Retrieves the invoice item with the given ID.
   */
  public static InvoiceItem retrieve(String invoiceitem) throws StripeException {
    return retrieve(invoiceitem, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the invoice item with the given ID.
   */
  public static InvoiceItem retrieve(String invoiceitem, RequestOptions options) throws StripeException {
    return retrieve(invoiceitem, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the invoice item with the given ID.
   */
  public static InvoiceItem retrieve(String invoiceitem, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem)));
    return request(ApiResource.RequestMethod.GET, url, params, InvoiceItem.class, options);
  }

  /**
   * Retrieves the invoice item with the given ID.
   */
  public static InvoiceItem retrieve(String invoiceitem, InvoiceItemRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(invoiceitem)));
    return request(ApiResource.RequestMethod.GET, url, params, InvoiceItem.class, options);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  @Override
  public InvoiceItem update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, InvoiceItem.class, options);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(InvoiceItemUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the amount or description of an invoice item on an upcoming invoice. Updating an
   * invoice item is only possible before the invoice it’s attached to is closed.
   */
  public InvoiceItem update(InvoiceItemUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, InvoiceItem.class, options);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes an invoice item, removing it from an invoice. Deleting invoice items is only possible
   * when they’re not attached to invoices, or if it’s attached to a draft invoice.
   */
  public InvoiceItem delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/invoiceitems/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, InvoiceItem.class, options);
  }

  /**
   * Amount (in the `currency` specified) of the invoice item. This should always be equal to
   * `unit_amount * quantity`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getAmount() {
    return this.amount;
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

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getDate() {
    return this.date;
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
   * If true, discounts will apply to this invoice item. Always false for prorations.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getDiscountable() {
    return this.discountable;
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
  public InvoiceLineItemPeriod getPeriod() {
    return this.period;
  }

  /**
   * If the invoice item is a proration, the plan of the subscription that the proration was
   * computed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Plan getPlan() {
    return this.plan;
  }

  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer
   * switched plans.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getProration() {
    return this.proration;
  }

  /**
   * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the
   * subscription that the proration was computed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getQuantity() {
    return this.quantity;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getSubscriptionItem() {
    return this.subscriptionItem;
  }

  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice
   * do not apply to this invoice item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public List<TaxRate> getTaxRates() {
    return this.taxRates;
  }

  /**
   * For prorations this indicates whether Stripe automatically grouped multiple related debit and
   * credit line items into a single combined line item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getUnifiedProration() {
    return this.unifiedProration;
  }

  /**
   * Unit Amount (in the `currency` specified) of the invoice item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getUnitAmount() {
    return this.unitAmount;
  }

  /**
   * Amount (in the `currency` specified) of the invoice item. This should always be equal to
   * `unit_amount * quantity`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAmount(final Long amount) {
    this.amount = amount;
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

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDate(final Long date) {
    this.date = date;
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
   * If true, discounts will apply to this invoice item. Always false for prorations.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDiscountable(final Boolean discountable) {
    this.discountable = discountable;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPeriod(final InvoiceLineItemPeriod period) {
    this.period = period;
  }

  /**
   * If the invoice item is a proration, the plan of the subscription that the proration was
   * computed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPlan(final Plan plan) {
    this.plan = plan;
  }

  /**
   * Whether the invoice item was created automatically as a proration adjustment when the customer
   * switched plans.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setProration(final Boolean proration) {
    this.proration = proration;
  }

  /**
   * Quantity of units for the invoice item. If the invoice item is a proration, the quantity of the
   * subscription that the proration was computed for.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setQuantity(final Long quantity) {
    this.quantity = quantity;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setSubscriptionItem(final String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
  }

  /**
   * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice
   * do not apply to this invoice item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setTaxRates(final List<TaxRate> taxRates) {
    this.taxRates = taxRates;
  }

  /**
   * For prorations this indicates whether Stripe automatically grouped multiple related debit and
   * credit line items into a single combined line item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUnifiedProration(final Boolean unifiedProration) {
    this.unifiedProration = unifiedProration;
  }

  /**
   * Unit Amount (in the `currency` specified) of the invoice item.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUnitAmount(final Long unitAmount) {
    this.unitAmount = unitAmount;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof InvoiceItem)) return false;
    final InvoiceItem other = (InvoiceItem) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$amount = this.getAmount();
    final java.lang.Object other$amount = other.getAmount();
    if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
    final java.lang.Object this$currency = this.getCurrency();
    final java.lang.Object other$currency = other.getCurrency();
    if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
    final java.lang.Object this$customer = this.getCustomer();
    final java.lang.Object other$customer = other.getCustomer();
    if (this$customer == null ? other$customer != null : !this$customer.equals(other$customer)) return false;
    final java.lang.Object this$date = this.getDate();
    final java.lang.Object other$date = other.getDate();
    if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$discountable = this.getDiscountable();
    final java.lang.Object other$discountable = other.getDiscountable();
    if (this$discountable == null ? other$discountable != null : !this$discountable.equals(other$discountable)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$invoice = this.getInvoice();
    final java.lang.Object other$invoice = other.getInvoice();
    if (this$invoice == null ? other$invoice != null : !this$invoice.equals(other$invoice)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$period = this.getPeriod();
    final java.lang.Object other$period = other.getPeriod();
    if (this$period == null ? other$period != null : !this$period.equals(other$period)) return false;
    final java.lang.Object this$plan = this.getPlan();
    final java.lang.Object other$plan = other.getPlan();
    if (this$plan == null ? other$plan != null : !this$plan.equals(other$plan)) return false;
    final java.lang.Object this$proration = this.getProration();
    final java.lang.Object other$proration = other.getProration();
    if (this$proration == null ? other$proration != null : !this$proration.equals(other$proration)) return false;
    final java.lang.Object this$quantity = this.getQuantity();
    final java.lang.Object other$quantity = other.getQuantity();
    if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
    final java.lang.Object this$subscription = this.getSubscription();
    final java.lang.Object other$subscription = other.getSubscription();
    if (this$subscription == null ? other$subscription != null : !this$subscription.equals(other$subscription)) return false;
    final java.lang.Object this$subscriptionItem = this.getSubscriptionItem();
    final java.lang.Object other$subscriptionItem = other.getSubscriptionItem();
    if (this$subscriptionItem == null ? other$subscriptionItem != null : !this$subscriptionItem.equals(other$subscriptionItem)) return false;
    final java.lang.Object this$taxRates = this.getTaxRates();
    final java.lang.Object other$taxRates = other.getTaxRates();
    if (this$taxRates == null ? other$taxRates != null : !this$taxRates.equals(other$taxRates)) return false;
    final java.lang.Object this$unifiedProration = this.getUnifiedProration();
    final java.lang.Object other$unifiedProration = other.getUnifiedProration();
    if (this$unifiedProration == null ? other$unifiedProration != null : !this$unifiedProration.equals(other$unifiedProration)) return false;
    final java.lang.Object this$unitAmount = this.getUnitAmount();
    final java.lang.Object other$unitAmount = other.getUnitAmount();
    if (this$unitAmount == null ? other$unitAmount != null : !this$unitAmount.equals(other$unitAmount)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof InvoiceItem;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $amount = this.getAmount();
    result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
    final java.lang.Object $currency = this.getCurrency();
    result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
    final java.lang.Object $customer = this.getCustomer();
    result = result * PRIME + ($customer == null ? 43 : $customer.hashCode());
    final java.lang.Object $date = this.getDate();
    result = result * PRIME + ($date == null ? 43 : $date.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $discountable = this.getDiscountable();
    result = result * PRIME + ($discountable == null ? 43 : $discountable.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $invoice = this.getInvoice();
    result = result * PRIME + ($invoice == null ? 43 : $invoice.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $period = this.getPeriod();
    result = result * PRIME + ($period == null ? 43 : $period.hashCode());
    final java.lang.Object $plan = this.getPlan();
    result = result * PRIME + ($plan == null ? 43 : $plan.hashCode());
    final java.lang.Object $proration = this.getProration();
    result = result * PRIME + ($proration == null ? 43 : $proration.hashCode());
    final java.lang.Object $quantity = this.getQuantity();
    result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
    final java.lang.Object $subscription = this.getSubscription();
    result = result * PRIME + ($subscription == null ? 43 : $subscription.hashCode());
    final java.lang.Object $subscriptionItem = this.getSubscriptionItem();
    result = result * PRIME + ($subscriptionItem == null ? 43 : $subscriptionItem.hashCode());
    final java.lang.Object $taxRates = this.getTaxRates();
    result = result * PRIME + ($taxRates == null ? 43 : $taxRates.hashCode());
    final java.lang.Object $unifiedProration = this.getUnifiedProration();
    result = result * PRIME + ($unifiedProration == null ? 43 : $unifiedProration.hashCode());
    final java.lang.Object $unitAmount = this.getUnitAmount();
    result = result * PRIME + ($unitAmount == null ? 43 : $unitAmount.hashCode());
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
