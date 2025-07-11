/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import com.google.api.core.ApiFunction;
import com.google.api.services.bigquery.model.ExternalDataConfiguration;
import com.google.api.services.bigquery.model.Table;
import com.google.auto.value.AutoValue;
import com.google.cloud.StringEnumType;
import com.google.cloud.StringEnumValue;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Google BigQuery external table definition. BigQuery's external tables are tables whose data
 * reside outside of BigQuery but can be queried as normal BigQuery tables. External tables are
 * experimental and might be subject to change or removed.
 *
 * @see <a href="https://cloud.google.com/bigquery/federated-data-sources">Federated Data Sources
 *     </a>
 */
@AutoValue
public abstract class ExternalTableDefinition extends TableDefinition {

  static final Function<ExternalDataConfiguration, ExternalTableDefinition>
      FROM_EXTERNAL_DATA_FUNCTION =
          new Function<ExternalDataConfiguration, ExternalTableDefinition>() {
            @Override
            public ExternalTableDefinition apply(ExternalDataConfiguration pb) {
              return ExternalTableDefinition.fromExternalDataConfiguration(pb);
            }
          };
  static final Function<ExternalTableDefinition, ExternalDataConfiguration>
      TO_EXTERNAL_DATA_FUNCTION =
          new Function<ExternalTableDefinition, ExternalDataConfiguration>() {
            @Override
            public ExternalDataConfiguration apply(ExternalTableDefinition tableInfo) {
              return tableInfo.toExternalDataConfigurationPb();
            }
          };

  private static final long serialVersionUID = -5951580238459622025L;

  public static final class SourceColumnMatch extends StringEnumValue {
    private static final long serialVersionUID = 818920627219751207L;
    private static final ApiFunction<String, SourceColumnMatch> CONSTRUCTOR =
        new ApiFunction<String, SourceColumnMatch>() {
          @Override
          public SourceColumnMatch apply(String constant) {
            return new SourceColumnMatch(constant);
          }
        };

    private static final StringEnumType<SourceColumnMatch> type =
        new StringEnumType<SourceColumnMatch>(SourceColumnMatch.class, CONSTRUCTOR);

    public static final SourceColumnMatch POSITION = type.createAndRegister("POSITION");

    public static final SourceColumnMatch NAME = type.createAndRegister("NAME");

    private SourceColumnMatch(String constant) {
      super(constant);
    }

    /**
     * Get the SourceColumnMatch for the given String constant, and throw an exception if the
     * constant is not recognized.
     */
    public static SourceColumnMatch valueOfStrict(String constant) {
      return type.valueOfStrict(constant);
    }

    /** Get the SourceColumnMatch for the given String constant, and allow unrecognized values. */
    public static SourceColumnMatch valueOf(String constant) {
      return type.valueOf(constant);
    }

    /** Return the known values for SourceColumnMatch. */
    public static SourceColumnMatch[] values() {
      return type.values();
    }
  }

  @AutoValue.Builder
  public abstract static class Builder
      extends TableDefinition.Builder<ExternalTableDefinition, Builder> {

    /**
     * Sets the fully-qualified URIs that point to your data in Google Cloud Storage (e.g.
     * gs://bucket/path). Each URI can contain one '*' wildcard character that must come after the
     * bucket's name. Size limits related to load jobs apply to external data sources, plus an
     * additional limit of 10 GB maximum size across all URIs.
     *
     * <p>For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully
     * specified and valid HTTPS URL for a Google Cloud Bigtable table.
     *
     * <p>For Google Cloud Datastore backup URIs: Exactly one URI can be specified. Also, the '*'
     * wildcard character is not allowed.
     *
     * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
     */
    public Builder setSourceUris(List<String> sourceUris) {
      return setSourceUrisImmut(ImmutableList.copyOf(sourceUris));
    }

    abstract Builder setFileSetSpecTypeInner(String spec);

    abstract Builder setSourceUrisImmut(ImmutableList<String> sourceUris);

    /**
     * Defines how to interpret files denoted by URIs. By default the files are assumed to be data
     * files (this can be specified explicitly via FILE_SET_SPEC_TYPE_FILE_SYSTEM_MATCH). A second
     * option is "FILE_SET_SPEC_TYPE_NEW_LINE_DELIMITED_MANIFEST" which interprets each file as a
     * manifest file, where each line is a reference to a file.
     */
    public Builder setFileSetSpecType(String fileSetSpecType) {
      return setFileSetSpecTypeInner(fileSetSpecType);
    }

    /**
     * Sets the source format, and possibly some parsing options, of the external data. Supported
     * formats are {@code CSV} and {@code NEWLINE_DELIMITED_JSON}.
     *
     * <p><a
     * href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
     * Source Format</a>
     */
    public Builder setFormatOptions(FormatOptions formatOptions) {
      return setFormatOptionsInner(formatOptions);
    }

    /**
     * Defines the list of possible SQL data types to which the source decimal values are converted.
     * This list and the precision and the scale parameters of the decimal field determine the
     * target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in
     * the specified list and if it supports the precision and the scale. STRING supports all
     * precision and scale values.
     *
     * @param decimalTargetTypes decimalTargetType or {@code null} for none
     */
    public abstract Builder setDecimalTargetTypes(List<String> decimalTargetTypes);

    abstract Builder setFormatOptionsInner(FormatOptions formatOptions);

    /**
     * Sets the maximum number of bad records that BigQuery can ignore when reading data. If the
     * number of bad records exceeds this value, an invalid error is returned in the job result. The
     * default value is 0, which requires that all records are valid.
     */
    public abstract Builder setMaxBadRecords(Integer maxBadRecords);

    /**
     * Sets whether BigQuery should allow extra values that are not represented in the table schema.
     * If true, the extra values are ignored. If false, records with extra columns are treated as
     * bad records, and if there are too many bad records, an invalid error is returned in the job
     * result. The default value is false. The value set with {@link
     * #setFormatOptions(FormatOptions)} property determines what BigQuery treats as an extra value.
     *
     * @see <a
     *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.ignoreUnknownValues">
     *     Ignore Unknown Values</a>
     */
    public abstract Builder setIgnoreUnknownValues(Boolean ignoreUnknownValues);

    /**
     * Sets compression type of the data source. By default no compression is assumed.
     *
     * @see <a
     *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.compression">
     *     Compression</a>
     */
    public abstract Builder setCompression(String compression);

    /**
     * [Optional, Trusted Tester] connectionId for external data source. The value may be {@code
     * null}.
     */
    public abstract Builder setConnectionId(String connectionId);

    /**
     * [Experimental] Sets detection of schema and format options automatically. Any option
     * specified explicitly will be honored.
     */
    public abstract Builder setAutodetect(Boolean autodetect);

    public abstract Builder setType(Type type);

    /** Sets the table schema. */
    public abstract Builder setSchema(Schema schema);

    /** Sets the table Hive partitioning options. */
    public Builder setHivePartitioningOptions(HivePartitioningOptions hivePartitioningOptions) {
      return setHivePartitioningOptionsInner(hivePartitioningOptions);
    }
    ;

    /**
     * When creating an external table, the user can provide a reference file with the table schema.
     * This is enabled for the following formats: AVRO, PARQUET, ORC.
     *
     * @param referenceFileSchemaUri or {@code null} for none
     */
    public abstract Builder setReferenceFileSchemaUri(String referenceFileSchemaUri);

    abstract Builder setHivePartitioningOptionsInner(
        HivePartitioningOptions hivePartitioningOptions);

    public Builder setObjectMetadata(String objectMetadata) {
      return setObjectMetadataInner(objectMetadata);
    }

    abstract Builder setObjectMetadataInner(String objectMetadata);

    /**
     * [Optional] Metadata Cache Mode for the table. Set this to enable caching of metadata from
     * external data source.
     *
     * @see <a
     *     href="https://cloud.google.com/bigquery/docs/reference/rest/v2/tables#metadatacachemode">
     *     MetadataCacheMode</a>
     */
    public Builder setMetadataCacheMode(String metadataCacheMode) {
      return setMetadataCacheModeInner(metadataCacheMode);
    }

    abstract Builder setMetadataCacheModeInner(String metadataCacheMode);

    /**
     * [Optional] Metadata Cache Mode for the table. Set this to enable caching of metadata from
     * external data source.
     *
     * @see <a
     *     href="https://cloud.google.com/bigquery/docs/reference/rest/v2/tables#resource:-table">
     *     MaxStaleness</a>
     */
    public Builder setMaxStaleness(String maxStaleness) {
      return setMaxStalenessInner(maxStaleness);
    }

    abstract Builder setMaxStalenessInner(String maxStaleness);

    /**
     * Time zone used when parsing timestamp values that do not have specific time zone information
     * (e.g. 2024-04-20 12:34:56). The expected format is a IANA timezone string (e.g.
     * America/Los_Angeles).
     */
    public abstract Builder setTimeZone(String timeZone);

    /** Format used to parse DATE values. Supports C-style and SQL-style values. */
    public abstract Builder setDateFormat(String dateFormat);

    /** Format used to parse DATETIME values. Supports C-style and SQL-style values. */
    public abstract Builder setDatetimeFormat(String datetimeFormat);

    /** Format used to parse TIME values. Supports C-style and SQL-style values. */
    public abstract Builder setTimeFormat(String timeFormat);

    /** Format used to parse TIMESTAMP values. Supports C-style and SQL-style values. */
    public abstract Builder setTimestampFormat(String timestampFormat);

    /**
     * Controls the strategy used to match loaded columns to the schema. If not set, a sensible
     * default is chosen based on how the schema is provided. If autodetect is used, then columns
     * are matched by name. Otherwise, columns are matched by position. This is done to keep the
     * behavior backward-compatible. Acceptable values are: POSITION - matches by position. This
     * assumes that the columns are ordered the same way as the schema. NAME - matches by name. This
     * reads the header row as column names and reorders columns to match the field names in the
     * schema.
     */
    public abstract Builder setSourceColumnMatch(SourceColumnMatch sourceColumnMatch);

    /**
     * A list of strings represented as SQL NULL value in a CSV file. null_marker and null_markers
     * can't be set at the same time. If null_marker is set, null_markers has to be not set. If
     * null_markers is set, null_marker has to be not set. If both null_marker and null_markers are
     * set at the same time, a user error would be thrown. Any strings listed in null_markers,
     * including empty string would be interpreted as SQL NULL. This applies to all column types.
     */
    public abstract Builder setNullMarkers(List<String> nullMarkers);

    /** Creates an {@code ExternalTableDefinition} object. */
    @Override
    public abstract ExternalTableDefinition build();
  }

  /**
   * Returns the compression type of the data source.
   *
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.compression">
   *     Compression</a>
   */
  @Nullable
  public abstract String getCompression();

  /**
   * Returns the connection ID used to connect to external data source.
   *
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration">
   *     ConnectionId</a>
   */
  @Nullable
  public abstract String getConnectionId();

  /**
   * Returns whether BigQuery should allow extra values that are not represented in the table
   * schema. If true, the extra values are ignored. If false, records with extra columns are treated
   * as bad records, and if there are too many bad records, an invalid error is returned in the job
   * result. The default value is false. The value of {@link #getFormatOptions()} determines what
   * BigQuery treats as an extra value.
   *
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.ignoreUnknownValues">
   *     Ignore Unknown Values</a>
   */
  @Nullable
  public Boolean ignoreUnknownValues() {
    return getIgnoreUnknownValues();
  }
  ;

  @Nullable
  public abstract Boolean getIgnoreUnknownValues();

  /**
   * Returns the maximum number of bad records that BigQuery can ignore when reading data. If the
   * number of bad records exceeds this value, an invalid error is returned in the job result.
   */
  @Nullable
  public abstract Integer getMaxBadRecords();

  /**
   * Returns the fully-qualified URIs that point to your data in Google Cloud Storage. Each URI can
   * contain one '*' wildcard character that must come after the bucket's name. Size limits related
   * to load jobs apply to external data sources, plus an additional limit of 10 GB maximum size
   * across all URIs.
   *
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   */
  @Nullable
  public List<String> getSourceUris() {
    return getSourceUrisImmut();
  }

  @Nullable
  public String getFileSetSpecType() {
    return getFileSetSpecTypeInner();
  }

  @Nullable
  abstract String getFileSetSpecTypeInner();

  @Nullable
  public abstract ImmutableList<String> getSourceUrisImmut();

  /**
   * Returns the object metadata.
   *
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration">
   *     ObjectMetadata</a>
   */
  @Nullable
  public String getObjectMetadata() {
    return getObjectMetadataInner();
  }

  @Nullable
  abstract String getObjectMetadataInner();

  /**
   * Returns the metadata cache mode.
   *
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/rest/v2/tables#metadatacachemode">
   *     MetadataCacheMode</a>
   */
  @Nullable
  public String getMetadataCacheMode() {
    return getMetadataCacheModeInner();
  }

  @Nullable
  abstract String getMetadataCacheModeInner();

  /**
   * Returns the maximum staleness of data that could be returned when the table is queried.
   * Staleness encoded as a string encoding of sql IntervalValue type.
   *
   * @see <a
   *     href="hhttps://cloud.google.com/bigquery/docs/reference/rest/v2/tables#resource:-table">
   *     MaxStaleness</a>
   */
  @Nullable
  public String getMaxStaleness() {
    return getMaxStalenessInner();
  }

  @Nullable
  abstract String getMaxStalenessInner();

  /**
   * Returns the source format, and possibly some parsing options, of the external data. Supported
   * formats are {@code CSV} and {@code NEWLINE_DELIMITED_JSON}.
   */
  @SuppressWarnings("unchecked")
  @Nullable
  public <F extends FormatOptions> F getFormatOptions() {
    return (F) getFormatOptionsInner();
  }

  @Nullable
  abstract FormatOptions getFormatOptionsInner();

  @Nullable
  public abstract ImmutableList<String> getDecimalTargetTypes();

  /**
   * [Experimental] Returns whether automatic detection of schema and format options should be
   * performed.
   */
  @Nullable
  public abstract Boolean getAutodetect();

  @Nullable
  public abstract String getReferenceFileSchemaUri();

  /**
   * [Experimental] Returns the HivePartitioningOptions when the data layout follows Hive
   * partitioning convention
   */
  @SuppressWarnings("unchecked")
  @Nullable
  public HivePartitioningOptions getHivePartitioningOptions() {
    return getHivePartitioningOptionsInner();
  }

  /**
   * Returns the time zone used when parsing timestamp values that don't have specific time zone
   * information.
   */
  @Nullable
  public abstract String getTimeZone();

  /** Returns the format used to parse DATE values. */
  @Nullable
  public abstract String getDateFormat();

  /** Returns the format used to parse DATETIME values. */
  @Nullable
  public abstract String getDatetimeFormat();

  /** Returns the format used to parse TIME values. */
  @Nullable
  public abstract String getTimeFormat();

  /** Returns the format used to parse TIMESTAMP values. */
  @Nullable
  public abstract String getTimestampFormat();

  /** Returns the strategy used to match loaded columns to the schema, either POSITION or NAME. */
  @Nullable
  public abstract SourceColumnMatch getSourceColumnMatch();

  /** Returns a list of strings represented as SQL NULL value in a CSV file. */
  @Nullable
  public abstract List<String> getNullMarkers();

  @Nullable
  abstract HivePartitioningOptions getHivePartitioningOptionsInner();

  /** Returns a builder for the {@code ExternalTableDefinition} object. */
  public abstract Builder toBuilder();

  @Override
  com.google.api.services.bigquery.model.Table toPb() {
    Table tablePb = super.toPb();
    tablePb.setExternalDataConfiguration(toExternalDataConfigurationPb());
    if (getMaxStaleness() != null) {
      tablePb.setMaxStaleness(getMaxStaleness());
    }
    return tablePb;
  }

  com.google.api.services.bigquery.model.ExternalDataConfiguration toExternalDataConfigurationPb() {
    com.google.api.services.bigquery.model.ExternalDataConfiguration externalConfigurationPb =
        new com.google.api.services.bigquery.model.ExternalDataConfiguration();
    if (getCompression() != null) {
      externalConfigurationPb.setCompression(getCompression());
    }
    if (getConnectionId() != null) {
      externalConfigurationPb.setConnectionId(getConnectionId());
    }
    if (ignoreUnknownValues() != null) {
      externalConfigurationPb.setIgnoreUnknownValues(ignoreUnknownValues());
    }
    if (getMaxBadRecords() != null) {
      externalConfigurationPb.setMaxBadRecords(getMaxBadRecords());
    }
    if (getSchema() != null) {
      externalConfigurationPb.setSchema(getSchema().toPb());
    }
    if (getFormatOptions() != null) {
      externalConfigurationPb.setSourceFormat(getFormatOptions().getType());
    }
    if (getSourceUris() != null) {
      externalConfigurationPb.setSourceUris(getSourceUris());
    }
    if (getDecimalTargetTypes() != null) {
      externalConfigurationPb.setDecimalTargetTypes(getDecimalTargetTypes());
    }
    if (getFormatOptions() != null && FormatOptions.PARQUET.equals(getFormatOptions().getType())) {
      externalConfigurationPb.setParquetOptions(((ParquetOptions) getFormatOptions()).toPb());
    }
    if (getFormatOptions() != null && FormatOptions.AVRO.equals(getFormatOptions().getType())) {
      externalConfigurationPb.setAvroOptions(((AvroOptions) getFormatOptions()).toPb());
    }
    if (getFormatOptions() != null && FormatOptions.CSV.equals(getFormatOptions().getType())) {
      externalConfigurationPb.setCsvOptions(((CsvOptions) getFormatOptions()).toPb());
    }
    if (getFormatOptions() != null
        && FormatOptions.GOOGLE_SHEETS.equals(getFormatOptions().getType())) {
      externalConfigurationPb.setGoogleSheetsOptions(
          ((GoogleSheetsOptions) getFormatOptions()).toPb());
    }
    if (getFormatOptions() != null && FormatOptions.BIGTABLE.equals(getFormatOptions().getType())) {
      externalConfigurationPb.setBigtableOptions(((BigtableOptions) getFormatOptions()).toPb());
    }
    if (getAutodetect() != null) {
      externalConfigurationPb.setAutodetect(getAutodetect());
    }
    if (getReferenceFileSchemaUri() != null) {
      externalConfigurationPb.setReferenceFileSchemaUri(getReferenceFileSchemaUri());
    }

    if (getHivePartitioningOptions() != null) {
      externalConfigurationPb.setHivePartitioningOptions(getHivePartitioningOptions().toPb());
    }
    if (getFileSetSpecType() != null) {
      externalConfigurationPb.setFileSetSpecType(getFileSetSpecType());
    }

    if (getObjectMetadata() != null) {
      externalConfigurationPb.setObjectMetadata(getObjectMetadata());
    }

    if (getMetadataCacheMode() != null) {
      externalConfigurationPb.setMetadataCacheMode(getMetadataCacheMode());
    }
    if (getTimeZone() != null) {
      externalConfigurationPb.setTimeZone(getTimeZone());
    }
    if (getDateFormat() != null) {
      externalConfigurationPb.setDateFormat(getDateFormat());
    }
    if (getDatetimeFormat() != null) {
      externalConfigurationPb.setDatetimeFormat(getDatetimeFormat());
    }
    if (getTimeFormat() != null) {
      externalConfigurationPb.setTimeFormat(getTimeFormat());
    }
    if (getTimestampFormat() != null) {
      externalConfigurationPb.setTimestampFormat(getTimestampFormat());
    }
    if (getSourceColumnMatch() != null) {
      externalConfigurationPb
          .getCsvOptions()
          .setSourceColumnMatch(getSourceColumnMatch().toString());
    }
    if (getNullMarkers() != null) {
      externalConfigurationPb.getCsvOptions().setNullMarkers(getNullMarkers());
    }

    return externalConfigurationPb;
  }

  static Builder newBuilder() {
    return new AutoValue_ExternalTableDefinition.Builder().setType(Type.EXTERNAL);
  }

  /**
   * Creates a builder for an ExternalTableDefinition object.
   *
   * @param sourceUris the fully-qualified URIs that point to your data in Google Cloud Storage.
   *     Each URI can contain one '*' wildcard character that must come after the bucket's name.
   *     Size limits related to load jobs apply to external data sources, plus an additional limit
   *     of 10 GB maximum size across all URIs.
   * @param schema the schema for the external data
   * @param format the source format of the external data
   * @return a builder for an ExternalTableDefinition object given source URIs, schema and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static Builder newBuilder(List<String> sourceUris, Schema schema, FormatOptions format) {
    return newBuilder().setSourceUris(sourceUris).setSchema(schema).setFormatOptions(format);
  }

  /**
   * Creates a builder for an ExternalTableDefinition object.
   *
   * @param sourceUri a fully-qualified URI that points to your data in Google Cloud Storage. The
   *     URI can contain one '*' wildcard character that must come after the bucket's name. Size
   *     limits related to load jobs apply to external data sources.
   * @param schema the schema for the external data
   * @param format the source format of the external data
   * @return a builder for an ExternalTableDefinition object given source URI, schema and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static Builder newBuilder(String sourceUri, Schema schema, FormatOptions format) {
    checkArgument(!isNullOrEmpty(sourceUri), "Provided sourceUri is null or empty");
    return newBuilder(ImmutableList.of(sourceUri), schema, format);
  }

  /**
   * Creates a builder for an ExternalTableDefinition object.
   *
   * @param sourceUri the fully-qualified URIs that point to your data in Google Cloud. For Google
   *     Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and
   *     valid HTTPS URL for a Google Cloud Bigtable table. Size limits related to load jobs apply
   *     to external data sources, plus an additional limit of 10 GB maximum size across all URIs.
   * @param format the source format of the external data
   * @return a builder for an ExternalTableDefinition object given source URIs and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static Builder newBuilder(String sourceUri, FormatOptions format) {
    checkArgument(!isNullOrEmpty(sourceUri), "Provided sourceUri is null or empty");
    return newBuilder().setSourceUris(ImmutableList.of(sourceUri)).setFormatOptions(format);
  }

  /**
   * Creates a builder for an ExternalTableDefinition object.
   *
   * @param sourceUri the fully-qualified URIs that point to your data in Google Cloud. For Google
   *     Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and
   *     valid HTTPS URL for a Google Cloud Bigtable table. Size limits related to load jobs apply
   *     to external data sources, plus an additional limit of 10 GB maximum size across all URIs.
   * @return a builder for an ExternalTableDefinition object given source URIs and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static Builder newBuilder(String sourceUri) {
    checkArgument(!isNullOrEmpty(sourceUri), "Provided sourceUri is null or empty");
    return newBuilder().setSourceUris(ImmutableList.of(sourceUri));
  }

  /**
   * Creates an ExternalTableDefinition object.
   *
   * @param sourceUris the fully-qualified URIs that point to your data in Google Cloud Storage.
   *     Each URI can contain one '*' wildcard character that must come after the bucket's name.
   *     Size limits related to load jobs apply to external data sources, plus an additional limit
   *     of 10 GB maximum size across all URIs.
   * @param schema the schema for the external data
   * @param format the source format of the external data
   * @return an ExternalTableDefinition object given source URIs, schema and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static ExternalTableDefinition of(
      List<String> sourceUris, Schema schema, FormatOptions format) {
    return newBuilder(sourceUris, schema, format).build();
  }

  /**
   * Creates an ExternalTableDefinition object.
   *
   * @param sourceUri a fully-qualified URI that points to your data in Google Cloud Storage. The
   *     URI can contain one '*' wildcard character that must come after the bucket's name. Size
   *     limits related to load jobs apply to external data sources.
   * @param schema the schema for the external data
   * @param format the source format of the external data
   * @return an ExternalTableDefinition object given source URIs, schema and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static ExternalTableDefinition of(String sourceUri, Schema schema, FormatOptions format) {
    return newBuilder(sourceUri, schema, format).build();
  }

  /**
   * Creates a builder for an ExternalTableDefinition object.
   *
   * @param sourceUri the fully-qualified URIs that point to your data in Google Cloud. For Google
   *     Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and
   *     valid HTTPS URL for a Google Cloud Bigtable table. Size limits related to load jobs apply
   *     to external data sources, plus an additional limit of 10 GB maximum size across all URIs.
   * @param format the source format of the external data
   * @return a builder for an ExternalTableDefinition object given source URIs and format
   * @see <a href="https://cloud.google.com/bigquery/loading-data-into-bigquery#quota">Quota</a>
   * @see <a
   *     href="https://cloud.google.com/bigquery/docs/reference/v2/tables#externalDataConfiguration.sourceFormat">
   *     Source Format</a>
   */
  public static ExternalTableDefinition of(String sourceUri, FormatOptions format) {
    return newBuilder(sourceUri, format).build();
  }

  @SuppressWarnings("unchecked")
  static ExternalTableDefinition fromPb(Table tablePb) {
    Builder builder = newBuilder().table(tablePb);

    com.google.api.services.bigquery.model.ExternalDataConfiguration externalDataConfiguration =
        tablePb.getExternalDataConfiguration();
    if (externalDataConfiguration != null) {
      if (externalDataConfiguration.getSourceUris() != null) {
        builder.setSourceUris(ImmutableList.copyOf(externalDataConfiguration.getSourceUris()));
      }
      if (externalDataConfiguration.getDecimalTargetTypes() != null) {
        builder.setDecimalTargetTypes(
            ImmutableList.copyOf(externalDataConfiguration.getDecimalTargetTypes()));
      }
      if (externalDataConfiguration.getSourceFormat() != null) {
        builder.setFormatOptions(FormatOptions.of(externalDataConfiguration.getSourceFormat()));
      }
      builder.setCompression(externalDataConfiguration.getCompression());
      if (externalDataConfiguration.getConnectionId() != null) {
        builder.setConnectionId(externalDataConfiguration.getConnectionId());
      }
      builder.setIgnoreUnknownValues(externalDataConfiguration.getIgnoreUnknownValues());
      if (externalDataConfiguration.getAvroOptions() != null) {
        builder.setFormatOptions(AvroOptions.fromPb(externalDataConfiguration.getAvroOptions()));
      }
      if (externalDataConfiguration.getCsvOptions() != null) {
        builder.setFormatOptions(CsvOptions.fromPb(externalDataConfiguration.getCsvOptions()));
      }
      if (externalDataConfiguration.getGoogleSheetsOptions() != null) {
        builder.setFormatOptions(
            GoogleSheetsOptions.fromPb(externalDataConfiguration.getGoogleSheetsOptions()));
      }
      if (externalDataConfiguration.getBigtableOptions() != null) {
        builder.setFormatOptions(
            BigtableOptions.fromPb(externalDataConfiguration.getBigtableOptions()));
      }
      if (externalDataConfiguration.getParquetOptions() != null) {
        builder.setFormatOptions(
            ParquetOptions.fromPb(externalDataConfiguration.getParquetOptions()));
      }
      builder.setMaxBadRecords(externalDataConfiguration.getMaxBadRecords());
      builder.setAutodetect(externalDataConfiguration.getAutodetect());
      if (externalDataConfiguration.getHivePartitioningOptions() != null) {
        builder.setHivePartitioningOptions(
            HivePartitioningOptions.fromPb(externalDataConfiguration.getHivePartitioningOptions()));
      }
      if (externalDataConfiguration.getReferenceFileSchemaUri() != null) {
        builder.setReferenceFileSchemaUri(externalDataConfiguration.getReferenceFileSchemaUri());
      }
      if (externalDataConfiguration.getFileSetSpecType() != null) {
        builder.setFileSetSpecType(externalDataConfiguration.getFileSetSpecType());
      }
      if (externalDataConfiguration.getObjectMetadata() != null) {
        builder.setObjectMetadata(externalDataConfiguration.getObjectMetadata());
      }
      if (externalDataConfiguration.getMetadataCacheMode() != null) {
        builder.setMetadataCacheMode(externalDataConfiguration.getMetadataCacheMode());
      }
      if (tablePb.getMaxStaleness() != null) {
        builder.setMaxStaleness(tablePb.getMaxStaleness());
      }
      if (externalDataConfiguration.getTimeZone() != null) {
        builder.setTimeZone(externalDataConfiguration.getTimeZone());
      }
      if (externalDataConfiguration.getDateFormat() != null) {
        builder.setDateFormat(externalDataConfiguration.getDateFormat());
      }
      if (externalDataConfiguration.getDatetimeFormat() != null) {
        builder.setDatetimeFormat(externalDataConfiguration.getDatetimeFormat());
      }
      if (externalDataConfiguration.getTimeFormat() != null) {
        builder.setTimeFormat(externalDataConfiguration.getTimeFormat());
      }
      if (externalDataConfiguration.getTimestampFormat() != null) {
        builder.setTimestampFormat(externalDataConfiguration.getTimestampFormat());
      }
      if (externalDataConfiguration.getCsvOptions() != null) {
        if (externalDataConfiguration.getCsvOptions().getSourceColumnMatch() != null) {
          builder.setSourceColumnMatch(
              SourceColumnMatch.valueOf(
                  externalDataConfiguration.getCsvOptions().getSourceColumnMatch()));
        }
        if (externalDataConfiguration.getCsvOptions().getNullMarkers() != null) {
          builder.setNullMarkers(externalDataConfiguration.getCsvOptions().getNullMarkers());
        }
      }
    }
    return builder.build();
  }

  static ExternalTableDefinition fromExternalDataConfiguration(
      ExternalDataConfiguration externalDataConfiguration) {
    Builder builder = newBuilder();
    if (externalDataConfiguration.getSourceUris() != null) {
      builder.setSourceUris(externalDataConfiguration.getSourceUris());
    }
    if (externalDataConfiguration.getDecimalTargetTypes() != null) {
      builder.setDecimalTargetTypes(externalDataConfiguration.getDecimalTargetTypes());
    }
    if (externalDataConfiguration.getSchema() != null) {
      builder.setSchema(Schema.fromPb(externalDataConfiguration.getSchema()));
    }
    if (externalDataConfiguration.getSourceFormat() != null) {
      builder.setFormatOptions(FormatOptions.of(externalDataConfiguration.getSourceFormat()));
    }
    if (externalDataConfiguration.getCompression() != null) {
      builder.setCompression(externalDataConfiguration.getCompression());
    }
    if (externalDataConfiguration.getConnectionId() != null) {
      builder.setConnectionId(externalDataConfiguration.getConnectionId());
    }
    if (externalDataConfiguration.getIgnoreUnknownValues() != null) {
      builder.setIgnoreUnknownValues(externalDataConfiguration.getIgnoreUnknownValues());
    }
    if (externalDataConfiguration.getAvroOptions() != null) {
      builder.setFormatOptions(AvroOptions.fromPb(externalDataConfiguration.getAvroOptions()));
    }
    if (externalDataConfiguration.getCsvOptions() != null) {
      builder.setFormatOptions(CsvOptions.fromPb(externalDataConfiguration.getCsvOptions()));
    }
    if (externalDataConfiguration.getGoogleSheetsOptions() != null) {
      builder.setFormatOptions(
          GoogleSheetsOptions.fromPb(externalDataConfiguration.getGoogleSheetsOptions()));
    }
    if (externalDataConfiguration.getBigtableOptions() != null) {
      builder.setFormatOptions(
          BigtableOptions.fromPb(externalDataConfiguration.getBigtableOptions()));
    }
    if (externalDataConfiguration.getParquetOptions() != null) {
      builder.setFormatOptions(
          ParquetOptions.fromPb(externalDataConfiguration.getParquetOptions()));
    }
    if (externalDataConfiguration.getMaxBadRecords() != null) {
      builder.setMaxBadRecords(externalDataConfiguration.getMaxBadRecords());
    }
    if (externalDataConfiguration.getAutodetect() != null) {
      builder.setAutodetect(externalDataConfiguration.getAutodetect());
    }
    if (externalDataConfiguration.getReferenceFileSchemaUri() != null) {
      builder.setReferenceFileSchemaUri(externalDataConfiguration.getReferenceFileSchemaUri());
    }
    if (externalDataConfiguration.getHivePartitioningOptions() != null) {
      builder.setHivePartitioningOptions(
          HivePartitioningOptions.fromPb(externalDataConfiguration.getHivePartitioningOptions()));
    }
    if (externalDataConfiguration.getFileSetSpecType() != null) {
      builder.setFileSetSpecType(externalDataConfiguration.getFileSetSpecType());
    }

    if (externalDataConfiguration.getObjectMetadata() != null) {
      builder.setObjectMetadata(externalDataConfiguration.getObjectMetadata());
    }

    if (externalDataConfiguration.getMetadataCacheMode() != null) {
      builder.setMetadataCacheMode(externalDataConfiguration.getMetadataCacheMode());
    }
    if (externalDataConfiguration.getTimeZone() != null) {
      builder.setTimeZone(externalDataConfiguration.getTimeZone());
    }
    if (externalDataConfiguration.getDateFormat() != null) {
      builder.setDateFormat(externalDataConfiguration.getDateFormat());
    }
    if (externalDataConfiguration.getDatetimeFormat() != null) {
      builder.setDatetimeFormat(externalDataConfiguration.getDatetimeFormat());
    }
    if (externalDataConfiguration.getTimeFormat() != null) {
      builder.setTimeFormat(externalDataConfiguration.getTimeFormat());
    }
    if (externalDataConfiguration.getTimestampFormat() != null) {
      builder.setTimestampFormat(externalDataConfiguration.getTimeFormat());
    }
    if (externalDataConfiguration.getCsvOptions() != null) {
      if (externalDataConfiguration.getCsvOptions().getSourceColumnMatch() != null) {
        builder.setSourceColumnMatch(
            SourceColumnMatch.valueOf(
                externalDataConfiguration.getCsvOptions().getSourceColumnMatch()));
      }
      if (externalDataConfiguration.getCsvOptions().getNullMarkers() != null) {
        builder.setNullMarkers(externalDataConfiguration.getCsvOptions().getNullMarkers());
      }
    }

    return builder.build();
  }
}
