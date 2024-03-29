// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FileLinkCreateParams;
import com.stripe.param.FileLinkListParams;
import com.stripe.param.FileLinkRetrieveParams;
import com.stripe.param.FileLinkUpdateParams;
import java.util.Map;

public class FileLink extends ApiResource implements HasId, MetadataStore<FileLink> {
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;
  /**
   * Whether this link is already expired.
   */
  @SerializedName("expired")
  Boolean expired;
  /**
   * Time at which the link expires.
   */
  @SerializedName("expires_at")
  Long expiresAt;
  /**
   * The file object this link points to.
   */
  @SerializedName("file")
  ExpandableField<File> file;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * The publicly accessible URL to download the file.
   */
  @SerializedName("url")
  String url;

  /**
   * Get id of expandable `file` object.
   */
  public String getFile() {
    return (this.file != null) ? this.file.getId() : null;
  }

  public void setFile(String id) {
    this.file = ApiResource.setExpandableFieldId(id, this.file);
  }

  /**
   * Get expanded `file`.
   */
  public File getFileObject() {
    return (this.file != null) ? this.file.getExpanded() : null;
  }

  public void setFileObject(File expandableObject) {
    this.file = new ExpandableField<File>(expandableObject.getId(), expandableObject);
  }

  /**
   * Retrieves the file link with the given ID.
   */
  public static FileLink retrieve(String link) throws StripeException {
    return retrieve(link, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the file link with the given ID.
   */
  public static FileLink retrieve(String link, RequestOptions options) throws StripeException {
    return retrieve(link, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the file link with the given ID.
   */
  public static FileLink retrieve(String link, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", ApiResource.urlEncodeId(link)));
    return request(ApiResource.RequestMethod.GET, url, params, FileLink.class, options);
  }

  /**
   * Retrieves the file link with the given ID.
   */
  public static FileLink retrieve(String link, FileLinkRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", ApiResource.urlEncodeId(link)));
    return request(ApiResource.RequestMethod.GET, url, params, FileLink.class, options);
  }

  /**
   * Creates a new file link object.
   */
  public static FileLink create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new file link object.
   */
  public static FileLink create(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /**
   * Creates a new file link object.
   */
  public static FileLink create(FileLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new file link object.
   */
  public static FileLink create(FileLinkCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /**
   * Updates an existing file link object. Expired links can no longer be updated.
   */
  @Override
  public FileLink update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing file link object. Expired links can no longer be updated.
   */
  @Override
  public FileLink update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /**
   * Updates an existing file link object. Expired links can no longer be updated.
   */
  public FileLink update(FileLinkUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing file link object. Expired links can no longer be updated.
   */
  public FileLink update(FileLinkUpdateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/file_links/%s", ApiResource.urlEncodeId(this.getId())));
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /**
   * Returns a list of file links.
   */
  public static FileLinkCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of file links.
   */
  public static FileLinkCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return requestCollection(url, params, FileLinkCollection.class, options);
  }

  /**
   * Returns a list of file links.
   */
  public static FileLinkCollection list(FileLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of file links.
   */
  public static FileLinkCollection list(FileLinkListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/file_links");
    return requestCollection(url, params, FileLinkCollection.class, options);
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
   * Whether this link is already expired.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Boolean getExpired() {
    return this.expired;
  }

  /**
   * Time at which the link expires.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getExpiresAt() {
    return this.expiresAt;
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
   * The publicly accessible URL to download the file.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getUrl() {
    return this.url;
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
   * Whether this link is already expired.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setExpired(final Boolean expired) {
    this.expired = expired;
  }

  /**
   * Time at which the link expires.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setExpiresAt(final Long expiresAt) {
    this.expiresAt = expiresAt;
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setObject(final String object) {
    this.object = object;
  }

  /**
   * The publicly accessible URL to download the file.
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
    if (!(o instanceof FileLink)) return false;
    final FileLink other = (FileLink) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$created = this.getCreated();
    final java.lang.Object other$created = other.getCreated();
    if (this$created == null ? other$created != null : !this$created.equals(other$created)) return false;
    final java.lang.Object this$expired = this.getExpired();
    final java.lang.Object other$expired = other.getExpired();
    if (this$expired == null ? other$expired != null : !this$expired.equals(other$expired)) return false;
    final java.lang.Object this$expiresAt = this.getExpiresAt();
    final java.lang.Object other$expiresAt = other.getExpiresAt();
    if (this$expiresAt == null ? other$expiresAt != null : !this$expiresAt.equals(other$expiresAt)) return false;
    final java.lang.Object this$file = this.getFile();
    final java.lang.Object other$file = other.getFile();
    if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$livemode = this.getLivemode();
    final java.lang.Object other$livemode = other.getLivemode();
    if (this$livemode == null ? other$livemode != null : !this$livemode.equals(other$livemode)) return false;
    final java.lang.Object this$metadata = this.getMetadata();
    final java.lang.Object other$metadata = other.getMetadata();
    if (this$metadata == null ? other$metadata != null : !this$metadata.equals(other$metadata)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$url = this.getUrl();
    final java.lang.Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof FileLink;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $created = this.getCreated();
    result = result * PRIME + ($created == null ? 43 : $created.hashCode());
    final java.lang.Object $expired = this.getExpired();
    result = result * PRIME + ($expired == null ? 43 : $expired.hashCode());
    final java.lang.Object $expiresAt = this.getExpiresAt();
    result = result * PRIME + ($expiresAt == null ? 43 : $expiresAt.hashCode());
    final java.lang.Object $file = this.getFile();
    result = result * PRIME + ($file == null ? 43 : $file.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $livemode = this.getLivemode();
    result = result * PRIME + ($livemode == null ? 43 : $livemode.hashCode());
    final java.lang.Object $metadata = this.getMetadata();
    result = result * PRIME + ($metadata == null ? 43 : $metadata.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
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
