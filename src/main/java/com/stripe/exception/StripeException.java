// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
package com.stripe.exception;

import com.stripe.model.StripeError;

public abstract class StripeException extends Exception {
  private static final long serialVersionUID = 2L;
  /**
   * The error resource returned by Stripe's API that caused the exception.
   */
  StripeError stripeError;
  private String code;
  private String requestId;
  private Integer statusCode;

  public StripeException(String message, String requestId, String code, Integer statusCode) {
    this(message, requestId, code, statusCode, null);
  }

  /**
   * Constructs a new Stripe exception with the specified details.
   */
  public StripeException(String message, String requestId, String code, Integer statusCode, Throwable e) {
    super(message, e);
    this.code = code;
    this.requestId = requestId;
    this.statusCode = statusCode;
  }

  /**
   * Returns a description of the exception, including the HTTP status code and request ID (if
   * applicable).
   *
   * @return a string representation of the exception.
   */
  @Override
  public String getMessage() {
    String additionalInfo = "";
    if (code != null) {
      additionalInfo += "; code: " + code;
    }
    if (requestId != null) {
      additionalInfo += "; request-id: " + requestId;
    }
    return super.getMessage() + additionalInfo;
  }

  /**
   * The error resource returned by Stripe's API that caused the exception.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public StripeError getStripeError() {
    return this.stripeError;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getCode() {
    return this.code;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getRequestId() {
    return this.requestId;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Integer getStatusCode() {
    return this.statusCode;
  }

  /**
   * The error resource returned by Stripe's API that caused the exception.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setStripeError(final StripeError stripeError) {
    this.stripeError = stripeError;
  }
}