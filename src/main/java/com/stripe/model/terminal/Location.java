// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.LocationCreateParams;
import com.stripe.param.terminal.LocationDeleteParams;
import com.stripe.param.terminal.LocationListParams;
import com.stripe.param.terminal.LocationRetrieveParams;
import com.stripe.param.terminal.LocationUpdateParams;
import java.util.Map;

public class Location extends ApiResource implements HasId {
  @SerializedName("address")
  Address address;
  /**
   * Always true for a deleted object.
   */
  @SerializedName("deleted")
  Boolean deleted;
  /**
   * The display name of the location.
   */
  @SerializedName("display_name")
  String displayName;
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
   * Retrieves a <code>Location</code> object.
   */
  public static Location retrieve(String location) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a <code>Location</code> object.
   */
  public static Location retrieve(String location, RequestOptions options) throws StripeException {
    return retrieve(location, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a <code>Location</code> object.
   */
  public static Location retrieve(String location, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location)));
    return request(ApiResource.RequestMethod.GET, url, params, Location.class, options);
  }

  /**
   * Retrieves a <code>Location</code> object.
   */
  public static Location retrieve(String location, LocationRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(location)));
    return request(ApiResource.RequestMethod.GET, url, params, Location.class, options);
  }

  /**
   * Creates a new <code>Location</code> object.
   */
  public static Location create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Location</code> object.
   */
  public static Location create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Creates a new <code>Location</code> object.
   */
  public static Location create(LocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Location</code> object.
   */
  public static Location create(LocationCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Location</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Location update(LocationUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Location.class, options);
  }

  /**
   * Returns a list of <code>Location</code> objects.
   */
  public static LocationCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>Location</code> objects.
   */
  public static LocationCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return requestCollection(url, params, LocationCollection.class, options);
  }

  /**
   * Returns a list of <code>Location</code> objects.
   */
  public static LocationCollection list(LocationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of <code>Location</code> objects.
   */
  public static LocationCollection list(LocationListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/locations");
    return requestCollection(url, params, LocationCollection.class, options);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, Location.class, options);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete(LocationDeleteParams params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Deletes a <code>Location</code> object.
   */
  public Location delete(LocationDeleteParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/terminal/locations/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, Location.class, options);
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Address getAddress() {
    return this.address;
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
   * The display name of the location.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getDisplayName() {
    return this.displayName;
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
  public void setAddress(final Address address) {
    this.address = address;
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
   * The display name of the location.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
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

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Location)) return false;
    final Location other = (Location) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$address = this.getAddress();
    final java.lang.Object other$address = other.getAddress();
    if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$displayName = this.getDisplayName();
    final java.lang.Object other$displayName = other.getDisplayName();
    if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Location;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $address = this.getAddress();
    result = result * PRIME + ($address == null ? 43 : $address.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $displayName = this.getDisplayName();
    result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
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
}
