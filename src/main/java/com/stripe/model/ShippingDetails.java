// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class ShippingDetails extends StripeObject {
  @SerializedName("address")
  Address address;
  /**
   * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
   */
  @SerializedName("carrier")
  String carrier;
  /**
   * Recipient name.
   */
  @SerializedName("name")
  String name;
  /**
   * Recipient phone (including extension).
   */
  @SerializedName("phone")
  String phone;
  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  @SerializedName("tracking_number")
  String trackingNumber;

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Address getAddress() {
    return this.address;
  }

  /**
   * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCarrier() {
    return this.carrier;
  }

  /**
   * Recipient name.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * Recipient phone (including extension).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getPhone() {
    return this.phone;
  }

  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getTrackingNumber() {
    return this.trackingNumber;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setAddress(final Address address) {
    this.address = address;
  }

  /**
   * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCarrier(final String carrier) {
    this.carrier = carrier;
  }

  /**
   * Recipient name.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Recipient phone (including extension).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setPhone(final String phone) {
    this.phone = phone;
  }

  /**
   * The tracking number for a physical product, obtained from the delivery service. If multiple
   * tracking numbers were generated for this purchase, please separate them with commas.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setTrackingNumber(final String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ShippingDetails)) return false;
    final ShippingDetails other = (ShippingDetails) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$address = this.getAddress();
    final java.lang.Object other$address = other.getAddress();
    if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
    final java.lang.Object this$carrier = this.getCarrier();
    final java.lang.Object other$carrier = other.getCarrier();
    if (this$carrier == null ? other$carrier != null : !this$carrier.equals(other$carrier)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$phone = this.getPhone();
    final java.lang.Object other$phone = other.getPhone();
    if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
    final java.lang.Object this$trackingNumber = this.getTrackingNumber();
    final java.lang.Object other$trackingNumber = other.getTrackingNumber();
    if (this$trackingNumber == null ? other$trackingNumber != null : !this$trackingNumber.equals(other$trackingNumber)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ShippingDetails;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $address = this.getAddress();
    result = result * PRIME + ($address == null ? 43 : $address.hashCode());
    final java.lang.Object $carrier = this.getCarrier();
    result = result * PRIME + ($carrier == null ? 43 : $carrier.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $phone = this.getPhone();
    result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
    final java.lang.Object $trackingNumber = this.getTrackingNumber();
    result = result * PRIME + ($trackingNumber == null ? 43 : $trackingNumber.hashCode());
    return result;
  }
}
