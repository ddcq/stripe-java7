// Generated by delombok at Mon Jul 15 18:44:01 PDT 2019
// Generated by com.stripe.generator.entity.SdkBuilder
package com.stripe.model.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.reporting.ReportTypeListParams;
import com.stripe.param.reporting.ReportTypeRetrieveParams;
import java.util.List;
import java.util.Map;

public class ReportType extends ApiResource implements HasId {
  /**
   * Most recent time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("data_available_end")
  Long dataAvailableEnd;
  /**
   * Earliest time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @SerializedName("data_available_start")
  Long dataAvailableStart;
  /**
   * List of column names that are included by default when this Report Type gets run. (If the
   * Report Type doesn't support the `columns` parameter, this will be null.)
   */
  @SerializedName("default_columns")
  List<String> defaultColumns;
  /**
   * The [ID of the Report
   * Type](https://stripe.com/docs/reporting/statements/api#available-report-types), such as
   * `balance.summary.1`.
   */
  @SerializedName("id")
  String id;
  /**
   * Human-readable name of the Report Type.
   */
  @SerializedName("name")
  String name;
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  @SerializedName("object")
  String object;
  /**
   * When this Report Type was latest updated. Measured in seconds since the Unix epoch.
   */
  @SerializedName("updated")
  Long updated;
  /**
   * Version of the Report Type. Different versions report with the same ID will have the same
   * purpose, but may take different run parameters or have different result schemas.
   */
  @SerializedName("version")
  Long version;

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType) throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType, RequestOptions options) throws StripeException {
    return retrieve(reportType, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType)));
    return request(ApiResource.RequestMethod.GET, url, params, ReportType.class, options);
  }

  /**
   * Retrieves the details of a Report Type. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportType retrieve(String reportType, ReportTypeRetrieveParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), String.format("/v1/reporting/report_types/%s", ApiResource.urlEncodeId(reportType)));
    return request(ApiResource.RequestMethod.GET, url, params, ReportType.class, options);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_types");
    return requestCollection(url, params, ReportTypeCollection.class, options);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(ReportTypeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a full list of Report Types. (Requires a <a
   * href="https://stripe.com/docs/keys#test-live-modes">live-mode API key</a>.)
   */
  public static ReportTypeCollection list(ReportTypeListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/reporting/report_types");
    return requestCollection(url, params, ReportTypeCollection.class, options);
  }

  /**
   * Most recent time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getDataAvailableEnd() {
    return this.dataAvailableEnd;
  }

  /**
   * Earliest time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getDataAvailableStart() {
    return this.dataAvailableStart;
  }

  /**
   * List of column names that are included by default when this Report Type gets run. (If the
   * Report Type doesn't support the `columns` parameter, this will be null.)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public List<String> getDefaultColumns() {
    return this.defaultColumns;
  }

  /**
   * Human-readable name of the Report Type.
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
   * When this Report Type was latest updated. Measured in seconds since the Unix epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getUpdated() {
    return this.updated;
  }

  /**
   * Version of the Report Type. Different versions report with the same ID will have the same
   * purpose, but may take different run parameters or have different result schemas.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public Long getVersion() {
    return this.version;
  }

  /**
   * Most recent time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDataAvailableEnd(final Long dataAvailableEnd) {
    this.dataAvailableEnd = dataAvailableEnd;
  }

  /**
   * Earliest time for which this Report Type is available. Measured in seconds since the Unix
   * epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDataAvailableStart(final Long dataAvailableStart) {
    this.dataAvailableStart = dataAvailableStart;
  }

  /**
   * List of column names that are included by default when this Report Type gets run. (If the
   * Report Type doesn't support the `columns` parameter, this will be null.)
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setDefaultColumns(final List<String> defaultColumns) {
    this.defaultColumns = defaultColumns;
  }

  /**
   * The [ID of the Report
   * Type](https://stripe.com/docs/reporting/statements/api#available-report-types), such as
   * `balance.summary.1`.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * Human-readable name of the Report Type.
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
   * When this Report Type was latest updated. Measured in seconds since the Unix epoch.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setUpdated(final Long updated) {
    this.updated = updated;
  }

  /**
   * Version of the Report Type. Different versions report with the same ID will have the same
   * purpose, but may take different run parameters or have different result schemas.
   */
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public void setVersion(final Long version) {
    this.version = version;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof ReportType)) return false;
    final ReportType other = (ReportType) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$dataAvailableEnd = this.getDataAvailableEnd();
    final java.lang.Object other$dataAvailableEnd = other.getDataAvailableEnd();
    if (this$dataAvailableEnd == null ? other$dataAvailableEnd != null : !this$dataAvailableEnd.equals(other$dataAvailableEnd)) return false;
    final java.lang.Object this$dataAvailableStart = this.getDataAvailableStart();
    final java.lang.Object other$dataAvailableStart = other.getDataAvailableStart();
    if (this$dataAvailableStart == null ? other$dataAvailableStart != null : !this$dataAvailableStart.equals(other$dataAvailableStart)) return false;
    final java.lang.Object this$defaultColumns = this.getDefaultColumns();
    final java.lang.Object other$defaultColumns = other.getDefaultColumns();
    if (this$defaultColumns == null ? other$defaultColumns != null : !this$defaultColumns.equals(other$defaultColumns)) return false;
    final java.lang.Object this$id = this.getId();
    final java.lang.Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final java.lang.Object this$name = this.getName();
    final java.lang.Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final java.lang.Object this$object = this.getObject();
    final java.lang.Object other$object = other.getObject();
    if (this$object == null ? other$object != null : !this$object.equals(other$object)) return false;
    final java.lang.Object this$updated = this.getUpdated();
    final java.lang.Object other$updated = other.getUpdated();
    if (this$updated == null ? other$updated != null : !this$updated.equals(other$updated)) return false;
    final java.lang.Object this$version = this.getVersion();
    final java.lang.Object other$version = other.getVersion();
    if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof ReportType;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $dataAvailableEnd = this.getDataAvailableEnd();
    result = result * PRIME + ($dataAvailableEnd == null ? 43 : $dataAvailableEnd.hashCode());
    final java.lang.Object $dataAvailableStart = this.getDataAvailableStart();
    result = result * PRIME + ($dataAvailableStart == null ? 43 : $dataAvailableStart.hashCode());
    final java.lang.Object $defaultColumns = this.getDefaultColumns();
    result = result * PRIME + ($defaultColumns == null ? 43 : $defaultColumns.hashCode());
    final java.lang.Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final java.lang.Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final java.lang.Object $object = this.getObject();
    result = result * PRIME + ($object == null ? 43 : $object.hashCode());
    final java.lang.Object $updated = this.getUpdated();
    result = result * PRIME + ($updated == null ? 43 : $updated.hashCode());
    final java.lang.Object $version = this.getVersion();
    result = result * PRIME + ($version == null ? 43 : $version.hashCode());
    return result;
  }

  /**
   * The [ID of the Report
   * Type](https://stripe.com/docs/reporting/statements/api#available-report-types), such as
   * `balance.summary.1`.
   */
  @Override
  @java.lang.SuppressWarnings("all")
  // @lombok.Generated
  public String getId() {
    return this.id;
  }
}
