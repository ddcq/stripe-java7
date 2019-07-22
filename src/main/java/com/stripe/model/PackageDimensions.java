// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class PackageDimensions extends StripeObject {
  /**
   * Height, in inches.
   */
  @SerializedName("height")
  BigDecimal height;
  /**
   * Length, in inches.
   */
  @SerializedName("length")
  BigDecimal length;
  /**
   * Weight, in ounces.
   */
  @SerializedName("weight")
  BigDecimal weight;
  /**
   * Width, in inches.
   */
  @SerializedName("width")
  BigDecimal width;

  /**
   * Height, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BigDecimal getHeight() {
    return this.height;
  }

  /**
   * Length, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BigDecimal getLength() {
    return this.length;
  }

  /**
   * Weight, in ounces.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BigDecimal getWeight() {
    return this.weight;
  }

  /**
   * Width, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BigDecimal getWidth() {
    return this.width;
  }

  /**
   * Height, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setHeight(final BigDecimal height) {
    this.height = height;
  }

  /**
   * Length, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setLength(final BigDecimal length) {
    this.length = length;
  }

  /**
   * Weight, in ounces.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setWeight(final BigDecimal weight) {
    this.weight = weight;
  }

  /**
   * Width, in inches.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setWidth(final BigDecimal width) {
    this.width = width;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof PackageDimensions)) return false;
    final PackageDimensions other = (PackageDimensions) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$height = this.getHeight();
    final java.lang.Object other$height = other.getHeight();
    if (this$height == null ? other$height != null : !this$height.equals(other$height)) return false;
    final java.lang.Object this$length = this.getLength();
    final java.lang.Object other$length = other.getLength();
    if (this$length == null ? other$length != null : !this$length.equals(other$length)) return false;
    final java.lang.Object this$weight = this.getWeight();
    final java.lang.Object other$weight = other.getWeight();
    if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
    final java.lang.Object this$width = this.getWidth();
    final java.lang.Object other$width = other.getWidth();
    if (this$width == null ? other$width != null : !this$width.equals(other$width)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof PackageDimensions;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $height = this.getHeight();
    result = result * PRIME + ($height == null ? 43 : $height.hashCode());
    final java.lang.Object $length = this.getLength();
    result = result * PRIME + ($length == null ? 43 : $length.hashCode());
    final java.lang.Object $weight = this.getWeight();
    result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
    final java.lang.Object $width = this.getWidth();
    result = result * PRIME + ($width == null ? 43 : $width.hashCode());
    return result;
  }
}
