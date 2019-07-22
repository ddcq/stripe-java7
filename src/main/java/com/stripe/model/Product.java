// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ProductCreateParams;
import com.stripe.param.ProductListParams;
import com.stripe.param.ProductRetrieveParams;
import com.stripe.param.ProductUpdateParams;
import java.util.List;
import java.util.Map;

public class Product extends ApiResource implements HasId, MetadataStore<Product> {
  /**
   * Whether the product is currently available for purchase.
   */
  @SerializedName("active")
  Boolean active;
  /**
   * A list of up to 5 attributes that each SKU can provide values for (e.g., `["color", "size"]`).
   * Only applicable to products of `type=good`.
   */
  @SerializedName("attributes")
  List<String> attributes;
  /**
   * A short one-line description of the product, meant to be displayable to the customer. Only
   * applicable to products of `type=good`.
   */
  @SerializedName("caption")
  String caption;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * An array of connect application identifiers that cannot purchase this product. Only applicable
   * to products of `type=good`.
   */
  @SerializedName("deactivate_on")
  List<String> deactivateOn;
  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;
  /**
   * The product's description, meant to be displayable to the customer. Only applicable to products
   * of `type=good`.
   */
  @SerializedName("description")
  String description;
  /**
   * Unique identifier for the object.
   */
  @SerializedName("id")
  String id;
  /**
   * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
   * Only applicable to products of `type=good`.
   */
  @SerializedName("images")
  List<String> images;
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
   * The product's name, meant to be displayable to the customer. Applicable to both `service` and
   * `good` types.
   */
  @SerializedName("name")
  String name;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own `package_dimensions`. Only applicable to products of
   * `type=good`.
   */
  @SerializedName("package_dimensions")
  PackageDimensions packageDimensions;
  /**
   * Whether this product is a shipped good. Only applicable to products of `type=good`.
   */
  @SerializedName("shippable")
  Boolean shippable;
  /**
   * Extra information about a product which will appear on your customer's credit card statement.
   * In the case that multiple products are billed at once, the first statement descriptor will be
   * used. Only available on products of type=`service`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;
  /**
   * The type of the product. The product is either of type `good`, which is eligible for use with
   * Orders and SKUs, or `service`, which is eligible for use with Subscriptions and Plans.
   */
  @SerializedName("type")
  String type;
  /**
   * A label that represents units of this product, such as seat(s), in Stripe and on customers’
   * receipts and invoices. Only available on products of type=`service`.
   */
  @SerializedName("unit_label")
  String unitLabel;
  @SerializedName("updated")
  Long updated;
  /**
   * A URL of a publicly-accessible webpage for this product. Only applicable to products of
   * `type=good`.
   */
  @SerializedName("url")
  String url;

  /**
   * Creates a new product object. To create a product for use with subscriptions, see <a
   * href="#create_service_product">Subscriptions Products</a>.
   */
  public static Product create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new product object. To create a product for use with subscriptions, see <a
   * href="#create_service_product">Subscriptions Products</a>.
   */
  public static Product create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Creates a new product object. To create a product for use with subscriptions, see <a
   * href="#create_service_product">Subscriptions Products</a>.
   */
  public static Product create(ProductCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new product object. To create a product for use with subscriptions, see <a
   * href="#create_service_product">Subscriptions Products</a>.
   */
  public static Product create(ProductCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, Product.class, options);
  }

  /**
   * Retrieves the details of an existing product. Supply the unique product ID from either a
   * product creation request or the product list, and Stripe will return the corresponding product
   * information.
   */
  public static Product retrieve(String id, ProductRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, Product.class, options);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a product’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing product and create a new one with the new attribute values.
   */
  @Override
  public Product update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a product’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing product and create a new one with the new attribute values.
   */
  @Override
  public Product update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a product’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing product and create a new one with the new attribute values.
   */
  public Product update(ProductUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specific product by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>Note that a product’s <code>attributes</code> are not editable. Instead, you would need to
   * deactivate the existing product and create a new one with the new attribute values.
   */
  public Product update(ProductUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Product.class, options);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return requestCollection(url, params, ProductCollection.class, options);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(ProductListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your products. The products are returned sorted by creation date, with the
   * most recently created products appearing first.
   */
  public static ProductCollection list(ProductListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/products");
    return requestCollection(url, params, ProductCollection.class, options);
  }

  /**
   * Delete a product. Deleting a product with type=<code>good</code> is only possible if it has no
   * SKUs associated with it. Deleting a product with type=<code>service</code> is only possible if
   * it has no plans associated with it.
   */
  public Product delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product with type=<code>good</code> is only possible if it has no
   * SKUs associated with it. Deleting a product with type=<code>service</code> is only possible if
   * it has no plans associated with it.
   */
  public Product delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a product. Deleting a product with type=<code>good</code> is only possible if it has no
   * SKUs associated with it. Deleting a product with type=<code>service</code> is only possible if
   * it has no plans associated with it.
   */
  public Product delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a product. Deleting a product with type=<code>good</code> is only possible if it has no
   * SKUs associated with it. Deleting a product with type=<code>service</code> is only possible if
   * it has no plans associated with it.
   */
  public Product delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/products/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, Product.class, options);
  }

  /**
   * Whether the product is currently available for purchase.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getActive() {
    return this.active;
  }

  /**
   * A list of up to 5 attributes that each SKU can provide values for (e.g., `["color", "size"]`).
   * Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public List<String> getAttributes() {
    return this.attributes;
  }

  /**
   * A short one-line description of the product, meant to be displayable to the customer. Only
   * applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCaption() {
    return this.caption;
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
   * An array of connect application identifiers that cannot purchase this product. Only applicable
   * to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public List<String> getDeactivateOn() {
    return this.deactivateOn;
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
   * The product's description, meant to be displayable to the customer. Only applicable to products
   * of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDescription() {
    return this.description;
  }

  /**
   * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
   * Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public List<String> getImages() {
    return this.images;
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
   * The product's name, meant to be displayable to the customer. Applicable to both `service` and
   * `good` types.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getName() {
    return this.name;
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
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own `package_dimensions`. Only applicable to products of
   * `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public PackageDimensions getPackageDimensions() {
    return this.packageDimensions;
  }

  /**
   * Whether this product is a shipped good. Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getShippable() {
    return this.shippable;
  }

  /**
   * Extra information about a product which will appear on your customer's credit card statement.
   * In the case that multiple products are billed at once, the first statement descriptor will be
   * used. Only available on products of type=`service`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getStatementDescriptor() {
    return this.statementDescriptor;
  }

  /**
   * The type of the product. The product is either of type `good`, which is eligible for use with
   * Orders and SKUs, or `service`, which is eligible for use with Subscriptions and Plans.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  /**
   * A label that represents units of this product, such as seat(s), in Stripe and on customers’
   * receipts and invoices. Only available on products of type=`service`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getUnitLabel() {
    return this.unitLabel;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getUpdated() {
    return this.updated;
  }

  /**
   * A URL of a publicly-accessible webpage for this product. Only applicable to products of
   * `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getUrl() {
    return this.url;
  }

  /**
   * Whether the product is currently available for purchase.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setActive(final Boolean active) {
    this.active = active;
  }

  /**
   * A list of up to 5 attributes that each SKU can provide values for (e.g., `["color", "size"]`).
   * Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAttributes(final List<String> attributes) {
    this.attributes = attributes;
  }

  /**
   * A short one-line description of the product, meant to be displayable to the customer. Only
   * applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCaption(final String caption) {
    this.caption = caption;
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
   * An array of connect application identifiers that cannot purchase this product. Only applicable
   * to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDeactivateOn(final List<String> deactivateOn) {
    this.deactivateOn = deactivateOn;
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
   * The product's description, meant to be displayable to the customer. Only applicable to products
   * of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDescription(final String description) {
    this.description = description;
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
   * A list of up to 8 URLs of images for this product, meant to be displayable to the customer.
   * Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setImages(final List<String> images) {
    this.images = images;
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
   * The product's name, meant to be displayable to the customer. Applicable to both `service` and
   * `good` types.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setName(final String name) {
    this.name = name;
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
   * The dimensions of this product for shipping purposes. A SKU associated with this product can
   * override this value by having its own `package_dimensions`. Only applicable to products of
   * `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPackageDimensions(final PackageDimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
  }

  /**
   * Whether this product is a shipped good. Only applicable to products of `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setShippable(final Boolean shippable) {
    this.shippable = shippable;
  }

  /**
   * Extra information about a product which will appear on your customer's credit card statement.
   * In the case that multiple products are billed at once, the first statement descriptor will be
   * used. Only available on products of type=`service`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStatementDescriptor(final String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  /**
   * The type of the product. The product is either of type `good`, which is eligible for use with
   * Orders and SKUs, or `service`, which is eligible for use with Subscriptions and Plans.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * A label that represents units of this product, such as seat(s), in Stripe and on customers’
   * receipts and invoices. Only available on products of type=`service`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUnitLabel(final String unitLabel) {
    this.unitLabel = unitLabel;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUpdated(final Long updated) {
    this.updated = updated;
  }

  /**
   * A URL of a publicly-accessible webpage for this product. Only applicable to products of
   * `type=good`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUrl(final String url) {
    this.url = url;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Product)) return false;
    final Product other = (Product) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$active = this.getActive();
    final java.lang.Object other$active = other.getActive();
    if (this$active == null ? other$active != null : !this$active.equals(other$active)) return false;
    final java.lang.Object this$attributes = this.getAttributes();
    final java.lang.Object other$attributes = other.getAttributes();
    if (this$attributes == null ? other$attributes != null : !this$attributes.equals(other$attributes)) return false;
    final java.lang.Object this$caption = this.getCaption();
    final java.lang.Object other$caption = other.getCaption();
    if (this$caption == null ? other$caption != null : !this$caption.equals(other$caption)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$deactivateOn = this.getDeactivateOn();
    final java.lang.Object other$deactivateOn = other.getDeactivateOn();
    if (this$deactivateOn == null ? other$deactivateOn != null : !this$deactivateOn.equals(other$deactivateOn)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$images = this.getImages();
    final java.lang.Object other$images = other.getImages();
    if (this$images == null ? other$images != null : !this$images.equals(other$images)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$packageDimensions = this.getPackageDimensions();
    final java.lang.Object other$packageDimensions = other.getPackageDimensions();
    if (this$packageDimensions == null ? other$packageDimensions != null : !this$packageDimensions.equals(other$packageDimensions)) return false;
    final java.lang.Object this$shippable = this.getShippable();
    final java.lang.Object other$shippable = other.getShippable();
    if (this$shippable == null ? other$shippable != null : !this$shippable.equals(other$shippable)) return false;
    final java.lang.Object this$statementDescriptor = this.getStatementDescriptor();
    final java.lang.Object other$statementDescriptor = other.getStatementDescriptor();
    if (this$statementDescriptor == null ? other$statementDescriptor != null : !this$statementDescriptor.equals(other$statementDescriptor)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final java.lang.Object this$unitLabel = this.getUnitLabel();
    final java.lang.Object other$unitLabel = other.getUnitLabel();
    if (this$unitLabel == null ? other$unitLabel != null : !this$unitLabel.equals(other$unitLabel)) return false;
    final java.lang.Object this$updated = this.getUpdated();
    final java.lang.Object other$updated = other.getUpdated();
    if (this$updated == null ? other$updated != null : !this$updated.equals(other$updated)) return false;
    final java.lang.Object this$url = this.getUrl();
    final java.lang.Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Product;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $active = this.getActive();
    result = result * PRIME + ($active == null ? 43 : $active.hashCode());
    final java.lang.Object $attributes = this.getAttributes();
    result = result * PRIME + ($attributes == null ? 43 : $attributes.hashCode());
    final java.lang.Object $caption = this.getCaption();
    result = result * PRIME + ($caption == null ? 43 : $caption.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $deactivateOn = this.getDeactivateOn();
    result = result * PRIME + ($deactivateOn == null ? 43 : $deactivateOn.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $images = this.getImages();
    result = result * PRIME + ($images == null ? 43 : $images.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $packageDimensions = this.getPackageDimensions();
    result = result * PRIME + ($packageDimensions == null ? 43 : $packageDimensions.hashCode());
    final java.lang.Object $shippable = this.getShippable();
    result = result * PRIME + ($shippable == null ? 43 : $shippable.hashCode());
    final java.lang.Object $statementDescriptor = this.getStatementDescriptor();
    result = result * PRIME + ($statementDescriptor == null ? 43 : $statementDescriptor.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final java.lang.Object $unitLabel = this.getUnitLabel();
    result = result * PRIME + ($unitLabel == null ? 43 : $unitLabel.hashCode());
    final java.lang.Object $updated = this.getUpdated();
    result = result * PRIME + ($updated == null ? 43 : $updated.hashCode());
    final java.lang.Object $url = this.getUrl();
    result = result * PRIME + ($url == null ? 43 : $url.hashCode());
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
