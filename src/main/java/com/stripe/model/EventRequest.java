// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
package com.stripe.model;

import com.google.gson.annotations.SerializedName;

public class EventRequest extends StripeObject {
  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe’s
   * automatic subscription handling). Request logs are available in the <a
   * href="https://dashboard.stripe.com/logs">dashboard</a>, but currently not in the API.
   */
  @SerializedName("id")
  String id;
  /**
   * The idempotency key transmitted during the request, if any. <i>Note: This property is populated
   * only for events on or after May 23, 2017.</i>
   */
  @SerializedName("idempotency_key")
  String idempotencyKey;

  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe’s
   * automatic subscription handling). Request logs are available in the <a
   * href="https://dashboard.stripe.com/logs">dashboard</a>, but currently not in the API.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getId() {
    return this.id;
  }

  /**
   * The idempotency key transmitted during the request, if any. <i>Note: This property is populated
   * only for events on or after May 23, 2017.</i>
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getIdempotencyKey() {
    return this.idempotencyKey;
  }

  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe’s
   * automatic subscription handling). Request logs are available in the <a
   * href="https://dashboard.stripe.com/logs">dashboard</a>, but currently not in the API.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * The idempotency key transmitted during the request, if any. <i>Note: This property is populated
   * only for events on or after May 23, 2017.</i>
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setIdempotencyKey(final String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof EventRequest)) return false;
    final EventRequest other = (EventRequest) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$idempotencyKey = this.getIdempotencyKey();
    final java.lang.Object other$idempotencyKey = other.getIdempotencyKey();
    if (this$idempotencyKey == null ? other$idempotencyKey != null : !this$idempotencyKey.equals(other$idempotencyKey)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof EventRequest;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $idempotencyKey = this.getIdempotencyKey();
    result = result * PRIME + ($idempotencyKey == null ? 43 : $idempotencyKey.hashCode());
    return result;
  }
}