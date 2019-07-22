// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TokenCreateParams;
import com.stripe.param.TokenRetrieveParams;
import java.util.Map;

public class Token extends ApiResource implements HasId {
  @SerializedName("bank_account")
  BankAccount bankAccount;
  @SerializedName("card")
  Card card;
  /**
   * IP address of the client that generated the token.
   */
  @SerializedName("client_ip")
  String clientIp;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * Email of the user, whose token is created during Stripe Checkout. This field is non-standard,
   * and maybe removed in the future.
   */
  @SerializedName("email")
  String email;
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
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * Type of the token: `account`, `bank_account`, `card`, or `pii`.
   */
  @SerializedName("type")
  String type;
  /**
   * Whether this token has already been used (tokens can be used only once).
   */
  @SerializedName("used")
  Boolean used;

  /**
   * Retrieves the token with the given ID.
   */
  public static Token retrieve(String token) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the token with the given ID.
   */
  public static Token retrieve(String token, RequestOptions options) throws StripeException {
    return retrieve(token, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the token with the given ID.
   */
  public static Token retrieve(String token, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token)));
    return request(ApiResource.RequestMethod.GET, url, params, Token.class, options);
  }

  /**
   * Retrieves the token with the given ID.
   */
  public static Token retrieve(String token, TokenRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/tokens/%s", ApiResource.urlEncodeId(token)));
    return request(ApiResource.RequestMethod.GET, url, params, Token.class, options);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="#accounts">Custom account</a>.
   */
  public static Token create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="#accounts">Custom account</a>.
   */
  public static Token create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tokens");
    return request(ApiResource.RequestMethod.POST, url, params, Token.class, options);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="#accounts">Custom account</a>.
   */
  public static Token create(TokenCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a single-use token that represents a bank account’s details. This token can be used
   * with any API method in place of a bank account dictionary. This token can be used only once, by
   * attaching it to a <a href="#accounts">Custom account</a>.
   */
  public static Token create(TokenCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/tokens");
    return request(ApiResource.RequestMethod.POST, url, params, Token.class, options);
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BankAccount getBankAccount() {
    return this.bankAccount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Card getCard() {
    return this.card;
  }

  /**
   * IP address of the client that generated the token.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getClientIp() {
    return this.clientIp;
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
   * Email of the user, whose token is created during Stripe Checkout. This field is non-standard,
   * and maybe removed in the future.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getEmail() {
    return this.email;
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

  /**
   * Type of the token: `account`, `bank_account`, `card`, or `pii`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  /**
   * Whether this token has already been used (tokens can be used only once).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getUsed() {
    return this.used;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setBankAccount(final BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCard(final Card card) {
    this.card = card;
  }

  /**
   * IP address of the client that generated the token.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setClientIp(final String clientIp) {
    this.clientIp = clientIp;
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
   * Email of the user, whose token is created during Stripe Checkout. This field is non-standard,
   * and maybe removed in the future.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setEmail(final String email) {
    this.email = email;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * Type of the token: `account`, `bank_account`, `card`, or `pii`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Whether this token has already been used (tokens can be used only once).
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUsed(final Boolean used) {
    this.used = used;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Token)) return false;
    final Token other = (Token) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$bankAccount = this.getBankAccount();
    final java.lang.Object other$bankAccount = other.getBankAccount();
    if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) return false;
    final java.lang.Object this$card = this.getCard();
    final java.lang.Object other$card = other.getCard();
    if (this$card == null ? other$card != null : !this$card.equals(other$card)) return false;
    final java.lang.Object this$clientIp = this.getClientIp();
    final java.lang.Object other$clientIp = other.getClientIp();
    if (this$clientIp == null ? other$clientIp != null : !this$clientIp.equals(other$clientIp)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$email = this.getEmail();
    final java.lang.Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final java.lang.Object this$used = this.getUsed();
    final java.lang.Object other$used = other.getUsed();
    if (this$used == null ? other$used != null : !this$used.equals(other$used)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Token;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $bankAccount = this.getBankAccount();
    result = result * PRIME + ($bankAccount == null ? 43 : $bankAccount.hashCode());
    final java.lang.Object $card = this.getCard();
    result = result * PRIME + ($card == null ? 43 : $card.hashCode());
    final java.lang.Object $clientIp = this.getClientIp();
    result = result * PRIME + ($clientIp == null ? 43 : $clientIp.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final java.lang.Object $used = this.getUsed();
    result = result * PRIME + ($used == null ? 43 : $used.hashCode());
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