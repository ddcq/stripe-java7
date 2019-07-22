// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.RecipientCreateParams;
import com.stripe.param.RecipientListParams;
import com.stripe.param.RecipientRetrieveParams;
import com.stripe.param.RecipientUpdateParams;
import java.util.Map;

public class Recipient extends ApiResource implements HasId, MetadataStore<Recipient> {
  /**
   * Hash describing the current account on the recipient, if there is one.
   */
  @SerializedName("active_account")
  BankAccount activeAccount;
  @SerializedName("cards")
  CardCollection cards;
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * The default card to use for creating transfers to this recipient.
   */
  @SerializedName("default_card")
  ExpandableField<Card> defaultCard;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;
  /**
   * The ID of the [Custom account](https://stripe.com/docs/connect/custom-accounts) this recipient
   * was migrated to. If set, the recipient can no longer be updated, nor can transfers be made to
   * it: use the Custom account instead.
   */
  @SerializedName("migrated_to")
  ExpandableField<Account> migratedTo;
  /**
   * Full, legal name of the recipient.
   */
  @SerializedName("name")
  String name;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  @SerializedName("rolled_back_from")
  ExpandableField<Account> rolledBackFrom;
  /**
   * Type of the recipient, one of `individual` or `corporation`.
   */
  @SerializedName("type")
  String type;
  /**
   * Whether the recipient has been verified. This field is non-standard, and maybe removed in the
   * future
   */
  @SerializedName("verified")
  Boolean verified;

  /**
   * Get id of expandable `defaultCard` object.
   */
  public String getDefaultCard() {
    return (this.defaultCard != null) ? this.defaultCard.getId() : null;
  }

  public void setDefaultCard(String id) {
    this.defaultCard = ApiResource.setExpandableFieldId(id, this.defaultCard);
  }

  /**
   * Get expanded `defaultCard`.
   */
  public Card getDefaultCardObject() {
    return (this.defaultCard != null) ? this.defaultCard.getExpanded() : null;
  }

  public void setDefaultCardObject(Card expandableObject) {
    this.defaultCard = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `migratedTo` object.
   */
  public String getMigratedTo() {
    return (this.migratedTo != null) ? this.migratedTo.getId() : null;
  }

  public void setMigratedTo(String id) {
    this.migratedTo = ApiResource.setExpandableFieldId(id, this.migratedTo);
  }

  /**
   * Get expanded `migratedTo`.
   */
  public Account getMigratedToObject() {
    return (this.migratedTo != null) ? this.migratedTo.getExpanded() : null;
  }

  public void setMigratedToObject(Account expandableObject) {
    this.migratedTo = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /**
   * Get id of expandable `rolledBackFrom` object.
   */
  public String getRolledBackFrom() {
    return (this.rolledBackFrom != null) ? this.rolledBackFrom.getId() : null;
  }

  public void setRolledBackFrom(String id) {
    this.rolledBackFrom = ApiResource.setExpandableFieldId(id, this.rolledBackFrom);
  }

  /**
   * Get expanded `rolledBackFrom`.
   */
  public Account getRolledBackFromObject() {
    return (this.rolledBackFrom != null) ? this.rolledBackFrom.getExpanded() : null;
  }

  public void setRolledBackFromObject(Account expandableObject) {
    this.rolledBackFrom = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return requestCollection(url, params, RecipientCollection.class, options);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(RecipientListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your recipients. The recipients are returned sorted by creation date, with
   * the most recently created recipients appearing first.
   */
  public static RecipientCollection list(RecipientListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return requestCollection(url, params, RecipientCollection.class, options);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return request(ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(RecipientCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new <code>Recipient</code> object and verifies the recipient’s identity. Also
   * verifies the recipient’s bank account information or debit card, if either is provided.
   */
  public static Recipient create(RecipientCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/recipients");
    return request(ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, Recipient.class, options);
  }

  /**
   * Retrieves the details of an existing recipient. You need only supply the unique recipient
   * identifier that was returned upon recipient creation.
   */
  public static Recipient retrieve(String id, RecipientRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(id)));
    return request(ApiResource.RequestMethod.GET, url, params, Recipient.class, options);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  @Override
  public Recipient update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  @Override
  public Recipient update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  public Recipient update(RecipientUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified recipient by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   *
   * <p>If you update the name or tax ID, the identity verification will automatically be rerun. If
   * you update the bank account, the bank account validation will automatically be rerun.
   */
  public Recipient update(RecipientUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, Recipient.class, options);
  }

  /**
   * Permanently deletes a recipient. It cannot be undone.
   */
  public Recipient delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Permanently deletes a recipient. It cannot be undone.
   */
  public Recipient delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Permanently deletes a recipient. It cannot be undone.
   */
  public Recipient delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a recipient. It cannot be undone.
   */
  public Recipient delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/recipients/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.DELETE, url, params, Recipient.class, options);
  }

  /**
   * Hash describing the current account on the recipient, if there is one.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public BankAccount getActiveAccount() {
    return this.activeAccount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public CardCollection getCards() {
    return this.cards;
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
   * Full, legal name of the recipient.
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
   * Type of the recipient, one of `individual` or `corporation`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getType() {
    return this.type;
  }

  /**
   * Whether the recipient has been verified. This field is non-standard, and maybe removed in the
   * future
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getVerified() {
    return this.verified;
  }

  /**
   * Hash describing the current account on the recipient, if there is one.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setActiveAccount(final BankAccount activeAccount) {
    this.activeAccount = activeAccount;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setCards(final CardCollection cards) {
    this.cards = cards;
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setMetadata(final Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * Full, legal name of the recipient.
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
   * Type of the recipient, one of `individual` or `corporation`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setType(final String type) {
    this.type = type;
  }

  /**
   * Whether the recipient has been verified. This field is non-standard, and maybe removed in the
   * future
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setVerified(final Boolean verified) {
    this.verified = verified;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Recipient)) return false;
    final Recipient other = (Recipient) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$activeAccount = this.getActiveAccount();
    final java.lang.Object other$activeAccount = other.getActiveAccount();
    if (this$activeAccount == null ? other$activeAccount != null : !this$activeAccount.equals(other$activeAccount)) return false;
    final java.lang.Object this$cards = this.getCards();
    final java.lang.Object other$cards = other.getCards();
    if (this$cards == null ? other$cards != null : !this$cards.equals(other$cards)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$defaultCard = this.getDefaultCard();
    final java.lang.Object other$defaultCard = other.getDefaultCard();
    if (this$defaultCard == null ? other$defaultCard != null : !this$defaultCard.equals(other$defaultCard)) return false;
    final java.lang.Object this$deleted = this.getDeleted();
    final java.lang.Object other$deleted = other.getDeleted();
    if (this$deleted == null ? other$deleted != null : !this$deleted.equals(other$deleted)) return false;
    final java.lang.Object this$description = this.getDescription();
    final java.lang.Object other$description = other.getDescription();
    if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
    final java.lang.Object this$email = this.getEmail();
    final java.lang.Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$migratedTo = this.getMigratedTo();
    final java.lang.Object other$migratedTo = other.getMigratedTo();
    if (this$migratedTo == null ? other$migratedTo != null : !this$migratedTo.equals(other$migratedTo)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$rolledBackFrom = this.getRolledBackFrom();
    final java.lang.Object other$rolledBackFrom = other.getRolledBackFrom();
    if (this$rolledBackFrom == null ? other$rolledBackFrom != null : !this$rolledBackFrom.equals(other$rolledBackFrom)) return false;
    final java.lang.Object this$type = this.getType();
    final java.lang.Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final java.lang.Object this$verified = this.getVerified();
    final java.lang.Object other$verified = other.getVerified();
    if (this$verified == null ? other$verified != null : !this$verified.equals(other$verified)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Recipient;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $activeAccount = this.getActiveAccount();
    result = result * PRIME + ($activeAccount == null ? 43 : $activeAccount.hashCode());
    final java.lang.Object $cards = this.getCards();
    result = result * PRIME + ($cards == null ? 43 : $cards.hashCode());
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $defaultCard = this.getDefaultCard();
    result = result * PRIME + ($defaultCard == null ? 43 : $defaultCard.hashCode());
    final java.lang.Object $deleted = this.getDeleted();
    result = result * PRIME + ($deleted == null ? 43 : $deleted.hashCode());
    final java.lang.Object $description = this.getDescription();
    result = result * PRIME + ($description == null ? 43 : $description.hashCode());
    final java.lang.Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $migratedTo = this.getMigratedTo();
    result = result * PRIME + ($migratedTo == null ? 43 : $migratedTo.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $rolledBackFrom = this.getRolledBackFrom();
    result = result * PRIME + ($rolledBackFrom == null ? 43 : $rolledBackFrom.hashCode());
    final java.lang.Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final java.lang.Object $verified = this.getVerified();
    result = result * PRIME + ($verified == null ? 43 : $verified.hashCode());
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