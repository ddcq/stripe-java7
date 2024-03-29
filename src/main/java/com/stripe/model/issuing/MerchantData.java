// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;

public class MerchantData extends StripeObject {
  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](https://stripe.com/docs/issuing/merchant-categories) for a list of possible values.
   */
  @SerializedName("category")
  String category;
  /**
   * City where the seller is located.
   */
  @SerializedName("city")
  String city;
  /**
   * Country where the seller is located.
   */
  @SerializedName("country")
  String country;
  /**
   * Name of the seller.
   */
  @SerializedName("name")
  String name;
  /**
   * Identifier assigned to the seller by the card brand.
   */
  @SerializedName("network_id")
  String networkId;
  /**
   * Postal code where the seller is located.
   */
  @SerializedName("postal_code")
  String postalCode;
  /**
   * State where the seller is located.
   */
  @SerializedName("state")
  String state;

  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](https://stripe.com/docs/issuing/merchant-categories) for a list of possible values.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCategory() {
    return this.category;
  }

  /**
   * City where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCity() {
    return this.city;
  }

  /**
   * Country where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCountry() {
    return this.country;
  }

  /**
   * Name of the seller.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * Identifier assigned to the seller by the card brand.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getNetworkId() {
    return this.networkId;
  }

  /**
   * Postal code where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getPostalCode() {
    return this.postalCode;
  }

  /**
   * State where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getState() {
    return this.state;
  }

  /**
   * A categorization of the seller's type of business. See our [merchant categories
   * guide](https://stripe.com/docs/issuing/merchant-categories) for a list of possible values.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCategory(final String category) {
    this.category = category;
  }

  /**
   * City where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCity(final String city) {
    this.city = city;
  }

  /**
   * Country where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCountry(final String country) {
    this.country = country;
  }

  /**
   * Name of the seller.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Identifier assigned to the seller by the card brand.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setNetworkId(final String networkId) {
    this.networkId = networkId;
  }

  /**
   * Postal code where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPostalCode(final String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * State where the seller is located.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setState(final String state) {
    this.state = state;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof MerchantData)) return false;
    final MerchantData other = (MerchantData) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$category = this.getCategory();
    final java.lang.Object other$category = other.getCategory();
    if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
    final java.lang.Object this$city = this.getCity();
    final java.lang.Object other$city = other.getCity();
    if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
    final java.lang.Object this$country = this.getCountry();
    final java.lang.Object other$country = other.getCountry();
    if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$networkId = this.getNetworkId();
    final java.lang.Object other$networkId = other.getNetworkId();
    if (this$networkId == null ? other$networkId != null : !this$networkId.equals(other$networkId)) return false;
    final java.lang.Object this$postalCode = this.getPostalCode();
    final java.lang.Object other$postalCode = other.getPostalCode();
    if (this$postalCode == null ? other$postalCode != null : !this$postalCode.equals(other$postalCode)) return false;
    final java.lang.Object this$state = this.getState();
    final java.lang.Object other$state = other.getState();
    if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof MerchantData;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $category = this.getCategory();
    result = result * PRIME + ($category == null ? 43 : $category.hashCode());
    final java.lang.Object $city = this.getCity();
    result = result * PRIME + ($city == null ? 43 : $city.hashCode());
    final java.lang.Object $country = this.getCountry();
    result = result * PRIME + ($country == null ? 43 : $country.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $networkId = this.getNetworkId();
    result = result * PRIME + ($networkId == null ? 43 : $networkId.hashCode());
    final java.lang.Object $postalCode = this.getPostalCode();
    result = result * PRIME + ($postalCode == null ? 43 : $postalCode.hashCode());
    final java.lang.Object $state = this.getState();
    result = result * PRIME + ($state == null ? 43 : $state.hashCode());
    return result;
  }
}
