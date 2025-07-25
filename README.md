# Google Cloud BigQuery Client for Java

Java idiomatic client for [Cloud BigQuery][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]


## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file:

```xml
<!--  Using libraries-bom to manage versions.
See https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM -->
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>libraries-bom</artifactId>
      <version>26.62.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.cloud</groupId>
    <artifactId>google-cloud-bigquery</artifactId>
  </dependency>
</dependencies>

```

If you are using Maven without the BOM, add this to your dependencies:

<!-- {x-version-update-start:google-cloud-bigquery:released} -->

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-bigquery</artifactId>
  <version>2.42.2</version>
</dependency>

```

If you are using Gradle 5.x or later, add this to your dependencies:

```Groovy
implementation platform('com.google.cloud:libraries-bom:26.45.0')

implementation 'com.google.cloud:google-cloud-bigquery'
```
If you are using Gradle without BOM, add this to your dependencies:

```Groovy
implementation 'com.google.cloud:google-cloud-bigquery:2.42.2'
```

If you are using SBT, add this to your dependencies:

```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-bigquery" % "2.42.2"
```
<!-- {x-version-update-end} -->

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Authorization

The client application making API calls must be granted [authorization scopes][auth-scopes] required for the desired Cloud BigQuery APIs, and the authenticated principal must have the [IAM role(s)][predefined-iam-roles] required to access GCP resources using the Cloud BigQuery API calls.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Cloud BigQuery [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Cloud BigQuery.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud Command Line Interface][cloud-cli] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-bigquery` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-bigquery` as a dependency in your code.

## About Cloud BigQuery


[Cloud BigQuery][product-docs] is a fully managed, NoOps, low cost data analytics service.
Data can be streamed into BigQuery at millions of rows per second to enable real-time analysis.
With BigQuery you can easily deploy Petabyte-scale Databases.

See the [Cloud BigQuery client library docs][javadocs] to learn how to
use this Cloud BigQuery Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-bigquery/tree/main/samples) directory.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Add Column Load Append | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AddColumnLoadAppend.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AddColumnLoadAppend.java) |
| Add Empty Column | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AddEmptyColumn.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AddEmptyColumn.java) |
| Auth Drive Scope | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthDriveScope.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthDriveScope.java) |
| Auth Snippets | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthSnippets.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthSnippets.java) |
| Auth User Flow | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthUserFlow.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthUserFlow.java) |
| Auth User Query | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthUserQuery.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthUserQuery.java) |
| Authorize Dataset | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthorizeDataset.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthorizeDataset.java) |
| Authorized View Tutorial | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/AuthorizedViewTutorial.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/AuthorizedViewTutorial.java) |
| Browse Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/BrowseTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/BrowseTable.java) |
| Cancel Job | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CancelJob.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CancelJob.java) |
| Copy Multiple Tables | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CopyMultipleTables.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CopyMultipleTables.java) |
| Copy Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CopyTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CopyTable.java) |
| Copy Table Cmek | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CopyTableCmek.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CopyTableCmek.java) |
| Create And Query Repeated Record Field | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateAndQueryRepeatedRecordField.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateAndQueryRepeatedRecordField.java) |
| Create Clustered Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateClusteredTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateClusteredTable.java) |
| Create Dataset | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateDataset.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateDataset.java) |
| Create Dataset Aws | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateDatasetAws.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateDatasetAws.java) |
| Create Dataset With Regional Endpoint | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateDatasetWithRegionalEndpoint.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateDatasetWithRegionalEndpoint.java) |
| Create External Table Aws | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateExternalTableAws.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateExternalTableAws.java) |
| Create Iam Policy | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateIamPolicy.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateIamPolicy.java) |
| Create Job | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateJob.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateJob.java) |
| Create Materialized View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateMaterializedView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateMaterializedView.java) |
| Create Model | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateModel.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateModel.java) |
| Create Partitioned Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreatePartitionedTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreatePartitionedTable.java) |
| Create Range Partitioned Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateRangePartitionedTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateRangePartitionedTable.java) |
| Create Routine | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateRoutine.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateRoutine.java) |
| Create Routine Ddl | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateRoutineDdl.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateRoutineDdl.java) |
| Create Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateTable.java) |
| Create Table Cmek | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateTableCmek.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateTableCmek.java) |
| Create Table External Hive Partitioned | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateTableExternalHivePartitioned.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateTableExternalHivePartitioned.java) |
| Create Table Without Schema | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateTableWithoutSchema.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateTableWithoutSchema.java) |
| Create Tables With Primary And Foreign Keys | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateTablesWithPrimaryAndForeignKeys.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateTablesWithPrimaryAndForeignKeys.java) |
| Create View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/CreateView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/CreateView.java) |
| Dataset Exists | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DatasetExists.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DatasetExists.java) |
| Ddl Create View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DdlCreateView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DdlCreateView.java) |
| Delete Dataset | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteDataset.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteDataset.java) |
| Delete Dataset And Contents | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteDatasetAndContents.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteDatasetAndContents.java) |
| Delete Label Dataset | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteLabelDataset.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteLabelDataset.java) |
| Delete Label Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteLabelTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteLabelTable.java) |
| Delete Materialized View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteMaterializedView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteMaterializedView.java) |
| Delete Model | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteModel.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteModel.java) |
| Delete Routine | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteRoutine.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteRoutine.java) |
| Delete Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/DeleteTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/DeleteTable.java) |
| Export Query Results To S3 | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ExportQueryResultsToS3.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ExportQueryResultsToS3.java) |
| Extract Model | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ExtractModel.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ExtractModel.java) |
| Extract Table Compressed | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ExtractTableCompressed.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ExtractTableCompressed.java) |
| Extract Table To Csv | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ExtractTableToCsv.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ExtractTableToCsv.java) |
| Extract Table To Json | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ExtractTableToJson.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ExtractTableToJson.java) |
| Get Dataset Info | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetDatasetInfo.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetDatasetInfo.java) |
| Get Dataset Labels | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetDatasetLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetDatasetLabels.java) |
| Get Job | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetJob.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetJob.java) |
| Get Model | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetModel.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetModel.java) |
| Get Routine | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetRoutine.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetRoutine.java) |
| Get Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetTable.java) |
| Get Table Labels | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetTableLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetTableLabels.java) |
| Get View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GetView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GetView.java) |
| Grant View Access | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/GrantViewAccess.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/GrantViewAccess.java) |
| Inserting Data Types | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/InsertingDataTypes.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/InsertingDataTypes.java) |
| Label Dataset | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LabelDataset.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LabelDataset.java) |
| Label Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LabelTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LabelTable.java) |
| List Datasets | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListDatasets.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListDatasets.java) |
| List Datasets By Label | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListDatasetsByLabel.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListDatasetsByLabel.java) |
| List Jobs | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListJobs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListJobs.java) |
| List Models | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListModels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListModels.java) |
| List Routines | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListRoutines.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListRoutines.java) |
| List Tables | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ListTables.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ListTables.java) |
| Load Avro From Gcs | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadAvroFromGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadAvroFromGcs.java) |
| Load Avro From Gcs Truncate | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadAvroFromGcsTruncate.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadAvroFromGcsTruncate.java) |
| Load Csv From Gcs | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcs.java) |
| Load Csv From Gcs Autodetect | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcsAutodetect.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcsAutodetect.java) |
| Load Csv From Gcs Truncate | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcsTruncate.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadCsvFromGcsTruncate.java) |
| Load Json From Gcs | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcs.java) |
| Load Json From Gcs Autodetect | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsAutodetect.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsAutodetect.java) |
| Load Json From Gcs Cmek | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsCmek.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsCmek.java) |
| Load Json From Gcs Truncate | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsTruncate.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadJsonFromGcsTruncate.java) |
| Load Local File | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadLocalFile.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadLocalFile.java) |
| Load Local File In Session | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadLocalFileInSession.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadLocalFileInSession.java) |
| Load Orc From Gcs | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadOrcFromGcs.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadOrcFromGcs.java) |
| Load Orc From Gcs Truncate | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadOrcFromGcsTruncate.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadOrcFromGcsTruncate.java) |
| Load Parquet | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadParquet.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadParquet.java) |
| Load Parquet Replace Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadParquetReplaceTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadParquetReplaceTable.java) |
| Load Partitioned Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadPartitionedTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadPartitionedTable.java) |
| Load Table Clustered | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/LoadTableClustered.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/LoadTableClustered.java) |
| Nested Repeated Schema | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/NestedRepeatedSchema.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/NestedRepeatedSchema.java) |
| Query Batch | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryBatch.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryBatch.java) |
| Query Clustered Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryClusteredTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryClusteredTable.java) |
| Query Destination Table Cmek | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryDestinationTableCmek.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryDestinationTableCmek.java) |
| Query Disable Cache | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryDisableCache.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryDisableCache.java) |
| Query Dry Run | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryDryRun.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryDryRun.java) |
| Query External Bigtable Perm | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalBigtablePerm.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalBigtablePerm.java) |
| Query External Bigtable Temp | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalBigtableTemp.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalBigtableTemp.java) |
| Query External Gcs Perm | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalGcsPerm.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalGcsPerm.java) |
| Query External Gcs Temp | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalGcsTemp.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalGcsTemp.java) |
| Query External Sheets Perm | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalSheetsPerm.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalSheetsPerm.java) |
| Query External Sheets Temp | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalSheetsTemp.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalSheetsTemp.java) |
| Query External Table Aws | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryExternalTableAws.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryExternalTableAws.java) |
| Query Large Results | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryLargeResults.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryLargeResults.java) |
| Query Materialized View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryMaterializedView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryMaterializedView.java) |
| Query Pagination | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryPagination.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryPagination.java) |
| Query Partitioned Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryPartitionedTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryPartitionedTable.java) |
| Query Script | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryScript.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryScript.java) |
| Query Short Mode | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryShortMode.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryShortMode.java) |
| Query Total Rows | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryTotalRows.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryTotalRows.java) |
| Query With Array Of Structs Named Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithArrayOfStructsNamedParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithArrayOfStructsNamedParameters.java) |
| Query With Array Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithArrayParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithArrayParameters.java) |
| Query With Named Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithNamedParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithNamedParameters.java) |
| Query With Named Types Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithNamedTypesParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithNamedTypesParameters.java) |
| Query With Positional Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithPositionalParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithPositionalParameters.java) |
| Query With Positional Types Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithPositionalTypesParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithPositionalTypesParameters.java) |
| Query With Structs Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithStructsParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithStructsParameters.java) |
| Query With Timestamp Parameters | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QueryWithTimestampParameters.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QueryWithTimestampParameters.java) |
| Quickstart Sample | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/QuickstartSample.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/QuickstartSample.java) |
| Relax Column Load Append | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/RelaxColumnLoadAppend.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/RelaxColumnLoadAppend.java) |
| Relax Column Mode | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/RelaxColumnMode.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/RelaxColumnMode.java) |
| Relax Table Query | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/RelaxTableQuery.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/RelaxTableQuery.java) |
| Resource Clean Up | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/ResourceCleanUp.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/ResourceCleanUp.java) |
| Run Legacy Query | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/RunLegacyQuery.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/RunLegacyQuery.java) |
| Save Query To Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/SaveQueryToTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/SaveQueryToTable.java) |
| Set User Agent | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/SetUserAgent.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/SetUserAgent.java) |
| Simple App | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/SimpleApp.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/SimpleApp.java) |
| Simple Query | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/SimpleQuery.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/SimpleQuery.java) |
| Simple Query Connection Read Api | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/SimpleQueryConnectionReadApi.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/SimpleQueryConnectionReadApi.java) |
| Table Exists | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/TableExists.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/TableExists.java) |
| Table Insert Rows | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/TableInsertRows.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/TableInsertRows.java) |
| Table Insert Rows Without Row Ids | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/TableInsertRowsWithoutRowIds.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/TableInsertRowsWithoutRowIds.java) |
| Undelete Table | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UndeleteTable.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UndeleteTable.java) |
| Update Dataset Access | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetAccess.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetAccess.java) |
| Update Dataset Description | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetDescription.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetDescription.java) |
| Update Dataset Expiration | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetExpiration.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetExpiration.java) |
| Update Dataset Partition Expiration | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetPartitionExpiration.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateDatasetPartitionExpiration.java) |
| Update Iam Policy | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateIamPolicy.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateIamPolicy.java) |
| Update Materialized View | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateMaterializedView.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateMaterializedView.java) |
| Update Model Description | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateModelDescription.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateModelDescription.java) |
| Update Routine | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateRoutine.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateRoutine.java) |
| Update Table Cmek | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateTableCmek.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateTableCmek.java) |
| Update Table Description | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateTableDescription.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateTableDescription.java) |
| Update Table Dml | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateTableDml.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateTableDml.java) |
| Update Table Expiration | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateTableExpiration.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateTableExpiration.java) |
| Update Table Require Partition Filter | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateTableRequirePartitionFilter.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateTableRequirePartitionFilter.java) |
| Update View Query | [source code](https://github.com/googleapis/java-bigquery/blob/main/samples/snippets/src/main/java/com/example/bigquery/UpdateViewQuery.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-bigquery&page=editor&open_in_editor=samples/snippets/src/main/java/com/example/bigquery/UpdateViewQuery.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Supported Java Versions

Java 8 or above is required for using this client.

Google's Java client libraries,
[Google Cloud Client Libraries][cloudlibs]
and
[Google Cloud API Libraries][apilibs],
follow the
[Oracle Java SE support roadmap][oracle]
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java
LTS version covered by  Oracle's Premier Support (which typically lasts 5 years
from initial General Availability). If the minimum required JVM for a given
library is changed, it is accompanied by a [semver][semver] major release.

Java 11 and (in September 2021) Java 17 are the best choices for new
development.

### Keeping production systems current

Google tests its client libraries with all current LTS versions covered by
Oracle's Extended Support (which typically lasts 8 years from initial
General Availability).

#### Legacy support

Google's client libraries support legacy versions of Java runtimes with long
term stable libraries that don't receive feature updates on a best efforts basis
as it may not be possible to backport all patches.

Google provides updates on a best efforts basis to apps that continue to use
Java 7, though apps might need to upgrade to current versions of the library
that supports their JVM.

#### Where to find specific information

The latest versions and the supported Java versions are identified on
the individual GitHub repository `github.com/GoogleAPIs/java-SERVICENAME`
and on [google-cloud-java][g-c-j].

## Versioning


This library follows [Semantic Versioning](http://semver.org/).



## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/bigquery
[javadocs]: https://cloud.google.com/java/docs/reference/google-cloud-bigquery/latest/history
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-bigquery/java11.html
[stability-image]: https://img.shields.io/badge/stability-stable-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-bigquery.svg
[maven-version-link]: https://central.sonatype.com/artifact/com.google.cloud/google-cloud-bigquery/2.42.2
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-cli]: https://cloud.google.com/cli
[troubleshooting]: https://github.com/googleapis/google-cloud-java/blob/main/TROUBLESHOOTING.md
[contributing]: https://github.com/googleapis/java-bigquery/blob/main/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-bigquery/blob/main/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-bigquery/blob/main/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=bigquery.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png

[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
