// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
package com.stripe.exception;

import com.stripe.model.EventDataObjectDeserializer;

public class EventDataObjectDeserializationException extends StripeException {
  private static final long serialVersionUID = 2L;
  /**
   * JSON intended as event data object {@link EventDataObjectDeserializer#getObject()} that fails
   * deserialization.
   */
  private final String rawJson;

  public EventDataObjectDeserializationException(String message, String rawJson) {
    super(message, null, null, null);
    this.rawJson = rawJson;
  }

  /**
   * JSON intended as event data object {@link EventDataObjectDeserializer#getObject()} that fails
   * deserialization.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getRawJson() {
    return this.rawJson;
  }
}
