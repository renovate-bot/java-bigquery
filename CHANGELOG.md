# Changelog

## [2.54.0](https://github.com/googleapis/java-bigquery/compare/v2.53.0...v2.54.0) (2025-07-31)


### Features

* **bigquery:** Add OpenTelemetry Samples ([#3899](https://github.com/googleapis/java-bigquery/issues/3899)) ([e3d9ed9](https://github.com/googleapis/java-bigquery/commit/e3d9ed92ca5d9b58b5747960d74f895ed8733ebf))
* **bigquery:** Add otel metrics to request headers ([#3900](https://github.com/googleapis/java-bigquery/issues/3900)) ([4071e4c](https://github.com/googleapis/java-bigquery/commit/4071e4cb2547b236183fd4fbb92c73f074cf2fa0))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.70.0 ([#3890](https://github.com/googleapis/java-bigquery/issues/3890)) ([84207e2](https://github.com/googleapis/java-bigquery/commit/84207e297eec75bcb4f1cc1b64423d7c2ddd6c30))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250706-2.0.0 ([#3910](https://github.com/googleapis/java-bigquery/issues/3910)) ([ae5c971](https://github.com/googleapis/java-bigquery/commit/ae5c97146c7076e90c000fd98b797ec8e08a9cd8))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.50.2 ([#3901](https://github.com/googleapis/java-bigquery/issues/3901)) ([8205623](https://github.com/googleapis/java-bigquery/commit/82056237f194a6c99ec4fb3a4315023efdedff1b))
* Update dependency io.opentelemetry:opentelemetry-api to v1.52.0 ([#3902](https://github.com/googleapis/java-bigquery/issues/3902)) ([772407b](https://github.com/googleapis/java-bigquery/commit/772407b12f4da005f79eafc944d4c53f0eec5c27))
* Update dependency io.opentelemetry:opentelemetry-bom to v1.52.0 ([#3903](https://github.com/googleapis/java-bigquery/issues/3903)) ([509a6fc](https://github.com/googleapis/java-bigquery/commit/509a6fc0bb7e7a101bf0d4334a3ff1adde2cab09))
* Update dependency io.opentelemetry:opentelemetry-context to v1.52.0 ([#3904](https://github.com/googleapis/java-bigquery/issues/3904)) ([96c1bae](https://github.com/googleapis/java-bigquery/commit/96c1bae0fcdfdfc2dbb25dcae5007c5d02111a8c))
* Update dependency io.opentelemetry:opentelemetry-exporter-logging to v1.52.0 ([#3905](https://github.com/googleapis/java-bigquery/issues/3905)) ([28ee4c9](https://github.com/googleapis/java-bigquery/commit/28ee4c941b99b1fe3803aefbe7a8ae57100d76cb))

## [2.53.0](https://github.com/googleapis/java-bigquery/compare/v2.52.0...v2.53.0) (2025-07-14)


### Features

* **bigquery:** Add OpenTelemetry support to BQ rpcs ([#3860](https://github.com/googleapis/java-bigquery/issues/3860)) ([e2d23c1](https://github.com/googleapis/java-bigquery/commit/e2d23c1b15f2c48a4113f82b920f5c29c4b5dfea))
* **bigquery:** Add support for custom timezones and timestamps ([#3859](https://github.com/googleapis/java-bigquery/issues/3859)) ([e5467c9](https://github.com/googleapis/java-bigquery/commit/e5467c917c63ac066edcbcd902cc2093a39971a3))
* Next release from main branch is 2.53.0 ([#3879](https://github.com/googleapis/java-bigquery/issues/3879)) ([c47a062](https://github.com/googleapis/java-bigquery/commit/c47a062136fea4de91190cafb1f11bac6abbbe3a))


### Bug Fixes

* Load jobs preserve ascii control characters configuration ([#3876](https://github.com/googleapis/java-bigquery/issues/3876)) ([5cfdf85](https://github.com/googleapis/java-bigquery/commit/5cfdf855fa0cf206660fd89743cbaabf3afa75a3))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.69.0 ([#3870](https://github.com/googleapis/java-bigquery/issues/3870)) ([a7f1007](https://github.com/googleapis/java-bigquery/commit/a7f1007b5242da2c0adebbb309a908d7d4db5974))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250615-2.0.0 ([#3872](https://github.com/googleapis/java-bigquery/issues/3872)) ([f081589](https://github.com/googleapis/java-bigquery/commit/f08158955b7fec3c2ced6332b6e4d76cc13f2e90))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.50.1 ([#3878](https://github.com/googleapis/java-bigquery/issues/3878)) ([0e971b8](https://github.com/googleapis/java-bigquery/commit/0e971b8ace013caa31b8a02a21038e94bebae2a5))


### Documentation

* Update maven format command ([#3877](https://github.com/googleapis/java-bigquery/issues/3877)) ([d2918da](https://github.com/googleapis/java-bigquery/commit/d2918da844cd20ca1602c6fcf9fa1df685f261fc))

## [2.52.0](https://github.com/googleapis/java-bigquery/compare/v2.51.0...v2.52.0) (2025-06-25)


### Features

* **bigquery:** Integrate Otel in client lib ([#3747](https://github.com/googleapis/java-bigquery/issues/3747)) ([6e3e07a](https://github.com/googleapis/java-bigquery/commit/6e3e07a22b8397e1e9d5b567589e44abc55961f2))
* **bigquery:** Integrate Otel into retries, jobs, and more ([#3842](https://github.com/googleapis/java-bigquery/issues/3842)) ([4b28c47](https://github.com/googleapis/java-bigquery/commit/4b28c479c1bc22326c8d2501354fb86ec2ce1744))


### Bug Fixes

* **bigquery:** Add MY_VIEW_DATASET_NAME_TEST_ to resource clean up sample ([#3838](https://github.com/googleapis/java-bigquery/issues/3838)) ([b1962a7](https://github.com/googleapis/java-bigquery/commit/b1962a7f0084ee4c3e248266b50406cf575cd657))


### Dependencies

* Remove version declaration of open-telemetry-bom ([#3855](https://github.com/googleapis/java-bigquery/issues/3855)) ([6f9f77d](https://github.com/googleapis/java-bigquery/commit/6f9f77d47596b00b7317c8a0d4a10c3d849ad57b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.66.0 ([#3835](https://github.com/googleapis/java-bigquery/issues/3835)) ([69be5e7](https://github.com/googleapis/java-bigquery/commit/69be5e7345fb8ca69d633d9dc99cf6c15fa5227b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.68.0 ([#3858](https://github.com/googleapis/java-bigquery/issues/3858)) ([d4ca353](https://github.com/googleapis/java-bigquery/commit/d4ca3535f54f3282aec133337103bbfa2c9a3653))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.49.2 ([#3853](https://github.com/googleapis/java-bigquery/issues/3853)) ([cf864df](https://github.com/googleapis/java-bigquery/commit/cf864df739bbb820e99999b7c1592a3635fea4ec))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.50.0 ([#3861](https://github.com/googleapis/java-bigquery/issues/3861)) ([eb26dee](https://github.com/googleapis/java-bigquery/commit/eb26deee37119389aee3962eea5ad67d63f26c70))
* Update dependency io.opentelemetry:opentelemetry-bom to v1.51.0 ([#3840](https://github.com/googleapis/java-bigquery/issues/3840)) ([51321c2](https://github.com/googleapis/java-bigquery/commit/51321c22778fd41134cc0cdfc70bdc47f05883f1))
* Update ossf/scorecard-action action to v2.4.2 ([#3810](https://github.com/googleapis/java-bigquery/issues/3810)) ([414f61d](https://github.com/googleapis/java-bigquery/commit/414f61d7efcfa568c1446bd41945d7a8e2450649))

## [2.51.0](https://github.com/googleapis/java-bigquery/compare/v2.50.1...v2.51.0) (2025-06-06)


### Features

* **bigquery:** Job creation mode GA ([#3804](https://github.com/googleapis/java-bigquery/issues/3804)) ([a21cde8](https://github.com/googleapis/java-bigquery/commit/a21cde8994e93337326cc4a2deb4bafd1596b77f))
* **bigquery:** Support Fine Grained ACLs for Datasets ([#3803](https://github.com/googleapis/java-bigquery/issues/3803)) ([bebf1c6](https://github.com/googleapis/java-bigquery/commit/bebf1c610e6d050c49fc05f30d3fa0247b7dfdcb))


### Dependencies

* Rollback netty.version to v4.1.119.Final ([#3827](https://github.com/googleapis/java-bigquery/issues/3827)) ([94c71a0](https://github.com/googleapis/java-bigquery/commit/94c71a090eab745c81dd9530bcdd3c8c1e734788))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.65.0 ([#3787](https://github.com/googleapis/java-bigquery/issues/3787)) ([0574ecc](https://github.com/googleapis/java-bigquery/commit/0574eccec2975738804be7d0ccb4c973459c82c9))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250511-2.0.0 ([#3794](https://github.com/googleapis/java-bigquery/issues/3794)) ([d3bf724](https://github.com/googleapis/java-bigquery/commit/d3bf724feef91469b44e1e5068738604d2b3cead))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.49.0 ([#3811](https://github.com/googleapis/java-bigquery/issues/3811)) ([2c5ede4](https://github.com/googleapis/java-bigquery/commit/2c5ede4b115cf7cdd078d54d29ce93636c1cedf5))

## [2.50.1](https://github.com/googleapis/java-bigquery/compare/v2.50.0...v2.50.1) (2025-05-16)


### Dependencies

* Update dependency com.google.cloud:sdk-platform-java-config to v3.48.0 ([#3790](https://github.com/googleapis/java-bigquery/issues/3790)) ([206f06d](https://github.com/googleapis/java-bigquery/commit/206f06de115ead53b26f09a5f4781efd279b5a73))
* Update netty.version to v4.2.1.final ([#3780](https://github.com/googleapis/java-bigquery/issues/3780)) ([6dcd858](https://github.com/googleapis/java-bigquery/commit/6dcd858eca788a8cb571368e12b4925993e380c4))


### Documentation

* **bigquery:** Update TableResult.getTotalRows() docstring ([#3785](https://github.com/googleapis/java-bigquery/issues/3785)) ([6483588](https://github.com/googleapis/java-bigquery/commit/6483588a3c5785b95ea841f21aa38f50ecf4226d))

## [2.50.0](https://github.com/googleapis/java-bigquery/compare/v2.49.2...v2.50.0) (2025-05-06)


### Features

* Add WRITE_TRUNCATE_DATA as an enum value for write disposition ([#3752](https://github.com/googleapis/java-bigquery/issues/3752)) ([acea61c](https://github.com/googleapis/java-bigquery/commit/acea61c20b69b44c8612ca22745458ad04bc6be4))
* **bigquery:** Add support for reservation field in jobs. ([#3768](https://github.com/googleapis/java-bigquery/issues/3768)) ([3e97f7c](https://github.com/googleapis/java-bigquery/commit/3e97f7c0c4676fcdda0862929a69bbabc69926f2))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.63.0 ([#3770](https://github.com/googleapis/java-bigquery/issues/3770)) ([934389e](https://github.com/googleapis/java-bigquery/commit/934389eb114d8fbb10c9c125d21ec26d503dca65))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250404-2.0.0 ([#3754](https://github.com/googleapis/java-bigquery/issues/3754)) ([1381c8f](https://github.com/googleapis/java-bigquery/commit/1381c8fe6c2552eec4519304c71697302733d6c7))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250427-2.0.0 ([#3773](https://github.com/googleapis/java-bigquery/issues/3773)) ([c0795fe](https://github.com/googleapis/java-bigquery/commit/c0795fe948e0ca231dbe8fc47c470603cb48ecc8))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.46.3 ([#3772](https://github.com/googleapis/java-bigquery/issues/3772)) ([ab166b6](https://github.com/googleapis/java-bigquery/commit/ab166b6c33c574b4494368709db0443e055b4863))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.47.0 ([#3779](https://github.com/googleapis/java-bigquery/issues/3779)) ([b27434b](https://github.com/googleapis/java-bigquery/commit/b27434b8a75e74184458e920142f5575fed9ba52))

## [2.49.2](https://github.com/googleapis/java-bigquery/compare/v2.49.1...v2.49.2) (2025-04-26)


### Dependencies

* Update dependency com.google.cloud:sdk-platform-java-config to v3.46.2 ([#3756](https://github.com/googleapis/java-bigquery/issues/3756)) ([907e39f](https://github.com/googleapis/java-bigquery/commit/907e39fd467f972863deeb86356fc3bfb989a76d))

## [2.49.1](https://github.com/googleapis/java-bigquery/compare/v2.49.0...v2.49.1) (2025-04-24)


### Bug Fixes

* Add labels to converter for listTables method ([#3735](https://github.com/googleapis/java-bigquery/issues/3735)) ([#3736](https://github.com/googleapis/java-bigquery/issues/3736)) ([8634822](https://github.com/googleapis/java-bigquery/commit/8634822e1836c5ccc0f8d0263ac57ac561578360))


### Dependencies

* Update dependency com.google.cloud:sdk-platform-java-config to v3.46.0 ([#3753](https://github.com/googleapis/java-bigquery/issues/3753)) ([a335927](https://github.com/googleapis/java-bigquery/commit/a335927e16d0907d62e584f08fa8393daae40354))
* Update netty.version to v4.2.0.final ([#3745](https://github.com/googleapis/java-bigquery/issues/3745)) ([bb811c0](https://github.com/googleapis/java-bigquery/commit/bb811c068b3efabf04fbe67dbb2979d562c604d9))

## [2.49.0](https://github.com/googleapis/java-bigquery/compare/v2.48.1...v2.49.0) (2025-03-20)


### Features

* **bigquery:** Implement getArray in BigQueryResultImpl ([#3693](https://github.com/googleapis/java-bigquery/issues/3693)) ([e2a3f2c](https://github.com/googleapis/java-bigquery/commit/e2a3f2c1a1406bf7bc9a035dce3acfde78f0eaa4))
* Next release from main branch is 2.49.0 ([#3706](https://github.com/googleapis/java-bigquery/issues/3706)) ([b46a6cc](https://github.com/googleapis/java-bigquery/commit/b46a6ccc959f8defb145279ea18ff2e4f1bac58f))


### Bug Fixes

* Retry ExceptionHandler not retrying on IOException ([#3668](https://github.com/googleapis/java-bigquery/issues/3668)) ([83245b9](https://github.com/googleapis/java-bigquery/commit/83245b961950ca9a993694082e533834ee364417))


### Dependencies

* Exclude io.netty:netty-common from org.apache.arrow:arrow-memor… ([#3715](https://github.com/googleapis/java-bigquery/issues/3715)) ([11b5809](https://github.com/googleapis/java-bigquery/commit/11b580949b910b38732c1c8d64704c54c260214e))
* Update actions/upload-artifact action to v4.6.2 ([#3724](https://github.com/googleapis/java-bigquery/issues/3724)) ([426a59b](https://github.com/googleapis/java-bigquery/commit/426a59b9b999e836804f84c5cbe11d497128f0a8))
* Update actions/upload-artifact action to v4.6.2 ([#3724](https://github.com/googleapis/java-bigquery/issues/3724)) ([483f930](https://github.com/googleapis/java-bigquery/commit/483f9305023988b3884329733d0e5fbcb6599eb1))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.61.0 ([#3703](https://github.com/googleapis/java-bigquery/issues/3703)) ([53b07b0](https://github.com/googleapis/java-bigquery/commit/53b07b0e77f6ef57c8518df2b106edace679f79a))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.62.0 ([#3726](https://github.com/googleapis/java-bigquery/issues/3726)) ([38e004b](https://github.com/googleapis/java-bigquery/commit/38e004b58134caf4f7b0d96257456930beb0e599))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250302-2.0.0 ([#3720](https://github.com/googleapis/java-bigquery/issues/3720)) ([c0b3902](https://github.com/googleapis/java-bigquery/commit/c0b39029302c51e65ea31495d837598eefbe94e8))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250313-2.0.0 ([#3723](https://github.com/googleapis/java-bigquery/issues/3723)) ([b8875a8](https://github.com/googleapis/java-bigquery/commit/b8875a895d6d5e267086e24f97d0ed5fec36b9fe))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.65.0 ([#3704](https://github.com/googleapis/java-bigquery/issues/3704)) ([53b68b1](https://github.com/googleapis/java-bigquery/commit/53b68b13a505aa5d38e56032eaeb8c95bf3e9078))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.66.0 ([#3727](https://github.com/googleapis/java-bigquery/issues/3727)) ([7339f94](https://github.com/googleapis/java-bigquery/commit/7339f94cfa53d1c988f8ef051ddd5a2d7668d430))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.45.1 ([#3714](https://github.com/googleapis/java-bigquery/issues/3714)) ([e4512aa](https://github.com/googleapis/java-bigquery/commit/e4512aa5966e7b935fa55a062d940d9db0c834b3))
* Update dependency com.google.oauth-client:google-oauth-client-java6 to v1.39.0 ([#3710](https://github.com/googleapis/java-bigquery/issues/3710)) ([c0c6352](https://github.com/googleapis/java-bigquery/commit/c0c6352b8d02145fe9513e3e23d316e045360d2d))
* Update dependency com.google.oauth-client:google-oauth-client-jetty to v1.39.0 ([#3711](https://github.com/googleapis/java-bigquery/issues/3711)) ([43b86e9](https://github.com/googleapis/java-bigquery/commit/43b86e91a664dd9d3edaea7b31b46ac635fb22b0))
* Update dependency node to v22 ([#3713](https://github.com/googleapis/java-bigquery/issues/3713)) ([251def5](https://github.com/googleapis/java-bigquery/commit/251def5659d2648dff0833ba967a65435e11b643))
* Update netty.version to v4.1.119.final ([#3717](https://github.com/googleapis/java-bigquery/issues/3717)) ([08a290a](https://github.com/googleapis/java-bigquery/commit/08a290adcfa7551ee27a58da0eaf5ac00a759b90))


### Documentation

* Update error handling comment to be more precise in samples ([#3712](https://github.com/googleapis/java-bigquery/issues/3712)) ([9eb555f](https://github.com/googleapis/java-bigquery/commit/9eb555ff61bef42a3bdfe197da8423b7bf14f493))

## [2.48.1](https://github.com/googleapis/java-bigquery/compare/v2.48.0...v2.48.1) (2025-02-26)


### Dependencies

* Update actions/upload-artifact action to v4.6.1 ([#3691](https://github.com/googleapis/java-bigquery/issues/3691)) ([9c0edea](https://github.com/googleapis/java-bigquery/commit/9c0edea7c00b3ffbe6b6a404e4161f768acb34f2))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.60.0 ([#3680](https://github.com/googleapis/java-bigquery/issues/3680)) ([6d9a40d](https://github.com/googleapis/java-bigquery/commit/6d9a40d55a6bbcbff7df39723d33f0af2b24f66e))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250216-2.0.0 ([#3688](https://github.com/googleapis/java-bigquery/issues/3688)) ([e3beb6f](https://github.com/googleapis/java-bigquery/commit/e3beb6ffe433db8ad4087d0f27a8f0d23e7c9322))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.64.0 ([#3681](https://github.com/googleapis/java-bigquery/issues/3681)) ([9e4e261](https://github.com/googleapis/java-bigquery/commit/9e4e26116226d17cc42ae030eed284bd6674b74b))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.44.0 ([#3694](https://github.com/googleapis/java-bigquery/issues/3694)) ([f69fbd3](https://github.com/googleapis/java-bigquery/commit/f69fbd371f18da6ddc43d4f32f532e684026fe16))
* Update dependency com.google.oauth-client:google-oauth-client-java6 to v1.38.0 ([#3685](https://github.com/googleapis/java-bigquery/issues/3685)) ([53bd7af](https://github.com/googleapis/java-bigquery/commit/53bd7af47783674a3accbadb1172edbcf628ab2b))
* Update dependency com.google.oauth-client:google-oauth-client-jetty to v1.38.0 ([#3686](https://github.com/googleapis/java-bigquery/issues/3686)) ([d71b2a3](https://github.com/googleapis/java-bigquery/commit/d71b2a34a728fb6ee1c88cdc895b87959e230b7a))
* Update ossf/scorecard-action action to v2.4.1 ([#3690](https://github.com/googleapis/java-bigquery/issues/3690)) ([cdb61fe](https://github.com/googleapis/java-bigquery/commit/cdb61febcb1a64f6ddd3c0e3c29fa7995f1d3fa5))

## [2.48.0](https://github.com/googleapis/java-bigquery/compare/v2.47.0...v2.48.0) (2025-02-13)


### Features

* Implement wasNull for BigQueryResultSet ([#3650](https://github.com/googleapis/java-bigquery/issues/3650)) ([c7ef94b](https://github.com/googleapis/java-bigquery/commit/c7ef94be115cd572df589385f9be801033d72d6d))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.59.0 ([#3660](https://github.com/googleapis/java-bigquery/issues/3660)) ([3a6228b](https://github.com/googleapis/java-bigquery/commit/3a6228b4adc638759d3b2725c612e97e1a3b9cec))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250128-2.0.0 ([#3667](https://github.com/googleapis/java-bigquery/issues/3667)) ([0b92af6](https://github.com/googleapis/java-bigquery/commit/0b92af6eba4a633bb514089c24b7dd19cf286789))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.63.0 ([#3661](https://github.com/googleapis/java-bigquery/issues/3661)) ([9bc8c01](https://github.com/googleapis/java-bigquery/commit/9bc8c0115dc16fb950567cd85cc7dfaa9df50d7d))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.43.0 ([#3669](https://github.com/googleapis/java-bigquery/issues/3669)) ([4d9e0ff](https://github.com/googleapis/java-bigquery/commit/4d9e0ff30269127f47484910e71fa7a21a735492))


### Documentation

* Update CONTRIBUTING.md for users without branch permissions ([#3670](https://github.com/googleapis/java-bigquery/issues/3670)) ([009b9a2](https://github.com/googleapis/java-bigquery/commit/009b9a2b3940ab66220e68ddd565710b8552cc45))

## [2.47.0](https://github.com/googleapis/java-bigquery/compare/v2.46.0...v2.47.0) (2025-01-29)


### Features

* **bigquery:** Support resource tags for datasets in java client ([#3647](https://github.com/googleapis/java-bigquery/issues/3647)) ([01e0b74](https://github.com/googleapis/java-bigquery/commit/01e0b742b9ffeafaa89b080a39d8a66c12c1fd3b))


### Bug Fixes

* **bigquery:** Remove ReadAPI bypass in executeSelect() ([#3624](https://github.com/googleapis/java-bigquery/issues/3624)) ([fadd992](https://github.com/googleapis/java-bigquery/commit/fadd992a63fd1bc87c99cc689ed103f05de49a99))
* Close bq read client ([#3644](https://github.com/googleapis/java-bigquery/issues/3644)) ([8833c97](https://github.com/googleapis/java-bigquery/commit/8833c97d73e3ba8e6a2061bbc55a6254b9e6668e))


### Dependencies

* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20250112-2.0.0 ([#3651](https://github.com/googleapis/java-bigquery/issues/3651)) ([fd06100](https://github.com/googleapis/java-bigquery/commit/fd06100c4c18b0416d384ec1f6bdfc796b70ad9f))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.42.0 ([#3653](https://github.com/googleapis/java-bigquery/issues/3653)) ([1a14342](https://github.com/googleapis/java-bigquery/commit/1a143428c7f584db3dd6e827c2ee8fe980afe18c))
* Update github/codeql-action action to v2.28.1 ([#3637](https://github.com/googleapis/java-bigquery/issues/3637)) ([858e517](https://github.com/googleapis/java-bigquery/commit/858e51792d98276f10fd780ef6edd0bb4a1b4f54))

## [2.46.0](https://github.com/googleapis/java-bigquery/compare/v2.45.0...v2.46.0) (2025-01-11)


### Features

* **bigquery:** Support IAM conditions in datasets in Java client. ([#3602](https://github.com/googleapis/java-bigquery/issues/3602)) ([6696a9c](https://github.com/googleapis/java-bigquery/commit/6696a9c7d42970e3c24bda4da713a855dbe40ce5))


### Bug Fixes

* NPE when reading BigQueryResultSet from empty tables ([#3627](https://github.com/googleapis/java-bigquery/issues/3627)) ([9a0b05a](https://github.com/googleapis/java-bigquery/commit/9a0b05a3b57797b7cdd8ca9739699fc018dbd868))
* **test:** Force usage of ReadAPI ([#3625](https://github.com/googleapis/java-bigquery/issues/3625)) ([5ca7d4a](https://github.com/googleapis/java-bigquery/commit/5ca7d4acbbc40d6ef337732464b3bbd130c86430))


### Dependencies

* Update actions/upload-artifact action to v4.5.0 ([#3620](https://github.com/googleapis/java-bigquery/issues/3620)) ([cc25099](https://github.com/googleapis/java-bigquery/commit/cc25099f81cbf94e9e2ee9db03a7d9ecd913c176))
* Update actions/upload-artifact action to v4.6.0 ([#3633](https://github.com/googleapis/java-bigquery/issues/3633)) ([ca20aa4](https://github.com/googleapis/java-bigquery/commit/ca20aa47ea7826594975ab6aeb8498e2377f8553))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.57.0 ([#3617](https://github.com/googleapis/java-bigquery/issues/3617)) ([51370a9](https://github.com/googleapis/java-bigquery/commit/51370a92e7ab29dfce91199666f23576d2d1b64a))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.58.0 ([#3631](https://github.com/googleapis/java-bigquery/issues/3631)) ([b0ea0d5](https://github.com/googleapis/java-bigquery/commit/b0ea0d5bc4ac730b0e2eaf47e8a7441dc113686b))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20241222-2.0.0 ([#3623](https://github.com/googleapis/java-bigquery/issues/3623)) ([4061922](https://github.com/googleapis/java-bigquery/commit/4061922e46135d673bfa48c00bbf284efa46e065))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.61.0 ([#3618](https://github.com/googleapis/java-bigquery/issues/3618)) ([6cba626](https://github.com/googleapis/java-bigquery/commit/6cba626ff14cebbc04fa4f6058b273de0c5dd96e))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.62.0 ([#3632](https://github.com/googleapis/java-bigquery/issues/3632)) ([e9ff265](https://github.com/googleapis/java-bigquery/commit/e9ff265041f6771a71c8c378ed3ff5fdec6e837b))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.41.1 ([#3628](https://github.com/googleapis/java-bigquery/issues/3628)) ([442d217](https://github.com/googleapis/java-bigquery/commit/442d217606b7d93d26887344a7a4a01303b18b8c))
* Update dependency com.google.oauth-client:google-oauth-client-java6 to v1.37.0 ([#3614](https://github.com/googleapis/java-bigquery/issues/3614)) ([f5faa69](https://github.com/googleapis/java-bigquery/commit/f5faa69bc5b6fdae137724df5693f8aecf27d609))
* Update dependency com.google.oauth-client:google-oauth-client-jetty to v1.37.0 ([#3615](https://github.com/googleapis/java-bigquery/issues/3615)) ([a6c7944](https://github.com/googleapis/java-bigquery/commit/a6c79443a5e675a01ecb91e362e261a6f6ecc055))
* Update github/codeql-action action to v2.27.9 ([#3608](https://github.com/googleapis/java-bigquery/issues/3608)) ([567ce01](https://github.com/googleapis/java-bigquery/commit/567ce01ed77d44760ddcd872a0d61abdd6a09832))
* Update github/codeql-action action to v2.28.0 ([#3621](https://github.com/googleapis/java-bigquery/issues/3621)) ([e0e09ec](https://github.com/googleapis/java-bigquery/commit/e0e09ec4954f5b5e2f094e4c67600f38353f453c))

## [2.45.0](https://github.com/googleapis/java-bigquery/compare/v2.44.0...v2.45.0) (2024-12-13)


### Features

* Enable Lossless Timestamps in BQ java client lib ([#3589](https://github.com/googleapis/java-bigquery/issues/3589)) ([c0b874a](https://github.com/googleapis/java-bigquery/commit/c0b874aa0150e63908450b13d019864b8cbfbfe3))
* Introduce `java.time` methods and variables ([#3586](https://github.com/googleapis/java-bigquery/issues/3586)) ([31fb15f](https://github.com/googleapis/java-bigquery/commit/31fb15fb963c18e4c29391e9fe56dfde31577511))


### Bug Fixes

* **test:** Update schema for broken ConnImplBenchmark test ([#3574](https://github.com/googleapis/java-bigquery/issues/3574)) ([8cf4387](https://github.com/googleapis/java-bigquery/commit/8cf4387fae22c81d40635b470b216fa4c126d681))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.56.0 ([#3582](https://github.com/googleapis/java-bigquery/issues/3582)) ([616ee2a](https://github.com/googleapis/java-bigquery/commit/616ee2aa8ccf3d2975274b256252f2f249775960))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20241111-2.0.0 ([#3591](https://github.com/googleapis/java-bigquery/issues/3591)) ([3eef3a9](https://github.com/googleapis/java-bigquery/commit/3eef3a9959bcfdb76c26fdf9069d9acf89f93a7a))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20241115-2.0.0 ([#3601](https://github.com/googleapis/java-bigquery/issues/3601)) ([41f9adb](https://github.com/googleapis/java-bigquery/commit/41f9adbe4235329fa2bbfd0930f4113e63f72e05))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.60.0 ([#3583](https://github.com/googleapis/java-bigquery/issues/3583)) ([34dd8bc](https://github.com/googleapis/java-bigquery/commit/34dd8bc22c8188f2b61dc9939b24a8d820548e2b))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.41.0 ([#3607](https://github.com/googleapis/java-bigquery/issues/3607)) ([11499d1](https://github.com/googleapis/java-bigquery/commit/11499d16727934fd3dfa5c18226e6f20471a11ac))
* Update github/codeql-action action to v2.27.5 ([#3588](https://github.com/googleapis/java-bigquery/issues/3588)) ([3f94075](https://github.com/googleapis/java-bigquery/commit/3f9407570fea5317aaf212b058ca1da05985eda9))
* Update github/codeql-action action to v2.27.6 ([#3597](https://github.com/googleapis/java-bigquery/issues/3597)) ([bc1f3b9](https://github.com/googleapis/java-bigquery/commit/bc1f3b97a0c8ccc6e93a07b2f0ebcf8e05da9b48))
* Update github/codeql-action action to v2.27.7 ([#3603](https://github.com/googleapis/java-bigquery/issues/3603)) ([528426b](https://github.com/googleapis/java-bigquery/commit/528426bf9b7801b1b9b45758b560f14a4c9bbc57))


### Documentation

* **bigquery:** Add javadoc description of timestamp() parameter. ([#3604](https://github.com/googleapis/java-bigquery/issues/3604)) ([6ee0c10](https://github.com/googleapis/java-bigquery/commit/6ee0c103771ef678f66cc7a584bdce27e21f29c4))

## [2.44.0](https://github.com/googleapis/java-bigquery/compare/v2.43.3...v2.44.0) (2024-11-17)


### Features

* Enable maxTimeTravelHours in BigQuery java client library ([#3555](https://github.com/googleapis/java-bigquery/issues/3555)) ([bd24fd8](https://github.com/googleapis/java-bigquery/commit/bd24fd8c550bfbd1207b194ed5c863a4a9924d48))


### Bug Fixes

* Update experimental methods documentation to [@internalapi](https://github.com/internalapi) ([#3552](https://github.com/googleapis/java-bigquery/issues/3552)) ([20826f1](https://github.com/googleapis/java-bigquery/commit/20826f1b08a3cc5bdcce5637b7ea21d467b2bce2))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.55.0 ([#3559](https://github.com/googleapis/java-bigquery/issues/3559)) ([950ad0c](https://github.com/googleapis/java-bigquery/commit/950ad0cce6370e332a568d3b2e9ef3911503d206))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20241027-2.0.0 ([#3568](https://github.com/googleapis/java-bigquery/issues/3568)) ([b5ccfcc](https://github.com/googleapis/java-bigquery/commit/b5ccfccb552e731ccb09be923715849a4282d44d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.59.0 ([#3561](https://github.com/googleapis/java-bigquery/issues/3561)) ([1bd24a1](https://github.com/googleapis/java-bigquery/commit/1bd24a1ad28d168587b7cba95ec348cb1308a803))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.40.0 ([#3576](https://github.com/googleapis/java-bigquery/issues/3576)) ([d5fa951](https://github.com/googleapis/java-bigquery/commit/d5fa951b8255ec1bcbcdf9bb3c29f247e38a0c7e))
* Update github/codeql-action action to v2.27.1 ([#3567](https://github.com/googleapis/java-bigquery/issues/3567)) ([e154ee3](https://github.com/googleapis/java-bigquery/commit/e154ee300485dc9d900343a8b5ceb7f6633bc3ff))
* Update github/codeql-action action to v2.27.3 ([#3569](https://github.com/googleapis/java-bigquery/issues/3569)) ([3707a40](https://github.com/googleapis/java-bigquery/commit/3707a402039365c49e1976a388593f621231dc02))
* Update github/codeql-action action to v2.27.4 ([#3572](https://github.com/googleapis/java-bigquery/issues/3572)) ([2c7b4f7](https://github.com/googleapis/java-bigquery/commit/2c7b4f750f4c8bf03c0ba74402d745341382a209))


### Documentation

* Fix BigQuery documentation formating ([#3565](https://github.com/googleapis/java-bigquery/issues/3565)) ([552f491](https://github.com/googleapis/java-bigquery/commit/552f49132af370f66aa1ccdde86e6280f638da22))

## [2.43.3](https://github.com/googleapis/java-bigquery/compare/v2.43.2...v2.43.3) (2024-10-29)


### Dependencies

* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v3.10.2 ([19fc184](https://github.com/googleapis/java-bigquery/commit/19fc1843f7db8ab6fb361bf7f8119014033bc1c6))

## [2.43.2](https://github.com/googleapis/java-bigquery/compare/v2.43.1...v2.43.2) (2024-10-27)


### Dependencies

* Update actions/checkout action to v4.2.2 ([#3541](https://github.com/googleapis/java-bigquery/issues/3541)) ([c36c123](https://github.com/googleapis/java-bigquery/commit/c36c123f5cd298b1481c9073ac9f5e634b0e1e68))
* Update actions/upload-artifact action to v4.4.2 ([#3524](https://github.com/googleapis/java-bigquery/issues/3524)) ([776a554](https://github.com/googleapis/java-bigquery/commit/776a5541cc94e8ffb1f5e5c6969ae06585571b45))
* Update actions/upload-artifact action to v4.4.3 ([#3530](https://github.com/googleapis/java-bigquery/issues/3530)) ([2f87fd9](https://github.com/googleapis/java-bigquery/commit/2f87fd9d777175cb5a8e5b0dc55f07546351e504))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.54.0 ([#3532](https://github.com/googleapis/java-bigquery/issues/3532)) ([25be311](https://github.com/googleapis/java-bigquery/commit/25be311c1477db0993a5825a2b839a295170790f))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20241013-2.0.0 ([#3544](https://github.com/googleapis/java-bigquery/issues/3544)) ([0c42092](https://github.com/googleapis/java-bigquery/commit/0c42092e34912d21a4d13f041577056faadf914a))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v3.10.0 ([0bd3c86](https://github.com/googleapis/java-bigquery/commit/0bd3c862636271c5a851fcd229b4cf6878a8c5d4))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v3.10.1 ([c03a63a](https://github.com/googleapis/java-bigquery/commit/c03a63a0da4f4915e9761dc1ca7429c46748688c))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.58.0 ([#3533](https://github.com/googleapis/java-bigquery/issues/3533)) ([cad2643](https://github.com/googleapis/java-bigquery/commit/cad26430f21a37eec2b87ea417f0cf67dcf9c97a))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.38.0 ([#3542](https://github.com/googleapis/java-bigquery/issues/3542)) ([16448ee](https://github.com/googleapis/java-bigquery/commit/16448eec7c7f00a113c923a0fcde463c8ac91f9b))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.39.0 ([#3548](https://github.com/googleapis/java-bigquery/issues/3548)) ([616b2f6](https://github.com/googleapis/java-bigquery/commit/616b2f611f313994bf0ec2889daea3b569a84baf))
* Update github/codeql-action action to v2.26.13 ([#3536](https://github.com/googleapis/java-bigquery/issues/3536)) ([844744f](https://github.com/googleapis/java-bigquery/commit/844744f3dea804a31abc806592f557a26cffbab4))
* Update github/codeql-action action to v2.27.0 ([#3540](https://github.com/googleapis/java-bigquery/issues/3540)) ([1616a0f](https://github.com/googleapis/java-bigquery/commit/1616a0f6057916e21f3b4a6d418d1431d8d1fa16))


### Documentation

* Reformat javadoc ([#3545](https://github.com/googleapis/java-bigquery/issues/3545)) ([4763f73](https://github.com/googleapis/java-bigquery/commit/4763f73ad854ca4bfdddbbdc0bb43fe639238665))
* Update SimpleApp to explicitly set project id ([#3534](https://github.com/googleapis/java-bigquery/issues/3534)) ([903a0f7](https://github.com/googleapis/java-bigquery/commit/903a0f7db0926f3d166eebada1710413056fb4a2))

## [2.43.1](https://github.com/googleapis/java-bigquery/compare/v2.43.0...v2.43.1) (2024-10-09)


### Dependencies

* Update actions/checkout action to v4.2.1 ([#3520](https://github.com/googleapis/java-bigquery/issues/3520)) ([ad8175a](https://github.com/googleapis/java-bigquery/commit/ad8175af06d5308a9366f8109055d61c115a4852))
* Update actions/upload-artifact action to v4.4.1 ([#3521](https://github.com/googleapis/java-bigquery/issues/3521)) ([dc21975](https://github.com/googleapis/java-bigquery/commit/dc21975cc6f3597d8f789f12a58feaa5b9b94da0))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240919-2.0.0 ([#3514](https://github.com/googleapis/java-bigquery/issues/3514)) ([9fe3829](https://github.com/googleapis/java-bigquery/commit/9fe382927ff4718252e22ac20c4e012f490e6b0e))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.37.0 ([bf4d37a](https://github.com/googleapis/java-bigquery/commit/bf4d37a15f13ada3cf0045b2d45355193d2c2f34))
* Update github/codeql-action action to v2.26.11 ([#3517](https://github.com/googleapis/java-bigquery/issues/3517)) ([ac736bb](https://github.com/googleapis/java-bigquery/commit/ac736bb50bf4b2e629dcbfe7de90b846e07038e4))
* Update github/codeql-action action to v2.26.12 ([#3522](https://github.com/googleapis/java-bigquery/issues/3522)) ([fdf8dc4](https://github.com/googleapis/java-bigquery/commit/fdf8dc4b7cb4e26939da10002e47c810d71bad6c))

## [2.43.0](https://github.com/googleapis/java-bigquery/compare/v2.42.4...v2.43.0) (2024-10-01)


### Features

* Add max staleness to ExternalTableDefinition ([#3499](https://github.com/googleapis/java-bigquery/issues/3499)) ([f1ebd5b](https://github.com/googleapis/java-bigquery/commit/f1ebd5be5877a68f76efafc30e3b5b0763f343c5))

## [2.42.4](https://github.com/googleapis/java-bigquery/compare/v2.42.3...v2.42.4) (2024-09-30)


### Dependencies

* Update actions/checkout action to v4.2.0 ([#3495](https://github.com/googleapis/java-bigquery/issues/3495)) ([b57fefb](https://github.com/googleapis/java-bigquery/commit/b57fefbdfee7b8dacdb12502d1df72af21323b51))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.51.0 ([#3480](https://github.com/googleapis/java-bigquery/issues/3480)) ([986b036](https://github.com/googleapis/java-bigquery/commit/986b036a022c8f68db59dd9d5944f3b724777533))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.53.0 ([#3504](https://github.com/googleapis/java-bigquery/issues/3504)) ([57ce901](https://github.com/googleapis/java-bigquery/commit/57ce9018448ebf4f09d3ecf9760054ebd117bc36))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240905-2.0.0 ([#3483](https://github.com/googleapis/java-bigquery/issues/3483)) ([a6508a2](https://github.com/googleapis/java-bigquery/commit/a6508a29f81b6729e41e827096e90f1d1bf07f4d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.55.0 ([#3481](https://github.com/googleapis/java-bigquery/issues/3481)) ([8908cfd](https://github.com/googleapis/java-bigquery/commit/8908cfd82332d09997a5538113fbe8e382f52c4a))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.57.0 ([#3505](https://github.com/googleapis/java-bigquery/issues/3505)) ([6e78f56](https://github.com/googleapis/java-bigquery/commit/6e78f56d17bb0d30b361220c86b1c66f21e9bd48))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.36.0 ([#3490](https://github.com/googleapis/java-bigquery/issues/3490)) ([a72c582](https://github.com/googleapis/java-bigquery/commit/a72c5825c93f359d295fb78e0e541752f535876b))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.36.1 ([#3496](https://github.com/googleapis/java-bigquery/issues/3496)) ([8f2e5c5](https://github.com/googleapis/java-bigquery/commit/8f2e5c542760ecd7c217c36c80cb3b5aebee6a73))
* Update dependency ubuntu to v24 ([#3498](https://github.com/googleapis/java-bigquery/issues/3498)) ([4f87ade](https://github.com/googleapis/java-bigquery/commit/4f87adec6c010b572675f98b651f88d14323e2e2))
* Update github/codeql-action action to v2.26.10 ([#3506](https://github.com/googleapis/java-bigquery/issues/3506)) ([ca71294](https://github.com/googleapis/java-bigquery/commit/ca712948b1adfb26bb1f9ef2250be10fe45d3424))
* Update github/codeql-action action to v2.26.7 ([#3482](https://github.com/googleapis/java-bigquery/issues/3482)) ([e2c94b6](https://github.com/googleapis/java-bigquery/commit/e2c94b601781ebe236c25cd3f40059e7543ba387))
* Update github/codeql-action action to v2.26.8 ([#3488](https://github.com/googleapis/java-bigquery/issues/3488)) ([a6d75de](https://github.com/googleapis/java-bigquery/commit/a6d75de60b822dcc5433afab55b5d392e6a6caf5))
* Update github/codeql-action action to v2.26.9 ([#3494](https://github.com/googleapis/java-bigquery/issues/3494)) ([8154043](https://github.com/googleapis/java-bigquery/commit/815404319a43a8a14d1d8aaa8ab22dd924b48175))

## [2.42.3](https://github.com/googleapis/java-bigquery/compare/v2.42.2...v2.42.3) (2024-09-12)


### Dependencies

* Update actions/upload-artifact action to v4.4.0 ([#3467](https://github.com/googleapis/java-bigquery/issues/3467)) ([08b28c5](https://github.com/googleapis/java-bigquery/commit/08b28c510a2280119a03da3caa385ec31e0c944c))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.35.0 ([#3472](https://github.com/googleapis/java-bigquery/issues/3472)) ([fa9ac5d](https://github.com/googleapis/java-bigquery/commit/fa9ac5d73ec4f21ab7d12949e413b4ee9d11aa6d))

## [2.42.2](https://github.com/googleapis/java-bigquery/compare/v2.42.1...v2.42.2) (2024-08-29)


### Bug Fixes

* ExecuteSelect now use provided credentials instead of GOOGLE_APP… ([#3465](https://github.com/googleapis/java-bigquery/issues/3465)) ([cd82235](https://github.com/googleapis/java-bigquery/commit/cd82235475310cacf1f607a412418be97c83559f))


### Dependencies

* Update actions/upload-artifact action to v4.3.5 ([#3456](https://github.com/googleapis/java-bigquery/issues/3456)) ([f00977c](https://github.com/googleapis/java-bigquery/commit/f00977ccf60227bf1415795da5b6e0a208f21b2c))
* Update actions/upload-artifact action to v4.3.5 ([#3462](https://github.com/googleapis/java-bigquery/issues/3462)) ([e1c6e92](https://github.com/googleapis/java-bigquery/commit/e1c6e92813c739fcd861e0622413b74c638cb547))
* Update actions/upload-artifact action to v4.3.6 ([#3463](https://github.com/googleapis/java-bigquery/issues/3463)) ([ba91227](https://github.com/googleapis/java-bigquery/commit/ba91227b972acb1d0796d5a9470ba790dfb8d5b0))
* Update github/codeql-action action to v2.26.6 ([#3464](https://github.com/googleapis/java-bigquery/issues/3464)) ([2aeb44d](https://github.com/googleapis/java-bigquery/commit/2aeb44d8b2ff5fa264cb14a8fc31e9494d77cb6b))

## [2.42.1](https://github.com/googleapis/java-bigquery/compare/v2.42.0...v2.42.1) (2024-08-27)


### Bug Fixes

* NPE for executeSelect nonFast path with empty result ([#3445](https://github.com/googleapis/java-bigquery/issues/3445)) ([d0d758a](https://github.com/googleapis/java-bigquery/commit/d0d758a6e5e90502491eefa64e3a7409bdcea6a9))


### Dependencies

* Update actions/upload-artifact action to v4.3.5 ([#3420](https://github.com/googleapis/java-bigquery/issues/3420)) ([d5ec87d](https://github.com/googleapis/java-bigquery/commit/d5ec87d16f64c231c8bfd87635952cb1a04f5e25))
* Update actions/upload-artifact action to v4.3.5 ([#3422](https://github.com/googleapis/java-bigquery/issues/3422)) ([c7d07b3](https://github.com/googleapis/java-bigquery/commit/c7d07b3f1d6fa2c2259fa7315b284bcaf48ee5f2))
* Update actions/upload-artifact action to v4.3.5 ([#3424](https://github.com/googleapis/java-bigquery/issues/3424)) ([a9d6869](https://github.com/googleapis/java-bigquery/commit/a9d6869251fa3df80d639c6998b62992468d6625))
* Update actions/upload-artifact action to v4.3.5 ([#3427](https://github.com/googleapis/java-bigquery/issues/3427)) ([022eb57](https://github.com/googleapis/java-bigquery/commit/022eb578ae0b6f02e943662c8d4e453590f7c209))
* Update actions/upload-artifact action to v4.3.5 ([#3430](https://github.com/googleapis/java-bigquery/issues/3430)) ([c7aacba](https://github.com/googleapis/java-bigquery/commit/c7aacbaeddc4809e283c6dfcdedd9610eac7730f))
* Update actions/upload-artifact action to v4.3.5 ([#3432](https://github.com/googleapis/java-bigquery/issues/3432)) ([b7e8244](https://github.com/googleapis/java-bigquery/commit/b7e8244cffdef926465e2d2700766b98ad687247))
* Update actions/upload-artifact action to v4.3.5 ([#3436](https://github.com/googleapis/java-bigquery/issues/3436)) ([ccefd6e](https://github.com/googleapis/java-bigquery/commit/ccefd6e755042b1e4c2aaec10228abb05779ed87))
* Update actions/upload-artifact action to v4.3.5 ([#3440](https://github.com/googleapis/java-bigquery/issues/3440)) ([916fe9a](https://github.com/googleapis/java-bigquery/commit/916fe9ad67e5162a9f24852a96e40a2051ebffbd))
* Update actions/upload-artifact action to v4.3.5 ([#3443](https://github.com/googleapis/java-bigquery/issues/3443)) ([187f099](https://github.com/googleapis/java-bigquery/commit/187f099edbf785e3ef50ae28fce6ae194d44dfb3))
* Update actions/upload-artifact action to v4.3.5 ([#3444](https://github.com/googleapis/java-bigquery/issues/3444)) ([04aea5e](https://github.com/googleapis/java-bigquery/commit/04aea5e1d0eeab02f8ea92ff3467c64507dc05c9))
* Update actions/upload-artifact action to v4.3.5 ([#3449](https://github.com/googleapis/java-bigquery/issues/3449)) ([c6e93cd](https://github.com/googleapis/java-bigquery/commit/c6e93cd1996f2feca3c79bf5ec4a079bd821c0f6))
* Update actions/upload-artifact action to v4.3.5 ([#3455](https://github.com/googleapis/java-bigquery/issues/3455)) ([fbfc106](https://github.com/googleapis/java-bigquery/commit/fbfc1064688ba594a0d232c413e6f8b54558590f))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.49.0 ([#3417](https://github.com/googleapis/java-bigquery/issues/3417)) ([66336a8](https://github.com/googleapis/java-bigquery/commit/66336a8989681a7c5c3d901c11c7fc6cef0b9fef))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.50.0 ([#3448](https://github.com/googleapis/java-bigquery/issues/3448)) ([2c12839](https://github.com/googleapis/java-bigquery/commit/2c128398b04c28ccd0844d028e2f8c467f8723f0))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240714-2.0.0 ([#3412](https://github.com/googleapis/java-bigquery/issues/3412)) ([8a48fd1](https://github.com/googleapis/java-bigquery/commit/8a48fd1eb6762e42bbdc49d1aa4ebab36c3e8e26))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240727-2.0.0 ([#3421](https://github.com/googleapis/java-bigquery/issues/3421)) ([91d780b](https://github.com/googleapis/java-bigquery/commit/91d780b0db2b9b05923b60621cf80251293be184))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240727-2.0.0 ([#3423](https://github.com/googleapis/java-bigquery/issues/3423)) ([16f350c](https://github.com/googleapis/java-bigquery/commit/16f350c28ec60dc4011b77cbda6416c9de45d431))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240727-2.0.0 ([#3428](https://github.com/googleapis/java-bigquery/issues/3428)) ([9ae6eca](https://github.com/googleapis/java-bigquery/commit/9ae6ecac3337eb19bced14b9fcd7ce74580d7326))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240803-2.0.0 ([#3435](https://github.com/googleapis/java-bigquery/issues/3435)) ([b4e20db](https://github.com/googleapis/java-bigquery/commit/b4e20db60b30dac9039407d724b8f7c816301e5c))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240815-2.0.0 ([#3454](https://github.com/googleapis/java-bigquery/issues/3454)) ([8796aee](https://github.com/googleapis/java-bigquery/commit/8796aee5f669414169dc8baf88f9121697f4cd04))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v3.9.0 ([c4afbef](https://github.com/googleapis/java-bigquery/commit/c4afbef9d4df03c798241d56d8988adb5724d008))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.53.0 ([#3418](https://github.com/googleapis/java-bigquery/issues/3418)) ([6cff7f0](https://github.com/googleapis/java-bigquery/commit/6cff7f0c2241223c529321e2b613f15c84ecbdcc))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.54.0 ([#3450](https://github.com/googleapis/java-bigquery/issues/3450)) ([cc9da95](https://github.com/googleapis/java-bigquery/commit/cc9da9576fa276afe069caff075c50e41e412ce1))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.34.0 ([#3433](https://github.com/googleapis/java-bigquery/issues/3433)) ([801f441](https://github.com/googleapis/java-bigquery/commit/801f44172f7be43e0649a116fb0bb556507fc572))
* Update github/codeql-action action to v2.26.2 ([#3426](https://github.com/googleapis/java-bigquery/issues/3426)) ([0a6574f](https://github.com/googleapis/java-bigquery/commit/0a6574fa11aa83b5c899f1dcd3b1132aa4f46ebd))
* Update github/codeql-action action to v2.26.3 ([#3438](https://github.com/googleapis/java-bigquery/issues/3438)) ([390e182](https://github.com/googleapis/java-bigquery/commit/390e1824bffef17e85d0ec142b4fcca6dff80a9c))
* Update github/codeql-action action to v2.26.5 ([#3446](https://github.com/googleapis/java-bigquery/issues/3446)) ([58aacc5](https://github.com/googleapis/java-bigquery/commit/58aacc5a92e18b790a03c0b9b4a75062928768c2))


### Documentation

* Update iam policy sample user to be consistent with other languages ([#3429](https://github.com/googleapis/java-bigquery/issues/3429)) ([2fc15b3](https://github.com/googleapis/java-bigquery/commit/2fc15b3e9f89289f0a047bb0a6ae7fb5bb71d253))

## [2.42.0](https://github.com/googleapis/java-bigquery/compare/v2.41.0...v2.42.0) (2024-07-28)


### Features

* Add ability to specify RetryOptions and BigQueryRetryConfig when create job and waitFor ([#3398](https://github.com/googleapis/java-bigquery/issues/3398)) ([1f91ae7](https://github.com/googleapis/java-bigquery/commit/1f91ae7fa2100a05f969a7429cb619a2b8b42dee))
* Add additional parameters to CsvOptions and ParquetOptions ([#3370](https://github.com/googleapis/java-bigquery/issues/3370)) ([34f16fb](https://github.com/googleapis/java-bigquery/commit/34f16fbaad236f5a6db26d693efde2025913d540))
* Add remaining Statement Types ([#3381](https://github.com/googleapis/java-bigquery/issues/3381)) ([5f39b19](https://github.com/googleapis/java-bigquery/commit/5f39b19e8839f06d956addb8d95cf05e4b60a3f1))


### Bug Fixes

* Null field mode inconsistency ([#2863](https://github.com/googleapis/java-bigquery/issues/2863)) ([b9e96e3](https://github.com/googleapis/java-bigquery/commit/b9e96e3aa738a1813ad452cf6141f792f437e8de))


### Dependencies

* Update actions/upload-artifact action to v4.3.4 ([#3382](https://github.com/googleapis/java-bigquery/issues/3382)) ([efa1aef](https://github.com/googleapis/java-bigquery/commit/efa1aef0a579baa379adbfbd2ee12f4ee5f3d987))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.48.0 ([#3374](https://github.com/googleapis/java-bigquery/issues/3374)) ([45b7f20](https://github.com/googleapis/java-bigquery/commit/45b7f20e1b324d9b77183c0f8bb5ae14724d6aef))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240616-2.0.0 ([#3368](https://github.com/googleapis/java-bigquery/issues/3368)) ([ceb270c](https://github.com/googleapis/java-bigquery/commit/ceb270c5cc2af4d69948ac89af1d72990fe1a7ee))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240623-2.0.0 ([#3384](https://github.com/googleapis/java-bigquery/issues/3384)) ([e1de34f](https://github.com/googleapis/java-bigquery/commit/e1de34f0c4c67d75bcf15f35fe86c411b61d04ac))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240629-2.0.0 ([#3392](https://github.com/googleapis/java-bigquery/issues/3392)) ([352562d](https://github.com/googleapis/java-bigquery/commit/352562da445e35a8207bcf77442130867f32e52d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.52.0 ([#3375](https://github.com/googleapis/java-bigquery/issues/3375)) ([2115c04](https://github.com/googleapis/java-bigquery/commit/2115c0448b242ddd887f2bac3d68c45847273c3d))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.33.0 ([#3405](https://github.com/googleapis/java-bigquery/issues/3405)) ([a4a9999](https://github.com/googleapis/java-bigquery/commit/a4a9999def9805b8fecbc1820cc9f6f6c1997991))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.10.3 ([#3371](https://github.com/googleapis/java-bigquery/issues/3371)) ([2e804c5](https://github.com/googleapis/java-bigquery/commit/2e804c56eeef5009cc46c7544fe9b04bfdd65d7a))
* Update github/codeql-action action to v2.25.11 ([#3376](https://github.com/googleapis/java-bigquery/issues/3376)) ([f1e0014](https://github.com/googleapis/java-bigquery/commit/f1e0014dca5ca04522796b44ff313696d2b41176))
* Update github/codeql-action action to v2.25.12 ([#3387](https://github.com/googleapis/java-bigquery/issues/3387)) ([af60b30](https://github.com/googleapis/java-bigquery/commit/af60b30cd774992c5d82063106471926dc6aaa6e))
* Update github/codeql-action action to v2.25.13 ([#3395](https://github.com/googleapis/java-bigquery/issues/3395)) ([95c8d6f](https://github.com/googleapis/java-bigquery/commit/95c8d6f65c5c5355fc52a0a2b54002d8f9cdb1ef))
* Update github/codeql-action action to v2.25.15 ([#3402](https://github.com/googleapis/java-bigquery/issues/3402)) ([a61ce7d](https://github.com/googleapis/java-bigquery/commit/a61ce7d710e2e8b000ee25ec9d295abbc2b63dd1))
* Update ossf/scorecard-action action to v2.4.0 ([#3408](https://github.com/googleapis/java-bigquery/issues/3408)) ([66777a2](https://github.com/googleapis/java-bigquery/commit/66777a2c3c7b0462330bd1c820e2f04ad4727465))


### Documentation

* Add short mode query sample ([#3397](https://github.com/googleapis/java-bigquery/issues/3397)) ([6dca6ff](https://github.com/googleapis/java-bigquery/commit/6dca6fffe96937db87713e45f0501d64fd5b544f))
* Add simple query connection read api sample ([#3394](https://github.com/googleapis/java-bigquery/issues/3394)) ([d407baa](https://github.com/googleapis/java-bigquery/commit/d407baa3e95ad894d4028aa46def7ca8efe930c3))

## [2.41.0](https://github.com/googleapis/java-bigquery/compare/v2.40.3...v2.41.0) (2024-06-25)


### Features

* Add columnNameCharacterMap to LoadJobConfiguration ([#3356](https://github.com/googleapis/java-bigquery/issues/3356)) ([2f3cbe3](https://github.com/googleapis/java-bigquery/commit/2f3cbe39619bcc93cb7d504417accd84b418dd41))
* Add MetadataCacheMode to ExternalTableDefinition ([#3351](https://github.com/googleapis/java-bigquery/issues/3351)) ([2814dc4](https://github.com/googleapis/java-bigquery/commit/2814dc49dfdd5671257b6a9933a5dd381d889dd1))


### Bug Fixes

* Add clustering value to ListTables result ([#3359](https://github.com/googleapis/java-bigquery/issues/3359)) ([5d52bc9](https://github.com/googleapis/java-bigquery/commit/5d52bc9f4ef93f84200335685901c6ac0256b769))


### Dependencies

* Update actions/checkout action to v4.1.7 ([#3349](https://github.com/googleapis/java-bigquery/issues/3349)) ([0857234](https://github.com/googleapis/java-bigquery/commit/085723491e4aca58d670c313bc18b0c044cfdca8))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240602-2.0.0 ([#3273](https://github.com/googleapis/java-bigquery/issues/3273)) ([7b7e52b](https://github.com/googleapis/java-bigquery/commit/7b7e52b339f57af752c573a222df68196f1808f5))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.32.0 ([#3360](https://github.com/googleapis/java-bigquery/issues/3360)) ([4420996](https://github.com/googleapis/java-bigquery/commit/4420996e89fef49270771bb4f01ffa4e871e7885))
* Update github/codeql-action action to v2.25.10 ([#3348](https://github.com/googleapis/java-bigquery/issues/3348)) ([8b6feff](https://github.com/googleapis/java-bigquery/commit/8b6feffa0e8add73a7587ce1762989713c2af38b))

## [2.40.3](https://github.com/googleapis/java-bigquery/compare/v2.40.2...v2.40.3) (2024-06-12)


### Dependencies

* Update actions/checkout action to v4.1.6 ([#3309](https://github.com/googleapis/java-bigquery/issues/3309)) ([c7d6362](https://github.com/googleapis/java-bigquery/commit/c7d6362d47cb985abf3c08f5c4e89f651480c4c8))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.46.0 ([#3328](https://github.com/googleapis/java-bigquery/issues/3328)) ([a6661ad](https://github.com/googleapis/java-bigquery/commit/a6661ade5e297102ff54d314fa55caac9201ac67))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.47.0 ([#3342](https://github.com/googleapis/java-bigquery/issues/3342)) ([79e34c2](https://github.com/googleapis/java-bigquery/commit/79e34c256ddf99a43d546788535a9e8fa0e97e6d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.50.0 ([#3330](https://github.com/googleapis/java-bigquery/issues/3330)) ([cabb0ab](https://github.com/googleapis/java-bigquery/commit/cabb0ab1bc09ba10c43a2cf109f1390268441693))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.51.0 ([#3343](https://github.com/googleapis/java-bigquery/issues/3343)) ([e3b934f](https://github.com/googleapis/java-bigquery/commit/e3b934fa133679a2d61baeea6f4de15eed287f7f))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.31.0 ([#3335](https://github.com/googleapis/java-bigquery/issues/3335)) ([0623455](https://github.com/googleapis/java-bigquery/commit/062345501c392c2a186c3cd82dee8d20ceda2a0a))
* Update dependency com.google.oauth-client:google-oauth-client-java6 to v1.36.0 ([#3305](https://github.com/googleapis/java-bigquery/issues/3305)) ([d05e554](https://github.com/googleapis/java-bigquery/commit/d05e5547e97f52ccfdcec1d6fe167e6587dd00c6))
* Update dependency com.google.oauth-client:google-oauth-client-jetty to v1.36.0 ([#3306](https://github.com/googleapis/java-bigquery/issues/3306)) ([0eeed66](https://github.com/googleapis/java-bigquery/commit/0eeed668b5f88f9c59ef6c1b309e7a81f5c1f0e9))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.10.2 ([#3311](https://github.com/googleapis/java-bigquery/issues/3311)) ([3912a92](https://github.com/googleapis/java-bigquery/commit/3912a9232788e09c10fc4e91ef6d65514fc106e4))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.10.2 ([#3312](https://github.com/googleapis/java-bigquery/issues/3312)) ([9737a5d](https://github.com/googleapis/java-bigquery/commit/9737a5d63d545ed197879bbd9dbfd3f1dbc15d93))
* Update github/codeql-action action to v2.25.6 ([#3307](https://github.com/googleapis/java-bigquery/issues/3307)) ([8999d33](https://github.com/googleapis/java-bigquery/commit/8999d337b92d7030825c5a36686ddd082cadc816))
* Update github/codeql-action action to v2.25.7 ([#3334](https://github.com/googleapis/java-bigquery/issues/3334)) ([768342d](https://github.com/googleapis/java-bigquery/commit/768342da168921251c34163b51ffc3cddfefc0ce))
* Update github/codeql-action action to v2.25.8 ([#3338](https://github.com/googleapis/java-bigquery/issues/3338)) ([8673fe5](https://github.com/googleapis/java-bigquery/commit/8673fe55e6d33e50c32a520a848cddc25eb6088e))

## [2.40.2](https://github.com/googleapis/java-bigquery/compare/v2.40.1...v2.40.2) (2024-05-26)


### Bug Fixes

* Fixing NPE bug by adding to if clause ([#3290](https://github.com/googleapis/java-bigquery/issues/3290)) ([127cff9](https://github.com/googleapis/java-bigquery/commit/127cff9f964c5d2d912d26276474822fd137a64b))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.45.0 ([#3295](https://github.com/googleapis/java-bigquery/issues/3295)) ([c659523](https://github.com/googleapis/java-bigquery/commit/c659523a7ca25bc12282f0e28fff18ec9221f48e))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.49.0 ([#3296](https://github.com/googleapis/java-bigquery/issues/3296)) ([7d148d5](https://github.com/googleapis/java-bigquery/commit/7d148d5bb1d6e1e6b0a421749fcbb73a6fbe61e0))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.30.1 ([#3310](https://github.com/googleapis/java-bigquery/issues/3310)) ([641f1a8](https://github.com/googleapis/java-bigquery/commit/641f1a8325f0f43aeffd135654480a721f26e4e7))
* Update github/codeql-action action to v2.25.4 ([#3291](https://github.com/googleapis/java-bigquery/issues/3291)) ([13bb5aa](https://github.com/googleapis/java-bigquery/commit/13bb5aaa6e4bac7144a369c9fbb5ae8922eb36ee))
* Update ossf/scorecard-action action to v2.3.3 ([#3304](https://github.com/googleapis/java-bigquery/issues/3304)) ([d096082](https://github.com/googleapis/java-bigquery/commit/d09608211aed5dc49e2b5e51affe7942403ed267))

## [2.40.1](https://github.com/googleapis/java-bigquery/compare/v2.40.0...v2.40.1) (2024-05-06)


### Dependencies

* Update actions/checkout action ([#3286](https://github.com/googleapis/java-bigquery/issues/3286)) ([4d8f3fb](https://github.com/googleapis/java-bigquery/commit/4d8f3fb7fd3d8f6e9484c809d6690f8078ef7a30))

## [2.40.0](https://github.com/googleapis/java-bigquery/compare/v2.39.1...v2.40.0) (2024-05-06)


### Features

* Add getStringOrDefault method to FieldValue ([#3255](https://github.com/googleapis/java-bigquery/issues/3255)) ([8bac33a](https://github.com/googleapis/java-bigquery/commit/8bac33a32e0239ffa03715ad0c6440527cb2e01e))


### Dependencies

* Update dependency com.google.cloud:sdk-platform-java-config to v3.30.0 ([#3279](https://github.com/googleapis/java-bigquery/issues/3279)) ([67f2ea4](https://github.com/googleapis/java-bigquery/commit/67f2ea47f78240b6def27241e21fd298a75920b2))

## [2.39.1](https://github.com/googleapis/java-bigquery/compare/v2.39.0...v2.39.1) (2024-04-29)


### Bug Fixes

* @Nullable annotations on builder methods ([#3222](https://github.com/googleapis/java-bigquery/issues/3222)) ([0c5eed1](https://github.com/googleapis/java-bigquery/commit/0c5eed1a18409f120a1243bd5da1db2aa4f9c206))


### Dependencies

* Update actions/checkout action ([#3267](https://github.com/googleapis/java-bigquery/issues/3267)) ([c297ed2](https://github.com/googleapis/java-bigquery/commit/c297ed2c77e36257451b5c12e4988f3293cdbb88))
* Update actions/upload-artifact action to v4.3.3 ([#3258](https://github.com/googleapis/java-bigquery/issues/3258)) ([5215235](https://github.com/googleapis/java-bigquery/commit/52152350a2a6218b51ebf3d7dd6beb2699064a3c))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.44.0 ([#3270](https://github.com/googleapis/java-bigquery/issues/3270)) ([ee09ab6](https://github.com/googleapis/java-bigquery/commit/ee09ab68ea2be824aaf4e3d08b67e3bfbab2977f))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v3.5.0 ([e7c6201](https://github.com/googleapis/java-bigquery/commit/e7c620119321b673c19b99adb79247cd3c52cd67))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.48.0 ([#3271](https://github.com/googleapis/java-bigquery/issues/3271)) ([3b6e0d5](https://github.com/googleapis/java-bigquery/commit/3b6e0d5e3d26b8e2de412aa926a638d72562d4a0))
* Update github/codeql-action action to v2.25.2 ([#3260](https://github.com/googleapis/java-bigquery/issues/3260)) ([3302dc4](https://github.com/googleapis/java-bigquery/commit/3302dc46e3e2c6a173798ef7f1642d3d4cb20332))
* Update github/codeql-action action to v2.25.3 ([#3268](https://github.com/googleapis/java-bigquery/issues/3268)) ([1cf2377](https://github.com/googleapis/java-bigquery/commit/1cf237702e16952029741c306aa57cb3558a663f))

## [2.39.0](https://github.com/googleapis/java-bigquery/compare/v2.38.2...v2.39.0) (2024-04-22)


### Features

* Add ExportDataStats to QueryStatistics ([#3244](https://github.com/googleapis/java-bigquery/issues/3244)) ([e91be80](https://github.com/googleapis/java-bigquery/commit/e91be80ebdd39c2448914ff9aa1742f3079d0bb8))
* Add new fields to copy job statistics ([#3205](https://github.com/googleapis/java-bigquery/issues/3205)) ([64bdda8](https://github.com/googleapis/java-bigquery/commit/64bdda84fe06726042a41f2a89ac5c067f9bc949))
* Add Range object to allow reading range value ([#3236](https://github.com/googleapis/java-bigquery/issues/3236)) ([2c3399d](https://github.com/googleapis/java-bigquery/commit/2c3399dd10fecc01237158a3cdeee966b38746f2))
* Add support for inserting Range values ([#3246](https://github.com/googleapis/java-bigquery/issues/3246)) ([ff1ebc6](https://github.com/googleapis/java-bigquery/commit/ff1ebc66e458519deca37275ba91650133188683))
* Add support for ObjectMetadata ([#3217](https://github.com/googleapis/java-bigquery/issues/3217)) ([975df05](https://github.com/googleapis/java-bigquery/commit/975df05b95b714c5574155d5e09860885c4b58f2))
* Add totalSlotMs to JobStatistics ([#3250](https://github.com/googleapis/java-bigquery/issues/3250)) ([75ea095](https://github.com/googleapis/java-bigquery/commit/75ea095b0a194d6be4951795bc3a616ace389ff2))


### Bug Fixes

* Fix BigQuery#listDatasets to include dataset location in the response ([#3238](https://github.com/googleapis/java-bigquery/issues/3238)) ([c50c17b](https://github.com/googleapis/java-bigquery/commit/c50c17bc4eedd0c34f440b697a8b26a5354c9c4f))
* Remove @InternalApi from TableResult ([#3257](https://github.com/googleapis/java-bigquery/issues/3257)) ([19d92a1](https://github.com/googleapis/java-bigquery/commit/19d92a144cd4d86fee6dd420e574c3a1a928642c))


### Dependencies

* Update actions/checkout action ([#3256](https://github.com/googleapis/java-bigquery/issues/3256)) ([6df3a32](https://github.com/googleapis/java-bigquery/commit/6df3a325b7f71ed1eb2054dd0c3a27cfd6cda2f2))
* Update actions/upload-artifact action to v4.3.2 ([#3248](https://github.com/googleapis/java-bigquery/issues/3248)) ([066b51f](https://github.com/googleapis/java-bigquery/commit/066b51fb088fc67c83a45a219897752876889136))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.40.0 ([#3210](https://github.com/googleapis/java-bigquery/issues/3210)) ([bf7e97e](https://github.com/googleapis/java-bigquery/commit/bf7e97e1c936a419a34529a316c4f538872dd20b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.41.0 ([#3219](https://github.com/googleapis/java-bigquery/issues/3219)) ([9d71b8b](https://github.com/googleapis/java-bigquery/commit/9d71b8b9a9231ea5d7cfa93c7bcbb533d6a3a900))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.43.0 ([#3225](https://github.com/googleapis/java-bigquery/issues/3225)) ([a897306](https://github.com/googleapis/java-bigquery/commit/a8973067348fa09acd91c5b01f048c43fac93894))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240323-2.0.0 ([#3239](https://github.com/googleapis/java-bigquery/issues/3239)) ([2c0f48f](https://github.com/googleapis/java-bigquery/commit/2c0f48f86d3c4d5a1a682775c494a9122373858d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.44.0 ([#3211](https://github.com/googleapis/java-bigquery/issues/3211)) ([6993b51](https://github.com/googleapis/java-bigquery/commit/6993b51f8722466b846a7dd3912acbd81e04126c))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.45.0 ([#3220](https://github.com/googleapis/java-bigquery/issues/3220)) ([21ae09c](https://github.com/googleapis/java-bigquery/commit/21ae09ce2c63f790ca77cc5c4c0df16dcb123b59))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.47.0 ([#3226](https://github.com/googleapis/java-bigquery/issues/3226)) ([d45d168](https://github.com/googleapis/java-bigquery/commit/d45d168bf53a8648e2254c8c4305a5d9a390276d))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.28.1 ([#3207](https://github.com/googleapis/java-bigquery/issues/3207)) ([6204331](https://github.com/googleapis/java-bigquery/commit/6204331953b3922f5ecb1ac0c1868cb6579dd73b))
* Update dependency org.threeten:threeten-extra to v1.8.0 ([#3242](https://github.com/googleapis/java-bigquery/issues/3242)) ([66d5efd](https://github.com/googleapis/java-bigquery/commit/66d5efded17c42514f98f4af2bc6ba826999a62a))
* Update github/codeql-action action to v2.24.9 ([#3204](https://github.com/googleapis/java-bigquery/issues/3204)) ([7a24d3e](https://github.com/googleapis/java-bigquery/commit/7a24d3e29f32db58475c1e02ab1c13ee8941c27d))
* Update github/codeql-action action to v2.25.1 ([#3229](https://github.com/googleapis/java-bigquery/issues/3229)) ([aeedf29](https://github.com/googleapis/java-bigquery/commit/aeedf2960700f1742e38469fd26ea70000967cfa))

## [2.38.2](https://github.com/googleapis/java-bigquery/compare/v2.38.1...v2.38.2) (2024-03-21)


### Dependencies

* Update actions/checkout action ([#3190](https://github.com/googleapis/java-bigquery/issues/3190)) ([940e4f6](https://github.com/googleapis/java-bigquery/commit/940e4f6c656a2e0f1d2e4d6e08d42214d14fe125))
* Update arrow.version to v15.0.1 ([#3189](https://github.com/googleapis/java-bigquery/issues/3189)) ([fb6284e](https://github.com/googleapis/java-bigquery/commit/fb6284e94d4744bb4c8f9501751bf79e04a2429b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.39.0 ([#3186](https://github.com/googleapis/java-bigquery/issues/3186)) ([9e705a1](https://github.com/googleapis/java-bigquery/commit/9e705a140ac6fc1d1d64674dc985c35955911667))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240229-2.0.0 ([#3188](https://github.com/googleapis/java-bigquery/issues/3188)) ([a018424](https://github.com/googleapis/java-bigquery/commit/a018424ccbf3c2c554d829c97e442f4813b2c764))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.43.0 ([#3187](https://github.com/googleapis/java-bigquery/issues/3187)) ([497ff29](https://github.com/googleapis/java-bigquery/commit/497ff298d84e536161b112c6b1aa176d4d962a49))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.28.1 ([#3196](https://github.com/googleapis/java-bigquery/issues/3196)) ([61f23a3](https://github.com/googleapis/java-bigquery/commit/61f23a35d2b5cbbd66ddf35b93709a5669b5b102))
* Update github/codeql-action action to v2.24.6 ([#3178](https://github.com/googleapis/java-bigquery/issues/3178)) ([8843cae](https://github.com/googleapis/java-bigquery/commit/8843cae621e1eede6b072b1347f2a68a36304bca))
* Update github/codeql-action action to v2.24.7 ([#3194](https://github.com/googleapis/java-bigquery/issues/3194)) ([2e2d730](https://github.com/googleapis/java-bigquery/commit/2e2d730de9e4e49f25c20de2cfe1ae38babef830))
* Update github/codeql-action action to v2.24.8 ([#3198](https://github.com/googleapis/java-bigquery/issues/3198)) ([bd81a56](https://github.com/googleapis/java-bigquery/commit/bd81a56a07c836abb05c1de0d42e9cd397920e99))

## [2.38.1](https://github.com/googleapis/java-bigquery/compare/v2.38.0...v2.38.1) (2024-03-07)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.38.0 ([#3159](https://github.com/googleapis/java-bigquery/issues/3159)) ([d6c65ab](https://github.com/googleapis/java-bigquery/commit/d6c65abb844d1cca616907cd6aeb02f2a6042916))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.42.0 ([#3160](https://github.com/googleapis/java-bigquery/issues/3160)) ([e31b5b7](https://github.com/googleapis/java-bigquery/commit/e31b5b7ea4b91ab0096bf318377dfd66d1364b3c))
* Update dependency com.google.cloud:sdk-platform-java-config to v3.27.0 ([#3176](https://github.com/googleapis/java-bigquery/issues/3176)) ([b93e62e](https://github.com/googleapis/java-bigquery/commit/b93e62e30808d9df95fa4c268dcd37a5462056e1))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.10.1 ([#3153](https://github.com/googleapis/java-bigquery/issues/3153)) ([436f58c](https://github.com/googleapis/java-bigquery/commit/436f58cbd33546f78ae082d4261ce106f9f77a66))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.10.1 ([#3154](https://github.com/googleapis/java-bigquery/issues/3154)) ([b68ab42](https://github.com/googleapis/java-bigquery/commit/b68ab427b157a40c7e7d415b02a01f1988080e08))
* Update github/codeql-action action to v2.24.5 ([#3165](https://github.com/googleapis/java-bigquery/issues/3165)) ([8ac7722](https://github.com/googleapis/java-bigquery/commit/8ac7722977e453d272710153180f458be6427aa4))

## [2.38.0](https://github.com/googleapis/java-bigquery/compare/v2.37.2...v2.38.0) (2024-02-22)


### Features

* Add MetadataCacheStatistics to Job QueryStatistics ([#3133](https://github.com/googleapis/java-bigquery/issues/3133)) ([f3f387b](https://github.com/googleapis/java-bigquery/commit/f3f387b2265d527f3b5bf567c1eaf7ecdad6e096))


### Dependencies

* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240211-2.0.0 ([#3152](https://github.com/googleapis/java-bigquery/issues/3152)) ([e5d6888](https://github.com/googleapis/java-bigquery/commit/e5d688872e4c125a68ed6f666bffd0a41efc3f30))
* Update github/codeql-action action to v2.24.3 ([#3148](https://github.com/googleapis/java-bigquery/issues/3148)) ([a0a7b01](https://github.com/googleapis/java-bigquery/commit/a0a7b0186ae47fcfcf75fe4f35cce50044c6926c))
* Update github/codeql-action action to v2.24.3 ([#3150](https://github.com/googleapis/java-bigquery/issues/3150)) ([042fcf0](https://github.com/googleapis/java-bigquery/commit/042fcf0aca46d349103211c3d04ae4b49868933c))
* Update github/codeql-action action to v2.24.4 ([#3161](https://github.com/googleapis/java-bigquery/issues/3161)) ([531b1a0](https://github.com/googleapis/java-bigquery/commit/531b1a0b93ee19a7479a006207c30f7399869773))

## [2.37.2](https://github.com/googleapis/java-bigquery/compare/v2.37.1...v2.37.2) (2024-02-14)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.37.0 ([#3132](https://github.com/googleapis/java-bigquery/issues/3132)) ([3a1efc2](https://github.com/googleapis/java-bigquery/commit/3a1efc2ede4eb1de5e3cf7703dc6bdef51b263f1))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240203-2.0.0 ([#3126](https://github.com/googleapis/java-bigquery/issues/3126)) ([5e28419](https://github.com/googleapis/java-bigquery/commit/5e2841988b223bc8ac775ed2b4d38e2c26b2815b))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.41.0 ([#3135](https://github.com/googleapis/java-bigquery/issues/3135)) ([9ab79ec](https://github.com/googleapis/java-bigquery/commit/9ab79ec14d661e79f152568ff667bef3482315e0))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.25.0 ([#3140](https://github.com/googleapis/java-bigquery/issues/3140)) ([e61a7bc](https://github.com/googleapis/java-bigquery/commit/e61a7bc5735822308db3baab327474b6319e4d93))
* Update github/codeql-action action to v2.24.1 ([#3139](https://github.com/googleapis/java-bigquery/issues/3139)) ([4b3a429](https://github.com/googleapis/java-bigquery/commit/4b3a42991836c3bb23972616cb4d20756dc83488))

## [2.37.1](https://github.com/googleapis/java-bigquery/compare/v2.37.0...v2.37.1) (2024-02-06)


### Features

* Add queryId to TableResult ([#3106](https://github.com/googleapis/java-bigquery/issues/3106)) ([2156f02](https://github.com/googleapis/java-bigquery/commit/2156f023b4ab95bc7ec669545b5709317555fdac))
* Update universe domain exception error code/message ([#3113](https://github.com/googleapis/java-bigquery/issues/3113)) ([5a82c85](https://github.com/googleapis/java-bigquery/commit/5a82c854b6549c82c905eba4905378b59cc88af4))


### Dependencies

* Update actions/upload-artifact action to v4.3.1 ([#3121](https://github.com/googleapis/java-bigquery/issues/3121)) ([3abdc70](https://github.com/googleapis/java-bigquery/commit/3abdc70890c3f5c396055d7d34fc4fe18aef7371))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240124-2.0.0 ([#3104](https://github.com/googleapis/java-bigquery/issues/3104)) ([6eff68e](https://github.com/googleapis/java-bigquery/commit/6eff68eb8c55162ca1cd2e915f3f60a87f584b35))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.24.0 ([#3109](https://github.com/googleapis/java-bigquery/issues/3109)) ([5ad778c](https://github.com/googleapis/java-bigquery/commit/5ad778c18130c33e7532d0bd3193053518ca047a))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.10.0 ([#3110](https://github.com/googleapis/java-bigquery/issues/3110)) ([3f8e8d1](https://github.com/googleapis/java-bigquery/commit/3f8e8d1f9477aed3a14bccf021d7ff982463022c))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.10.0 ([#3111](https://github.com/googleapis/java-bigquery/issues/3111)) ([2858e96](https://github.com/googleapis/java-bigquery/commit/2858e96807190d995d9d682e056d90821da11b7a))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.10.2 ([#3119](https://github.com/googleapis/java-bigquery/issues/3119)) ([4b4fdd8](https://github.com/googleapis/java-bigquery/commit/4b4fdd8ebc324d2bc48a9f78347247f4f6c2e424))
* Update github/codeql-action action to v2.23.2 ([#3102](https://github.com/googleapis/java-bigquery/issues/3102)) ([2cc545e](https://github.com/googleapis/java-bigquery/commit/2cc545ec1c0267fd9c33f3f1566f29d9a30f514e))
* Update github/codeql-action action to v2.24.0 ([#3114](https://github.com/googleapis/java-bigquery/issues/3114)) ([01f0405](https://github.com/googleapis/java-bigquery/commit/01f04059ab119da759536426938c1069906c8be4))

## [2.37.0](https://github.com/googleapis/java-bigquery/compare/v2.36.0...v2.37.0) (2024-01-25)


### Features

* Add support for Table resource tags ([#3046](https://github.com/googleapis/java-bigquery/issues/3046)) ([7d61111](https://github.com/googleapis/java-bigquery/commit/7d61111d23282c7e2478ac31ba0d4e423330ec92))
* Add universe domain ([#3090](https://github.com/googleapis/java-bigquery/issues/3090)) ([b2814a2](https://github.com/googleapis/java-bigquery/commit/b2814a2f8e6601347d0489058e563878af40f301))


### Dependencies

* Update actions/upload-artifact action to v4.1.0 ([#3071](https://github.com/googleapis/java-bigquery/issues/3071)) ([3fbb2bb](https://github.com/googleapis/java-bigquery/commit/3fbb2bba7ad7bca245a8ca5eb59d999aead29ebd))
* Update actions/upload-artifact action to v4.2.0 ([#3081](https://github.com/googleapis/java-bigquery/issues/3081)) ([af81354](https://github.com/googleapis/java-bigquery/commit/af81354c342cdb2a790cb008fc9fe3460e62265b))
* Update actions/upload-artifact action to v4.3.0 ([#3091](https://github.com/googleapis/java-bigquery/issues/3091)) ([f4411b0](https://github.com/googleapis/java-bigquery/commit/f4411b09c4b681d2f3fb250ef133b291649f2865))
* Update arrow.version to v15 ([#3084](https://github.com/googleapis/java-bigquery/issues/3084)) ([4d4cbae](https://github.com/googleapis/java-bigquery/commit/4d4cbae00028f84c071f51e88d7ee976efdf04d5))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.35.0 ([#3066](https://github.com/googleapis/java-bigquery/issues/3066)) ([48cdaa8](https://github.com/googleapis/java-bigquery/commit/48cdaa8a77935062cfe9ed8fb66f52f774bdd673))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.36.0 ([#3093](https://github.com/googleapis/java-bigquery/issues/3093)) ([24456a3](https://github.com/googleapis/java-bigquery/commit/24456a361a39550e962ac68a79de3c7a9e912884))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20240105-2.0.0 ([#3073](https://github.com/googleapis/java-bigquery/issues/3073)) ([f371d67](https://github.com/googleapis/java-bigquery/commit/f371d6709109acf07224ee0b2615de400fd90838))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.39.0 ([#3067](https://github.com/googleapis/java-bigquery/issues/3067)) ([6ff4f04](https://github.com/googleapis/java-bigquery/commit/6ff4f043905a6fe67bc3ed5cbbacc0f9eddd3172))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.40.0 ([#3094](https://github.com/googleapis/java-bigquery/issues/3094)) ([110bcc5](https://github.com/googleapis/java-bigquery/commit/110bcc506272b372fdd90ee718fad298c8ab7e19))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.22.0 ([#3080](https://github.com/googleapis/java-bigquery/issues/3080)) ([a5b119c](https://github.com/googleapis/java-bigquery/commit/a5b119cdf6f8ce9d180a2d51a3a7a9aad50b1ea4))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.23.0 ([#3096](https://github.com/googleapis/java-bigquery/issues/3096)) ([0933b34](https://github.com/googleapis/java-bigquery/commit/0933b34f30ade216dcf61767a771509ca07f294b))
* Update dependency com.google.oauth-client:google-oauth-client-java6 to v1.35.0 ([#3078](https://github.com/googleapis/java-bigquery/issues/3078)) ([2614df2](https://github.com/googleapis/java-bigquery/commit/2614df203b1f3c9800b8c8c23d32e7f22ec76253))
* Update dependency com.google.oauth-client:google-oauth-client-jetty to v1.35.0 ([#3079](https://github.com/googleapis/java-bigquery/issues/3079)) ([f03c4fc](https://github.com/googleapis/java-bigquery/commit/f03c4fc957ae5665fe0f98c0f06cc80eea7cec59))
* Update github/codeql-action action to v2.23.0 ([#3061](https://github.com/googleapis/java-bigquery/issues/3061)) ([0fbdfba](https://github.com/googleapis/java-bigquery/commit/0fbdfba1aecf18567fae95aea133b6504f050bd5))
* Update github/codeql-action action to v2.23.1 ([#3077](https://github.com/googleapis/java-bigquery/issues/3077)) ([e3f417c](https://github.com/googleapis/java-bigquery/commit/e3f417cec3bdd81040baac3f054d0270dde9d9f8))

## [2.36.0](https://github.com/googleapis/java-bigquery/compare/v2.35.0...v2.36.0) (2024-01-10)


### Features

* Support RANGE schema ([#3043](https://github.com/googleapis/java-bigquery/issues/3043)) ([febfc1f](https://github.com/googleapis/java-bigquery/commit/febfc1fdb026a0d07ab24159437633cfb7f44c5d))
* Use location in BigQueryOption as the default for query ([#3047](https://github.com/googleapis/java-bigquery/issues/3047)) ([270f866](https://github.com/googleapis/java-bigquery/commit/270f8665a4973be6091697bc8101bee76e26ff1d))


### Bug Fixes

* Bigquery.create NullPointerException when job already exists ([#3035](https://github.com/googleapis/java-bigquery/issues/3035)) ([38191b1](https://github.com/googleapis/java-bigquery/commit/38191b10a3c2f3ed89351e095c9fc1983bb301ea))


### Dependencies

* Update actions/upload-artifact action to v4 ([#3055](https://github.com/googleapis/java-bigquery/issues/3055)) ([7d76100](https://github.com/googleapis/java-bigquery/commit/7d761006b4a7f549bf254b03f67989c9b41cd7b1))
* Update arrow.version to v14.0.2 ([#3050](https://github.com/googleapis/java-bigquery/issues/3050)) ([b0dc33a](https://github.com/googleapis/java-bigquery/commit/b0dc33ad4e004edcfbee131edb5745159f9e6af3))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.34.0 ([#3033](https://github.com/googleapis/java-bigquery/issues/3033)) ([a710632](https://github.com/googleapis/java-bigquery/commit/a7106325b0f688fc36b1b93ecb7001e45b54a454))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.21.0 ([#3060](https://github.com/googleapis/java-bigquery/issues/3060)) ([78995c4](https://github.com/googleapis/java-bigquery/commit/78995c47ba33019e1007f98d152016ffc3184bd4))
* Update github/codeql-action action to v2.22.11 ([#3002](https://github.com/googleapis/java-bigquery/issues/3002)) ([52d5e97](https://github.com/googleapis/java-bigquery/commit/52d5e97bdb9fa58c9fbee06cc1b41d58feeae379))

## [2.35.0](https://github.com/googleapis/java-bigquery/compare/v2.34.2...v2.35.0) (2023-12-01)


### Features

* Add InputBytes to extract job statistics ([#2998](https://github.com/googleapis/java-bigquery/issues/2998)) ([19b7c3a](https://github.com/googleapis/java-bigquery/commit/19b7c3ad842a566d4e3e93e48625e0281504de80))
* Add Routine DataGovernanceType ([#3006](https://github.com/googleapis/java-bigquery/issues/3006)) ([ecb567b](https://github.com/googleapis/java-bigquery/commit/ecb567b75849cd0665ac4ab315a5af3bdf934f48))


### Bug Fixes

* Update TableInsertRows.java ([#2999](https://github.com/googleapis/java-bigquery/issues/2999)) ([ff4a086](https://github.com/googleapis/java-bigquery/commit/ff4a086f0aa3c0401b62489ea8a0b9e2fd6cb3fe))


### Dependencies

* Update actions/github-script action to v7 ([#3001](https://github.com/googleapis/java-bigquery/issues/3001)) ([d1bdeab](https://github.com/googleapis/java-bigquery/commit/d1bdeab242ea2e6374d1b6d0bbd9eadf638cbcb2))
* Update actions/setup-java action to v4 ([#3018](https://github.com/googleapis/java-bigquery/issues/3018)) ([14ed571](https://github.com/googleapis/java-bigquery/commit/14ed571365f600b188b7d6716e2549c5b81868ad))
* Update arrow.version to v14 ([#3023](https://github.com/googleapis/java-bigquery/issues/3023)) ([759fd64](https://github.com/googleapis/java-bigquery/commit/759fd64f73a437e4b9847a807b5b716069b4d20e))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20231111-2.0.0 ([#3020](https://github.com/googleapis/java-bigquery/issues/3020)) ([ef48002](https://github.com/googleapis/java-bigquery/commit/ef480029c9e1958c1b6a6f2241b110fb3cfe036d))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.20.0 ([#3019](https://github.com/googleapis/java-bigquery/issues/3019)) ([0293edb](https://github.com/googleapis/java-bigquery/commit/0293edb74e02f44803faacbce400df20da53f66c))

## [2.34.2](https://github.com/googleapis/java-bigquery/compare/v2.34.1...v2.34.2) (2023-11-07)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.32.0 ([#2989](https://github.com/googleapis/java-bigquery/issues/2989)) ([47a61a7](https://github.com/googleapis/java-bigquery/commit/47a61a7c2cb5fed88937670bca7b15e38529dfaf))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.36.0 ([#2990](https://github.com/googleapis/java-bigquery/issues/2990)) ([81c0727](https://github.com/googleapis/java-bigquery/commit/81c07275809eadc4e7146bd080475e4775102339))

## [2.34.1](https://github.com/googleapis/java-bigquery/compare/v2.34.0...v2.34.1) (2023-11-06)


### Dependencies

* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.19.0 ([#2986](https://github.com/googleapis/java-bigquery/issues/2986)) ([0d400da](https://github.com/googleapis/java-bigquery/commit/0d400da7f73ee44ab5053ef51b1d45a9d29f0ebb))
* Update dependency org.checkerframework:checker-compat-qual to v2.5.6 ([#2982](https://github.com/googleapis/java-bigquery/issues/2982)) ([c137f1f](https://github.com/googleapis/java-bigquery/commit/c137f1f17f192f4f0a3c4d33e1d27677dbf4556b))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.10.1 ([#2984](https://github.com/googleapis/java-bigquery/issues/2984)) ([a64b91c](https://github.com/googleapis/java-bigquery/commit/a64b91c03b0291452d53cc407d9c841b3567fe23))
* Update github/codeql-action action to v2.22.5 ([#2975](https://github.com/googleapis/java-bigquery/issues/2975)) ([0b88846](https://github.com/googleapis/java-bigquery/commit/0b8884634f8bd21615a9263bb1344cb162adfa47))

## [2.34.0](https://github.com/googleapis/java-bigquery/compare/v2.33.2...v2.34.0) (2023-10-26)


### Features

* Add BigLakeConfiguration Property in StandardTableDefinition.java  ([#2916](https://github.com/googleapis/java-bigquery/issues/2916)) ([1d660fa](https://github.com/googleapis/java-bigquery/commit/1d660fa19f0d82c2b6ec2ea9590881e513274c25))
* Add support for Dataset property storageBillingModel ([#2913](https://github.com/googleapis/java-bigquery/issues/2913)) ([f452cf4](https://github.com/googleapis/java-bigquery/commit/f452cf4e100b6cc211681a840ddbd0be5108d01e))
* Add support for preview features ([#2923](https://github.com/googleapis/java-bigquery/issues/2923)) ([113b8f2](https://github.com/googleapis/java-bigquery/commit/113b8f27419365c7277c6a300c5f07cea954cca1))


### Dependencies

* Update actions/checkout action to v4.1.1 ([#2950](https://github.com/googleapis/java-bigquery/issues/2950)) ([c556c18](https://github.com/googleapis/java-bigquery/commit/c556c1837baf0d53245452d6a152910df7883262))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.30.0 ([#2942](https://github.com/googleapis/java-bigquery/issues/2942)) ([e760fca](https://github.com/googleapis/java-bigquery/commit/e760fcae98b23ff4e7fc3ae25f2437be220e9df9))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.31.0 ([#2967](https://github.com/googleapis/java-bigquery/issues/2967)) ([7ed55b5](https://github.com/googleapis/java-bigquery/commit/7ed55b5c075dbac827c6201d0398ff87d8240b38))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20231008-2.0.0 ([#2946](https://github.com/googleapis/java-bigquery/issues/2946)) ([3d0da5b](https://github.com/googleapis/java-bigquery/commit/3d0da5b5a20f49721477afbed10ea3fff43652bb))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.34.0 ([#2943](https://github.com/googleapis/java-bigquery/issues/2943)) ([18162c3](https://github.com/googleapis/java-bigquery/commit/18162c37c97eff6387e0f58d211f2c1725a9c8d3))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.35.0 ([#2968](https://github.com/googleapis/java-bigquery/issues/2968)) ([219db2c](https://github.com/googleapis/java-bigquery/commit/219db2c0023610d2adcba4889a9b785df2113893))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.18.0 ([#2955](https://github.com/googleapis/java-bigquery/issues/2955)) ([1ee18eb](https://github.com/googleapis/java-bigquery/commit/1ee18ebeb90adeb371ef04cbfc7b18be2c24d1e8))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.28 ([#2956](https://github.com/googleapis/java-bigquery/issues/2956)) ([b03effd](https://github.com/googleapis/java-bigquery/commit/b03effd3b5f5fd6365de9a6267a1a8ace46d7718))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.28 ([#2957](https://github.com/googleapis/java-bigquery/issues/2957)) ([6465e41](https://github.com/googleapis/java-bigquery/commit/6465e413c93e01069f86c80fc424715d46f9067b))
* Update github/codeql-action action to v2.22.2 ([#2944](https://github.com/googleapis/java-bigquery/issues/2944)) ([f584e59](https://github.com/googleapis/java-bigquery/commit/f584e59571f0c7918d2d83a19b00d49bd5b558c4))
* Update github/codeql-action action to v2.22.3 ([#2954](https://github.com/googleapis/java-bigquery/issues/2954)) ([1b2bc18](https://github.com/googleapis/java-bigquery/commit/1b2bc18bf49d06e1ccd29745be649108dd28cfa5))
* Update github/codeql-action action to v2.22.4 ([#2958](https://github.com/googleapis/java-bigquery/issues/2958)) ([de9bcee](https://github.com/googleapis/java-bigquery/commit/de9bcee50ba682ffa93aae063191a8880741507d))
* Update ossf/scorecard-action action to v2.3.1 ([#2960](https://github.com/googleapis/java-bigquery/issues/2960)) ([855e698](https://github.com/googleapis/java-bigquery/commit/855e69889f68592608c8a56070ffdafdf8365f57))

## [2.33.2](https://github.com/googleapis/java-bigquery/compare/v2.33.1...v2.33.2) (2023-10-11)


### Bug Fixes

* GetDouble in read API path ([#2919](https://github.com/googleapis/java-bigquery/issues/2919)) ([436ee8e](https://github.com/googleapis/java-bigquery/commit/436ee8ebe9104f6ca721f1a14bd409158c7bdb5a))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.29.0 ([#2911](https://github.com/googleapis/java-bigquery/issues/2911)) ([052f5c2](https://github.com/googleapis/java-bigquery/commit/052f5c2f722243be39c0d93b1f81b81a0db48ef1))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230925-2.0.0 ([#2921](https://github.com/googleapis/java-bigquery/issues/2921)) ([f0fb64f](https://github.com/googleapis/java-bigquery/commit/f0fb64f43817c5aa53adb6c5152afe3fd44b7df1))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.33.0 ([#2912](https://github.com/googleapis/java-bigquery/issues/2912)) ([e053494](https://github.com/googleapis/java-bigquery/commit/e05349476a8d987b2cd24ee6a80b2d9b7b9463ee))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.17.0 ([#2931](https://github.com/googleapis/java-bigquery/issues/2931)) ([25a94f1](https://github.com/googleapis/java-bigquery/commit/25a94f1da840c0cb32bed882e18f7b10f9890d04))
* Update github/codeql-action action to v2.22.0 ([#2926](https://github.com/googleapis/java-bigquery/issues/2926)) ([33ce4ae](https://github.com/googleapis/java-bigquery/commit/33ce4aee8b10f630212d96901af00f063c43f440))
* Update github/codeql-action action to v2.22.1 ([#2934](https://github.com/googleapis/java-bigquery/issues/2934)) ([7ae7b99](https://github.com/googleapis/java-bigquery/commit/7ae7b99ab21fcd6e74cbaa95e750da961c09ae80))
* Update ossf/scorecard-action action to v2.3.0 ([#2927](https://github.com/googleapis/java-bigquery/issues/2927)) ([93bfd8e](https://github.com/googleapis/java-bigquery/commit/93bfd8eb7fe35121e97b06cf8b103a3960fe9535))

## [2.33.1](https://github.com/googleapis/java-bigquery/compare/v2.33.0...v2.33.1) (2023-09-28)


### Bug Fixes

* Dry run NPE when there is no query parameters ([#2899](https://github.com/googleapis/java-bigquery/issues/2899)) ([8f85a4d](https://github.com/googleapis/java-bigquery/commit/8f85a4d540623e8b4c83005e62e842ba36f8fb1b))

## [2.33.0](https://github.com/googleapis/java-bigquery/compare/v2.32.0...v2.33.0) (2023-09-27)


### Features

* Add support for FileSetSpec ([#2888](https://github.com/googleapis/java-bigquery/issues/2888)) ([3895bd9](https://github.com/googleapis/java-bigquery/commit/3895bd94b283b6ff731cfa94426ea0691e0d54c4))


### Bug Fixes

* Update samples snippet to write to BYTES instead of ARRAY&lt;BYTES&gt; ([#2876](https://github.com/googleapis/java-bigquery/issues/2876)) ([7e040e9](https://github.com/googleapis/java-bigquery/commit/7e040e97eeec762ab97190dea33b94769d681bf0))


### Dependencies

* Update actions/checkout action ([#2893](https://github.com/googleapis/java-bigquery/issues/2893)) ([e3655af](https://github.com/googleapis/java-bigquery/commit/e3655af235f002128979ed592c5aade33a4c7596))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.16.1 ([#2892](https://github.com/googleapis/java-bigquery/issues/2892)) ([e1d9871](https://github.com/googleapis/java-bigquery/commit/e1d987199ad8994aa3e9115daf26e0fb27aef911))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.27 ([#2885](https://github.com/googleapis/java-bigquery/issues/2885)) ([2237ca2](https://github.com/googleapis/java-bigquery/commit/2237ca2a1dbe9e1dc1d5e6c0dc2bd2fd39e01ef0))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.27 ([#2886](https://github.com/googleapis/java-bigquery/issues/2886)) ([539b4e6](https://github.com/googleapis/java-bigquery/commit/539b4e62f80598fb510fad37429ae0441db04c6f))
* Update github/codeql-action action to v2.21.4 ([#2829](https://github.com/googleapis/java-bigquery/issues/2829)) ([599e3b3](https://github.com/googleapis/java-bigquery/commit/599e3b3d7e948a0688c6e08d4910f9db5c532f99))
* Update github/codeql-action action to v2.21.8 - abandoned ([#2897](https://github.com/googleapis/java-bigquery/issues/2897)) ([ab4e1d0](https://github.com/googleapis/java-bigquery/commit/ab4e1d026c34b7d28caaf5b0b1465ac2de62c530))
* Update github/codeql-action action to v2.21.8 ([#2889](https://github.com/googleapis/java-bigquery/issues/2889)) ([b568026](https://github.com/googleapis/java-bigquery/commit/b568026fe1b8fb7365306b718b5f8540fb13b8dc))
* Update github/codeql-action action to v2.21.9 ([#2901](https://github.com/googleapis/java-bigquery/issues/2901)) ([33a729f](https://github.com/googleapis/java-bigquery/commit/33a729f367ba6d9f04595e1b781c7eb321289380))

## [2.32.0](https://github.com/googleapis/java-bigquery/compare/v2.31.2...v2.32.0) (2023-09-14)


### Features

* Add support for converting interval fields to threeten PeriodDuration ([#2838](https://github.com/googleapis/java-bigquery/issues/2838)) ([2294c2f](https://github.com/googleapis/java-bigquery/commit/2294c2ffca62a22a66786a9a4c6c9ef1be898e5d))
* Add support for ExternalDatasetReference ([#2871](https://github.com/googleapis/java-bigquery/issues/2871)) ([bbb86fd](https://github.com/googleapis/java-bigquery/commit/bbb86fd8488ad253f2e9cf3fb08360330bd860a3))


### Dependencies

* Update actions/checkout action to v4 ([#2862](https://github.com/googleapis/java-bigquery/issues/2862)) ([902e9b9](https://github.com/googleapis/java-bigquery/commit/902e9b97cd548910354297ff6e605df094a03175))
* Update actions/upload-artifact action to v3.1.3 ([#2867](https://github.com/googleapis/java-bigquery/issues/2867)) ([cbbf0fb](https://github.com/googleapis/java-bigquery/commit/cbbf0fb8a99c0633335d81cd36a7b53dfe9df20b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.26.0 ([#2873](https://github.com/googleapis/java-bigquery/issues/2873)) ([6196625](https://github.com/googleapis/java-bigquery/commit/6196625d614ce80641008ffab3b5bf9720651bb9))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.30.0 ([#2874](https://github.com/googleapis/java-bigquery/issues/2874)) ([6cafedf](https://github.com/googleapis/java-bigquery/commit/6cafedf634bc88f41b2b5d3ec1425341b02ac8b6))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.15.0 ([#2870](https://github.com/googleapis/java-bigquery/issues/2870)) ([f24439b](https://github.com/googleapis/java-bigquery/commit/f24439b7adf1f08cee4b65918b4395861fe88517))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.26 ([#2868](https://github.com/googleapis/java-bigquery/issues/2868)) ([d01031c](https://github.com/googleapis/java-bigquery/commit/d01031cbc6d50f9aff8c6d49a8d2c54496779451))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.26 ([#2869](https://github.com/googleapis/java-bigquery/issues/2869)) ([edd7141](https://github.com/googleapis/java-bigquery/commit/edd714129b65d73f894591c4d40e1a8e79c36b04))

## [2.31.2](https://github.com/googleapis/java-bigquery/compare/v2.31.1...v2.31.2) (2023-09-05)


### Bug Fixes

* Hide TableReference data struct ([#2855](https://github.com/googleapis/java-bigquery/issues/2855)) ([2cbded6](https://github.com/googleapis/java-bigquery/commit/2cbded6600af1de8ec15b04a2496733ad2b50c47))
* SearchStats IndexUnusedReasons null bug ([#2825](https://github.com/googleapis/java-bigquery/issues/2825)) ([309ea60](https://github.com/googleapis/java-bigquery/commit/309ea607a9ff50e59dc4e1069c689c1da9605ed5))

## [2.31.1](https://github.com/googleapis/java-bigquery/compare/v2.31.0...v2.31.1) (2023-08-09)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.25.0 ([#2845](https://github.com/googleapis/java-bigquery/issues/2845)) ([d940f8d](https://github.com/googleapis/java-bigquery/commit/d940f8d7f119d75aaa80eb60babd5406fca76c69))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.29.0 ([#2846](https://github.com/googleapis/java-bigquery/issues/2846)) ([87a0a10](https://github.com/googleapis/java-bigquery/commit/87a0a10d806fdcbf4bdb1ee1478b9ee6aeb7b287))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.14.0 ([#2834](https://github.com/googleapis/java-bigquery/issues/2834)) ([79fe14c](https://github.com/googleapis/java-bigquery/commit/79fe14c08836b40bf84775a526cba32f63dd8227))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.24 ([#2839](https://github.com/googleapis/java-bigquery/issues/2839)) ([ae752bc](https://github.com/googleapis/java-bigquery/commit/ae752bc36c516e1a4172bc0c9cfa7ed6bbcbe0e7))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.24 ([#2840](https://github.com/googleapis/java-bigquery/issues/2840)) ([1ae6cb9](https://github.com/googleapis/java-bigquery/commit/1ae6cb9b20152e00db9a559ff143faca581bf8b1))
* Update github/codeql-action action to v2.21.1 ([#2824](https://github.com/googleapis/java-bigquery/issues/2824)) ([9978971](https://github.com/googleapis/java-bigquery/commit/997897166ba121256b7fa6f4c63f83daebdc6a54))
* Update jmh.version to v1.37 ([#2836](https://github.com/googleapis/java-bigquery/issues/2836)) ([4b3a3c2](https://github.com/googleapis/java-bigquery/commit/4b3a3c22985c76f7e861341dc76e96abc970eaec))

## [2.31.0](https://github.com/googleapis/java-bigquery/compare/v2.30.1...v2.31.0) (2023-07-25)


### Features

* Adds Exception handling to handle ALREADY EXISTS error ([#2788](https://github.com/googleapis/java-bigquery/issues/2788)) ([67a07ea](https://github.com/googleapis/java-bigquery/commit/67a07ea45c4635a2e9d43220d4bc34780eb512ef))


### Dependencies

* Update arrow.version to v12.0.1 ([#2750](https://github.com/googleapis/java-bigquery/issues/2750)) ([f92bee5](https://github.com/googleapis/java-bigquery/commit/f92bee558f6de070fb9f525bb47a824dc2c53e07))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.24.0 ([#2811](https://github.com/googleapis/java-bigquery/issues/2811)) ([b660063](https://github.com/googleapis/java-bigquery/commit/b6600635e01f930fa19769cb2594ef4f43226124))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.28.0 ([#2812](https://github.com/googleapis/java-bigquery/issues/2812)) ([921716d](https://github.com/googleapis/java-bigquery/commit/921716d54ea34f1914d16f7774124175be488087))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.13.1 ([#2806](https://github.com/googleapis/java-bigquery/issues/2806)) ([df3cd76](https://github.com/googleapis/java-bigquery/commit/df3cd761b5111bb0f174f691765697aa1bcbebde))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.10.0 ([#2808](https://github.com/googleapis/java-bigquery/issues/2808)) ([694f711](https://github.com/googleapis/java-bigquery/commit/694f7111d7497126d429c5dda17f44f661279582))
* Update github/codeql-action action to v2.21.0 ([#2803](https://github.com/googleapis/java-bigquery/issues/2803)) ([c6c536c](https://github.com/googleapis/java-bigquery/commit/c6c536c618908425f288fa0e6f516df2cc6a4b97))

## [2.30.1](https://github.com/googleapis/java-bigquery/compare/v2.30.0...v2.30.1) (2023-07-18)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.23.0 ([#2791](https://github.com/googleapis/java-bigquery/issues/2791)) ([940301b](https://github.com/googleapis/java-bigquery/commit/940301b327bf941cfab56d68759b6f1494fda22f))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.27.0 ([#2792](https://github.com/googleapis/java-bigquery/issues/2792)) ([c791066](https://github.com/googleapis/java-bigquery/commit/c79106678a0ac62b34605f19ca2baea296ea531c))

## [2.30.0](https://github.com/googleapis/java-bigquery/compare/v2.29.0...v2.30.0) (2023-07-17)


### Features

* Add missing storage related fields to Table, TableInfo and StandardTableDefinition ([#2673](https://github.com/googleapis/java-bigquery/issues/2673)) ([e3003f4](https://github.com/googleapis/java-bigquery/commit/e3003f48df9cca2bd549d893ffef3bb198a3b2aa))
* Add support for Search statistics ([#2787](https://github.com/googleapis/java-bigquery/issues/2787)) ([344f695](https://github.com/googleapis/java-bigquery/commit/344f695e319470acf350ebdd56d643c03704ea1f))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.22.0 ([#2777](https://github.com/googleapis/java-bigquery/issues/2777)) ([078f244](https://github.com/googleapis/java-bigquery/commit/078f244572db7484471d2c55a0db4533de0d1dc7))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.26.0 ([#2778](https://github.com/googleapis/java-bigquery/issues/2778)) ([2ee52c9](https://github.com/googleapis/java-bigquery/commit/2ee52c934d253d29c16b25d498ebe8e968cda481))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.13.0 ([#2786](https://github.com/googleapis/java-bigquery/issues/2786)) ([dd14eee](https://github.com/googleapis/java-bigquery/commit/dd14eee126f3cb6be7c943157e65acd5d4a088d4))
* Update github/codeql-action action to v2.20.1 ([#2766](https://github.com/googleapis/java-bigquery/issues/2766)) ([2014613](https://github.com/googleapis/java-bigquery/commit/201461351ac9813f6d11e6f5c3b9ec4dd01c001b))
* Update github/codeql-action action to v2.20.4 ([#2784](https://github.com/googleapis/java-bigquery/issues/2784)) ([e886f5f](https://github.com/googleapis/java-bigquery/commit/e886f5fa79aee469fe7b8860b5e87951635b6ce7))
* Update ossf/scorecard-action action to v2.2.0 ([#2775](https://github.com/googleapis/java-bigquery/issues/2775)) ([688b2a0](https://github.com/googleapis/java-bigquery/commit/688b2a0b16b578dc0784094608b35cb3a68f151b))

## [2.29.0](https://github.com/googleapis/java-bigquery/compare/v2.28.0...v2.29.0) (2023-06-23)


### Features

* Increase default Read API timeout to 60s ([#2764](https://github.com/googleapis/java-bigquery/issues/2764)) ([f606d0b](https://github.com/googleapis/java-bigquery/commit/f606d0b28ca8f65654413a99ab698f35e3befce1))


### Dependencies

* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.12.0 ([#2771](https://github.com/googleapis/java-bigquery/issues/2771)) ([7537e0f](https://github.com/googleapis/java-bigquery/commit/7537e0f31d8f4696559ef09c7bd284bf78217280))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.23 ([#2759](https://github.com/googleapis/java-bigquery/issues/2759)) ([27ba48a](https://github.com/googleapis/java-bigquery/commit/27ba48a0cab331f2d233ba96fed710c11d31dc53))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.23 ([#2760](https://github.com/googleapis/java-bigquery/issues/2760)) ([8cddf8f](https://github.com/googleapis/java-bigquery/commit/8cddf8fd286f51cd75aba0da6a52cbc12cab7e2a))

## [2.28.0](https://github.com/googleapis/java-bigquery/compare/v2.27.1...v2.28.0) (2023-06-19)


### Features

* Add primary key and foreign keys ([#2744](https://github.com/googleapis/java-bigquery/issues/2744)) ([afb571c](https://github.com/googleapis/java-bigquery/commit/afb571c97edb13f93df9ac140af4516205d27a49))
* Partial Projection of Table Metadata ([#2756](https://github.com/googleapis/java-bigquery/issues/2756)) ([9207743](https://github.com/googleapis/java-bigquery/commit/92077437d759705151f7778207616ecf024371ba))
* Return JobID with TableResult ([#2689](https://github.com/googleapis/java-bigquery/issues/2689)) ([aa38428](https://github.com/googleapis/java-bigquery/commit/aa38428ad26b64d2566b33f4b2ca3dcc102c3247))

## [2.27.1](https://github.com/googleapis/java-bigquery/compare/v2.27.0...v2.27.1) (2023-06-13)


### Dependencies

* Update actions/checkout action to v3.5.3 ([#2746](https://github.com/googleapis/java-bigquery/issues/2746)) ([17f8438](https://github.com/googleapis/java-bigquery/commit/17f843880f5633b602de5221c26b830e7e304d2b))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.21.0 ([#2741](https://github.com/googleapis/java-bigquery/issues/2741)) ([d665e52](https://github.com/googleapis/java-bigquery/commit/d665e523b2c393c17a734ff4714aeb85f8d61dd7))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.25.0 ([#2743](https://github.com/googleapis/java-bigquery/issues/2743)) ([5d38d23](https://github.com/googleapis/java-bigquery/commit/5d38d2375cedd29e35d75881a206cab3fdcdd6a5))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.11.0 ([#2738](https://github.com/googleapis/java-bigquery/issues/2738)) ([3b56445](https://github.com/googleapis/java-bigquery/commit/3b564458eef9df2173c47e26e2399a6a6cad6eee))
* Update github/codeql-action action to v2.20.0 ([#2751](https://github.com/googleapis/java-bigquery/issues/2751)) ([42ae181](https://github.com/googleapis/java-bigquery/commit/42ae18134b972c1694a7e012d2f51c916e663c83))
* Update github/codeql-action action to v2.3.6 ([#2712](https://github.com/googleapis/java-bigquery/issues/2712)) ([f043ed6](https://github.com/googleapis/java-bigquery/commit/f043ed61dacf4ea66eedaf0a6faada06057b7d50))

## [2.27.0](https://github.com/googleapis/java-bigquery/compare/v2.26.1...v2.27.0) (2023-05-30)


### Features

* Add support for session id on TableDataWriteChannel ([#2715](https://github.com/googleapis/java-bigquery/issues/2715)) ([42851d8](https://github.com/googleapis/java-bigquery/commit/42851d818ee825d7c4141d40d116e1da43c11f14))


### Bug Fixes

* Add support for repeated record query parameters ([#2698](https://github.com/googleapis/java-bigquery/issues/2698)) ([51aff50](https://github.com/googleapis/java-bigquery/commit/51aff502215d69bd0151030421cd18646c6ead36))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.20.0 ([#2720](https://github.com/googleapis/java-bigquery/issues/2720)) ([4962cac](https://github.com/googleapis/java-bigquery/commit/4962cac8fb3fe8d77a136eaf1b579cd79304acfb))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230506-2.0.0 ([#2707](https://github.com/googleapis/java-bigquery/issues/2707)) ([4d2ec07](https://github.com/googleapis/java-bigquery/commit/4d2ec0716287e9624949cbcdf6605c127c209be4))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230520-2.0.0 ([#2723](https://github.com/googleapis/java-bigquery/issues/2723)) ([5c64797](https://github.com/googleapis/java-bigquery/commit/5c64797c603343408849535b2dbf8080cd11ca32))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.37.2 ([#2726](https://github.com/googleapis/java-bigquery/issues/2726)) ([052c47a](https://github.com/googleapis/java-bigquery/commit/052c47aa43b0f50414db3031914e8a775ae98925))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.24.0 ([#2721](https://github.com/googleapis/java-bigquery/issues/2721)) ([7c357fb](https://github.com/googleapis/java-bigquery/commit/7c357fb414d45fde734c09c88ee3023d8d8f5822))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.10.1 ([#2713](https://github.com/googleapis/java-bigquery/issues/2713)) ([744e83a](https://github.com/googleapis/java-bigquery/commit/744e83a3da5323bc2cff2bcc6368a3eec39f392e))

## [2.26.1](https://github.com/googleapis/java-bigquery/compare/v2.26.0...v2.26.1) (2023-05-16)


### Bug Fixes

* Custom host  for resumable uploads ([#2696](https://github.com/googleapis/java-bigquery/issues/2696)) ([2b4eff1](https://github.com/googleapis/java-bigquery/commit/2b4eff1fed8b1ac9bf24bd69440377e904bc66e1))

## [2.26.0](https://github.com/googleapis/java-bigquery/compare/v2.25.0...v2.26.0) (2023-05-15)


### Features

* Add  field in HivePartitioningOptions ([#2678](https://github.com/googleapis/java-bigquery/issues/2678)) ([4165e55](https://github.com/googleapis/java-bigquery/commit/4165e5549d7a8e8e011d7700bc791e9b470c670d))
* Allow passing autodetect_schema on table update ([#2661](https://github.com/googleapis/java-bigquery/issues/2661)) ([4c01698](https://github.com/googleapis/java-bigquery/commit/4c01698e571d7adbaf914984cdf65f6c35e4edb8))


### Bug Fixes

* Move ratio calculation for whether to use read API to avoid NPE with setUseReadAPI(false) ([#2509](https://github.com/googleapis/java-bigquery/issues/2509)) ([e1326c8](https://github.com/googleapis/java-bigquery/commit/e1326c8b615f392f80a09d36a1b4cef79dfea662))


### Dependencies

* Update arrow.version to v12 (major) ([#2675](https://github.com/googleapis/java-bigquery/issues/2675)) ([7700cf5](https://github.com/googleapis/java-bigquery/commit/7700cf588d4a6d3b3267d8fd51eaf8aed1752506))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.19.0 ([#2691](https://github.com/googleapis/java-bigquery/issues/2691)) ([1939803](https://github.com/googleapis/java-bigquery/commit/193980319cb743e6b6c67648ddb21432e5e69ff8))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.23.0 ([#2692](https://github.com/googleapis/java-bigquery/issues/2692)) ([f56e541](https://github.com/googleapis/java-bigquery/commit/f56e54161894c3be6e975ac102454afca4c9b058))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.9.0 ([#2685](https://github.com/googleapis/java-bigquery/issues/2685)) ([b74da29](https://github.com/googleapis/java-bigquery/commit/b74da296e2d2739adb481cda417d51569d1acc51))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.22 ([#2687](https://github.com/googleapis/java-bigquery/issues/2687)) ([cf5d758](https://github.com/googleapis/java-bigquery/commit/cf5d758fe6aad4b374c34940aa93f8060f779505))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.22 ([#2688](https://github.com/googleapis/java-bigquery/issues/2688)) ([32ea8ab](https://github.com/googleapis/java-bigquery/commit/32ea8ab19bff86d8183ddd9d6e6d06303eb9d83f))
* Update github/codeql-action action to v2.3.3 ([#2658](https://github.com/googleapis/java-bigquery/issues/2658)) ([487f207](https://github.com/googleapis/java-bigquery/commit/487f20707c9b320a68100f85b2a1277cad9b37ea))

## [2.25.0](https://github.com/googleapis/java-bigquery/compare/v2.24.5...v2.25.0) (2023-04-27)


### Features

* Add ICEBERG format options ([#2662](https://github.com/googleapis/java-bigquery/issues/2662)) ([55048ca](https://github.com/googleapis/java-bigquery/commit/55048caf6b308dca3a0961595a4a735c44d99bbb))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.18.0 ([#2648](https://github.com/googleapis/java-bigquery/issues/2648)) ([29bd415](https://github.com/googleapis/java-bigquery/commit/29bd415c5c3d3f3c433821277fcd831796daa3d2))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230408-2.0.0 ([#2650](https://github.com/googleapis/java-bigquery/issues/2650)) ([b9c2f60](https://github.com/googleapis/java-bigquery/commit/b9c2f60cb296f488cc4095b54fbcc459dc2f3fa5))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.36.1 ([fea119b](https://github.com/googleapis/java-bigquery/commit/fea119b79eea54e9f0d221e1e71a2ca77957c657))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.22.0 ([#2649](https://github.com/googleapis/java-bigquery/issues/2649)) ([b6326f3](https://github.com/googleapis/java-bigquery/commit/b6326f3aed15d312987109009af66c7aa5a30a1d))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.8.0 ([#2659](https://github.com/googleapis/java-bigquery/issues/2659)) ([691a47a](https://github.com/googleapis/java-bigquery/commit/691a47abb63bd34b5c5c57439124d4713013b94c))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.9.3 ([#2660](https://github.com/googleapis/java-bigquery/issues/2660)) ([319f98e](https://github.com/googleapis/java-bigquery/commit/319f98eee611a10cf26582e32c9e6f8e24385565))

## [2.24.5](https://github.com/googleapis/java-bigquery/compare/v2.24.4...v2.24.5) (2023-04-14)


### Dependencies

* Update actions/checkout action to v3.5.2 ([#2630](https://github.com/googleapis/java-bigquery/issues/2630)) ([95e49fd](https://github.com/googleapis/java-bigquery/commit/95e49fd47648ff1574e60ed3a1ab8dacb75df654))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.16.0 ([#2625](https://github.com/googleapis/java-bigquery/issues/2625)) ([594a7b4](https://github.com/googleapis/java-bigquery/commit/594a7b4bf150a5963c149f8f5f6edd18adbf99fe))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230401-2.0.0 ([#2631](https://github.com/googleapis/java-bigquery/issues/2631)) ([5d8d9a6](https://github.com/googleapis/java-bigquery/commit/5d8d9a6dadb901b6b89b992965f0d1af332a6328))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.35.0 ([8439020](https://github.com/googleapis/java-bigquery/commit/843902051342889e6d6f23a84385441f1f173930))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.20.0 ([#2626](https://github.com/googleapis/java-bigquery/issues/2626)) ([f466b51](https://github.com/googleapis/java-bigquery/commit/f466b514fed248b1193900ac65be3d9a5154a858))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.7.0 ([#2637](https://github.com/googleapis/java-bigquery/issues/2637)) ([e8f07d7](https://github.com/googleapis/java-bigquery/commit/e8f07d70f754bb6a5937af7af436714bf2301af0))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.21 ([#2633](https://github.com/googleapis/java-bigquery/issues/2633)) ([3e376b1](https://github.com/googleapis/java-bigquery/commit/3e376b146dd5dfd38ae03dd48fa1e12bc7d12ead))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.21 ([#2634](https://github.com/googleapis/java-bigquery/issues/2634)) ([000f720](https://github.com/googleapis/java-bigquery/commit/000f72026e1464ec698032eff6eeb31afcfa963a))
* Update github/codeql-action action to v2.2.12 ([#2635](https://github.com/googleapis/java-bigquery/issues/2635)) ([b2f97e9](https://github.com/googleapis/java-bigquery/commit/b2f97e90da2891ddb59fc0291b54ebcd3d945709))
* Update ossf/scorecard-action action to v2.1.3 ([#2618](https://github.com/googleapis/java-bigquery/issues/2618)) ([d166401](https://github.com/googleapis/java-bigquery/commit/d166401edd01d6d9306027d601d26d66b661de02))

## [2.24.4](https://github.com/googleapis/java-bigquery/compare/v2.24.3...v2.24.4) (2023-03-30)


### Bug Fixes

* QueryWithStructsParameters sample mismatch ([#2610](https://github.com/googleapis/java-bigquery/issues/2610)) ([71f9f55](https://github.com/googleapis/java-bigquery/commit/71f9f55225eac6d7d4a3d5f0960b28bf8769d03d))


### Dependencies

* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230318-2.0.0 ([#2607](https://github.com/googleapis/java-bigquery/issues/2607)) ([a328eb2](https://github.com/googleapis/java-bigquery/commit/a328eb285b6007e0e01b059a03e71a2b5a6e7399))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.34.2 ([#2619](https://github.com/googleapis/java-bigquery/issues/2619)) ([e4aa0fe](https://github.com/googleapis/java-bigquery/commit/e4aa0fef53f9eebbe09d878318521df5d070fd70))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.6.0 ([#2612](https://github.com/googleapis/java-bigquery/issues/2612)) ([eac97ac](https://github.com/googleapis/java-bigquery/commit/eac97ac03007b52e6c242f427ac21e491bfefb13))
* Update github/codeql-action action to v2.2.9 ([#2608](https://github.com/googleapis/java-bigquery/issues/2608)) ([24aac14](https://github.com/googleapis/java-bigquery/commit/24aac1489dd99ebd0133e80a21dd7309f2c17494))

## [2.24.3](https://github.com/googleapis/java-bigquery/compare/v2.24.2...v2.24.3) (2023-03-24)


### Dependencies

* Update actions/checkout action to v3.5.0 ([#2600](https://github.com/googleapis/java-bigquery/issues/2600)) ([f38d9f1](https://github.com/googleapis/java-bigquery/commit/f38d9f17fdc067392631ee3c2d2a6c658985f68d))

## [2.24.2](https://github.com/googleapis/java-bigquery/compare/v2.24.1...v2.24.2) (2023-03-22)


### Dependencies

* Update github/codeql-action action to v2.2.8 ([#2593](https://github.com/googleapis/java-bigquery/issues/2593)) ([d306ad8](https://github.com/googleapis/java-bigquery/commit/d306ad8189a44c066ad5305596c86fae71251055))

## [2.24.1](https://github.com/googleapis/java-bigquery/compare/v2.24.0...v2.24.1) (2023-03-21)


### Dependencies

* Update cloud client dependencies ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))
* Update dependency com.google.cloud:google-cloud-bigquery to v2.23.2 ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))
* Update dependency com.google.cloud:google-cloud-bigquery to v2.24.0 ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.34.1 ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))
* Update dependency com.google.cloud:google-cloud-bigtable to v2.20.1 ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))
* Update dependency com.google.cloud:libraries-bom to v26.10.0 ([7b07779](https://github.com/googleapis/java-bigquery/commit/7b0777924103a711f9e3066c0a52adc551f24fca))

## [2.24.0](https://github.com/googleapis/java-bigquery/compare/v2.23.2...v2.24.0) (2023-03-21)


### Features

* Add support for clone ([#2553](https://github.com/googleapis/java-bigquery/issues/2553)) ([2186c64](https://github.com/googleapis/java-bigquery/commit/2186c64e523e030a777eec447bc1f22802f56617))


### Dependencies

* Update actions/checkout action to v3.4.0 ([#2575](https://github.com/googleapis/java-bigquery/issues/2575)) ([6935a1e](https://github.com/googleapis/java-bigquery/commit/6935a1e353d496e6de656de3431563b3527456e5))
* Update actions/upload-artifact action to v3.1.2 ([#2571](https://github.com/googleapis/java-bigquery/issues/2571)) ([aa0c70e](https://github.com/googleapis/java-bigquery/commit/aa0c70ec6fe0ae859b0944101373ebabb0bb4600))
* Update cloud client dependencies ([#2583](https://github.com/googleapis/java-bigquery/issues/2583)) ([dcacc31](https://github.com/googleapis/java-bigquery/commit/dcacc3150b3dbcd9c54038035cec3a7b1946af6c))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.15.0 ([#2577](https://github.com/googleapis/java-bigquery/issues/2577)) ([eaf09d6](https://github.com/googleapis/java-bigquery/commit/eaf09d65c00a742732b918478021dde3b12ac1bd))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230311-2.0.0 ([#2578](https://github.com/googleapis/java-bigquery/issues/2578)) ([aab037c](https://github.com/googleapis/java-bigquery/commit/aab037c8eb676b42231c99b5890c991095d2f8c2))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.5.0 ([#2580](https://github.com/googleapis/java-bigquery/issues/2580)) ([1764eeb](https://github.com/googleapis/java-bigquery/commit/1764eeb8d56ab3e5bda9b554414b5fe4d022fb72))
* Update dependency com.google.cloud:google-cloud-storage to v2.20.0 ([#2559](https://github.com/googleapis/java-bigquery/issues/2559)) ([8a854db](https://github.com/googleapis/java-bigquery/commit/8a854dbdcb676e2b2873ddfadf514f2e401fe987))
* Update github/codeql-action action to v2.2.7 ([#2572](https://github.com/googleapis/java-bigquery/issues/2572)) ([105f5ee](https://github.com/googleapis/java-bigquery/commit/105f5ee8d8882f79688dec685f20f44817bf313a))

## [2.23.2](https://github.com/googleapis/java-bigquery/compare/v2.23.1...v2.23.2) (2023-03-07)


### Bug Fixes

* External table definition parquet format options ([#2535](https://github.com/googleapis/java-bigquery/issues/2535)) ([eb45973](https://github.com/googleapis/java-bigquery/commit/eb4597314fad72bbdb666a832f0f15f732f40817))


### Documentation

* Remove stale snippet comment ([#2555](https://github.com/googleapis/java-bigquery/issues/2555)) ([a71b1b2](https://github.com/googleapis/java-bigquery/commit/a71b1b2abb568bd1ed088f7bd4b77f93a68ec95e))

## [2.23.1](https://github.com/googleapis/java-bigquery/compare/v2.23.0...v2.23.1) (2023-03-02)


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.14.0 ([#2545](https://github.com/googleapis/java-bigquery/issues/2545)) ([ad78ebb](https://github.com/googleapis/java-bigquery/commit/ad78ebb35a5b6d7d86d59e6c0fa078c68a65a275))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.18.0 ([#2546](https://github.com/googleapis/java-bigquery/issues/2546)) ([60e45e4](https://github.com/googleapis/java-bigquery/commit/60e45e457edfd257e16e37f0c0d5049dd722f0e3))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.4.0 ([#2547](https://github.com/googleapis/java-bigquery/issues/2547)) ([2588582](https://github.com/googleapis/java-bigquery/commit/25885821328ecb72c57d9ebeb548a6710d186381))

## [2.23.0](https://github.com/googleapis/java-bigquery/compare/v2.22.0...v2.23.0) (2023-02-22)


### Features

* Add support for session_id in load jobs ([#2519](https://github.com/googleapis/java-bigquery/issues/2519)) ([e431c17](https://github.com/googleapis/java-bigquery/commit/e431c17efe0f69d084f119463ca8bdb25047a7fe))


### Dependencies

* Update cloud client dependencies ([#2526](https://github.com/googleapis/java-bigquery/issues/2526)) ([4d88ccc](https://github.com/googleapis/java-bigquery/commit/4d88ccc22b86ae83220324c53c2430f7878473bd))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.13.0 ([#2533](https://github.com/googleapis/java-bigquery/issues/2533)) ([ed2cb74](https://github.com/googleapis/java-bigquery/commit/ed2cb7436c2ba38bdc4975abd12ba88d231087db))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230210-2.0.0 ([#2530](https://github.com/googleapis/java-bigquery/issues/2530)) ([62ff092](https://github.com/googleapis/java-bigquery/commit/62ff092908bbc2cf26e8cb9426bdc0f45d1b2b9e))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.3.0 ([#2534](https://github.com/googleapis/java-bigquery/issues/2534)) ([f1bcc33](https://github.com/googleapis/java-bigquery/commit/f1bcc331d61f966f9c0c29dd3dccb122cafc874d))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.20 ([#2527](https://github.com/googleapis/java-bigquery/issues/2527)) ([5fe5e74](https://github.com/googleapis/java-bigquery/commit/5fe5e74afd4af873213455010b73dcf8240e008d))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.20 ([#2528](https://github.com/googleapis/java-bigquery/issues/2528)) ([554e75d](https://github.com/googleapis/java-bigquery/commit/554e75df92aa0dbd16d65d51a6c845c914062059))

## [2.22.0](https://github.com/googleapis/java-bigquery/compare/v2.21.0...v2.22.0) (2023-02-08)


### Features

* Add collation for Case sensitive string column ([#2490](https://github.com/googleapis/java-bigquery/issues/2490)) ([3257737](https://github.com/googleapis/java-bigquery/commit/325773757e811172236eb3221926025b82f5db64))


### Dependencies

* Update arrow.version to v11 (major) ([#2495](https://github.com/googleapis/java-bigquery/issues/2495)) ([94ed060](https://github.com/googleapis/java-bigquery/commit/94ed06089239a0df0ffebf7f8470a38c16be95bf))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.11.0 ([#2482](https://github.com/googleapis/java-bigquery/issues/2482)) ([e6ffb9b](https://github.com/googleapis/java-bigquery/commit/e6ffb9b594e3bb680c4904f822c39653d626c4d3))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.12.0 ([#2512](https://github.com/googleapis/java-bigquery/issues/2512)) ([09f280d](https://github.com/googleapis/java-bigquery/commit/09f280d15389838dcc7ff9d8c1f485041559051e))
* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.31.0 ([#2499](https://github.com/googleapis/java-bigquery/issues/2499)) ([c0a393c](https://github.com/googleapis/java-bigquery/commit/c0a393ca3aae372dd42477c9b54bd785fc17ab20))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.15.0 ([#2483](https://github.com/googleapis/java-bigquery/issues/2483)) ([5c2bf69](https://github.com/googleapis/java-bigquery/commit/5c2bf69b227ca4efb55b42c06a747426183f8ae5))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.2.0 ([#2513](https://github.com/googleapis/java-bigquery/issues/2513)) ([02832dd](https://github.com/googleapis/java-bigquery/commit/02832ddcb62d4701cd3568eae806586917b359b5))

## [2.21.0](https://github.com/googleapis/java-bigquery/compare/v2.20.2...v2.21.0) (2023-01-23)


### Features

* Migrate from google-http-client-jackson2 to google-http-client-gson ([#2471](https://github.com/googleapis/java-bigquery/issues/2471)) ([09a8382](https://github.com/googleapis/java-bigquery/commit/09a8382222e1174c46989e797e0941cc36d387f1))


### Bug Fixes

* **java:** Skip fixing poms for special modules ([#1744](https://github.com/googleapis/java-bigquery/issues/1744)) ([#2474](https://github.com/googleapis/java-bigquery/issues/2474)) ([4e8bbe0](https://github.com/googleapis/java-bigquery/commit/4e8bbe0808b2aabea889042135e3a388d2f8ecff))


### Dependencies

* Update com.google.cloud:google-cloud-bigquerystorage-bom to v2.28.3 ([5a20c32](https://github.com/googleapis/java-bigquery/commit/5a20c327d9b863fbde9a8fb10f61f4c706b446a8))
* Update com.google.cloud:google-cloud-datacatalog-bom to v1.14.0 ([606fc1e](https://github.com/googleapis/java-bigquery/commit/606fc1e26c7c6f407a1938058b07699d84615bc7))
* Update com.google.cloud:google-cloud-storage to v2.17.1 ([#2465](https://github.com/googleapis/java-bigquery/issues/2465)) ([606fc1e](https://github.com/googleapis/java-bigquery/commit/606fc1e26c7c6f407a1938058b07699d84615bc7))
* Update com.google.cloud:google-cloud-storage to v2.17.2 ([#2479](https://github.com/googleapis/java-bigquery/issues/2479)) ([5a20c32](https://github.com/googleapis/java-bigquery/commit/5a20c327d9b863fbde9a8fb10f61f4c706b446a8))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.10.0 ([#2463](https://github.com/googleapis/java-bigquery/issues/2463)) ([5bfa7ae](https://github.com/googleapis/java-bigquery/commit/5bfa7aeb8ca48fab438d03b2ba1a19a8673d85a9))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20230114-2.0.0 ([#2477](https://github.com/googleapis/java-bigquery/issues/2477)) ([b6409d5](https://github.com/googleapis/java-bigquery/commit/b6409d52adde116bf073ec71e8968fd68b983e65))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.1.2 ([#2476](https://github.com/googleapis/java-bigquery/issues/2476)) ([688b6a6](https://github.com/googleapis/java-bigquery/commit/688b6a65b890668591451e8f3d01f9f15527c80d))

## [2.20.2](https://github.com/googleapis/java-bigquery/compare/v2.20.1...v2.20.2) (2023-01-12)


### Dependencies

* Update com.google.cloud:google-cloud-bigquerystorage-bom to 2.28.1 ([b62391d](https://github.com/googleapis/java-bigquery/commit/b62391d9cbf5fab30ff5df488d2835be45c5b8d8))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20221209-2.0.0 ([#2449](https://github.com/googleapis/java-bigquery/issues/2449)) ([9d0a107](https://github.com/googleapis/java-bigquery/commit/9d0a107da5e1e600dddccae79eb83358fd6940c6))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20221217-2.0.0 ([#2459](https://github.com/googleapis/java-bigquery/issues/2459)) ([08e2927](https://github.com/googleapis/java-bigquery/commit/08e2927ecb05ff3fda03493a99f466a6d2417d20))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.1.1 ([#2455](https://github.com/googleapis/java-bigquery/issues/2455)) ([412710c](https://github.com/googleapis/java-bigquery/commit/412710c25d637efeac5a2242ad841b11a788708a))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.9.2 ([#2456](https://github.com/googleapis/java-bigquery/issues/2456)) ([04d47ad](https://github.com/googleapis/java-bigquery/commit/04d47ad3b8e9b0078884f81c227eb96e87d21aa2))
* Update dependency org.threeten:threeten-extra to v1.7.2 ([#2450](https://github.com/googleapis/java-bigquery/issues/2450)) ([485be56](https://github.com/googleapis/java-bigquery/commit/485be563ba50974dd40069072b56d319ad40a70a))

## [2.20.1](https://github.com/googleapis/java-bigquery/compare/v2.20.0...v2.20.1) (2023-01-04)


### Dependencies

* Update dependency com.google.cloud:google-cloud-bigquerystorage-bom to v2.28.0 ([#2451](https://github.com/googleapis/java-bigquery/issues/2451)) ([4b760e1](https://github.com/googleapis/java-bigquery/commit/4b760e1049c6ddbfcb17b7de5905f43a53165c3d))

## [2.20.0](https://github.com/googleapis/java-bigquery/compare/v2.19.1...v2.20.0) (2022-12-13)


### Features

* Add fast query path support when empty jobId object is passed ([#2349](https://github.com/googleapis/java-bigquery/issues/2349)) ([42c083a](https://github.com/googleapis/java-bigquery/commit/42c083ac680c657bf3f648fbce81004ecac8be87))
* Next release from main branch is 2.20.0 ([#2405](https://github.com/googleapis/java-bigquery/issues/2405)) ([9297a43](https://github.com/googleapis/java-bigquery/commit/9297a4359f7b080a60b6bb5873edfd66cd7d2261))


### Dependencies

* Update arrow.version to v10.0.1 ([#2426](https://github.com/googleapis/java-bigquery/issues/2426)) ([aff9019](https://github.com/googleapis/java-bigquery/commit/aff901904d04a9a35042126a90e2a2826283a3e7))
* Update cloud client dependencies ([#2444](https://github.com/googleapis/java-bigquery/issues/2444)) ([7255357](https://github.com/googleapis/java-bigquery/commit/7255357fc3bc715ebe15761acbe83c5e33495fdc))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.8.0 ([#2418](https://github.com/googleapis/java-bigquery/issues/2418)) ([1ac1653](https://github.com/googleapis/java-bigquery/commit/1ac1653ed705fa7173c4a83ab37169fdb15422e3))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.9.0 ([#2441](https://github.com/googleapis/java-bigquery/issues/2441)) ([01cc3c3](https://github.com/googleapis/java-bigquery/commit/01cc3c3d64884c2d7b68c5099de7c0959c1846db))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20221127-2.0.0 ([#2437](https://github.com/googleapis/java-bigquery/issues/2437)) ([eb52002](https://github.com/googleapis/java-bigquery/commit/eb52002919843ad9341d3f9b06c10e401637b82a))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.12.0 ([#2419](https://github.com/googleapis/java-bigquery/issues/2419)) ([c449031](https://github.com/googleapis/java-bigquery/commit/c4490315b62606371e134f2a9c2fbfabc60bee03))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.1.0 ([#2435](https://github.com/googleapis/java-bigquery/issues/2435)) ([c99b215](https://github.com/googleapis/java-bigquery/commit/c99b21552e30a509b6220de7a491566dbab086db))
* Update dependency com.google.cloud:google-cloud-storage to v2.15.1 ([#2420](https://github.com/googleapis/java-bigquery/issues/2420)) ([baf337a](https://github.com/googleapis/java-bigquery/commit/baf337a12e89af73db0c2494e61f271f32e44ed0))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.18 ([#2424](https://github.com/googleapis/java-bigquery/issues/2424)) ([63b5196](https://github.com/googleapis/java-bigquery/commit/63b51969dc20747d3dd1f127cc0fcb2d27c9c8c0))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.19 ([#2432](https://github.com/googleapis/java-bigquery/issues/2432)) ([396c6dc](https://github.com/googleapis/java-bigquery/commit/396c6dc101837a801c7f693f3a3548eb6685feaf))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.18 ([#2425](https://github.com/googleapis/java-bigquery/issues/2425)) ([cd2ae9f](https://github.com/googleapis/java-bigquery/commit/cd2ae9f3d2c19be8a375e6be57a7e6b805b1ac4e))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.19 ([#2433](https://github.com/googleapis/java-bigquery/issues/2433)) ([bf94087](https://github.com/googleapis/java-bigquery/commit/bf940878a7cf602b7f0736335653bc6c479e2df6))
* Update jmh.version to v1.36 ([#2415](https://github.com/googleapis/java-bigquery/issues/2415)) ([0676586](https://github.com/googleapis/java-bigquery/commit/06765866bf4507f8f6ebbaee28e7dc698f9ba14c))

## [2.19.1](https://github.com/googleapis/java-bigquery/compare/v2.19.0...v2.19.1) (2022-11-08)


### Dependencies

* Update dependency com.google.cloud:google-cloud-storage to v2.15.0 ([#2402](https://github.com/googleapis/java-bigquery/issues/2402)) ([aac2711](https://github.com/googleapis/java-bigquery/commit/aac27119142e1411eb2f8b0270c806262f08d391))

## [2.19.0](https://github.com/googleapis/java-bigquery/compare/v2.18.2...v2.19.0) (2022-11-07)


### Features

* Add getTimestampInstant() method to FieldValue ([#2350](https://github.com/googleapis/java-bigquery/issues/2350)) ([113303f](https://github.com/googleapis/java-bigquery/commit/113303fb41ec4855bb81a5bd3c7f8984bc70da3e))


### Dependencies

* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20221028-2.0.0 ([#2393](https://github.com/googleapis/java-bigquery/issues/2393)) ([d3f6a6b](https://github.com/googleapis/java-bigquery/commit/d3f6a6bf55697541cfdc3bcdd2c441e8bd21dbc2))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.0.6 ([#2399](https://github.com/googleapis/java-bigquery/issues/2399)) ([9de9aa8](https://github.com/googleapis/java-bigquery/commit/9de9aa8f7eb2e21b88a13df23b65e2aaf6b749cf))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.17 ([#2396](https://github.com/googleapis/java-bigquery/issues/2396)) ([87f8cdd](https://github.com/googleapis/java-bigquery/commit/87f8cdd7b0b005430486e51e4c339a6de95b0011))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.17 ([#2397](https://github.com/googleapis/java-bigquery/issues/2397)) ([7927350](https://github.com/googleapis/java-bigquery/commit/7927350f562dbdef8774df82c9c0d528118d0213))

## [2.18.2](https://github.com/googleapis/java-bigquery/compare/v2.18.1...v2.18.2) (2022-10-28)


### Dependencies

* Remove duplicated deps in the pom. ([#2383](https://github.com/googleapis/java-bigquery/issues/2383)) ([fe164aa](https://github.com/googleapis/java-bigquery/commit/fe164aad572b74c21de2ce492f0f7c28bd07a7df))

## [2.18.1](https://github.com/googleapis/java-bigquery/compare/v2.18.0...v2.18.1) (2022-10-28)


### Dependencies

* Remove version declaration for gson ([#2379](https://github.com/googleapis/java-bigquery/issues/2379)) ([0908652](https://github.com/googleapis/java-bigquery/commit/0908652a2e8baf46b142a8ba31c0967e593986d6))

## [2.18.0](https://github.com/googleapis/java-bigquery/compare/v2.17.1...v2.18.0) (2022-10-27)


### Features

* Add executeSelectAsync and Refactor ([#2294](https://github.com/googleapis/java-bigquery/issues/2294)) ([80fa478](https://github.com/googleapis/java-bigquery/commit/80fa47834f3ef536f553702dee3ddc80e18981bb))


### Bug Fixes

* Add --add-opens arg to native-image command ([#2369](https://github.com/googleapis/java-bigquery/issues/2369)) ([8e8b6d7](https://github.com/googleapis/java-bigquery/commit/8e8b6d70e228a63b5dde00b828765110b0222d20))
* Properly handle external table schema on table update ([#2236](https://github.com/googleapis/java-bigquery/issues/2236)) ([460ef31](https://github.com/googleapis/java-bigquery/commit/460ef318297fe5562a983f64c407b7c0fa5a9a8b))


### Dependencies

* Update arrow.version to v10 (major) ([#2371](https://github.com/googleapis/java-bigquery/issues/2371)) ([b7873db](https://github.com/googleapis/java-bigquery/commit/b7873db46e174c755657ddcecbb02c0e495c9a1f))
* Update cloud client dependencies ([#2362](https://github.com/googleapis/java-bigquery/issues/2362)) ([0936699](https://github.com/googleapis/java-bigquery/commit/09366996e281354cc423cbc3ac97a11b0d48eda6))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.6.0 ([#2355](https://github.com/googleapis/java-bigquery/issues/2355)) ([7bc59a7](https://github.com/googleapis/java-bigquery/commit/7bc59a77a6f3821ac19088a8ee864f5d24bdee2e))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.7.0 ([#2366](https://github.com/googleapis/java-bigquery/issues/2366)) ([02102d3](https://github.com/googleapis/java-bigquery/commit/02102d3fb873e68827a8630a4eb34d4bcabd5f9d))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20221015-2.0.0 ([#2370](https://github.com/googleapis/java-bigquery/issues/2370)) ([9b796cf](https://github.com/googleapis/java-bigquery/commit/9b796cf0b14094f9442c7e21d7789a673691b87d))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.10.0 ([#2356](https://github.com/googleapis/java-bigquery/issues/2356)) ([edb2ca0](https://github.com/googleapis/java-bigquery/commit/edb2ca03f2e216d6a1083a9dc2bc7f74bed9d3a5))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.0.5 ([#2361](https://github.com/googleapis/java-bigquery/issues/2361)) ([51b2258](https://github.com/googleapis/java-bigquery/commit/51b2258bbfa542c822668240c8d5f7cc6c63e03c))
* Update dependency com.google.code.gson:gson to v2.10 ([#2367](https://github.com/googleapis/java-bigquery/issues/2367)) ([82e3de5](https://github.com/googleapis/java-bigquery/commit/82e3de5f76644e3530ac795a5eafd1dac4c3be07))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.15 ([#2352](https://github.com/googleapis/java-bigquery/issues/2352)) ([b0f172c](https://github.com/googleapis/java-bigquery/commit/b0f172c1863bbe66c366a75c4a5c06ee5ba049d0))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.16 ([#2358](https://github.com/googleapis/java-bigquery/issues/2358)) ([f4e5fc5](https://github.com/googleapis/java-bigquery/commit/f4e5fc59f4b9bc63c763ec1dc8b75f87defc9ced))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.15 ([#2353](https://github.com/googleapis/java-bigquery/issues/2353)) ([ac9226c](https://github.com/googleapis/java-bigquery/commit/ac9226c7a6297d686c0bd77939f084e3faf6090a))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.16 ([#2359](https://github.com/googleapis/java-bigquery/issues/2359)) ([52ec31a](https://github.com/googleapis/java-bigquery/commit/52ec31a6dc3705e09e7ce9cd815241a0fb2cc5d6))

## [2.17.1](https://github.com/googleapis/java-bigquery/compare/v2.17.0...v2.17.1) (2022-10-10)


### Dependencies

* Update cloud client dependencies ([#2335](https://github.com/googleapis/java-bigquery/issues/2335)) ([f8053d7](https://github.com/googleapis/java-bigquery/commit/f8053d7773d225b29e669976c6123b5d30ccd6a8))
* Update cloud client dependencies ([#2337](https://github.com/googleapis/java-bigquery/issues/2337)) ([1194eac](https://github.com/googleapis/java-bigquery/commit/1194eacf23d947a0d923a3b3fd3f9460dfc996b3))
* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.5.6 ([#2336](https://github.com/googleapis/java-bigquery/issues/2336)) ([a86c759](https://github.com/googleapis/java-bigquery/commit/a86c7594d0c9e8a480297b028e108c86f4a1e12a))

## [2.17.0](https://github.com/googleapis/java-bigquery/compare/v2.16.1...v2.17.0) (2022-10-03)


### Features

* Add remote function options to routine metadata ([#2291](https://github.com/googleapis/java-bigquery/issues/2291)) ([d30670e](https://github.com/googleapis/java-bigquery/commit/d30670ee2edf498b0335f3dfdec3487f5627a9f3))


### Dependencies

* Update dependency com.google.api.grpc:proto-google-cloud-bigqueryconnection-v1 to v2.5.5 ([#2328](https://github.com/googleapis/java-bigquery/issues/2328)) ([6e48ec2](https://github.com/googleapis/java-bigquery/commit/6e48ec22f98f95cc93a6a0e2a068d8a4d8c822ca))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20220913-2.0.0 ([#2287](https://github.com/googleapis/java-bigquery/issues/2287)) ([fa33184](https://github.com/googleapis/java-bigquery/commit/fa331844dc1862120867d73ad87d87587a388576))
* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20220924-2.0.0 ([#2325](https://github.com/googleapis/java-bigquery/issues/2325)) ([82c2097](https://github.com/googleapis/java-bigquery/commit/82c2097a866804ffb95a871087438fc163e8b77c))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.0.4 ([#2327](https://github.com/googleapis/java-bigquery/issues/2327)) ([188c779](https://github.com/googleapis/java-bigquery/commit/188c77995cad31b328cfbf745df164f4ac70b692))
* Update dependency gcp-releasetool to v1.8.9 ([#2326](https://github.com/googleapis/java-bigquery/issues/2326)) ([52dfd13](https://github.com/googleapis/java-bigquery/commit/52dfd13a4d311526c784397f50ca5cf45b60f2a5))
* Update dependency importlib-metadata to v4.13.0 ([#2323](https://github.com/googleapis/java-bigquery/issues/2323)) ([4c7e089](https://github.com/googleapis/java-bigquery/commit/4c7e089f281c7147cd468fbdbd19cd7238b49be3))
* Update dependency importlib-metadata to v5 ([#2324](https://github.com/googleapis/java-bigquery/issues/2324)) ([bd43cf4](https://github.com/googleapis/java-bigquery/commit/bd43cf42443feba02d7970d3dd17c11d1b64872c))
* Update dependency org.graalvm.buildtools:junit-platform-native to v0.9.14 ([#2288](https://github.com/googleapis/java-bigquery/issues/2288)) ([959519c](https://github.com/googleapis/java-bigquery/commit/959519cd9e5910ba7d93cce00c318ed322dcaf23))
* Update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.14 ([#2289](https://github.com/googleapis/java-bigquery/issues/2289)) ([3cf7ef8](https://github.com/googleapis/java-bigquery/commit/3cf7ef83d891480bf80fcb1879ca86e9e053304e))
* Update dependency org.junit.vintage:junit-vintage-engine to v5.9.1 ([#2285](https://github.com/googleapis/java-bigquery/issues/2285)) ([65fac18](https://github.com/googleapis/java-bigquery/commit/65fac188db2514ae620fb5146055591cfe6ac995))

## [2.16.1](https://github.com/googleapis/java-bigquery/compare/v2.16.0...v2.16.1) (2022-09-15)


### Dependencies

* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.0.3 ([#2274](https://github.com/googleapis/java-bigquery/issues/2274)) ([4c9952b](https://github.com/googleapis/java-bigquery/commit/4c9952b4f8bc81a66f2a43ecbb9fa85774ed8a93))

## [2.16.0](https://github.com/googleapis/java-bigquery/compare/v2.15.0...v2.16.0) (2022-09-12)


### Features

* Add preserveAsciiControlCharacters to CsvOptions ([#2143](https://github.com/googleapis/java-bigquery/issues/2143)) ([856893f](https://github.com/googleapis/java-bigquery/commit/856893f4d8f1b419365d8f179ce9f9e571dec718))
* Add reference file schema option for federated formats ([#2269](https://github.com/googleapis/java-bigquery/issues/2269)) ([8c488e6](https://github.com/googleapis/java-bigquery/commit/8c488e64259bd67716342f48f96d2932c5e57c3e))


### Bug Fixes

* Socket-timeout at bigquery.it.ITNightlyBigQueryTest: testForTableNotFound ([#2260](https://github.com/googleapis/java-bigquery/issues/2260)) ([a9b5fb2](https://github.com/googleapis/java-bigquery/commit/a9b5fb2c1078788ddb1ac3169c9ce597af228ac0))


### Dependencies

* Update dependency com.google.apis:google-api-services-bigquery to v2-rev20220827-2.0.0 ([#2261](https://github.com/googleapis/java-bigquery/issues/2261)) ([3c67d21](https://github.com/googleapis/java-bigquery/commit/3c67d21c10f66b3c5313a1733f4e81db42c1b7c3))
* Update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.9.3 ([#2259](https://github.com/googleapis/java-bigquery/issues/2259)) ([5e30a04](https://github.com/googleapis/java-bigquery/commit/5e30a04e5b14b03e60e587787180b27f605d6abd))
* Update dependency com.google.cloud:google-cloud-shared-dependencies to v3.0.2 ([#2267](https://github.com/googleapis/java-bigquery/issues/2267)) ([8472fe5](https://github.com/googleapis/java-bigquery/commit/8472fe580a8197aaa3957dd3231fed0a9511fbb5))

## [2.15.0](https://github.com/googleapis/java-bigquery/compare/v2.14.7...v2.15.0) (2022-08-25)


### Features

* add preview support for default values ([#2244](https://github.com/googleapis/java-bigquery/issues/2244)) ([fd3d3c5](https://github.com/googleapis/java-bigquery/commit/fd3d3c57afed84b4d00aab438d79472a6afa001b))

## [2.14.7](https://github.com/googleapis/java-bigquery/compare/v2.14.6...v2.14.7) (2022-08-23)


### Bug Fixes

* table-not-found issue with executeSelect while running long queries  ([#2222](https://github.com/googleapis/java-bigquery/issues/2222)) ([4876569](https://github.com/googleapis/java-bigquery/commit/487656973fe3e06d838c1b495ac024ab2c6810f6))

## [2.14.6](https://github.com/googleapis/java-bigquery/compare/v2.14.5...v2.14.6) (2022-08-12)


### Dependencies

* update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.9.2 ([#2221](https://github.com/googleapis/java-bigquery/issues/2221)) ([3292cdd](https://github.com/googleapis/java-bigquery/commit/3292cddeec7c83fa198a96d80a35c13b003a26c8))

## [2.14.5](https://github.com/googleapis/java-bigquery/compare/v2.14.4...v2.14.5) (2022-08-12)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220806-2.0.0 ([#2223](https://github.com/googleapis/java-bigquery/issues/2223)) ([05d1de1](https://github.com/googleapis/java-bigquery/commit/05d1de19488c45ceb202824d9ce2ae0fd290d930))

## [2.14.4](https://github.com/googleapis/java-bigquery/compare/v2.14.3...v2.14.4) (2022-08-08)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.11.3 ([#2213](https://github.com/googleapis/java-bigquery/issues/2213)) ([a293ab5](https://github.com/googleapis/java-bigquery/commit/a293ab56c5455cef8b9731784ddd78cc6162dca8))

## [2.14.3](https://github.com/googleapis/java-bigquery/compare/v2.14.2...v2.14.3) (2022-08-05)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220730-2.0.0 ([#2208](https://github.com/googleapis/java-bigquery/issues/2208)) ([5165e2b](https://github.com/googleapis/java-bigquery/commit/5165e2b3d4001d58daa2a60b553926d938848ee6))
* update dependency com.google.cloud:google-cloud-storage to v2.11.2 ([#2207](https://github.com/googleapis/java-bigquery/issues/2207)) ([da5389d](https://github.com/googleapis/java-bigquery/commit/da5389d78c5136f01c16d23f4f7ec54c6b4f3010))

## [2.14.2](https://github.com/googleapis/java-bigquery/compare/v2.14.1...v2.14.2) (2022-08-04)


### Dependencies

* update arrow.version to v9 (major) ([#2201](https://github.com/googleapis/java-bigquery/issues/2201)) ([3ec5ef9](https://github.com/googleapis/java-bigquery/commit/3ec5ef987425315a0dc4d2ab9a4dc162cf000156))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220716-2.0.0 ([#2202](https://github.com/googleapis/java-bigquery/issues/2202)) ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))
* update dependency com.google.cloud:google-cloud-bigquerystorage-bom to 2.18.0 ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))
* update dependency com.google.cloud:google-cloud-datacatalog-bom to 1.9.1 ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v3 ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))
* update dependency com.google.cloud:google-cloud-storage to 2.11.0 ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))
* update dependency com.google.cloud:google-cloud-storage to v2.11.1 ([#2194](https://github.com/googleapis/java-bigquery/issues/2194)) ([45be001](https://github.com/googleapis/java-bigquery/commit/45be00165846010afd43e184d94b81d4254f5cd5))
* update dependency com.google.code.gson:gson to v2.9.1 ([#2190](https://github.com/googleapis/java-bigquery/issues/2190)) ([4bd4539](https://github.com/googleapis/java-bigquery/commit/4bd4539be4aa2ced4eeefde4b48fdbaa5faf5801))
* update dependency org.threeten:threeten-extra to v1.7.1 ([c1ca09e](https://github.com/googleapis/java-bigquery/commit/c1ca09e41bb9d4b070e241437b46d717e66f4944))


### Documentation

* **owlbot-java:** explaining why not using formatter in pom.xml ([#1511](https://github.com/googleapis/java-bigquery/issues/1511)) ([#2195](https://github.com/googleapis/java-bigquery/issues/2195)) ([7c45aa5](https://github.com/googleapis/java-bigquery/commit/7c45aa5bf78e2c15534cdd6d3d9af572ea871e57)), closes [#1502](https://github.com/googleapis/java-bigquery/issues/1502)

## [2.14.1](https://github.com/googleapis/java-bigquery/compare/v2.14.0...v2.14.1) (2022-07-27)


### Dependencies

* update dependency org.junit.vintage:junit-vintage-engine to v5.9.0 ([#2183](https://github.com/googleapis/java-bigquery/issues/2183)) ([f8325cf](https://github.com/googleapis/java-bigquery/commit/f8325cff22af3f087b23d6376ab96e78648efd00))

## [2.14.0](https://github.com/googleapis/java-bigquery/compare/v2.13.8...v2.14.0) (2022-07-22)


### Features

* Add decimal target type ([#2166](https://github.com/googleapis/java-bigquery/issues/2166)) ([ebbd8f5](https://github.com/googleapis/java-bigquery/commit/ebbd8f52853d3c0ca918a47d826474cc5825a58a))
* **bigquery:** enable use of GEOGRAPHY query params ([#2158](https://github.com/googleapis/java-bigquery/issues/2158)) ([b19ad76](https://github.com/googleapis/java-bigquery/commit/b19ad767a53a9bd5d14b4cb36716cbb1c7b44ed6))


### Bug Fixes

* Add query dryRun logic to get the schema when null schema is returned from the backend ([#2106](https://github.com/googleapis/java-bigquery/issues/2106)) ([c98d22b](https://github.com/googleapis/java-bigquery/commit/c98d22b2b4f45e20d7d0666c5342cdbfadd30bde))
* enable longpaths support for windows test ([#1485](https://github.com/googleapis/java-bigquery/issues/1485)) ([#2164](https://github.com/googleapis/java-bigquery/issues/2164)) ([e18b9f8](https://github.com/googleapis/java-bigquery/commit/e18b9f8b4d2f194577b1710ad64710fe0f3d88d9))
* **java:** make field accessible to address Java 17 issue with arrow ([#2165](https://github.com/googleapis/java-bigquery/issues/2165)) ([d605b81](https://github.com/googleapis/java-bigquery/commit/d605b8149954e79c05461630915b674e11793889))


### Dependencies

* update dependency org.graalvm.buildtools:junit-platform-native to v0.9.13 ([#2160](https://github.com/googleapis/java-bigquery/issues/2160)) ([970135b](https://github.com/googleapis/java-bigquery/commit/970135bec33b831925476855da9a84c34311068d))
* update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.13 ([#2161](https://github.com/googleapis/java-bigquery/issues/2161)) ([3507bf7](https://github.com/googleapis/java-bigquery/commit/3507bf7c9fc2aef299d06d9771cfcc06e3080b87))

## [2.13.8](https://github.com/googleapis/java-bigquery/compare/v2.13.7...v2.13.8) (2022-07-01)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.9.0 ([#2149](https://github.com/googleapis/java-bigquery/issues/2149)) ([a07c714](https://github.com/googleapis/java-bigquery/commit/a07c714cb90c7ff62a43f7500abe8d54a5cd0936))

## [2.13.7](https://github.com/googleapis/java-bigquery/compare/v2.13.6...v2.13.7) (2022-06-29)


### Dependencies

* update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.8.4 ([#2140](https://github.com/googleapis/java-bigquery/issues/2140)) ([c7ef597](https://github.com/googleapis/java-bigquery/commit/c7ef597832505e6c05adb38ac1db5dd15e32d024))

## [2.13.6](https://github.com/googleapis/java-bigquery/compare/v2.13.5...v2.13.6) (2022-06-24)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220611-1.32.1 ([#2132](https://github.com/googleapis/java-bigquery/issues/2132)) ([bddefcf](https://github.com/googleapis/java-bigquery/commit/bddefcf647d50ee12fffea80c04613b38b8d02d0))
* update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.8.3 ([#2135](https://github.com/googleapis/java-bigquery/issues/2135)) ([0bd5ddc](https://github.com/googleapis/java-bigquery/commit/0bd5ddc0df0a978692252e50c37c94f41a3c4e1d))

## [2.13.5](https://github.com/googleapis/java-bigquery/compare/v2.13.4...v2.13.5) (2022-06-23)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.13.0 ([#2128](https://github.com/googleapis/java-bigquery/issues/2128)) ([3043533](https://github.com/googleapis/java-bigquery/commit/3043533608c5659be0313f1942d20314d2157fd4))

## [2.13.4](https://github.com/googleapis/java-bigquery/compare/v2.13.3...v2.13.4) (2022-06-22)


### Dependencies

* update dependency org.graalvm.buildtools:junit-platform-native to v0.9.12 ([#2124](https://github.com/googleapis/java-bigquery/issues/2124)) ([4542ce9](https://github.com/googleapis/java-bigquery/commit/4542ce9a51d9756a8a06d0e33cf3a40d1e321ade))
* update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.12 ([#2125](https://github.com/googleapis/java-bigquery/issues/2125)) ([6da965f](https://github.com/googleapis/java-bigquery/commit/6da965f540a2cdb2eaf845301cfbfbf34b9a6866))

## [2.13.3](https://github.com/googleapis/java-bigquery/compare/v2.13.2...v2.13.3) (2022-06-16)


### Bug Fixes

* Assertj-core cleanup ([#2102](https://github.com/googleapis/java-bigquery/issues/2102)) ([4630c50](https://github.com/googleapis/java-bigquery/commit/4630c50db7428d888b726297408b7a223b39b28a))


### Documentation

* **sample:** clean up native image sample README ([#2120](https://github.com/googleapis/java-bigquery/issues/2120)) ([de7b45a](https://github.com/googleapis/java-bigquery/commit/de7b45a52259cec16970e074dd4f526685aa4d09))


### Dependencies

* update cloud client dependencies ([#2110](https://github.com/googleapis/java-bigquery/issues/2110)) ([30a88f4](https://github.com/googleapis/java-bigquery/commit/30a88f43aea6269e3fbe82544eb2112f25830761))
* update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.8.2 ([#2101](https://github.com/googleapis/java-bigquery/issues/2101)) ([bdbd3da](https://github.com/googleapis/java-bigquery/commit/bdbd3da4c6c8bb7f2363711691edb31c7711d811))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.34.1 ([#2111](https://github.com/googleapis/java-bigquery/issues/2111)) ([1a0235f](https://github.com/googleapis/java-bigquery/commit/1a0235f9cdea0ae37b2e8b1047ca66395b1af3b0))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.34.1 ([#2112](https://github.com/googleapis/java-bigquery/issues/2112)) ([e52739f](https://github.com/googleapis/java-bigquery/commit/e52739ffcaeb9ca9dc362f07f117f37ecff220c7))

## [2.13.2](https://github.com/googleapis/java-bigquery/compare/v2.13.1...v2.13.2) (2022-06-05)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220528-1.32.1 ([#2096](https://github.com/googleapis/java-bigquery/issues/2096)) ([9275750](https://github.com/googleapis/java-bigquery/commit/9275750f76938933e4e062d2eae2f8d5cd99c7e1))

## [2.13.1](https://github.com/googleapis/java-bigquery/compare/v2.13.0...v2.13.1) (2022-06-02)


### Dependencies

* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.34.0 ([#2088](https://github.com/googleapis/java-bigquery/issues/2088)) ([ed33496](https://github.com/googleapis/java-bigquery/commit/ed33496950bb25bb754a7bb71c74d73d99d25209))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.34.0 ([#2089](https://github.com/googleapis/java-bigquery/issues/2089)) ([117d390](https://github.com/googleapis/java-bigquery/commit/117d3907fcecaf923d200021ff66503a67dec2a1))

## [2.13.0](https://github.com/googleapis/java-bigquery/compare/v2.12.0...v2.13.0) (2022-05-31)


### Features

* add destinationExpirationTime to CopyJobConfiguration ([#2031](https://github.com/googleapis/java-bigquery/issues/2031)) ([9e0b351](https://github.com/googleapis/java-bigquery/commit/9e0b35136aed6ed489bff4d4ac86c4d5d83274be))


### Documentation

* **samples:** update querypagination sample ([#2074](https://github.com/googleapis/java-bigquery/issues/2074)) ([4e153f5](https://github.com/googleapis/java-bigquery/commit/4e153f525cc600cecdfabec600b166560ba62607))


### Dependencies

* update dependency com.google.cloud:google-cloud-datacatalog-bom to v1.8.1 ([#2076](https://github.com/googleapis/java-bigquery/issues/2076)) ([38d6bae](https://github.com/googleapis/java-bigquery/commit/38d6baefeebe0dc2858d38f6c44ad727b6beba92))
* update dependency com.google.cloud:google-cloud-storage to v2.7.2 ([#2077](https://github.com/googleapis/java-bigquery/issues/2077)) ([eb443df](https://github.com/googleapis/java-bigquery/commit/eb443dfd5fd26e9c424dcbb1b00af5260a525679))

## [2.12.0](https://github.com/googleapis/java-bigquery/compare/v2.11.2...v2.12.0) (2022-05-25)


### Features

* add build scripts for native image testing in Java 17 ([#1440](https://github.com/googleapis/java-bigquery/issues/1440)) ([#2057](https://github.com/googleapis/java-bigquery/issues/2057)) ([065ae78](https://github.com/googleapis/java-bigquery/commit/065ae78ef20052032c245b3fe991808c24ec8077))


### Bug Fixes

* add more native image configurations for Arrow tests and enable native image tests ([#2053](https://github.com/googleapis/java-bigquery/issues/2053)) ([7f0bfd4](https://github.com/googleapis/java-bigquery/commit/7f0bfd4a42c28f3d2a748474e1ec40740311a734))
* Flaky testPositionalQueryParameters ([#2059](https://github.com/googleapis/java-bigquery/issues/2059)) ([3764b59](https://github.com/googleapis/java-bigquery/commit/3764b5967c694fa34aef75804333e5a6101d912e))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.7.0 ([#2061](https://github.com/googleapis/java-bigquery/issues/2061)) ([1c7a0ab](https://github.com/googleapis/java-bigquery/commit/1c7a0ab157f79772d8da58bfe15f54a7394124e8))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.11.0 ([#2055](https://github.com/googleapis/java-bigquery/issues/2055)) ([9667663](https://github.com/googleapis/java-bigquery/commit/9667663fbec20f262c218f07cce1ada0c9a4bce0))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.12.0 ([#2063](https://github.com/googleapis/java-bigquery/issues/2063)) ([6d3f4be](https://github.com/googleapis/java-bigquery/commit/6d3f4bead2315703015bd75711fcbf19428fad6e))
* update dependency com.google.cloud:google-cloud-storage to v2.7.0 ([#2064](https://github.com/googleapis/java-bigquery/issues/2064)) ([fd47710](https://github.com/googleapis/java-bigquery/commit/fd47710afdf32fd535f8e2b430156eb4a659a64d))
* update dependency com.google.cloud:google-cloud-storage to v2.7.1 ([#2066](https://github.com/googleapis/java-bigquery/issues/2066)) ([89962a5](https://github.com/googleapis/java-bigquery/commit/89962a5e3cec0e5a4334454b1bff83fba3d95d4d))

### [2.11.2](https://github.com/googleapis/java-bigquery/compare/v2.11.1...v2.11.2) (2022-05-18)


### Bug Fixes

* Flaky connenction close issue ([#2044](https://github.com/googleapis/java-bigquery/issues/2044)) ([9993717](https://github.com/googleapis/java-bigquery/commit/9993717d546c4039cb8c846787fdd131cc0c113f))
* NPE issue with testMultipleRuns ([#2050](https://github.com/googleapis/java-bigquery/issues/2050)) ([251d468](https://github.com/googleapis/java-bigquery/commit/251d4686d22e0000982bcd891de68491326558fe))

### [2.11.1](https://github.com/googleapis/java-bigquery/compare/v2.11.0...v2.11.1) (2022-05-16)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220507-1.32.1 ([#2042](https://github.com/googleapis/java-bigquery/issues/2042)) ([081888e](https://github.com/googleapis/java-bigquery/commit/081888e9ab9bc2c68e607fb11ff1ee40ac58873a))

## [2.11.0](https://github.com/googleapis/java-bigquery/compare/v2.10.10...v2.11.0) (2022-05-10)


### Features

* add Connection interface ([#1374](https://github.com/googleapis/java-bigquery/issues/1374)) ([3804275](https://github.com/googleapis/java-bigquery/commit/380427511b33938209241f3800bff05914957f2b))
* next release from main branch is 2.10.9 ([#1996](https://github.com/googleapis/java-bigquery/issues/1996)) ([f716427](https://github.com/googleapis/java-bigquery/commit/f716427490d4b87573669ab4338335c0844e82c0))


### Bug Fixes

* add native image configuration for Arrow ([#2018](https://github.com/googleapis/java-bigquery/issues/2018)) ([06cbe69](https://github.com/googleapis/java-bigquery/commit/06cbe69112e3e0d31e4fb90e43dca6e6dc4f1bdf))
* fix for flaky connection close issue ([#2034](https://github.com/googleapis/java-bigquery/issues/2034)) ([db3daac](https://github.com/googleapis/java-bigquery/commit/db3daacea8a91ab80b7e923f1480874b01cbad0c))


### Documentation

* **sample:** remove unused dependency and add setup instructions ([#2010](https://github.com/googleapis/java-bigquery/issues/2010)) ([e2e9113](https://github.com/googleapis/java-bigquery/commit/e2e91133718d41349a94b5d93d66699e84233e64))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220422-1.32.1 ([#2017](https://github.com/googleapis/java-bigquery/issues/2017)) ([b9fa786](https://github.com/googleapis/java-bigquery/commit/b9fa786ad1bca2fb763a146fa3bb431ff6860153))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220429-1.32.1 ([#2020](https://github.com/googleapis/java-bigquery/issues/2020)) ([78789a5](https://github.com/googleapis/java-bigquery/commit/78789a5530679349dbee691bd1907ffaefc617a6))

### [2.10.10](https://github.com/googleapis/java-bigquery/compare/v2.10.9...v2.10.10) (2022-04-18)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.6.2 ([#1990](https://github.com/googleapis/java-bigquery/issues/1990)) ([4c1cb4c](https://github.com/googleapis/java-bigquery/commit/4c1cb4c13214556b706f1ff8c50a46f881bf2724))
* update dependency com.google.cloud:google-cloud-storage to v2.6.1 ([#1991](https://github.com/googleapis/java-bigquery/issues/1991)) ([e02bf31](https://github.com/googleapis/java-bigquery/commit/e02bf315737dba50741c1346af8bde6871cb857a))

### [2.10.9](https://github.com/googleapis/java-bigquery/compare/v2.10.8...v2.10.9) (2022-04-16)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.10.0 ([#1983](https://github.com/googleapis/java-bigquery/issues/1983)) ([50ac31c](https://github.com/googleapis/java-bigquery/commit/50ac31c598ae8c5aa4e1f6dcde80da704db904a5))
* update dependency com.google.cloud:native-image-support to v0.13.1 ([#1982](https://github.com/googleapis/java-bigquery/issues/1982)) ([04f4679](https://github.com/googleapis/java-bigquery/commit/04f4679fe376e726b21e313115bfd48adc6cbe6b))

### [2.10.8](https://github.com/googleapis/java-bigquery/compare/v2.10.7...v2.10.8) (2022-04-14)


### Dependencies

* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.33.3 ([#1977](https://github.com/googleapis/java-bigquery/issues/1977)) ([b084791](https://github.com/googleapis/java-bigquery/commit/b08479180e212bccae166f3a675d46fb658d3ce8))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.33.3 ([#1978](https://github.com/googleapis/java-bigquery/issues/1978)) ([a24ce6e](https://github.com/googleapis/java-bigquery/commit/a24ce6ead65f3fceff6573e24c10c324650d907b))

### [2.10.7](https://github.com/googleapis/java-bigquery/compare/v2.10.6...v2.10.7) (2022-04-08)


### Dependencies

* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.33.2 ([#1969](https://github.com/googleapis/java-bigquery/issues/1969)) ([f1c4b84](https://github.com/googleapis/java-bigquery/commit/f1c4b847a271a86bba7f123945515c721c3b9ae1))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.33.2 ([#1970](https://github.com/googleapis/java-bigquery/issues/1970)) ([22fede5](https://github.com/googleapis/java-bigquery/commit/22fede57884f42001b3af91d5152a4da981d4fbc))

### [2.10.6](https://github.com/googleapis/java-bigquery/compare/v2.10.5...v2.10.6) (2022-04-07)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220326-1.32.1 ([#1964](https://github.com/googleapis/java-bigquery/issues/1964)) ([4ff65d6](https://github.com/googleapis/java-bigquery/commit/4ff65d6147c4dc4472a8adfb1840a1d5a3e5a044))

### [2.10.5](https://github.com/googleapis/java-bigquery/compare/v2.10.4...v2.10.5) (2022-03-31)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220322-1.32.1 ([#1951](https://github.com/googleapis/java-bigquery/issues/1951)) ([17ba20c](https://github.com/googleapis/java-bigquery/commit/17ba20c5e243327475c447ff180b9b2eef3f2b79))
* update dependency com.google.cloud:google-cloud-bigtable to v2.6.1 ([#1952](https://github.com/googleapis/java-bigquery/issues/1952)) ([78a6ead](https://github.com/googleapis/java-bigquery/commit/78a6ead8882036da5abc41a3c442e76c2a30265f))
* update dependency com.google.cloud:google-cloud-storage to v2.6.0 ([#1956](https://github.com/googleapis/java-bigquery/issues/1956)) ([ee9dfce](https://github.com/googleapis/java-bigquery/commit/ee9dfce867900d9eba696aee3ca7bc09e68eccd4))

### [2.10.4](https://github.com/googleapis/java-bigquery/compare/v2.10.3...v2.10.4) (2022-03-29)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.9.0 ([#1945](https://github.com/googleapis/java-bigquery/issues/1945)) ([e6a6502](https://github.com/googleapis/java-bigquery/commit/e6a65024498d5c44000fb982953d063710b7c1d5))
* update dependency com.google.cloud:google-cloud-storage to v2.5.1 ([#1943](https://github.com/googleapis/java-bigquery/issues/1943)) ([c845e80](https://github.com/googleapis/java-bigquery/commit/c845e802a91bb22918913c3fd501eb80b8eb3c4c))
* update dependency com.google.cloud:native-image-support to v0.12.11 ([#1944](https://github.com/googleapis/java-bigquery/issues/1944)) ([fd54a96](https://github.com/googleapis/java-bigquery/commit/fd54a96f8ccdf7876d914d338cbb2ec7b6cc310a))
* update jmh.version to v1.35 ([#1938](https://github.com/googleapis/java-bigquery/issues/1938)) ([77b9a20](https://github.com/googleapis/java-bigquery/commit/77b9a20d2aff95a49e6e1e56a50442e3eb04bf3c))

### [2.10.3](https://github.com/googleapis/java-bigquery/compare/v2.10.2...v2.10.3) (2022-03-28)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.5.0 ([#1936](https://github.com/googleapis/java-bigquery/issues/1936)) ([57e6807](https://github.com/googleapis/java-bigquery/commit/57e680724a1f6717b183ef48ce039600a6c90b9a))

### [2.10.2](https://github.com/googleapis/java-bigquery/compare/v2.10.1...v2.10.2) (2022-03-24)


### Dependencies

* update dependency org.graalvm.buildtools:junit-platform-native to v0.9.11 ([#1931](https://github.com/googleapis/java-bigquery/issues/1931)) ([d6af865](https://github.com/googleapis/java-bigquery/commit/d6af865bcccbdc3294d2c9442272f2f02bad3f8f))
* update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.11 ([#1932](https://github.com/googleapis/java-bigquery/issues/1932)) ([bc444b2](https://github.com/googleapis/java-bigquery/commit/bc444b2cad99b8185a37a226abd2d315c95c6568))

### [2.10.1](https://github.com/googleapis/java-bigquery/compare/v2.10.0...v2.10.1) (2022-03-21)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220313-1.32.1 ([#1925](https://github.com/googleapis/java-bigquery/issues/1925)) ([0e88b93](https://github.com/googleapis/java-bigquery/commit/0e88b930ef4d2581e0d44ba31a0d4b6a05f6cc53))

## [2.10.0](https://github.com/googleapis/java-bigquery/compare/v2.9.4...v2.10.0) (2022-03-14)


### Features

* set Table.Schema for permanent external tables ([#1701](https://github.com/googleapis/java-bigquery/issues/1701)) ([73e829b](https://github.com/googleapis/java-bigquery/commit/73e829bad373279b13fb59a56b1dc60eac0835a0))


### Documentation

* **sample:** Added AuthorizeDataset Sample ([#1909](https://github.com/googleapis/java-bigquery/issues/1909)) ([a7a196b](https://github.com/googleapis/java-bigquery/commit/a7a196b4ea9cab28448bafe0fdc64f5e3de0412f))
* **samples:** fix undeleteTable sample IT failure ([#1912](https://github.com/googleapis/java-bigquery/issues/1912)) ([7802f16](https://github.com/googleapis/java-bigquery/commit/7802f16fb24bf29ab93139d8404d4b3c4d80b506)), closes [#1911](https://github.com/googleapis/java-bigquery/issues/1911)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220307-1.32.1 ([#1921](https://github.com/googleapis/java-bigquery/issues/1921)) ([fcad209](https://github.com/googleapis/java-bigquery/commit/fcad2091f9a24d667ceefc5a6d9aa57542bed702))
* update dependency com.google.cloud:google-cloud-storage to v2.4.5 ([#1906](https://github.com/googleapis/java-bigquery/issues/1906)) ([d35d689](https://github.com/googleapis/java-bigquery/commit/d35d68963bc6a668d7177ac47d09b65dbefb9b7b))
* update dependency com.google.cloud:native-image-support to v0.12.10 ([#1919](https://github.com/googleapis/java-bigquery/issues/1919)) ([a59ccf5](https://github.com/googleapis/java-bigquery/commit/a59ccf59c5fb1389fc5c5ed42ec8c41182f2e59d))
* update dependency com.google.cloud:native-image-support to v0.12.8 ([#1907](https://github.com/googleapis/java-bigquery/issues/1907)) ([fddf593](https://github.com/googleapis/java-bigquery/commit/fddf59346e9635b5f10f94803ca87933337dc337))
* update dependency com.google.cloud:native-image-support to v0.12.9 ([#1913](https://github.com/googleapis/java-bigquery/issues/1913)) ([830dd50](https://github.com/googleapis/java-bigquery/commit/830dd50ffaf62b398a1325df44e4c92cd0a6ae1b))

### [2.9.4](https://github.com/googleapis/java-bigquery/compare/v2.9.3...v2.9.4) (2022-03-08)


### Dependencies

* update dependency com.google.cloud:native-image-support to v0.12.7 ([#1896](https://github.com/googleapis/java-bigquery/issues/1896)) ([5dcb02b](https://github.com/googleapis/java-bigquery/commit/5dcb02b04f9a87ba39e7cfa72229318926262029))

### [2.9.3](https://github.com/googleapis/java-bigquery/compare/v2.9.2...v2.9.3) (2022-03-08)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.6.0 ([#1892](https://github.com/googleapis/java-bigquery/issues/1892)) ([ce06adb](https://github.com/googleapis/java-bigquery/commit/ce06adb5f95704309eaf0ab4b49d2bdb4ceaeb98))

### [2.9.2](https://github.com/googleapis/java-bigquery/compare/v2.9.1...v2.9.2) (2022-03-07)


### Bug Fixes

* add missing equality check for targetTypes in DatasetAclEntity ([#1866](https://github.com/googleapis/java-bigquery/issues/1866)) ([ca28e2d](https://github.com/googleapis/java-bigquery/commit/ca28e2d68901b6c9332f97c7985aaca7f4486e29))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220222-1.32.1 ([#1888](https://github.com/googleapis/java-bigquery/issues/1888)) ([c8eb867](https://github.com/googleapis/java-bigquery/commit/c8eb8671e53759e786955dd44fae4867632237e4))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220226-1.32.1 ([#1890](https://github.com/googleapis/java-bigquery/issues/1890)) ([c8c5643](https://github.com/googleapis/java-bigquery/commit/c8c5643d0552f9f28a684514cd192f985e0d711c))

### [2.9.1](https://github.com/googleapis/java-bigquery/compare/v2.9.0...v2.9.1) (2022-03-03)


### Bug Fixes

* adjusting retry logic to avoid retrying successful job creation ([#1879](https://github.com/googleapis/java-bigquery/issues/1879)) ([fd07533](https://github.com/googleapis/java-bigquery/commit/fd0753338e15965347683345b0e51838baf5d9f6))
* **java:** add additional configurations to fix native image tests ([#1859](https://github.com/googleapis/java-bigquery/issues/1859)) ([3e82960](https://github.com/googleapis/java-bigquery/commit/3e82960f75ced489f9f0e72fe45165ab866f1d8b))


### Documentation

* **sample:** Table exists sample fix ([#1868](https://github.com/googleapis/java-bigquery/issues/1868)) ([698306e](https://github.com/googleapis/java-bigquery/commit/698306e480b5f3a180c62b6d9ae0d919e05154d3))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220220-1.32.1 ([#1872](https://github.com/googleapis/java-bigquery/issues/1872)) ([e67cf65](https://github.com/googleapis/java-bigquery/commit/e67cf65bc044d07ba386f98cf67d2e16144255d0))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.8.0 ([#1876](https://github.com/googleapis/java-bigquery/issues/1876)) ([a16985f](https://github.com/googleapis/java-bigquery/commit/a16985f79f5e09ee6567caf3eb502d7e88103f97))
* update dependency com.google.cloud:google-cloud-storage to v2.4.2 ([#1853](https://github.com/googleapis/java-bigquery/issues/1853)) ([ef91109](https://github.com/googleapis/java-bigquery/commit/ef91109821a702a6b55b4f1265e812578ca881d8))
* update dependency com.google.cloud:google-cloud-storage to v2.4.4 ([#1873](https://github.com/googleapis/java-bigquery/issues/1873)) ([a4deb16](https://github.com/googleapis/java-bigquery/commit/a4deb16ed54edf51608f27b47b0846fb23c553fd))
* update dependency com.google.cloud:native-image-support to v0.12.4 ([#1855](https://github.com/googleapis/java-bigquery/issues/1855)) ([376738d](https://github.com/googleapis/java-bigquery/commit/376738d5fb7253de6e2e9d574aa99e9d7a9e67ad))
* update dependency com.google.cloud:native-image-support to v0.12.5 ([#1874](https://github.com/googleapis/java-bigquery/issues/1874)) ([c68c49a](https://github.com/googleapis/java-bigquery/commit/c68c49a26abdcce8468b5e848cf39c458aba4774))
* update dependency com.google.cloud:native-image-support to v0.12.6 ([#1878](https://github.com/googleapis/java-bigquery/issues/1878)) ([3749921](https://github.com/googleapis/java-bigquery/commit/3749921d6d120ffd79941c9ede64822cea03f1cd))
* update dependency com.google.code.gson:gson to v2.9.0 ([#1850](https://github.com/googleapis/java-bigquery/issues/1850)) ([627da62](https://github.com/googleapis/java-bigquery/commit/627da62bd02314c673c345bd8eb87e973a805bc7))
* update dependency org.graalvm.buildtools:junit-platform-native to v0.9.10 ([#1860](https://github.com/googleapis/java-bigquery/issues/1860)) ([b31b44c](https://github.com/googleapis/java-bigquery/commit/b31b44c170b1bc948daaae1a9ae6c469370f986c))
* update dependency org.graalvm.buildtools:native-maven-plugin to v0.9.10 ([#1861](https://github.com/googleapis/java-bigquery/issues/1861)) ([ae05dfe](https://github.com/googleapis/java-bigquery/commit/ae05dfed0e670826f7674dc092b91bd5f634bf97))

## [2.9.0](https://github.com/googleapis/java-bigquery/compare/v2.8.0...v2.9.0) (2022-02-11)


### Features

* add Interval type support ([#1844](https://github.com/googleapis/java-bigquery/issues/1844)) ([fd3751a](https://github.com/googleapis/java-bigquery/commit/fd3751a44be8f6401ea4b13684f862177ee9e976))


### Documentation

* **sample:** Add sample for native image support in Bigquery ([#1829](https://github.com/googleapis/java-bigquery/issues/1829)) ([7bb6c79](https://github.com/googleapis/java-bigquery/commit/7bb6c79e4839f183dda021ddf81a3961efd752d6))


### Dependencies

* update actions/github-script action to v6 ([#1847](https://github.com/googleapis/java-bigquery/issues/1847)) ([7ffe963](https://github.com/googleapis/java-bigquery/commit/7ffe963043ae8b243f1e351a5fffd992f3fcbbb5))
* update dependency com.google.cloud:google-cloud-bigtable to v2.5.3 ([#1840](https://github.com/googleapis/java-bigquery/issues/1840)) ([88fc05f](https://github.com/googleapis/java-bigquery/commit/88fc05f3233e4e3a9cdfa73eff9856e4fd6fb1c7))
* update dependency com.google.cloud:google-cloud-storage to v2.4.0 ([#1828](https://github.com/googleapis/java-bigquery/issues/1828)) ([d628fff](https://github.com/googleapis/java-bigquery/commit/d628fff9b899e13c75aaf26d42bfc553c48a3c4e))
* update dependency com.google.cloud:google-cloud-storage to v2.4.1 ([#1839](https://github.com/googleapis/java-bigquery/issues/1839)) ([e8ebd5c](https://github.com/googleapis/java-bigquery/commit/e8ebd5c2ed29f26aa004e1bdf59ab2e7afb2963c))
* update dependency com.google.cloud:native-image-support to v0.12.0 ([#1832](https://github.com/googleapis/java-bigquery/issues/1832)) ([1d27b30](https://github.com/googleapis/java-bigquery/commit/1d27b309e2fa6cdc99fc08234390a065d7ca1098))
* update dependency com.google.cloud:native-image-support to v0.12.1 ([#1841](https://github.com/googleapis/java-bigquery/issues/1841)) ([15918a1](https://github.com/googleapis/java-bigquery/commit/15918a1fa006734ee265ccc569facb8958a1d0bb))
* update dependency com.google.cloud:native-image-support to v0.12.2 ([#1843](https://github.com/googleapis/java-bigquery/issues/1843)) ([56e6acf](https://github.com/googleapis/java-bigquery/commit/56e6acf4def66c4c298fa7bb6b38025db9faee68))
* update dependency com.google.cloud:native-image-support to v0.12.3 ([#1845](https://github.com/googleapis/java-bigquery/issues/1845)) ([b64b441](https://github.com/googleapis/java-bigquery/commit/b64b441bf4d0e79434e556f1fdb9ec0083d5baec))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.33.1 ([#1835](https://github.com/googleapis/java-bigquery/issues/1835)) ([7680714](https://github.com/googleapis/java-bigquery/commit/7680714f4a2d0da798ec3ea613701251cba859ff))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.33.1 ([#1836](https://github.com/googleapis/java-bigquery/issues/1836)) ([950f3cd](https://github.com/googleapis/java-bigquery/commit/950f3cdb3be2571f0519848aa167e67949e06f1e))

## [2.8.0](https://github.com/googleapis/java-bigquery/compare/v2.7.1...v2.8.0) (2022-02-02)


### Features

* add Dataset ACL support ([#1763](https://github.com/googleapis/java-bigquery/issues/1763)) ([18a11e8](https://github.com/googleapis/java-bigquery/commit/18a11e88c0be5c0d5cf89d498439d5f8347e589d))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20220123-1.32.1 ([#1819](https://github.com/googleapis/java-bigquery/issues/1819)) ([82175f1](https://github.com/googleapis/java-bigquery/commit/82175f19634550f8b16c830362798396cd28e79d))
* update dependency com.google.cloud:google-cloud-bigtable to v2.5.2 ([#1821](https://github.com/googleapis/java-bigquery/issues/1821)) ([0fe0a78](https://github.com/googleapis/java-bigquery/commit/0fe0a78db110794f9d2797bd74792d361acef96c))

### [2.7.1](https://github.com/googleapis/java-bigquery/compare/v2.7.0...v2.7.1) (2022-02-01)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.7.0 ([#1813](https://github.com/googleapis/java-bigquery/issues/1813)) ([f2cfc8b](https://github.com/googleapis/java-bigquery/commit/f2cfc8bc5f97359a69ac3647919670bd714ac953))


### Documentation

* **samples:** fix CopyMultipleTables sample IT failure and improve a few other samples ([#1817](https://github.com/googleapis/java-bigquery/issues/1817)) ([e12122c](https://github.com/googleapis/java-bigquery/commit/e12122c4472ed4c3d00fc8c7515be210bbf68df3))
* **samples:** fix GrantViewAccess sample IT failure ([#1816](https://github.com/googleapis/java-bigquery/issues/1816)) ([d48ae41](https://github.com/googleapis/java-bigquery/commit/d48ae41d1437bd9246d973a9f0b56f230a1eea68))

## [2.7.0](https://github.com/googleapis/java-bigquery/compare/v2.6.2...v2.7.0) (2022-01-27)


### Features

* add JSON type support ([#1799](https://github.com/googleapis/java-bigquery/issues/1799)) ([73c4a73](https://github.com/googleapis/java-bigquery/commit/73c4a7330b717416fb0c9ce21215460f25faa930))


### Dependencies

* **java:** update actions/github-script action to v5 ([#1339](https://github.com/googleapis/java-bigquery/issues/1339)) ([#1809](https://github.com/googleapis/java-bigquery/issues/1809)) ([90afea5](https://github.com/googleapis/java-bigquery/commit/90afea5d50218c89d350fbb572072f2d75710072))
* update actions/github-script action to v5 ([#1808](https://github.com/googleapis/java-bigquery/issues/1808)) ([8e5f585](https://github.com/googleapis/java-bigquery/commit/8e5f58552e83abf309e314bddbfdc9ab3527181e))
* update dependency com.google.cloud:google-cloud-storage to v2.3.0 ([#1796](https://github.com/googleapis/java-bigquery/issues/1796)) ([8b77d9b](https://github.com/googleapis/java-bigquery/commit/8b77d9b207b96dcbb4afc2e8f06fb9c147ce6a90))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.33.0 ([#1802](https://github.com/googleapis/java-bigquery/issues/1802)) ([c78fc77](https://github.com/googleapis/java-bigquery/commit/c78fc775fb5278e7925a1d473d40e3a801eb4acf))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.33.0 ([#1803](https://github.com/googleapis/java-bigquery/issues/1803)) ([8e34e59](https://github.com/googleapis/java-bigquery/commit/8e34e59f13d289bcc9ea42d954c16db9eed1a423))
* update dependency org.assertj:assertj-core to v3 ([#1786](https://github.com/googleapis/java-bigquery/issues/1786)) ([69fcabf](https://github.com/googleapis/java-bigquery/commit/69fcabf478c6fab23c4da3fcc516f820cc178a5b))

### [2.6.2](https://www.github.com/googleapis/java-bigquery/compare/v2.6.1...v2.6.2) (2022-01-09)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.5.1 ([#1780](https://www.github.com/googleapis/java-bigquery/issues/1780)) ([60c4c44](https://www.github.com/googleapis/java-bigquery/commit/60c4c4470d77467f68e876c6d841df1f4e98dc20))
* update dependency com.google.cloud:google-cloud-storage to v2.2.3 ([#1779](https://www.github.com/googleapis/java-bigquery/issues/1779)) ([925d22f](https://www.github.com/googleapis/java-bigquery/commit/925d22f8e142d7d19d40d229147e777c94b2c293))

### [2.6.1](https://www.github.com/googleapis/java-bigquery/compare/v2.6.0...v2.6.1) (2022-01-07)


### Bug Fixes

* **java:** Pass missing integration test flags to native image test commands ([#1309](https://www.github.com/googleapis/java-bigquery/issues/1309)) ([#1766](https://www.github.com/googleapis/java-bigquery/issues/1766)) ([5363981](https://www.github.com/googleapis/java-bigquery/commit/536398115b5567f09b32de00f64f712ce811ae6c))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.5.0 ([#1770](https://www.github.com/googleapis/java-bigquery/issues/1770)) ([d4ae6e7](https://www.github.com/googleapis/java-bigquery/commit/d4ae6e720c5f38bdf71e1bb1ecf949d3a3a5747a))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.6.0 ([#1774](https://www.github.com/googleapis/java-bigquery/issues/1774)) ([53db89d](https://www.github.com/googleapis/java-bigquery/commit/53db89d6d20aa29480b1583393c28749875001f5))

## [2.6.0](https://www.github.com/googleapis/java-bigquery/compare/v2.5.1...v2.6.0) (2021-12-27)


### Features

* create Job retry for rate limit exceeded with status code 200 ([#1744](https://www.github.com/googleapis/java-bigquery/issues/1744)) ([97a61dc](https://www.github.com/googleapis/java-bigquery/commit/97a61dc90fb701986a51a12c9c83b7138894307a))


### Bug Fixes

* **java:** add -ntp flag to native image testing command ([#1299](https://www.github.com/googleapis/java-bigquery/issues/1299)) ([#1738](https://www.github.com/googleapis/java-bigquery/issues/1738)) ([585875e](https://www.github.com/googleapis/java-bigquery/commit/585875e776e17660c58f9f8fe8385f13833bca57))


### Documentation

* rename alter materialized view to update ([#1754](https://www.github.com/googleapis/java-bigquery/issues/1754)) ([0b7d911](https://www.github.com/googleapis/java-bigquery/commit/0b7d91135222505f0eb01e8b40095156a073b62e))
* **samples:** update UpdateTableExpirationIT to fix failing IT. ([#1753](https://www.github.com/googleapis/java-bigquery/issues/1753)) ([a62a9f4](https://www.github.com/googleapis/java-bigquery/commit/a62a9f4fdda465b8c9e2f67f111d1b1b4a067903))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20211129-1.32.1 ([#1737](https://www.github.com/googleapis/java-bigquery/issues/1737)) ([776ff10](https://www.github.com/googleapis/java-bigquery/commit/776ff1004592f62799ff0244a448d6911bcca5be))
* update dependency com.google.cloud:google-cloud-bigtable to v2.3.1 ([#1741](https://www.github.com/googleapis/java-bigquery/issues/1741)) ([2f31a0a](https://www.github.com/googleapis/java-bigquery/commit/2f31a0a4f491eca25cbd3992e48f94214bfd605b))
* update dependency com.google.cloud:google-cloud-bigtable to v2.4.0 ([#1746](https://www.github.com/googleapis/java-bigquery/issues/1746)) ([92e5d02](https://www.github.com/googleapis/java-bigquery/commit/92e5d02ff25511233b15f07844bb8b13de2dc72f))
* update dependency com.google.cloud:google-cloud-storage to v2.2.2 ([#1740](https://www.github.com/googleapis/java-bigquery/issues/1740)) ([2022301](https://www.github.com/googleapis/java-bigquery/commit/2022301b39390f20796b8c5b3d6ee0e82aa127aa))
* update jmh.version to v1.34 ([#1758](https://www.github.com/googleapis/java-bigquery/issues/1758)) ([5a2bcbc](https://www.github.com/googleapis/java-bigquery/commit/5a2bcbc7197fa75a464ed62d3e3df3bd43652b9d))

### [2.5.1](https://www.github.com/googleapis/java-bigquery/compare/v2.5.0...v2.5.1) (2021-12-03)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.3.0 ([#1730](https://www.github.com/googleapis/java-bigquery/issues/1730)) ([6d503e8](https://www.github.com/googleapis/java-bigquery/commit/6d503e887d44d76a10fee6c9eaad69ae926b2489))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.5.1 ([#1731](https://www.github.com/googleapis/java-bigquery/issues/1731)) ([3b4b075](https://www.github.com/googleapis/java-bigquery/commit/3b4b0755eea06f8d1e5c290fc9aae500676e7213))

## [2.5.0](https://www.github.com/googleapis/java-bigquery/compare/v2.4.1...v2.5.0) (2021-12-01)


### Features

* add support for BI Engine Statistics ([#1723](https://www.github.com/googleapis/java-bigquery/issues/1723)) ([13cc6e6](https://www.github.com/googleapis/java-bigquery/commit/13cc6e608fd501067f7c5dcd2f5b9a03c078b065))

### [2.4.1](https://www.github.com/googleapis/java-bigquery/compare/v2.4.0...v2.4.1) (2021-11-16)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.2.1 ([#1709](https://www.github.com/googleapis/java-bigquery/issues/1709)) ([3e6ac61](https://www.github.com/googleapis/java-bigquery/commit/3e6ac614a92b492407a920601781ed654b8523c6))

## [2.4.0](https://www.github.com/googleapis/java-bigquery/compare/v2.3.3...v2.4.0) (2021-11-15)


### Features

* induce minor version bump for lts ([#1688](https://www.github.com/googleapis/java-bigquery/issues/1688)) ([6cb11db](https://www.github.com/googleapis/java-bigquery/commit/6cb11db5f15e7d617bc5aa4a3ac5fdacbe515b77))


### Bug Fixes

* **java:** java 17 dependency arguments ([#1683](https://www.github.com/googleapis/java-bigquery/issues/1683)) ([bef2705](https://www.github.com/googleapis/java-bigquery/commit/bef2705208abfc837d16f01758c802d817420dd4))
* removing a new line character in a property ([#1700](https://www.github.com/googleapis/java-bigquery/issues/1700)) ([5185801](https://www.github.com/googleapis/java-bigquery/commit/5185801797c620dba9de7e72b7dea8ddc600ed58))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20211106-1.32.1 ([#1703](https://www.github.com/googleapis/java-bigquery/issues/1703)) ([8987086](https://www.github.com/googleapis/java-bigquery/commit/8987086469ff3ce6320332353744b0adfbb2aefd))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.5.0 ([#1702](https://www.github.com/googleapis/java-bigquery/issues/1702)) ([33ab54f](https://www.github.com/googleapis/java-bigquery/commit/33ab54f1559f903ec78f6d568c0aee666b2ad804))
* update dependency com.google.cloud:google-cloud-storage to v2.2.0 ([#1691](https://www.github.com/googleapis/java-bigquery/issues/1691)) ([1f46d8d](https://www.github.com/googleapis/java-bigquery/commit/1f46d8dd316f1c8df392f749428986d4d9c7fa07))

### [2.3.3](https://www.github.com/googleapis/java-bigquery/compare/v2.3.2...v2.3.3) (2021-10-25)


### Bug Fixes

* allow retry on connection establishing exceptions ([#1666](https://www.github.com/googleapis/java-bigquery/issues/1666)) ([fd06ad2](https://www.github.com/googleapis/java-bigquery/commit/fd06ad2728e52eac2e8570b0ba15830ad79470ad))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20211017-1.32.1 ([#1679](https://www.github.com/googleapis/java-bigquery/issues/1679)) ([5e46e5c](https://www.github.com/googleapis/java-bigquery/commit/5e46e5c59f58efb996364edb394b149f4ead8428))

### [2.3.2](https://www.github.com/googleapis/java-bigquery/compare/v2.3.1...v2.3.2) (2021-10-20)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.2.0 ([#1667](https://www.github.com/googleapis/java-bigquery/issues/1667)) ([201852f](https://www.github.com/googleapis/java-bigquery/commit/201852fa3f9947da54bf4c4ec79d1b2630d76f2f))

### [2.3.1](https://www.github.com/googleapis/java-bigquery/compare/v2.3.0...v2.3.1) (2021-10-19)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.4.0 ([#1661](https://www.github.com/googleapis/java-bigquery/issues/1661)) ([a499bbc](https://www.github.com/googleapis/java-bigquery/commit/a499bbc526da6a2e7f289ba2a86d9d206659d88c))
* update dependency com.google.cloud:google-cloud-storage to v2.1.9 ([#1659](https://www.github.com/googleapis/java-bigquery/issues/1659)) ([16c2d22](https://www.github.com/googleapis/java-bigquery/commit/16c2d22550812e908f19969c27bcaf9dd5f861e1))

## [2.3.0](https://www.github.com/googleapis/java-bigquery/compare/v2.2.1...v2.3.0) (2021-10-15)


### Features

* add session support ([#1652](https://www.github.com/googleapis/java-bigquery/issues/1652)) ([acc6cb8](https://www.github.com/googleapis/java-bigquery/commit/acc6cb8ad318ae41a9a3a00a5942025c14cbe681))


### Bug Fixes

* fix timestamp rounding issue ([#1645](https://www.github.com/googleapis/java-bigquery/issues/1645)) ([e60bdff](https://www.github.com/googleapis/java-bigquery/commit/e60bdff9e196a618a59a0544ec93f87b2ec5fc82))

### [2.2.1](https://www.github.com/googleapis/java-bigquery/compare/v2.2.0...v2.2.1) (2021-10-05)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210927-1.32.1 ([#1634](https://www.github.com/googleapis/java-bigquery/issues/1634)) ([13f4523](https://www.github.com/googleapis/java-bigquery/commit/13f45230a6f8ef888a6afafc02a270fb012e962f))
* update dependency com.google.cloud:google-cloud-storage to v2.1.7 ([#1635](https://www.github.com/googleapis/java-bigquery/issues/1635)) ([abb64dc](https://www.github.com/googleapis/java-bigquery/commit/abb64dccd569632c2de5cc20b3f8d34642dab98f))

## [2.2.0](https://www.github.com/googleapis/java-bigquery/compare/v2.1.13...v2.2.0) (2021-10-01)


### Features

* add support for AvroOptions ([#1630](https://www.github.com/googleapis/java-bigquery/issues/1630)) ([10c1961](https://www.github.com/googleapis/java-bigquery/commit/10c1961f53ab6ba1b71ead9c51a369bf14389c49))

### [2.1.13](https://www.github.com/googleapis/java-bigquery/compare/v2.1.12...v2.1.13) (2021-09-29)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.1.6 ([#1621](https://www.github.com/googleapis/java-bigquery/issues/1621)) ([dfa15e5](https://www.github.com/googleapis/java-bigquery/commit/dfa15e5ca08a3227f015a389c4c08732178a73e7))

### [2.1.12](https://www.github.com/googleapis/java-bigquery/compare/v2.1.11...v2.1.12) (2021-09-24)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.1.4 ([#1616](https://www.github.com/googleapis/java-bigquery/issues/1616)) ([3e3b1da](https://www.github.com/googleapis/java-bigquery/commit/3e3b1da0f9e4006a83ed824f8ed67a9798219bee))
* update dependency com.google.cloud:google-cloud-storage to v2.1.5 ([#1615](https://www.github.com/googleapis/java-bigquery/issues/1615)) ([00cc068](https://www.github.com/googleapis/java-bigquery/commit/00cc0682b694bcdad927e0ec1770b99896402563))

### [2.1.11](https://www.github.com/googleapis/java-bigquery/compare/v2.1.10...v2.1.11) (2021-09-22)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.1.3 ([#1609](https://www.github.com/googleapis/java-bigquery/issues/1609)) ([6b04f76](https://www.github.com/googleapis/java-bigquery/commit/6b04f769ad5fb2eaa0eec57a5e937b81413c95e3))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.3.0 ([#1610](https://www.github.com/googleapis/java-bigquery/issues/1610)) ([fb3895e](https://www.github.com/googleapis/java-bigquery/commit/fb3895e811cdec46b05f2188cd054788fcb03a1d))

### [2.1.10](https://www.github.com/googleapis/java-bigquery/compare/v2.1.9...v2.1.10) (2021-09-22)


### Bug Fixes

* add retrySetting in logging ([#1604](https://www.github.com/googleapis/java-bigquery/issues/1604)) ([1a96cb0](https://www.github.com/googleapis/java-bigquery/commit/1a96cb076ded8eae8c34962aa00e914ba197b516))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210910-1.32.1 ([#1602](https://www.github.com/googleapis/java-bigquery/issues/1602)) ([1ccac9a](https://www.github.com/googleapis/java-bigquery/commit/1ccac9a6ca891fd160911de524e8227414b29e75))

### [2.1.9](https://www.github.com/googleapis/java-bigquery/compare/v2.1.8...v2.1.9) (2021-09-21)


### Bug Fixes

* do not throw NPE from BigQueryImpl.testIamPermissions ([#1596](https://www.github.com/googleapis/java-bigquery/issues/1596)) ([4251b19](https://www.github.com/googleapis/java-bigquery/commit/4251b19f5b240b907aa5fc6d0cc64026245714cf))


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.1.4 ([#1597](https://www.github.com/googleapis/java-bigquery/issues/1597)) ([354cf7f](https://www.github.com/googleapis/java-bigquery/commit/354cf7f3a8dd8cf24d9a5f7e3377591a13b60863))

### [2.1.8](https://www.github.com/googleapis/java-bigquery/compare/v2.1.7...v2.1.8) (2021-09-16)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210904-1.32.1 ([#1584](https://www.github.com/googleapis/java-bigquery/issues/1584)) ([9b42705](https://www.github.com/googleapis/java-bigquery/commit/9b42705e670e095cfd48b239e814d6608f4748c7))
* update dependency com.google.cloud:google-cloud-bigtable to v2.1.2 ([#1585](https://www.github.com/googleapis/java-bigquery/issues/1585)) ([114d587](https://www.github.com/googleapis/java-bigquery/commit/114d587e4b6bf25df3a33a7d9bfc2d22cb929812))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.1 ([#1586](https://www.github.com/googleapis/java-bigquery/issues/1586)) ([7478903](https://www.github.com/googleapis/java-bigquery/commit/747890305f503a8b8e2406d3c51b4b7e0fae0741))
* update dependency com.google.cloud:google-cloud-storage to v2.1.3 ([#1587](https://www.github.com/googleapis/java-bigquery/issues/1587)) ([f006fd0](https://www.github.com/googleapis/java-bigquery/commit/f006fd02d2966e358d53af7da4a86901ad64e4e9))

### [2.1.7](https://www.github.com/googleapis/java-bigquery/compare/v2.1.6...v2.1.7) (2021-09-07)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210828-1.32.1 ([#1561](https://www.github.com/googleapis/java-bigquery/issues/1561)) ([cd6b3e2](https://www.github.com/googleapis/java-bigquery/commit/cd6b3e2c663e626fd3769813fd50f66a0a3231df))
* update dependency com.google.cloud:google-cloud-storage to v2.1.1 ([#1565](https://www.github.com/googleapis/java-bigquery/issues/1565)) ([b0e5d7a](https://www.github.com/googleapis/java-bigquery/commit/b0e5d7ade8a82680cb02050586b758b83b80632e))

### [2.1.6](https://www.github.com/googleapis/java-bigquery/compare/v2.1.5...v2.1.6) (2021-09-02)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2.1.1 ([#1554](https://www.github.com/googleapis/java-bigquery/issues/1554)) ([a88f662](https://www.github.com/googleapis/java-bigquery/commit/a88f662a1fc1c21f59e5847670dbb3f559e754f2))

### [2.1.5](https://www.github.com/googleapis/java-bigquery/compare/v2.1.4...v2.1.5) (2021-08-31)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210819-1.32.1 ([#1546](https://www.github.com/googleapis/java-bigquery/issues/1546)) ([c00e6b6](https://www.github.com/googleapis/java-bigquery/commit/c00e6b663b983e6ec030323d9da6829416065be5))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.2.0 ([#1549](https://www.github.com/googleapis/java-bigquery/issues/1549)) ([69889f0](https://www.github.com/googleapis/java-bigquery/commit/69889f08b830ea47de66410cc45e9be3248c8154))

### [2.1.4](https://www.github.com/googleapis/java-bigquery/compare/v2.1.3...v2.1.4) (2021-08-25)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v2.1.0 ([#1534](https://www.github.com/googleapis/java-bigquery/issues/1534)) ([d998cf6](https://www.github.com/googleapis/java-bigquery/commit/d998cf65c653eff3322547662b7e88b51ec21c15))

### [2.1.3](https://www.github.com/googleapis/java-bigquery/compare/v2.1.2...v2.1.3) (2021-08-24)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210813-1.32.1 ([#1520](https://www.github.com/googleapis/java-bigquery/issues/1520)) ([da09e53](https://www.github.com/googleapis/java-bigquery/commit/da09e53bbdd18693c182d7945506b0531bb445e4))
* update dependency com.google.cloud:google-cloud-bigtable to v2.0.1 ([#1521](https://www.github.com/googleapis/java-bigquery/issues/1521)) ([11da456](https://www.github.com/googleapis/java-bigquery/commit/11da456eb42f8b86d4ec64d192cd580f9e219aeb))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.1.0 ([#1525](https://www.github.com/googleapis/java-bigquery/issues/1525)) ([cd7e46b](https://www.github.com/googleapis/java-bigquery/commit/cd7e46b6a7e78937a59c0a3aee0c81e51a342ce3))
* update dependency com.google.cloud:google-cloud-storage to v2.0.2 ([#1522](https://www.github.com/googleapis/java-bigquery/issues/1522)) ([6be4f24](https://www.github.com/googleapis/java-bigquery/commit/6be4f2473ecf1b710e7142da27616b374b3cca12))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.32.1 ([#1526](https://www.github.com/googleapis/java-bigquery/issues/1526)) ([c31f18b](https://www.github.com/googleapis/java-bigquery/commit/c31f18b6dc9e02adcf72dc8ae8526d4ab766797c))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.32.1 ([#1527](https://www.github.com/googleapis/java-bigquery/issues/1527)) ([a36fc45](https://www.github.com/googleapis/java-bigquery/commit/a36fc45329b9a73aa6ee1316b2d348276f30d25c))

### [2.1.2](https://www.github.com/googleapis/java-bigquery/compare/v2.1.1...v2.1.2) (2021-08-17)


### Bug Fixes

* add retry logging for BigQueryRetryAlgorithm.java ([#1506](https://www.github.com/googleapis/java-bigquery/issues/1506)) ([f598279](https://www.github.com/googleapis/java-bigquery/commit/f5982794fb5f9c13c3e328efcb8ab852682b4466))

### [2.1.1](https://www.github.com/googleapis/java-bigquery/compare/v2.1.0...v2.1.1) (2021-08-12)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v2.0.1 ([#1503](https://www.github.com/googleapis/java-bigquery/issues/1503)) ([3f6f6ef](https://www.github.com/googleapis/java-bigquery/commit/3f6f6ef4d67b2ef01dac7f5aa2ed2eea862157e8))

## [2.1.0](https://www.github.com/googleapis/java-bigquery/compare/v2.0.1...v2.1.0) (2021-08-11)


### Features

* add support for transactioninfo in query statistics ([#1497](https://www.github.com/googleapis/java-bigquery/issues/1497)) ([4c3b2de](https://www.github.com/googleapis/java-bigquery/commit/4c3b2de16584b9079dd4afd5a33aa8c00bc75f20)), closes [#1467](https://www.github.com/googleapis/java-bigquery/issues/1467)
* Updated `BigQueryRetryAlgorithm` so that it can retry on RateLimit Errors using RegEx ([#1499](https://www.github.com/googleapis/java-bigquery/issues/1499)) ([ec68c11](https://www.github.com/googleapis/java-bigquery/commit/ec68c1145a89753e7d42458bbea86737cad6090f))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v2 ([#1495](https://www.github.com/googleapis/java-bigquery/issues/1495)) ([cf26534](https://www.github.com/googleapis/java-bigquery/commit/cf265347e5e650670d19a1122f69497272854ebe))
* update dependency com.google.cloud:google-cloud-storage to v2 ([#1491](https://www.github.com/googleapis/java-bigquery/issues/1491)) ([b705052](https://www.github.com/googleapis/java-bigquery/commit/b705052475899512c7981d3893b7d630f1488c99))

### [2.0.1](https://www.github.com/googleapis/java-bigquery/compare/v2.0.0...v2.0.1) (2021-08-09)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.118.1 ([#1486](https://www.github.com/googleapis/java-bigquery/issues/1486)) ([3ba6e1f](https://www.github.com/googleapis/java-bigquery/commit/3ba6e1f8548b5518076187a65b214c79195d86ac))
* update jmh.version to v1.33 ([#1487](https://www.github.com/googleapis/java-bigquery/issues/1487)) ([3eedfbe](https://www.github.com/googleapis/java-bigquery/commit/3eedfbe208897c6ee45b480ff81a90a4dba9bdd4))

## [2.0.0](https://www.github.com/googleapis/java-bigquery/compare/v1.137.2...v2.0.0) (2021-08-05)


### ⚠ BREAKING CHANGES

* update dependency com.google.cloud:google-cloud-shared-config to v1 (#1466)

### Features

* update dependency com.google.cloud:google-cloud-shared-config to v1 ([#1466](https://www.github.com/googleapis/java-bigquery/issues/1466)) ([3db013e](https://www.github.com/googleapis/java-bigquery/commit/3db013eeb01f255e1bc40af21370241761f2b519))

### [1.137.2](https://www.github.com/googleapis/java-bigquery/compare/v1.137.1...v1.137.2) (2021-08-05)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210726-1.32.1 ([#1469](https://www.github.com/googleapis/java-bigquery/issues/1469)) ([9df5ac2](https://www.github.com/googleapis/java-bigquery/commit/9df5ac2525e3aa9b52512d59cab0fc8b998f0bc9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v2 ([#1472](https://www.github.com/googleapis/java-bigquery/issues/1472)) ([227983e](https://www.github.com/googleapis/java-bigquery/commit/227983e2c69dfdd5001f9c951f086daadb937578))

### [1.137.1](https://www.github.com/googleapis/java-bigquery/compare/v1.137.0...v1.137.1) (2021-07-20)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.27.3 ([#1452](https://www.github.com/googleapis/java-bigquery/issues/1452)) ([fea5eca](https://www.github.com/googleapis/java-bigquery/commit/fea5eca733d501b72b8713e555f54dc86bbde85f))

## [1.137.0](https://www.github.com/googleapis/java-bigquery/compare/v1.136.0...v1.137.0) (2021-07-14)


### Features

* Implemented BigQueryRetryAlgorithm to retry on the basis of the configured re-triable error messages ([#1426](https://www.github.com/googleapis/java-bigquery/issues/1426)) ([44d9795](https://www.github.com/googleapis/java-bigquery/commit/44d97953febac11c9167efe6781c779f486355d0))


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.118.0 ([#1445](https://www.github.com/googleapis/java-bigquery/issues/1445)) ([271b861](https://www.github.com/googleapis/java-bigquery/commit/271b8612da64e5216ac6dc5a39493b0593b23320))

## [1.136.0](https://www.github.com/googleapis/java-bigquery/compare/v1.135.4...v1.136.0) (2021-07-08)


### Features

* add dmlStatistics support ([#1431](https://www.github.com/googleapis/java-bigquery/issues/1431)) ([9d67e05](https://www.github.com/googleapis/java-bigquery/commit/9d67e05d2a6fab0c9e6017dec33b0d74ad821825))

### [1.135.4](https://www.github.com/googleapis/java-bigquery/compare/v1.135.3...v1.135.4) (2021-07-08)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210617-1.32.1 ([#1425](https://www.github.com/googleapis/java-bigquery/issues/1425)) ([82467ed](https://www.github.com/googleapis/java-bigquery/commit/82467ed4d8435e33a6496663a5dd6ae9377d4212))

### [1.135.3](https://www.github.com/googleapis/java-bigquery/compare/v1.135.2...v1.135.3) (2021-07-02)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.27.1 ([#1414](https://www.github.com/googleapis/java-bigquery/issues/1414)) ([6d6d276](https://www.github.com/googleapis/java-bigquery/commit/6d6d27699cc36984c2138beaf377906f8555d52a))
* update dependency com.google.cloud:google-cloud-bigtable to v1.27.2 ([#1422](https://www.github.com/googleapis/java-bigquery/issues/1422)) ([53c6cf1](https://www.github.com/googleapis/java-bigquery/commit/53c6cf14b96289ff2291a0dec1327e5b98d32910))
* update dependency com.google.cloud:google-cloud-storage to v1.117.1 ([#1417](https://www.github.com/googleapis/java-bigquery/issues/1417)) ([a746a16](https://www.github.com/googleapis/java-bigquery/commit/a746a1647db3b39c8f1bb68d97fb71bc477ad678))

### [1.135.2](https://www.github.com/googleapis/java-bigquery/compare/v1.135.1...v1.135.2) (2021-06-30)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.4.0 ([#1411](https://www.github.com/googleapis/java-bigquery/issues/1411)) ([e626c4a](https://www.github.com/googleapis/java-bigquery/commit/e626c4aec7b7796fe5c888d7f726cd957469b4ad))

### [1.135.1](https://www.github.com/googleapis/java-bigquery/compare/v1.135.0...v1.135.1) (2021-06-29)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.117.0 ([#1403](https://www.github.com/googleapis/java-bigquery/issues/1403)) ([0cfcab0](https://www.github.com/googleapis/java-bigquery/commit/0cfcab02e7d80317b19062937677dbe07d3b3bd5))

## [1.135.0](https://www.github.com/googleapis/java-bigquery/compare/v1.134.1...v1.135.0) (2021-06-28)


### Features

* add support for table snapshot ([#1320](https://www.github.com/googleapis/java-bigquery/issues/1320)) ([d783292](https://www.github.com/googleapis/java-bigquery/commit/d783292f4bd2d971235d8afa6318976856529cb5))

### [1.134.1](https://www.github.com/googleapis/java-bigquery/compare/v1.134.0...v1.134.1) (2021-06-28)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210617-1.31.5 ([#1394](https://www.github.com/googleapis/java-bigquery/issues/1394)) ([580ac64](https://www.github.com/googleapis/java-bigquery/commit/580ac64e98167db7a57ca7e196e792a48822dce1))

## [1.134.0](https://www.github.com/googleapis/java-bigquery/compare/v1.133.1...v1.134.0) (2021-06-25)


### Features

* add support for jobs.delete ([#1387](https://www.github.com/googleapis/java-bigquery/issues/1387)) ([95f1a6c](https://www.github.com/googleapis/java-bigquery/commit/95f1a6c2e3281d61d38660749cf31fa504ddf8e0))
* add support for parameterized type ([#1390](https://www.github.com/googleapis/java-bigquery/issues/1390)) ([b1fb57c](https://www.github.com/googleapis/java-bigquery/commit/b1fb57c0b43f4bdc9e32b821b32e95bb1ca8df3b)), closes [#1309](https://www.github.com/googleapis/java-bigquery/issues/1309)


### Bug Fixes

* bug fix for get method of Bigquery Dataset ([#1379](https://www.github.com/googleapis/java-bigquery/issues/1379)) ([f034a99](https://www.github.com/googleapis/java-bigquery/commit/f034a99806613fc6abb5587c56362fe38d60bebc))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210529-1.31.5 ([#1380](https://www.github.com/googleapis/java-bigquery/issues/1380)) ([4a6906a](https://www.github.com/googleapis/java-bigquery/commit/4a6906aa1e3ac139973823bdf142e5c280f6ab68))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210611-1.31.5 ([#1383](https://www.github.com/googleapis/java-bigquery/issues/1383)) ([b09f951](https://www.github.com/googleapis/java-bigquery/commit/b09f951d9debe783c5f67c3e9479fb640722a8bd))
* update dependency com.google.cloud:google-cloud-bigtable to v1.27.0 ([#1384](https://www.github.com/googleapis/java-bigquery/issues/1384)) ([6c4d886](https://www.github.com/googleapis/java-bigquery/commit/6c4d886a3875eaed5d7c10b82f6c064c1995b6ca))


### Documentation

* **sample:** update UpdateTableExpiration sample ([#1389](https://www.github.com/googleapis/java-bigquery/issues/1389)) ([ac854c4](https://www.github.com/googleapis/java-bigquery/commit/ac854c42fa4339f688c03d121e25df6030eabd3f)), closes [#1371](https://www.github.com/googleapis/java-bigquery/issues/1371)

### [1.133.1](https://www.github.com/googleapis/java-bigquery/compare/v1.133.0...v1.133.1) (2021-06-16)


### Bug Fixes

* handle specific exceptions ([#1370](https://www.github.com/googleapis/java-bigquery/issues/1370)) ([68808e9](https://www.github.com/googleapis/java-bigquery/commit/68808e9f47c07af598324f3f07dd996bc1e5297b))


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.116.0 ([#1375](https://www.github.com/googleapis/java-bigquery/issues/1375)) ([d064b7b](https://www.github.com/googleapis/java-bigquery/commit/d064b7b363508d1a958b92563c5df1d1c429c69d))

## [1.133.0](https://www.github.com/googleapis/java-bigquery/compare/v1.132.1...v1.133.0) (2021-06-08)


### Features

* add support for DecimalTargetTypes ([#1345](https://www.github.com/googleapis/java-bigquery/issues/1345)) ([ba528df](https://www.github.com/googleapis/java-bigquery/commit/ba528df03def71907e2811cf267718f090605d95))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.26.1 ([#1360](https://www.github.com/googleapis/java-bigquery/issues/1360)) ([bf55699](https://www.github.com/googleapis/java-bigquery/commit/bf55699d849de7e873577de04e44fbfe0f078ab1))

### [1.132.1](https://www.github.com/googleapis/java-bigquery/compare/v1.132.0...v1.132.1) (2021-06-07)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210529-1.31.0 ([#1355](https://www.github.com/googleapis/java-bigquery/issues/1355)) ([bc7744e](https://www.github.com/googleapis/java-bigquery/commit/bc7744e5570c2990231a680fb9cda9acebb3d7ca))

## [1.132.0](https://www.github.com/googleapis/java-bigquery/compare/v1.131.1...v1.132.0) (2021-06-04)


### Features

* add `gcf-owl-bot[bot]` to `ignoreAuthors` ([#1331](https://www.github.com/googleapis/java-bigquery/issues/1331)) ([1f19362](https://www.github.com/googleapis/java-bigquery/commit/1f19362ad5527a12e4fadc1df42523857b6e709a))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210518-1.31.0 ([#1341](https://www.github.com/googleapis/java-bigquery/issues/1341)) ([a37a2f5](https://www.github.com/googleapis/java-bigquery/commit/a37a2f5240bb7b0681b8e5e70801d96b4a5675e5))
* update dependency com.google.cloud:google-cloud-bigtable to v1.25.0 ([#1334](https://www.github.com/googleapis/java-bigquery/issues/1334)) ([f7be534](https://www.github.com/googleapis/java-bigquery/commit/f7be534a5a7fb79232bcd3d082365033262f6dcb))
* update dependency com.google.cloud:google-cloud-bigtable to v1.26.0 ([#1347](https://www.github.com/googleapis/java-bigquery/issues/1347)) ([55f3e7b](https://www.github.com/googleapis/java-bigquery/commit/55f3e7b359cc197767e75f026f572110649c2ba7))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.3.0 ([#1348](https://www.github.com/googleapis/java-bigquery/issues/1348)) ([ab41045](https://www.github.com/googleapis/java-bigquery/commit/ab41045628a6735de3223bb22285f0affc269c75))
* update dependency com.google.cloud:google-cloud-storage to v1.115.0 ([#1344](https://www.github.com/googleapis/java-bigquery/issues/1344)) ([0ee09f7](https://www.github.com/googleapis/java-bigquery/commit/0ee09f779c116c000be1cc99c6b1d52a14b33403))
* update jmh.version to v1.32 ([#1340](https://www.github.com/googleapis/java-bigquery/issues/1340)) ([dfaa49e](https://www.github.com/googleapis/java-bigquery/commit/dfaa49e06715198a012385fad4a37160403b54f4))

### [1.131.1](https://www.github.com/googleapis/java-bigquery/compare/v1.131.0...v1.131.1) (2021-05-19)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.2.0 ([#1324](https://www.github.com/googleapis/java-bigquery/issues/1324)) ([dd238db](https://www.github.com/googleapis/java-bigquery/commit/dd238db05664e588aca00e4f10e368d3a574d605))
* update dependency com.google.cloud:google-cloud-storage to v1.114.0 ([#1306](https://www.github.com/googleapis/java-bigquery/issues/1306)) ([a2cb66a](https://www.github.com/googleapis/java-bigquery/commit/a2cb66a60a44748e7aa8d4f4b5386e46191557b7))

## [1.131.0](https://www.github.com/googleapis/java-bigquery/compare/v1.130.0...v1.131.0) (2021-05-18)


### Features

* add ParquetOptions support and expose it in LoadJobConfiguration and ExternalTableDefinition classes ([#1318](https://www.github.com/googleapis/java-bigquery/issues/1318)) ([72b1715](https://www.github.com/googleapis/java-bigquery/commit/72b17151c4f3c4a3d298d3791e58c3112a14b4f5))

## [1.130.0](https://www.github.com/googleapis/java-bigquery/compare/v1.129.0...v1.130.0) (2021-05-15)


### Features

* add support for partitioning and clustering in MaterializedViewDefinition ([#1301](https://www.github.com/googleapis/java-bigquery/issues/1301)) ([b909754](https://www.github.com/googleapis/java-bigquery/commit/b909754b4c828871c8b360d0ddf69cc488b1d33c)), closes [#1300](https://www.github.com/googleapis/java-bigquery/issues/1300)


### Dependencies

* update dependency com.google.api.grpc:proto-google-cloud-datacatalog-v1 to v1.3.3 ([#1296](https://www.github.com/googleapis/java-bigquery/issues/1296)) ([558cb14](https://www.github.com/googleapis/java-bigquery/commit/558cb14a4091c9e44dea766b967ecb78132a46c5))
* update dependency com.google.cloud:google-cloud-bigtable to v1.24.1 ([#1305](https://www.github.com/googleapis/java-bigquery/issues/1305)) ([96363a9](https://www.github.com/googleapis/java-bigquery/commit/96363a969f8ac8ffb3627e8a0da69c030dc9f862))
* update dependency com.google.cloud:google-cloud-datacatalog to v1.3.3 ([#1297](https://www.github.com/googleapis/java-bigquery/issues/1297)) ([c49e697](https://www.github.com/googleapis/java-bigquery/commit/c49e697086f6aaf8271daf799b985b468496c382))
* update jmh.version to v1.31 ([#1303](https://www.github.com/googleapis/java-bigquery/issues/1303)) ([817cf7b](https://www.github.com/googleapis/java-bigquery/commit/817cf7bbecc920e9866cd85f2b1689926933c4da))

## [1.129.0](https://www.github.com/googleapis/java-bigquery/compare/v1.128.3...v1.129.0) (2021-05-11)


### Features

* add support for user defined TVFs ([#1278](https://www.github.com/googleapis/java-bigquery/issues/1278)) ([89958e9](https://www.github.com/googleapis/java-bigquery/commit/89958e9b5e4330b31878aa31b90569d2fd0310f2))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210422-1.31.0 ([#1275](https://www.github.com/googleapis/java-bigquery/issues/1275)) ([acc88c5](https://www.github.com/googleapis/java-bigquery/commit/acc88c5de445d166055825bf51d56a031e642675))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210430-1.31.0 ([#1285](https://www.github.com/googleapis/java-bigquery/issues/1285)) ([e74ae1c](https://www.github.com/googleapis/java-bigquery/commit/e74ae1c180c8ce27c9c8985c1935a894889b6375))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.1.0 ([#1290](https://www.github.com/googleapis/java-bigquery/issues/1290)) ([e60f2cd](https://www.github.com/googleapis/java-bigquery/commit/e60f2cd823b1551e43154f87a5157acca51b346c))
* update jmh.version to v1.30 ([#1281](https://www.github.com/googleapis/java-bigquery/issues/1281)) ([3704a6c](https://www.github.com/googleapis/java-bigquery/commit/3704a6cc46b84ce3b5ba01466ba39333f1b16886))

### [1.128.3](https://www.github.com/googleapis/java-bigquery/compare/v1.128.2...v1.128.3) (2021-04-30)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.24.0 ([#1269](https://www.github.com/googleapis/java-bigquery/issues/1269)) ([f006fa9](https://www.github.com/googleapis/java-bigquery/commit/f006fa9b4e5029c6eaa0440308c33f7c6b963b50))

### [1.128.2](https://www.github.com/googleapis/java-bigquery/compare/v1.128.1...v1.128.2) (2021-04-30)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.23.2 ([#1255](https://www.github.com/googleapis/java-bigquery/issues/1255)) ([bc6075b](https://www.github.com/googleapis/java-bigquery/commit/bc6075b1eefaf9a65fc5f4d27ab8a7b76d499d35))
* update dependency com.google.cloud:google-cloud-storage to v1.113.16 ([#1259](https://www.github.com/googleapis/java-bigquery/issues/1259)) ([8c0b85b](https://www.github.com/googleapis/java-bigquery/commit/8c0b85b5b9a9661b10181587c29e819ee5b6a708))

### [1.128.1](https://www.github.com/googleapis/java-bigquery/compare/v1.128.0...v1.128.1) (2021-04-26)


### Bug Fixes

* release scripts from issuing overlapping phases ([#1241](https://www.github.com/googleapis/java-bigquery/issues/1241)) ([b2bbc90](https://www.github.com/googleapis/java-bigquery/commit/b2bbc90d968573e4e2e7c0785da3b5ae4c1ac0d7))
* typo ([#1236](https://www.github.com/googleapis/java-bigquery/issues/1236)) ([e2e7f90](https://www.github.com/googleapis/java-bigquery/commit/e2e7f900db11c513818339208eee28cccc5aa76f))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210410-1.31.0 ([#1245](https://www.github.com/googleapis/java-bigquery/issues/1245)) ([b00ded9](https://www.github.com/googleapis/java-bigquery/commit/b00ded92dfe553f9cf06624606717729f1103d6b))
* update dependency com.google.cloud:google-cloud-bigtable to v1.23.0 ([#1239](https://www.github.com/googleapis/java-bigquery/issues/1239)) ([18c17ab](https://www.github.com/googleapis/java-bigquery/commit/18c17ab30e893763d4075f40242aceec4c1d14d4))
* update dependency com.google.cloud:google-cloud-bigtable to v1.23.1 ([#1248](https://www.github.com/googleapis/java-bigquery/issues/1248)) ([5306bf1](https://www.github.com/googleapis/java-bigquery/commit/5306bf1cd86c6e6bc71374f1a33dcd54b8bcd578))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.1 ([#1246](https://www.github.com/googleapis/java-bigquery/issues/1246)) ([119a378](https://www.github.com/googleapis/java-bigquery/commit/119a378d6619098b4e123475c2ac7657e26c52e3))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1 ([#1252](https://www.github.com/googleapis/java-bigquery/issues/1252)) ([80e63b4](https://www.github.com/googleapis/java-bigquery/commit/80e63b4bec2eaf3d53f900b8b226c156d095f262))
* update dependency com.google.cloud:google-cloud-storage to v1.113.15 ([#1238](https://www.github.com/googleapis/java-bigquery/issues/1238)) ([6997434](https://www.github.com/googleapis/java-bigquery/commit/69974342628d1718ae79d810f9a89c264f77b878))

## [1.128.0](https://www.github.com/googleapis/java-bigquery/compare/v1.127.12...v1.128.0) (2021-04-09)


### Features

* add support for parameterMode in QueryJobConfiguration to unblock JDBC migration to the Java client library ([#1223](https://www.github.com/googleapis/java-bigquery/issues/1223)) ([3ce4933](https://www.github.com/googleapis/java-bigquery/commit/3ce49334478dc0905cdcb476c739a49d296de922))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210404-1.31.0 ([#1226](https://www.github.com/googleapis/java-bigquery/issues/1226)) ([8ea26fc](https://www.github.com/googleapis/java-bigquery/commit/8ea26fcedf1f34565d287daab388c2a93d7ac6ea))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.21.0 ([#1224](https://www.github.com/googleapis/java-bigquery/issues/1224)) ([d5c5747](https://www.github.com/googleapis/java-bigquery/commit/d5c5747e74d8c2e1ca0901eea0d82fd94460a639))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.31.5 ([#1221](https://www.github.com/googleapis/java-bigquery/issues/1221)) ([f7cdb36](https://www.github.com/googleapis/java-bigquery/commit/f7cdb36c1f9e513e78e390ae5319c70f7c454536))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.31.5 ([#1222](https://www.github.com/googleapis/java-bigquery/issues/1222)) ([0a271cb](https://www.github.com/googleapis/java-bigquery/commit/0a271cb363180a093385ed6c5c68e12c6fde6502))

### [1.127.12](https://www.github.com/googleapis/java-bigquery/compare/v1.127.11...v1.127.12) (2021-04-07)


### Documentation

* **samples:** update querypagination sample ([#1209](https://www.github.com/googleapis/java-bigquery/issues/1209)) ([9b4f3ec](https://www.github.com/googleapis/java-bigquery/commit/9b4f3ecc248fd6fac2b9542b14d6f343bcb8463c))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210327-1.31.0 ([#1214](https://www.github.com/googleapis/java-bigquery/issues/1214)) ([bf5d444](https://www.github.com/googleapis/java-bigquery/commit/bf5d444103f5e6dc3db1751a9e3fd382cf42cb5d))
* update dependency com.google.cloud:google-cloud-bigtable to v1.21.3 ([#1211](https://www.github.com/googleapis/java-bigquery/issues/1211)) ([6b85ab3](https://www.github.com/googleapis/java-bigquery/commit/6b85ab3daddeb490ccb2877a0ce22d1e1c403a07))
* update dependency com.google.cloud:google-cloud-bigtable to v1.22.0 ([#1217](https://www.github.com/googleapis/java-bigquery/issues/1217)) ([503d32b](https://www.github.com/googleapis/java-bigquery/commit/503d32bdaede96207203d79eebbf6964a199b8f8))

### [1.127.11](https://www.github.com/googleapis/java-bigquery/compare/v1.127.10...v1.127.11) (2021-03-25)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.21.2 ([#1195](https://www.github.com/googleapis/java-bigquery/issues/1195)) ([8e3618e](https://www.github.com/googleapis/java-bigquery/commit/8e3618ec69009712c2616a52efdca4eb0dfbc5d8))

### [1.127.10](https://www.github.com/googleapis/java-bigquery/compare/v1.127.9...v1.127.10) (2021-03-19)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210313-1.31.0 ([#1187](https://www.github.com/googleapis/java-bigquery/issues/1187)) ([bba71f2](https://www.github.com/googleapis/java-bigquery/commit/bba71f2f475f6dd8bf2a9d567aaed26377543abe))

### [1.127.9](https://www.github.com/googleapis/java-bigquery/compare/v1.127.8...v1.127.9) (2021-03-17)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.21.1 ([#1181](https://www.github.com/googleapis/java-bigquery/issues/1181)) ([fbbf96a](https://www.github.com/googleapis/java-bigquery/commit/fbbf96aecd3b49adb1d180652eff02a562449cce))
* update dependency com.google.cloud:google-cloud-storage to v1.113.14 ([#1176](https://www.github.com/googleapis/java-bigquery/issues/1176)) ([c84fc5c](https://www.github.com/googleapis/java-bigquery/commit/c84fc5c5f7f9b5d30e0dae921542a53cb20b8f37))

### [1.127.8](https://www.github.com/googleapis/java-bigquery/compare/v1.127.7...v1.127.8) (2021-03-11)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210303-1.31.0 ([#1171](https://www.github.com/googleapis/java-bigquery/issues/1171)) ([ba27951](https://www.github.com/googleapis/java-bigquery/commit/ba27951225418b49635607a7e9a913f6b2328575))

### [1.127.7](https://www.github.com/googleapis/java-bigquery/compare/v1.127.6...v1.127.7) (2021-03-10)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.21.0 ([#1159](https://www.github.com/googleapis/java-bigquery/issues/1159)) ([624cefc](https://www.github.com/googleapis/java-bigquery/commit/624cefc8e658f5fc47c4a29d1dd71a76c46edfa9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.1 ([#1166](https://www.github.com/googleapis/java-bigquery/issues/1166)) ([58e2ddf](https://www.github.com/googleapis/java-bigquery/commit/58e2ddf2250d135a8e16afc98bbed9bb62ba38cf))
* update dependency com.google.cloud:google-cloud-storage to v1.113.13 ([#1164](https://www.github.com/googleapis/java-bigquery/issues/1164)) ([34c6843](https://www.github.com/googleapis/java-bigquery/commit/34c684397cf4ddb1fb2e7b7cac68ef5c12dc8b92))

### [1.127.6](https://www.github.com/googleapis/java-bigquery/compare/v1.127.5...v1.127.6) (2021-03-02)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210219-1.31.0 ([#1149](https://www.github.com/googleapis/java-bigquery/issues/1149)) ([5c7e32f](https://www.github.com/googleapis/java-bigquery/commit/5c7e32f890bb1fa5cc25641f8a73afb775eeb0a8))
* update dependency com.google.cloud:google-cloud-storage to v1.113.12 ([#1153](https://www.github.com/googleapis/java-bigquery/issues/1153)) ([9a058a7](https://www.github.com/googleapis/java-bigquery/commit/9a058a746a27d34829e12e4e3ff4a838560181b1))
* update jmh.version to v1.28 ([#1151](https://www.github.com/googleapis/java-bigquery/issues/1151)) ([4cafa86](https://www.github.com/googleapis/java-bigquery/commit/4cafa863f2bcc1ae36c493c616aea6c699242015))

### [1.127.5](https://www.github.com/googleapis/java-bigquery/compare/v1.127.4...v1.127.5) (2021-02-25)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.20.0 ([#1141](https://www.github.com/googleapis/java-bigquery/issues/1141)) ([b5c90db](https://www.github.com/googleapis/java-bigquery/commit/b5c90db802d19d1d3426cc4228061f7b6aafa28e))

### [1.127.4](https://www.github.com/googleapis/java-bigquery/compare/v1.127.3...v1.127.4) (2021-02-23)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210215-1.31.0 ([#1128](https://www.github.com/googleapis/java-bigquery/issues/1128)) ([b042da7](https://www.github.com/googleapis/java-bigquery/commit/b042da754c99eacf31d37a69fbd39762dc75174b))
* update dependency com.google.cloud:google-cloud-bigtable to v1.20.1 ([#1129](https://www.github.com/googleapis/java-bigquery/issues/1129)) ([8ae422e](https://www.github.com/googleapis/java-bigquery/commit/8ae422eff5d7bae29673cba810b3ab0409175495))
* update dependency com.google.cloud:google-cloud-storage to v1.113.11 ([#1130](https://www.github.com/googleapis/java-bigquery/issues/1130)) ([aadb23f](https://www.github.com/googleapis/java-bigquery/commit/aadb23fb149464289d835f337772393ff282c23a))

### [1.127.3](https://www.github.com/googleapis/java-bigquery/compare/v1.127.2...v1.127.3) (2021-02-19)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.19.0 ([#1122](https://www.github.com/googleapis/java-bigquery/issues/1122)) ([54c5915](https://www.github.com/googleapis/java-bigquery/commit/54c59154e2ee3174ca7dfd2d371e821eff4dc4fc))
* update dependency com.google.cloud:google-cloud-storage to v1.113.10 ([#1119](https://www.github.com/googleapis/java-bigquery/issues/1119)) ([c1ed29f](https://www.github.com/googleapis/java-bigquery/commit/c1ed29fe92df1737688c4e1edfd9a8301fc861c2))

### [1.127.2](https://www.github.com/googleapis/java-bigquery/compare/v1.127.1...v1.127.2) (2021-02-15)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210204-1.31.0 ([#1109](https://www.github.com/googleapis/java-bigquery/issues/1109)) ([fbc11d7](https://www.github.com/googleapis/java-bigquery/commit/fbc11d70f1ca824b3e1359426c972c38fd2a3b76))

### [1.127.1](https://www.github.com/googleapis/java-bigquery/compare/v1.127.0...v1.127.1) (2021-02-11)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20210118-1.31.0 ([#1102](https://www.github.com/googleapis/java-bigquery/issues/1102)) ([f227eb4](https://www.github.com/googleapis/java-bigquery/commit/f227eb4a5eac1ddf8adf45d6cb093d51da56df6a))
* update dependency com.google.cloud:google-cloud-bigtable to v1.20.0 ([#1095](https://www.github.com/googleapis/java-bigquery/issues/1095)) ([82ff369](https://www.github.com/googleapis/java-bigquery/commit/82ff3695c8f5811e3b1f52dd52ab6d743475e40c))

## [1.127.0](https://www.github.com/googleapis/java-bigquery/compare/v1.126.6...v1.127.0) (2021-02-09)


### Features

* add reservation usage in job statistics ([#1018](https://www.github.com/googleapis/java-bigquery/issues/1018)) ([49cbb0f](https://www.github.com/googleapis/java-bigquery/commit/49cbb0f16ac3236e2f87b44570994d7235485902))
* add support for javascript UDFs determinism level ([#1094](https://www.github.com/googleapis/java-bigquery/issues/1094)) ([cf68d8d](https://www.github.com/googleapis/java-bigquery/commit/cf68d8dc6bf421ea9c82c27760af03dd64b24a29)), closes [#1083](https://www.github.com/googleapis/java-bigquery/issues/1083)


### Documentation

* **samples:** fix sample issue ([#1086](https://www.github.com/googleapis/java-bigquery/issues/1086)) ([ef669df](https://www.github.com/googleapis/java-bigquery/commit/ef669df3c97981664615f0d752f8d988d08c00c9))
* **samples:** Update region tag for create table external hive partitioning ([#1079](https://www.github.com/googleapis/java-bigquery/issues/1079)) ([50bf783](https://www.github.com/googleapis/java-bigquery/commit/50bf7831d9a7fe40ae08894d50fd2c8ae974f05a))

### [1.126.6](https://www.github.com/googleapis/java-bigquery/compare/v1.126.5...v1.126.6) (2021-01-13)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.18.0 ([#1064](https://www.github.com/googleapis/java-bigquery/issues/1064)) ([0b7925e](https://www.github.com/googleapis/java-bigquery/commit/0b7925ef311808293f2ed9969a71414520fdd8d3))

### [1.126.5](https://www.github.com/googleapis/java-bigquery/compare/v1.126.4...v1.126.5) (2021-01-13)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.113.9 ([#1061](https://www.github.com/googleapis/java-bigquery/issues/1061)) ([0644f40](https://www.github.com/googleapis/java-bigquery/commit/0644f408d4d0a80c54e78aeef8169b0e18aa8256))

### [1.126.4](https://www.github.com/googleapis/java-bigquery/compare/v1.126.3...v1.126.4) (2021-01-12)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.19.2 ([#1035](https://www.github.com/googleapis/java-bigquery/issues/1035)) ([239975b](https://www.github.com/googleapis/java-bigquery/commit/239975b318e513c93fdf42a2699bb019089459ed))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.17.1 ([#1056](https://www.github.com/googleapis/java-bigquery/issues/1056)) ([be89a1b](https://www.github.com/googleapis/java-bigquery/commit/be89a1bffcd59d0b171dde86f118714a4ba31d08))
* update dependency com.google.cloud:google-cloud-storage to v1.113.8 ([#1046](https://www.github.com/googleapis/java-bigquery/issues/1046)) ([c3e9348](https://www.github.com/googleapis/java-bigquery/commit/c3e934809eddfdf6e191f50acf97e8670a80865b))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.31.4 ([#1055](https://www.github.com/googleapis/java-bigquery/issues/1055)) ([8dd66e6](https://www.github.com/googleapis/java-bigquery/commit/8dd66e69c78febb00aa2f8f9028817f6d4735e79))

### [1.126.3](https://www.github.com/googleapis/java-bigquery/compare/v1.126.2...v1.126.3) (2020-12-15)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.19.1 ([#1025](https://www.github.com/googleapis/java-bigquery/issues/1025)) ([1c6e90d](https://www.github.com/googleapis/java-bigquery/commit/1c6e90d9e2fe13d99ab7fe1c9999c6050371a5d9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.17.0 ([#1026](https://www.github.com/googleapis/java-bigquery/issues/1026)) ([12e2c38](https://www.github.com/googleapis/java-bigquery/commit/12e2c382f6749c3baa54119e404725eea58da907))

### [1.126.2](https://www.github.com/googleapis/java-bigquery/compare/v1.126.1...v1.126.2) (2020-12-14)


### Documentation

* **samples:** add missing region tag ([#1014](https://www.github.com/googleapis/java-bigquery/issues/1014)) ([1999950](https://www.github.com/googleapis/java-bigquery/commit/1999950da0e784b72c4dbe749ceb56d750cea1b3))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.1 ([#1020](https://www.github.com/googleapis/java-bigquery/issues/1020)) ([aa52928](https://www.github.com/googleapis/java-bigquery/commit/aa5292844fc64642b32a4a823338acf8e61549b0))
* update dependency com.google.cloud:google-cloud-storage to v1.113.6 ([#1017](https://www.github.com/googleapis/java-bigquery/issues/1017)) ([b62e8f2](https://www.github.com/googleapis/java-bigquery/commit/b62e8f208ae4741e7ba6df41c6c90a8192f84aee))

### [1.126.1](https://www.github.com/googleapis/java-bigquery/compare/v1.126.0...v1.126.1) (2020-12-09)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.113.5 ([#1007](https://www.github.com/googleapis/java-bigquery/issues/1007)) ([479ae98](https://www.github.com/googleapis/java-bigquery/commit/479ae98a22df32d257d13ef7d9aad4888ddacfdf))

## [1.126.0](https://www.github.com/googleapis/java-bigquery/compare/v1.125.2...v1.126.0) (2020-12-05)


### Features

* set requestId for fast query path in QueryRequestInfo instead of QueryJobConfiguration ([#987](https://www.github.com/googleapis/java-bigquery/issues/987)) ([e2cd4f6](https://www.github.com/googleapis/java-bigquery/commit/e2cd4f63ccc543e144f90e06eaadb2e96ce94943))

### [1.125.2](https://www.github.com/googleapis/java-bigquery/compare/v1.125.1...v1.125.2) (2020-12-04)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20201030-1.31.0 ([#995](https://www.github.com/googleapis/java-bigquery/issues/995)) ([8968b44](https://www.github.com/googleapis/java-bigquery/commit/8968b44ceb9fa9a199257a5cb8434069d4fdc4b6))
* update dependency com.google.cloud:google-cloud-bigtable to v1.19.0 ([#993](https://www.github.com/googleapis/java-bigquery/issues/993)) ([fc87746](https://www.github.com/googleapis/java-bigquery/commit/fc8774698be60ea567a4d0be5cc3c2a57a75bd99))

### [1.125.1](https://www.github.com/googleapis/java-bigquery/compare/v1.125.0...v1.125.1) (2020-12-02)


### Bug Fixes

* update listPartitions() to support tables from other projects ([#974](https://www.github.com/googleapis/java-bigquery/issues/974)) ([1739d57](https://www.github.com/googleapis/java-bigquery/commit/1739d57c59cfb6b90ccf3fcc9c07d1449fc17238))


### Documentation

* **samples:** add alter materialized view ([#979](https://www.github.com/googleapis/java-bigquery/issues/979)) ([37c0632](https://www.github.com/googleapis/java-bigquery/commit/37c0632500366006aecab18b21a10bf8956c4b6c))
* **samples:** add create external table using hivepartitioningoptions ([#969](https://www.github.com/googleapis/java-bigquery/issues/969)) ([3994be6](https://www.github.com/googleapis/java-bigquery/commit/3994be62b63b4b56944499c10b42d77ced4ab33c))
* **samples:** add create iam policy for table ([#975](https://www.github.com/googleapis/java-bigquery/issues/975)) ([0cfc98b](https://www.github.com/googleapis/java-bigquery/commit/0cfc98bffc9970d3275cc233d59c621ddbb6aea6))
* **samples:** add create materialized view ([#977](https://www.github.com/googleapis/java-bigquery/issues/977)) ([155e688](https://www.github.com/googleapis/java-bigquery/commit/155e6882aebdb4ac93e1e78baac0579ca7e11bd1))
* **samples:** add delete materialized view ([#980](https://www.github.com/googleapis/java-bigquery/issues/980)) ([022cb99](https://www.github.com/googleapis/java-bigquery/commit/022cb99b486d27c91f478353ab47df4b8e184e4a))
* **samples:** add export model ([#970](https://www.github.com/googleapis/java-bigquery/issues/970)) ([2edad15](https://www.github.com/googleapis/java-bigquery/commit/2edad15764f144268f1bd3052d1d0ac069a2f377))
* **samples:** add query materialized view ([#978](https://www.github.com/googleapis/java-bigquery/issues/978)) ([cf36b82](https://www.github.com/googleapis/java-bigquery/commit/cf36b82ef9bc0849a87b717c099321915a76b967))
* **samples:** add update iam policy for table ([#976](https://www.github.com/googleapis/java-bigquery/issues/976)) ([aeecac9](https://www.github.com/googleapis/java-bigquery/commit/aeecac905911dbe1ee534f0e5eeef2705a0cb6b3))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.18.1 ([#989](https://www.github.com/googleapis/java-bigquery/issues/989)) ([bbf4fe2](https://www.github.com/googleapis/java-bigquery/commit/bbf4fe2565b1676567f28d720b255696328c08cc))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.16.0 ([#988](https://www.github.com/googleapis/java-bigquery/issues/988)) ([3cc0d94](https://www.github.com/googleapis/java-bigquery/commit/3cc0d94888f649a16495f66e80ebf95093730b1a))

## [1.125.0](https://www.github.com/googleapis/java-bigquery/compare/v1.124.7...v1.125.0) (2020-11-19)


### Features

* add BIGNUMERIC support ([#703](https://www.github.com/googleapis/java-bigquery/issues/703)) ([718ec2a](https://www.github.com/googleapis/java-bigquery/commit/718ec2ae25150dceef8fb9bc3e2fcf6238fc2220))

### [1.124.7](https://www.github.com/googleapis/java-bigquery/compare/v1.124.6...v1.124.7) (2020-11-16)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.18.0 ([#949](https://www.github.com/googleapis/java-bigquery/issues/949)) ([6adc55f](https://www.github.com/googleapis/java-bigquery/commit/6adc55f1f3277cc3bdac8d98069dc0dab8744d39))
* update dependency com.google.cloud:google-cloud-storage to v1.113.4 ([#951](https://www.github.com/googleapis/java-bigquery/issues/951)) ([5fddfad](https://www.github.com/googleapis/java-bigquery/commit/5fddfad89049c706b5c1b2bc092da498f8c5e5a6))

### [1.124.6](https://www.github.com/googleapis/java-bigquery/compare/v1.124.5...v1.124.6) (2020-11-13)


### Bug Fixes

* make sure to fall back to old query path when query job is incomplete ([#941](https://www.github.com/googleapis/java-bigquery/issues/941)) ([bd7d85c](https://www.github.com/googleapis/java-bigquery/commit/bd7d85c489cd260feeabbdc9ecbb8dcdc8d9ae77))


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.17.3 ([#936](https://www.github.com/googleapis/java-bigquery/issues/936)) ([0b34a50](https://www.github.com/googleapis/java-bigquery/commit/0b34a5095b2bad4ac02b3d40937dd1a3ab3f2154))

### [1.124.5](https://www.github.com/googleapis/java-bigquery/compare/v1.124.4...v1.124.5) (2020-11-11)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.17.2 ([#930](https://www.github.com/googleapis/java-bigquery/issues/930)) ([eab190f](https://www.github.com/googleapis/java-bigquery/commit/eab190f4f68e9d2a33b203d35d0d064c6c755f2f))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.15.0 ([#929](https://www.github.com/googleapis/java-bigquery/issues/929)) ([321357c](https://www.github.com/googleapis/java-bigquery/commit/321357ce41bc67be3009c27b4999b1d7cb4ecfee))

### [1.124.4](https://www.github.com/googleapis/java-bigquery/compare/v1.124.3...v1.124.4) (2020-11-10)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.113.3 ([#923](https://www.github.com/googleapis/java-bigquery/issues/923)) ([ececddf](https://www.github.com/googleapis/java-bigquery/commit/ececddf32294f7884350d7e99f4eb3d493744ed2))

### [1.124.3](https://www.github.com/googleapis/java-bigquery/compare/v1.124.2...v1.124.3) (2020-11-10)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20201030-1.30.10 ([#917](https://www.github.com/googleapis/java-bigquery/issues/917)) ([3d55b36](https://www.github.com/googleapis/java-bigquery/commit/3d55b365d3b737290b4e9b2c11e69ae67711a1d3))
* update dependency com.google.cloud:google-cloud-bigtable to v1.17.1 ([#906](https://www.github.com/googleapis/java-bigquery/issues/906)) ([07a8e28](https://www.github.com/googleapis/java-bigquery/commit/07a8e2812ed4d1b6bde2fba55462f8df5c7993ef))
* update dependency com.google.oauth-client:google-oauth-client-java6 to v1.31.2 ([#912](https://www.github.com/googleapis/java-bigquery/issues/912)) ([fd584e3](https://www.github.com/googleapis/java-bigquery/commit/fd584e3f84b1d726850e098ad509cab1e6735191))
* update dependency com.google.oauth-client:google-oauth-client-jetty to v1.31.2 ([#913](https://www.github.com/googleapis/java-bigquery/issues/913)) ([1ca3e90](https://www.github.com/googleapis/java-bigquery/commit/1ca3e9022354f2f5c96df004208979eabace90df))

### [1.124.2](https://www.github.com/googleapis/java-bigquery/compare/v1.124.1...v1.124.2) (2020-10-31)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.14.1 ([#897](https://www.github.com/googleapis/java-bigquery/issues/897)) ([b2cc174](https://www.github.com/googleapis/java-bigquery/commit/b2cc174640d227d617c7671ec4d074b3facf735e))

### [1.124.1](https://www.github.com/googleapis/java-bigquery/compare/v1.124.0...v1.124.1) (2020-10-30)


### Bug Fixes

* nullpointerexception for listroutines and listmodels ([#890](https://www.github.com/googleapis/java-bigquery/issues/890)) ([9e5c7c7](https://www.github.com/googleapis/java-bigquery/commit/9e5c7c7a6a0e32ce145a727bcdc1493e149f3b14))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20201022-1.30.10 ([#892](https://www.github.com/googleapis/java-bigquery/issues/892)) ([ea4f45e](https://www.github.com/googleapis/java-bigquery/commit/ea4f45e00de6f8da8352f5a85513996475960f7c))

## [1.124.0](https://www.github.com/googleapis/java-bigquery/compare/v1.123.2...v1.124.0) (2020-10-29)


### Features

* add acl for routine ([#875](https://www.github.com/googleapis/java-bigquery/issues/875)) ([b031447](https://www.github.com/googleapis/java-bigquery/commit/b031447d691de51678a0654c27b0f621672dd52a))


### Bug Fixes

* **samples:** dataset getcreatetime ([#866](https://www.github.com/googleapis/java-bigquery/issues/866)) ([992baaf](https://www.github.com/googleapis/java-bigquery/commit/992baaf85ae2904bb5900cfdfce6b447fd301b3b))


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.113.2 ([#871](https://www.github.com/googleapis/java-bigquery/issues/871)) ([66551c3](https://www.github.com/googleapis/java-bigquery/commit/66551c3955ec9ba58e5b7b3204539ff4cde07298))


### Documentation

* **samples:** fix typo ([#884](https://www.github.com/googleapis/java-bigquery/issues/884)) ([97573b5](https://www.github.com/googleapis/java-bigquery/commit/97573b574a84a1504baf3ad0fb0d30a321842a14))

### [1.123.2](https://www.github.com/googleapis/java-bigquery/compare/v1.123.1...v1.123.2) (2020-10-23)


### Dependencies

* update dependency com.google.cloud:google-cloud-bigtable to v1.17.0 ([#860](https://www.github.com/googleapis/java-bigquery/issues/860)) ([825575e](https://www.github.com/googleapis/java-bigquery/commit/825575eed83312e94d1417cf5e1d286bd843c347))

### [1.123.1](https://www.github.com/googleapis/java-bigquery/compare/v1.123.0...v1.123.1) (2020-10-23)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20201015-1.30.10 ([#851](https://www.github.com/googleapis/java-bigquery/issues/851)) ([439eea9](https://www.github.com/googleapis/java-bigquery/commit/439eea95390b72e5aa84ddd9c208475074cf821c))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.13.0 ([#834](https://www.github.com/googleapis/java-bigquery/issues/834)) ([16a105b](https://www.github.com/googleapis/java-bigquery/commit/16a105bdcfbe61e78d79743aa216f281cf57040a))


### Documentation

* **samples:** add export query results to Amazon S3 sample and IT ([#853](https://www.github.com/googleapis/java-bigquery/issues/853)) ([5358620](https://www.github.com/googleapis/java-bigquery/commit/53586207c300002f6bbad3d67f4441729b109f8a))
* **samples:** create and query Amazon s3 data using external table ([#835](https://www.github.com/googleapis/java-bigquery/issues/835)) ([53a56be](https://www.github.com/googleapis/java-bigquery/commit/53a56be8b0878edbc4bc5dd67ed63b48c96d3899))

## [1.123.0](https://www.github.com/googleapis/java-bigquery/compare/v1.122.2...v1.123.0) (2020-10-20)


### Features

* add requirePartitionFilter field in HivePartitioningOptions ([#803](https://www.github.com/googleapis/java-bigquery/issues/803)) ([193c886](https://www.github.com/googleapis/java-bigquery/commit/193c8860d3a21e56b6ebe77240bd4eee3d19ee72))


### Bug Fixes

* fix start index with page size for list rows ([#793](https://www.github.com/googleapis/java-bigquery/issues/793)) ([71e7d48](https://www.github.com/googleapis/java-bigquery/commit/71e7d4804e1facfb921892dc702adaec35e47cd0))
* schema and totalRows for duplicate request ids ([#804](https://www.github.com/googleapis/java-bigquery/issues/804)) ([f2799dd](https://www.github.com/googleapis/java-bigquery/commit/f2799dd9a4323460843aa6df7ac7c2f092c7f1b3))


### Documentation

* **samples:** add omni create aws dataset ([#821](https://www.github.com/googleapis/java-bigquery/issues/821)) ([477a8e3](https://www.github.com/googleapis/java-bigquery/commit/477a8e39ce85408c745ebcc72a136b31edf66f05))
* **samples:** add omni create external table ([#823](https://www.github.com/googleapis/java-bigquery/issues/823)) ([fc3cf2a](https://www.github.com/googleapis/java-bigquery/commit/fc3cf2a4151e154e5240938579b50183242db1d8))


### Dependencies

* update core transport dependencies to v1.31.1 ([#811](https://www.github.com/googleapis/java-bigquery/issues/811)) ([27a86a0](https://www.github.com/googleapis/java-bigquery/commit/27a86a06de63fef62b63307e0e01060e91efe0f6))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20201007-1.30.10 ([#812](https://www.github.com/googleapis/java-bigquery/issues/812)) ([89f34c6](https://www.github.com/googleapis/java-bigquery/commit/89f34c6cd282d402a64e87614953491df3f1cdbe))
* update dependency com.google.cloud:google-cloud-bigtable to v1.16.2 ([#813](https://www.github.com/googleapis/java-bigquery/issues/813)) ([791bf25](https://www.github.com/googleapis/java-bigquery/commit/791bf253c7828daaf04fe5bec0ae8798e12dc2bc))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.12.1 ([#827](https://www.github.com/googleapis/java-bigquery/issues/827)) ([afe3b18](https://www.github.com/googleapis/java-bigquery/commit/afe3b185f26b1755b8c46bfb344b9041ee9641e7))
* update jmh.version to v1.26 ([#815](https://www.github.com/googleapis/java-bigquery/issues/815)) ([e5fd40f](https://www.github.com/googleapis/java-bigquery/commit/e5fd40fdc6de483a0f063cde83af1a6e23173c29))

### [1.122.2](https://www.github.com/googleapis/java-bigquery/compare/v1.122.1...v1.122.2) (2020-10-08)


### Bug Fixes

* bigquery exception get reason and message ([#788](https://www.github.com/googleapis/java-bigquery/issues/788)) ([d783c3a](https://www.github.com/googleapis/java-bigquery/commit/d783c3a2baf80da2aa48c6be555904bd3c33bb1a))


### Documentation

* **samples:** add query external bigtable using permanent table ([#764](https://www.github.com/googleapis/java-bigquery/issues/764)) ([257edfc](https://www.github.com/googleapis/java-bigquery/commit/257edfc14ef09efc4474eb5aba08ccf4d7c199c0))
* **samples:** add query external bigtable using temp table ([#763](https://www.github.com/googleapis/java-bigquery/issues/763)) ([fed28c7](https://www.github.com/googleapis/java-bigquery/commit/fed28c78ca4b70569d5148e67522b0f39321b306))

### [1.122.1](https://www.github.com/googleapis/java-bigquery/compare/v1.122.0...v1.122.1) (2020-10-06)


### Bug Fixes

* request id for fast query path ([#781](https://www.github.com/googleapis/java-bigquery/issues/781)) ([15dc9f0](https://www.github.com/googleapis/java-bigquery/commit/15dc9f0a95ebe3d97f8cbc5413f6c740f5f20241))

## [1.122.0](https://www.github.com/googleapis/java-bigquery/compare/v1.121.0...v1.122.0) (2020-10-01)


### Features

* add connectionId support for external data sources ([#776](https://www.github.com/googleapis/java-bigquery/issues/776)) ([dcd7daa](https://www.github.com/googleapis/java-bigquery/commit/dcd7daa15d8f820affc9c155ba6d7a9a4c15066d))

## [1.121.0](https://www.github.com/googleapis/java-bigquery/compare/v1.120.0...v1.121.0) (2020-10-01)


### Features

* add case insensitive for fields get by name ([#775](https://www.github.com/googleapis/java-bigquery/issues/775)) ([fcea662](https://www.github.com/googleapis/java-bigquery/commit/fcea66290c2079a6b5f7f9fc340ad706ca30cabd))
* use bigquery exception ([#749](https://www.github.com/googleapis/java-bigquery/issues/749)) ([84d6632](https://www.github.com/googleapis/java-bigquery/commit/84d6632dbbdb9ccaf4afba545ec94a1156a989a2))


### Bug Fixes

* nullpointer exception when executionerror is null ([#754](https://www.github.com/googleapis/java-bigquery/issues/754)) ([03bda1b](https://www.github.com/googleapis/java-bigquery/commit/03bda1bf79169bf0fca3ee12c1c3dfeb19c2e102))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200916-1.30.10 ([#768](https://www.github.com/googleapis/java-bigquery/issues/768)) ([6f8911a](https://www.github.com/googleapis/java-bigquery/commit/6f8911a356daf3dec79431491e40b1bfa1c20d4d))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.0 ([#769](https://www.github.com/googleapis/java-bigquery/issues/769)) ([49dbbba](https://www.github.com/googleapis/java-bigquery/commit/49dbbba8d1726e7277eb0ad8e168ff0a480daf0e))
* update dependency com.google.cloud:google-cloud-storage to v1.113.1 ([#770](https://www.github.com/googleapis/java-bigquery/issues/770)) ([34f30ec](https://www.github.com/googleapis/java-bigquery/commit/34f30ec2fea28e053fdb32d766749c8d6d0e115c))


### Documentation

* update clustering field docstrings ([#774](https://www.github.com/googleapis/java-bigquery/issues/774)) ([58e2e4e](https://www.github.com/googleapis/java-bigquery/commit/58e2e4ee8c4f3bf8391bbc1e2ff07b63e6247c69))
* **samples:** add region tag for auth snippet ([#760](https://www.github.com/googleapis/java-bigquery/issues/760)) ([9709c9e](https://www.github.com/googleapis/java-bigquery/commit/9709c9e401a512b6ab8e3ded52420597e30c7b0c))
* **samples:** fix flaky test case for undelete table ([#757](https://www.github.com/googleapis/java-bigquery/issues/757)) ([85b7069](https://www.github.com/googleapis/java-bigquery/commit/85b70691cc380beeafa839be4f10ec513342389f))

## [1.120.0](https://www.github.com/googleapis/java-bigquery/compare/v1.119.0...v1.120.0) (2020-09-22)


### Features

* sql fast path impl ([#509](https://www.github.com/googleapis/java-bigquery/issues/509)) ([64a7d65](https://www.github.com/googleapis/java-bigquery/commit/64a7d65ff97152c49194f507562266c1ba6f0f3b)), closes [google-cloud-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryException.java#L69-L71](https://www.github.com/google-cloud-bigquery/src/main/java/com/google/cloud/bigquery/BigQueryException.java/issues/L69-L71) [#L69](https://www.github.com/googleapis/java-bigquery/issues/L69)

## [1.119.0](https://www.github.com/googleapis/java-bigquery/compare/v1.118.0...v1.119.0) (2020-09-17)


### Features

* add additional time partitioning intervals ([#737](https://www.github.com/googleapis/java-bigquery/issues/737)) ([a57dbdf](https://www.github.com/googleapis/java-bigquery/commit/a57dbdf96440bc7e51443efb99b007ac42cd481b))

## [1.118.0](https://www.github.com/googleapis/java-bigquery/compare/v1.117.2...v1.118.0) (2020-09-17)


### Features

* **bigquery:** explicitly ask for dense responses from HTTP backend ([#739](https://www.github.com/googleapis/java-bigquery/issues/739)) ([8c92c99](https://www.github.com/googleapis/java-bigquery/commit/8c92c9919b278bdb128be963391fc1870e69e343))


### Bug Fixes

* throw jobexception for invalid multiple statements query ([#732](https://www.github.com/googleapis/java-bigquery/issues/732)) ([2a0d86d](https://www.github.com/googleapis/java-bigquery/commit/2a0d86d2d07dd706fb7d943da6ebd5c9ac98dfca))

### [1.117.2](https://www.github.com/googleapis/java-bigquery/compare/v1.117.1...v1.117.2) (2020-09-15)


### Bug Fixes

* get recordvalue by field name ([#718](https://www.github.com/googleapis/java-bigquery/issues/718)) ([b3f59b1](https://www.github.com/googleapis/java-bigquery/commit/b3f59b1e1215d93a3b7048149c88318f2a074f79))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200827-1.30.10 ([#722](https://www.github.com/googleapis/java-bigquery/issues/722)) ([dcb8671](https://www.github.com/googleapis/java-bigquery/commit/dcb86719f11fe2b75113974ada13bae20150aa49))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.9.0 ([#715](https://www.github.com/googleapis/java-bigquery/issues/715)) ([b75b95b](https://www.github.com/googleapis/java-bigquery/commit/b75b95b7ca338da0900c53856c280c9acc140cd5))
* update dependency com.google.cloud:google-cloud-storage to v1.113.0 ([#723](https://www.github.com/googleapis/java-bigquery/issues/723)) ([fb6d543](https://www.github.com/googleapis/java-bigquery/commit/fb6d5430b9f6e1285e7fa0102c78d9c4dd07c599))
* update jmh.version to v1.25.2 ([#720](https://www.github.com/googleapis/java-bigquery/issues/720)) ([9afba31](https://www.github.com/googleapis/java-bigquery/commit/9afba319a62f54ee766d2476f5bd2ee91b3ba762))

### [1.117.1](https://www.github.com/googleapis/java-bigquery/compare/v1.117.0...v1.117.1) (2020-08-28)


### Bug Fixes

* npe for destination table ([#699](https://www.github.com/googleapis/java-bigquery/issues/699)) ([863c9e1](https://www.github.com/googleapis/java-bigquery/commit/863c9e1d7da8a63154677fb32954e2048dd48e9e))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200818-1.30.10 ([#705](https://www.github.com/googleapis/java-bigquery/issues/705)) ([127414c](https://www.github.com/googleapis/java-bigquery/commit/127414c4f2cb7ea50dfc0f5cbfcb7f581cf67e63))
* update dependency com.google.cloud:google-cloud-storage to v1.112.0 ([#708](https://www.github.com/googleapis/java-bigquery/issues/708)) ([0be6a2b](https://www.github.com/googleapis/java-bigquery/commit/0be6a2b8ba47a912d8af7326ebc910d02393f6f5))
* update jmh.version to v1.25.1 ([#698](https://www.github.com/googleapis/java-bigquery/issues/698)) ([e3a021b](https://www.github.com/googleapis/java-bigquery/commit/e3a021b24cbcdfe23617da1662f438fb2d8699fb))

## [1.117.0](https://www.github.com/googleapis/java-bigquery/compare/v1.116.10...v1.117.0) (2020-08-25)


### Features

* add jmh benchmark module ([#686](https://www.github.com/googleapis/java-bigquery/issues/686)) ([a0e760f](https://www.github.com/googleapis/java-bigquery/commit/a0e760fbb1f5a9b169045ceba2dcf682d4736995))
* support for Table ACLs ([#653](https://www.github.com/googleapis/java-bigquery/issues/653)) ([f0e67d8](https://www.github.com/googleapis/java-bigquery/commit/f0e67d8a63fdfe62bcd285c3bbb04cae79386229))


### Bug Fixes

* temporarily disable reporting to unblock releases ([#692](https://www.github.com/googleapis/java-bigquery/issues/692)) ([c1f5533](https://www.github.com/googleapis/java-bigquery/commit/c1f5533ee25907cad5fbae589b5dd08418e3f42b))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200805-1.30.10 ([#672](https://www.github.com/googleapis/java-bigquery/issues/672)) ([3e578f4](https://www.github.com/googleapis/java-bigquery/commit/3e578f4337e2d0c41237294ea7889d9efd0eddb0))
* update jmh.version to v1.25 ([#690](https://www.github.com/googleapis/java-bigquery/issues/690)) ([44f7632](https://www.github.com/googleapis/java-bigquery/commit/44f7632feaeb1e1de8a1f68db972c48786e244de))


### Documentation

* update samples README.md ([#667](https://www.github.com/googleapis/java-bigquery/issues/667)) ([60d904b](https://www.github.com/googleapis/java-bigquery/commit/60d904b1fc4625f490f9357c486bfe5ef4f36f2c))
* **samples:** add samples lint job and fix lint issues ([#684](https://www.github.com/googleapis/java-bigquery/issues/684)) ([f08becc](https://www.github.com/googleapis/java-bigquery/commit/f08beccecd00f792c33ac3d2e29a696bd9411fb6))
* **samples:** fix checkstyle errors ([#682](https://www.github.com/googleapis/java-bigquery/issues/682)) ([fe5abc0](https://www.github.com/googleapis/java-bigquery/commit/fe5abc054c5eb7907ef58d5aa3285b3f10211aa4)), closes [#681](https://www.github.com/googleapis/java-bigquery/issues/681)

### [1.116.10](https://www.github.com/googleapis/java-bigquery/compare/v1.116.9...v1.116.10) (2020-08-11)


### Documentation

* **samples:** add query external sheet permanent table ([#658](https://www.github.com/googleapis/java-bigquery/issues/658)) ([6488cd1](https://www.github.com/googleapis/java-bigquery/commit/6488cd1ef914b2c87fa823511126a51cc27712fa))
* **samples:** add query external sheet temp table ([#659](https://www.github.com/googleapis/java-bigquery/issues/659)) ([9044050](https://www.github.com/googleapis/java-bigquery/commit/904405039a2d4dbb865451d7b1ac9257cc54efd2))
* **samples:** add relax column load append ([#657](https://www.github.com/googleapis/java-bigquery/issues/657)) ([511e9d7](https://www.github.com/googleapis/java-bigquery/commit/511e9d7580c7ddcda6734dd5f0ad012035bc77d5))
* remove outdated readme content ([#666](https://www.github.com/googleapis/java-bigquery/issues/666)) ([349e111](https://www.github.com/googleapis/java-bigquery/commit/349e11163773b22deae3dfb0ed4373f717711b79))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.6 ([#661](https://www.github.com/googleapis/java-bigquery/issues/661)) ([df3788a](https://www.github.com/googleapis/java-bigquery/commit/df3788a2ba9223bd99c56b6e76fbc6b0ab2b302a))

### [1.116.9](https://www.github.com/googleapis/java-bigquery/compare/v1.116.8...v1.116.9) (2020-08-07)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.5 ([#654](https://www.github.com/googleapis/java-bigquery/issues/654)) ([cb1b8c4](https://www.github.com/googleapis/java-bigquery/commit/cb1b8c4d6bd739d2f803e96d8b32dcd02fb643ae))


### Documentation

* **samples:** add load csv autodetect data from gcs ([#655](https://www.github.com/googleapis/java-bigquery/issues/655)) ([497ddf4](https://www.github.com/googleapis/java-bigquery/commit/497ddf41a0faeef4d896fc7f8e3e78b2c295d4a0))
* **samples:** add undelete table ([#638](https://www.github.com/googleapis/java-bigquery/issues/638)) ([e799bb3](https://www.github.com/googleapis/java-bigquery/commit/e799bb39022b6914678b085a000132d2fbca4a7f))
* **samples:** fix region tag for bigquery_relax_column_query_append ([#651](https://www.github.com/googleapis/java-bigquery/issues/651)) ([319b982](https://www.github.com/googleapis/java-bigquery/commit/319b982a8a50f592c244301b6431352b140ee50d))

### [1.116.8](https://www.github.com/googleapis/java-bigquery/compare/v1.116.7...v1.116.8) (2020-08-04)


### Reverts

* Revert "docs(samples): add undelete table (#611)" (#620) ([e28abed](https://www.github.com/googleapis/java-bigquery/commit/e28abed3cd414cc7432ea188eacde8b53b7819e3)), closes [#611](https://www.github.com/googleapis/java-bigquery/issues/611) [#620](https://www.github.com/googleapis/java-bigquery/issues/620)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200719-1.30.10 ([#602](https://www.github.com/googleapis/java-bigquery/issues/602)) ([8dc5bc3](https://www.github.com/googleapis/java-bigquery/commit/8dc5bc3851124b340a3454ce4df54ff44ac44379))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.4 ([#639](https://www.github.com/googleapis/java-bigquery/issues/639)) ([46f929b](https://www.github.com/googleapis/java-bigquery/commit/46f929b1ac9a4a731c98e83b444d29573ab8572d))


### Documentation

* **samples:** add authorized view tutorial ([#637](https://www.github.com/googleapis/java-bigquery/issues/637)) ([91cdf72](https://www.github.com/googleapis/java-bigquery/commit/91cdf72efc93dc9fcf06a25b06ef227fa43359ed))
* **samples:** add delete dataset and contents ([#629](https://www.github.com/googleapis/java-bigquery/issues/629)) ([209d035](https://www.github.com/googleapis/java-bigquery/commit/209d035c66fe776ad31db848d4d1b7c669f73595))
* **samples:** add load json table with overwrite data from gcs ([#582](https://www.github.com/googleapis/java-bigquery/issues/582)) ([f127475](https://www.github.com/googleapis/java-bigquery/commit/f127475100a307970a0af5227d367d790b434775))
* **samples:** add load orc file and overwrite data into a table from gcs ([#584](https://www.github.com/googleapis/java-bigquery/issues/584)) ([b3621df](https://www.github.com/googleapis/java-bigquery/commit/b3621df78f2c06cefdb637048dd91e11dbf8256f))
* **samples:** add query disable cache ([#595](https://www.github.com/googleapis/java-bigquery/issues/595)) ([8ef8db2](https://www.github.com/googleapis/java-bigquery/commit/8ef8db2e2fbcbff5136b18423746b25384a082ef))
* **samples:** add query dry run ([#587](https://www.github.com/googleapis/java-bigquery/issues/587)) ([55cd52c](https://www.github.com/googleapis/java-bigquery/commit/55cd52cf5e0f06afcbb7c1d961daca04cc5fe7a9))
* **samples:** add query legacy large results ([#594](https://www.github.com/googleapis/java-bigquery/issues/594)) ([4787dd0](https://www.github.com/googleapis/java-bigquery/commit/4787dd07202b6312b1a25957fee6a14e500dce48))
* **samples:** add query on external table from gcs ([#588](https://www.github.com/googleapis/java-bigquery/issues/588)) ([64bed25](https://www.github.com/googleapis/java-bigquery/commit/64bed2591daefed7bb8c8f93aa0a3d748a41a20d))
* **samples:** add query on external temp table from gcs ([#593](https://www.github.com/googleapis/java-bigquery/issues/593)) ([ef757ad](https://www.github.com/googleapis/java-bigquery/commit/ef757ad44dcc2745f2d07b799a1af63166d79d4f))
* **samples:** add query pagination ([#596](https://www.github.com/googleapis/java-bigquery/issues/596)) ([918c8bd](https://www.github.com/googleapis/java-bigquery/commit/918c8bd78d3654120f18db49058085c321c05819))
* **samples:** add query partitioned table ([#597](https://www.github.com/googleapis/java-bigquery/issues/597)) ([055ebc0](https://www.github.com/googleapis/java-bigquery/commit/055ebc09b36afc278a728d5ce1af5362ea0b5794))
* **samples:** add query script ([#605](https://www.github.com/googleapis/java-bigquery/issues/605)) ([ca07302](https://www.github.com/googleapis/java-bigquery/commit/ca073025b8d156bf9e76656fb36f49a5f81927c9))
* **samples:** add query total rows ([#609](https://www.github.com/googleapis/java-bigquery/issues/609)) ([0da5fd1](https://www.github.com/googleapis/java-bigquery/commit/0da5fd16747445819212741dd55c224b867f1629))
* **samples:** add query with arrays parameters ([#603](https://www.github.com/googleapis/java-bigquery/issues/603)) ([1eeffe6](https://www.github.com/googleapis/java-bigquery/commit/1eeffe6c8cc6cf131137cfadef46782012d6e47f))
* **samples:** add query with name types parameters ([#633](https://www.github.com/googleapis/java-bigquery/issues/633)) ([082f1a2](https://www.github.com/googleapis/java-bigquery/commit/082f1a2c2aeeaf1243681bee921fc54328969728))
* **samples:** add query with positional type parameters ([#634](https://www.github.com/googleapis/java-bigquery/issues/634)) ([208883c](https://www.github.com/googleapis/java-bigquery/commit/208883c2205abeeaee6c5162253eefc569fcba78))
* **samples:** add query with timestamp parameters ([#604](https://www.github.com/googleapis/java-bigquery/issues/604)) ([0abdd90](https://www.github.com/googleapis/java-bigquery/commit/0abdd902ec4a6758be4aed91b16a3df0c0afbd94))
* **samples:** add table exists ([#610](https://www.github.com/googleapis/java-bigquery/issues/610)) ([db9eef7](https://www.github.com/googleapis/java-bigquery/commit/db9eef76c066ba2b57fe2b6f64d6c966474b9071))
* **samples:** add undelete table ([#611](https://www.github.com/googleapis/java-bigquery/issues/611)) ([6c763d5](https://www.github.com/googleapis/java-bigquery/commit/6c763d58f2f13f52a44983b56b74b300a17468cc))
* **samples:** add update dataset partition expiration ([#612](https://www.github.com/googleapis/java-bigquery/issues/612)) ([720b5ac](https://www.github.com/googleapis/java-bigquery/commit/720b5acfe2f9f46eebb18b6e5d0db881b0ad7e2a))
* **samples:** add update model description ([#617](https://www.github.com/googleapis/java-bigquery/issues/617)) ([a8cb797](https://www.github.com/googleapis/java-bigquery/commit/a8cb797ab9f758c1af74faa84e8f71bf76a69223))
* **samples:** add update routine ([#618](https://www.github.com/googleapis/java-bigquery/issues/618)) ([a889800](https://www.github.com/googleapis/java-bigquery/commit/a889800b16483a85400198b2cb261d95afb2c69b))
* **samples:** add update table cmek ([#619](https://www.github.com/googleapis/java-bigquery/issues/619)) ([31cc937](https://www.github.com/googleapis/java-bigquery/commit/31cc9375c78156643b03374fddeb7aab4b26b4f3))
* **samples:** add update table require partition filter ([#624](https://www.github.com/googleapis/java-bigquery/issues/624)) ([29272bb](https://www.github.com/googleapis/java-bigquery/commit/29272bb9a3238b2f0dab2e44b23db6909d3809a2))
* **samples:** load orc file into a table from gcs ([#583](https://www.github.com/googleapis/java-bigquery/issues/583)) ([cbb1902](https://www.github.com/googleapis/java-bigquery/commit/cbb1902e1e3d7017b1cd9be0e51243e5840ace96))
* **samples:** update view query ([#625](https://www.github.com/googleapis/java-bigquery/issues/625)) ([8d71720](https://www.github.com/googleapis/java-bigquery/commit/8d717202ed36f55dd141ba45243f2dc30b597d99))

### [1.116.7](https://www.github.com/googleapis/java-bigquery/compare/v1.116.6...v1.116.7) (2020-07-21)


### Bug Fixes

* **sample:** region tag ([#544](https://www.github.com/googleapis/java-bigquery/issues/544)) ([f7f6e73](https://www.github.com/googleapis/java-bigquery/commit/f7f6e73ef82924fb0f7cbae5c871f1cd27620cc6))


### Documentation

* **samples:** add auth user flow and query ([#478](https://www.github.com/googleapis/java-bigquery/issues/478)) ([65dffac](https://www.github.com/googleapis/java-bigquery/commit/65dffac6af316d0baca5cfbd2b3dd3fae323549d))
* **samples:** add create view ddl ([#558](https://www.github.com/googleapis/java-bigquery/issues/558)) ([9253218](https://www.github.com/googleapis/java-bigquery/commit/925321881cde3edd187a9a442a26eb508535744a))
* **samples:** add extract compressed table ([#538](https://www.github.com/googleapis/java-bigquery/issues/538)) ([3f129a6](https://www.github.com/googleapis/java-bigquery/commit/3f129a6a4fff2162d1aef5ba29b4fa6246793d97))
* **samples:** add get dataset labels ([#539](https://www.github.com/googleapis/java-bigquery/issues/539)) ([563157c](https://www.github.com/googleapis/java-bigquery/commit/563157cc40727cb7cb9aed16dfbb956a668ead51))
* **samples:** add get table labels ([#540](https://www.github.com/googleapis/java-bigquery/issues/540)) ([a6d9491](https://www.github.com/googleapis/java-bigquery/commit/a6d94913f74a6b4d29e9314a0652a9e3fa30aed9))
* **samples:** add grant view access ([#563](https://www.github.com/googleapis/java-bigquery/issues/563)) ([0c092e0](https://www.github.com/googleapis/java-bigquery/commit/0c092e06cdf47882a38901e8e4814afa87c7eba4))
* **samples:** add insert rows without rowids in a table ([#573](https://www.github.com/googleapis/java-bigquery/issues/573)) ([b07dee3](https://www.github.com/googleapis/java-bigquery/commit/b07dee31e4b6fec8bf05f23ed52006829dbdbc4a))
* **samples:** add list dataset by label ([#555](https://www.github.com/googleapis/java-bigquery/issues/555)) ([a0d7bea](https://www.github.com/googleapis/java-bigquery/commit/a0d7beab025a2895f0efc1e9888594e386a0a1b3))
* **samples:** add list jobs ([#554](https://www.github.com/googleapis/java-bigquery/issues/554)) ([b87cecf](https://www.github.com/googleapis/java-bigquery/commit/b87cecff3f41339b20382b26381c38c4d7150305))
* **samples:** add list routines ([#546](https://www.github.com/googleapis/java-bigquery/issues/546)) ([2cd81d4](https://www.github.com/googleapis/java-bigquery/commit/2cd81d4fb616588e9ed966f6dd32cd4615d305c4))
* **samples:** add load avro table with truncate from gcs ([#567](https://www.github.com/googleapis/java-bigquery/issues/567)) ([fa998ba](https://www.github.com/googleapis/java-bigquery/commit/fa998baa32437a5e39670c5c7399c0945de56d52))
* **samples:** add load json file from gcs into a table ([#568](https://www.github.com/googleapis/java-bigquery/issues/568)) ([3d65821](https://www.github.com/googleapis/java-bigquery/commit/3d658210650d2849c86df96dccd3587e95a6f4a6))
* **samples:** add load json file from gcs into a table with autodetect schema ([#569](https://www.github.com/googleapis/java-bigquery/issues/569)) ([259d470](https://www.github.com/googleapis/java-bigquery/commit/259d470ecadc9f384920164c8a2f45643cff130a))
* **samples:** add load json table with encryption key from gcs ([#575](https://www.github.com/googleapis/java-bigquery/issues/575)) ([2ac556e](https://www.github.com/googleapis/java-bigquery/commit/2ac556e2707b3088446353ca03d9a8d08b6d66e2))
* **samples:** add load table from gcs using avro file ([#564](https://www.github.com/googleapis/java-bigquery/issues/564)) ([219f7a9](https://www.github.com/googleapis/java-bigquery/commit/219f7a978ab83421917ec4eb0295af38f4a9dd04))
* **samples:** add query destination table with encryption key ([#576](https://www.github.com/googleapis/java-bigquery/issues/576)) ([29b8a7f](https://www.github.com/googleapis/java-bigquery/commit/29b8a7f179bf1fcd125f211353ef95021c0142d8))
* **samples:** add region tag for oauth dependencies ([#570](https://www.github.com/googleapis/java-bigquery/issues/570)) ([8ed6bd6](https://www.github.com/googleapis/java-bigquery/commit/8ed6bd679761744bed7f4dcb4f66bf6f37119154))
* correct comment ([#553](https://www.github.com/googleapis/java-bigquery/issues/553)) ([48cdc92](https://www.github.com/googleapis/java-bigquery/commit/48cdc92b6f1e128b4f0c8c25cd9ea907ab77bd93))


### Dependencies

* update core transport dependencies to v1.31.0 ([#565](https://www.github.com/googleapis/java-bigquery/issues/565)) ([5fd73ee](https://www.github.com/googleapis/java-bigquery/commit/5fd73eeb5b5d8c91154c23642737c9ece37b1750))

### [1.116.6](https://www.github.com/googleapis/java-bigquery/compare/v1.116.5...v1.116.6) (2020-07-10)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200625-1.30.10 ([#533](https://www.github.com/googleapis/java-bigquery/issues/533)) ([d5b4b49](https://www.github.com/googleapis/java-bigquery/commit/d5b4b496b062c6c7f402503524732381915fd688))
* update dependency com.google.cloud:google-cloud-storage to v1.111.2 ([#531](https://www.github.com/googleapis/java-bigquery/issues/531)) ([9b2aeb4](https://www.github.com/googleapis/java-bigquery/commit/9b2aeb4d729b0719e19fcc054eabb08527dd4ac2))

### [1.116.5](https://www.github.com/googleapis/java-bigquery/compare/v1.116.4...v1.116.5) (2020-07-10)


### Bug Fixes

* handle malformed backend responses. ([#522](https://www.github.com/googleapis/java-bigquery/issues/522)) ([64de23a](https://www.github.com/googleapis/java-bigquery/commit/64de23a95736ffaaae7a05e0fd2c6f5f8c5c3665))


### Documentation

* **samples:** add label dataset ([#526](https://www.github.com/googleapis/java-bigquery/issues/526)) ([d775818](https://www.github.com/googleapis/java-bigquery/commit/d775818bda5c3a9c310ce7747f575200ce72fd9d))
* **samples:** add label table ([#527](https://www.github.com/googleapis/java-bigquery/issues/527)) ([d7cf47d](https://www.github.com/googleapis/java-bigquery/commit/d7cf47d1a1f6eda47637e49983086d79ed1cd7ac))


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.3 ([#523](https://www.github.com/googleapis/java-bigquery/issues/523)) ([82341cb](https://www.github.com/googleapis/java-bigquery/commit/82341cbb12ad6f5e020b5ba15701f66f0cbbfa19))

### [1.116.4](https://www.github.com/googleapis/java-bigquery/compare/v1.116.3...v1.116.4) (2020-07-08)


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200617-1.30.9 ([#500](https://www.github.com/googleapis/java-bigquery/issues/500)) ([8b6457c](https://www.github.com/googleapis/java-bigquery/commit/8b6457c010121a4c031611c2a896aa9147012ca3))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200625-1.30.9 ([#517](https://www.github.com/googleapis/java-bigquery/issues/517)) ([a0540e4](https://www.github.com/googleapis/java-bigquery/commit/a0540e4792818853a502bf56b363b26a60c5f5d9))
* update dependency com.google.cloud:google-cloud-storage to v1.110.0 ([#465](https://www.github.com/googleapis/java-bigquery/issues/465)) ([c4e6848](https://www.github.com/googleapis/java-bigquery/commit/c4e68486769bddb515023758e73eea5491b35e61))
* update dependency com.google.cloud:google-cloud-storage to v1.111.0 ([#484](https://www.github.com/googleapis/java-bigquery/issues/484)) ([a880fe2](https://www.github.com/googleapis/java-bigquery/commit/a880fe2b39f443b2e5e29d6288098c3db33fc6b5))
* update shared-dependencies and google-cloud-storage versions ([#505](https://www.github.com/googleapis/java-bigquery/issues/505)) ([8961842](https://www.github.com/googleapis/java-bigquery/commit/896184203dd3e4ccc6bd245bea7e2288f4e5b8cb))


### Documentation

* **samples:** add cancel job ([#487](https://www.github.com/googleapis/java-bigquery/issues/487)) ([fdea80e](https://www.github.com/googleapis/java-bigquery/commit/fdea80e17bddfc32a4541f240a25de5a3be01ef5))
* **samples:** add copy cmek table ([#513](https://www.github.com/googleapis/java-bigquery/issues/513)) ([f356c71](https://www.github.com/googleapis/java-bigquery/commit/f356c715bd1783df389b0fb66a7bb8747375765c))
* **samples:** add create and delete routine ([#493](https://www.github.com/googleapis/java-bigquery/issues/493)) ([99c324c](https://www.github.com/googleapis/java-bigquery/commit/99c324c60a7825da7259a3173ee6b776d0c76825))
* **samples:** add create cmek table ([#511](https://www.github.com/googleapis/java-bigquery/issues/511)) ([b5fd40f](https://www.github.com/googleapis/java-bigquery/commit/b5fd40fe1c826bfae96b19b797a3b5943762a22e))
* **samples:** add create job ([#470](https://www.github.com/googleapis/java-bigquery/issues/470)) ([e63f06e](https://www.github.com/googleapis/java-bigquery/commit/e63f06eeaa18386a8489b41cdad8d2c8e63fc146))
* **samples:** add create routine ddl ([#495](https://www.github.com/googleapis/java-bigquery/issues/495)) ([f955408](https://www.github.com/googleapis/java-bigquery/commit/f9554087f71cb830fde9598150d433d603e5be22))
* **samples:** add create table without schema ([#488](https://www.github.com/googleapis/java-bigquery/issues/488)) ([9232370](https://www.github.com/googleapis/java-bigquery/commit/9232370ff8c8755c9404ea319d9d9c9a397dd407))
* **samples:** add create view ([#497](https://www.github.com/googleapis/java-bigquery/issues/497)) ([09cf7f1](https://www.github.com/googleapis/java-bigquery/commit/09cf7f1a937c6c66b65ddc92cff1c29df63e6162))
* **samples:** add dataset exists ([#492](https://www.github.com/googleapis/java-bigquery/issues/492)) ([2a10616](https://www.github.com/googleapis/java-bigquery/commit/2a106160e8d24bd1ebbd25bb8dd012a46ba1d7e4))
* **samples:** add delete label on a dataset ([#515](https://www.github.com/googleapis/java-bigquery/issues/515)) ([a0edebb](https://www.github.com/googleapis/java-bigquery/commit/a0edebb4da976c6a4a0553f18c6e749f9190aa15))
* **samples:** add delete label on a table ([#516](https://www.github.com/googleapis/java-bigquery/issues/516)) ([9c1b82a](https://www.github.com/googleapis/java-bigquery/commit/9c1b82a208d80c03d4330fda5382b54e7c8f06c6))
* **samples:** add get job ([#503](https://www.github.com/googleapis/java-bigquery/issues/503)) ([3c1884b](https://www.github.com/googleapis/java-bigquery/commit/3c1884b9f78c4f365dab662b7cfed0e1a253cb2d))
* **samples:** add get routine ([#504](https://www.github.com/googleapis/java-bigquery/issues/504)) ([dbe4d30](https://www.github.com/googleapis/java-bigquery/commit/dbe4d30691dcc8e607e58fe6c97b40f3a2091012))
* **samples:** add get view ([#508](https://www.github.com/googleapis/java-bigquery/issues/508)) ([38b7ab2](https://www.github.com/googleapis/java-bigquery/commit/38b7ab2ba4a5797cb489714209465f5a9710c8da))
* **samples:** add insert data types ([#479](https://www.github.com/googleapis/java-bigquery/issues/479)) ([12a2bea](https://www.github.com/googleapis/java-bigquery/commit/12a2bea2c65d80a1c401cb65f3d826eb07fc3037))
* **samples:** add query batch ([#469](https://www.github.com/googleapis/java-bigquery/issues/469)) ([0ffbac3](https://www.github.com/googleapis/java-bigquery/commit/0ffbac349cc27ce72b06e05723e45a973b69cef1))

### [1.116.3](https://www.github.com/googleapis/java-bigquery/compare/v1.116.2...v1.116.3) (2020-06-18)


### Documentation

* **samples:** add create and delete model ([#462](https://www.github.com/googleapis/java-bigquery/issues/462)) ([df6479f](https://www.github.com/googleapis/java-bigquery/commit/df6479f2243193e692313790cbb1720d0279d47a))
* **samples:** add create range partition table ([#458](https://www.github.com/googleapis/java-bigquery/issues/458)) ([68140d5](https://www.github.com/googleapis/java-bigquery/commit/68140d5e463304253a5cc28e6dae9cc73d1bf8d1))
* **samples:** add query ([#463](https://www.github.com/googleapis/java-bigquery/issues/463)) ([e5db01c](https://www.github.com/googleapis/java-bigquery/commit/e5db01cac9309d0d2da819276d69af017c367929))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200603-1.30.9 ([#447](https://www.github.com/googleapis/java-bigquery/issues/447)) ([f53559e](https://www.github.com/googleapis/java-bigquery/commit/f53559e376ff8ebcca7440b977c02feb9b52a64b))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.1 ([#448](https://www.github.com/googleapis/java-bigquery/issues/448)) ([8af668e](https://www.github.com/googleapis/java-bigquery/commit/8af668e2b5e9028cabe70740ea1baa624d35b7c0))
* update dependency com.google.cloud:google-cloud-storage to v1.109.1 ([#453](https://www.github.com/googleapis/java-bigquery/issues/453)) ([01dd6be](https://www.github.com/googleapis/java-bigquery/commit/01dd6be4f8894d11124f6e68545aa3b3b3ee14d8))

### [1.116.2](https://www.github.com/googleapis/java-bigquery/compare/v1.116.1...v1.116.2) (2020-06-09)


### Documentation

* **samples:** add load CSV from GCS sample ([#426](https://www.github.com/googleapis/java-bigquery/issues/426)) ([3810366](https://www.github.com/googleapis/java-bigquery/commit/3810366451097a7f14db11504103865540ac242a))
* **samples:** add load CSV from GCS to overwrite table sample ([#428](https://www.github.com/googleapis/java-bigquery/issues/428)) ([21a3606](https://www.github.com/googleapis/java-bigquery/commit/21a3606f5fb65287f808b12a6fef65817c8a8ba6))
* **samples:** add update table using dml query sample ([#424](https://www.github.com/googleapis/java-bigquery/issues/424)) ([3902ba1](https://www.github.com/googleapis/java-bigquery/commit/3902ba1cf0d8a88d3e6f30b6606067503487c77d)), closes [#413](https://www.github.com/googleapis/java-bigquery/issues/413)
* **samples:** added copy table and accompanying test ([#414](https://www.github.com/googleapis/java-bigquery/issues/414)) ([de0d97f](https://www.github.com/googleapis/java-bigquery/commit/de0d97f2f940c9cf507d19c5595e1a0e819ef19c))
* **samples:** added extract to json and accompanying test ([#416](https://www.github.com/googleapis/java-bigquery/issues/416)) ([16a956d](https://www.github.com/googleapis/java-bigquery/commit/16a956db0aa545df84f7885ffb4425460cf55a16))
* **samples:** adding browse table sample and test ([#422](https://www.github.com/googleapis/java-bigquery/issues/422)) ([dff4e5f](https://www.github.com/googleapis/java-bigquery/commit/dff4e5f86764b1c779c2ef131182483e2ffa1c1b))
* **samples:** adding destination query sample and test ([#418](https://www.github.com/googleapis/java-bigquery/issues/418)) ([0f50961](https://www.github.com/googleapis/java-bigquery/commit/0f50961aaf1092f3ecc4e02fa9cebb50f6d45e90))
* **samples:** adding simple query example for completeness ([#417](https://www.github.com/googleapis/java-bigquery/issues/417)) ([59426df](https://www.github.com/googleapis/java-bigquery/commit/59426df912f743b7927deb562366b625aba6f087))
* **samples:** rename extract table json to extract table csv ([#415](https://www.github.com/googleapis/java-bigquery/issues/415)) ([c1f21e6](https://www.github.com/googleapis/java-bigquery/commit/c1f21e6c16df40bb3c71610f9d5b4fb4855b28fb))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200523-1.30.9 ([#409](https://www.github.com/googleapis/java-bigquery/issues/409)) ([d30c823](https://www.github.com/googleapis/java-bigquery/commit/d30c823c5a604b195f17d8ac33894107cdee967e))

### [1.116.1](https://www.github.com/googleapis/java-bigquery/compare/v1.116.0...v1.116.1) (2020-06-01)


### Dependencies

* remove google-cloud-core classiier=test since it is managed by … ([#396](https://www.github.com/googleapis/java-bigquery/issues/396)) ([bafd8ae](https://www.github.com/googleapis/java-bigquery/commit/bafd8ae780121ee968bca7b3eb68bb0f0a438124))
* restrict -annotation deps ([#402](https://www.github.com/googleapis/java-bigquery/issues/402)) ([db41581](https://www.github.com/googleapis/java-bigquery/commit/db4158186b99d0bed68fd70bef5918b1820e5dd1))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.6.0 ([#392](https://www.github.com/googleapis/java-bigquery/issues/392)) ([3f13ccb](https://www.github.com/googleapis/java-bigquery/commit/3f13ccbbf1ca8f179c48a69c8e456bdf45c43af5))
* update shared-deps and add back certain test deps ([#390](https://www.github.com/googleapis/java-bigquery/issues/390)) ([7e21be2](https://www.github.com/googleapis/java-bigquery/commit/7e21be2506cdaf065cd32e3aed403890929b93e7))


### Documentation

* **samples:** Convert tightly coupled local variable inside of method into method arguments ([#386](https://www.github.com/googleapis/java-bigquery/issues/386)) ([7c02cd3](https://www.github.com/googleapis/java-bigquery/commit/7c02cd3ca7238d24bb2914ae2262a3b2e2d4bda7)), closes [#387](https://www.github.com/googleapis/java-bigquery/issues/387)
* **samples:** Convert tightly coupled local variable involved options inside of method into method arguments ([#393](https://www.github.com/googleapis/java-bigquery/issues/393)) ([a11f3cb](https://www.github.com/googleapis/java-bigquery/commit/a11f3cb4733215a9c4a65936b05f9cc2ed75656f)), closes [#394](https://www.github.com/googleapis/java-bigquery/issues/394)
* **samples:** Fix flaky test ([#397](https://www.github.com/googleapis/java-bigquery/issues/397)) ([64847d1](https://www.github.com/googleapis/java-bigquery/commit/64847d1e5137e811e7f462fc058908fa9fcc55fb))
* **samples:** update revierwers for samples module changes ([#401](https://www.github.com/googleapis/java-bigquery/issues/401)) ([69b9d84](https://www.github.com/googleapis/java-bigquery/commit/69b9d8417d5b910286aaa855f4a83fc151a81cec))

## [1.116.0](https://www.github.com/googleapis/java-bigquery/compare/v1.115.1...v1.116.0) (2020-05-21)


### Features

* remove autovalue profile as it has moved to shared-config ([#370](https://www.github.com/googleapis/java-bigquery/issues/370)) ([57982a0](https://www.github.com/googleapis/java-bigquery/commit/57982a052c7849becbadbed773f951f0e7870a56))


### Bug Fixes

* error message for get routine ([#372](https://www.github.com/googleapis/java-bigquery/issues/372)) ([5966733](https://www.github.com/googleapis/java-bigquery/commit/596673346f9b5540cece041e63019227522062be))

### [1.115.1](https://www.github.com/googleapis/java-bigquery/compare/v1.115.0...v1.115.1) (2020-05-19)


### Dependencies

* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.4.0 ([#362](https://www.github.com/googleapis/java-bigquery/issues/362)) ([7a256f7](https://www.github.com/googleapis/java-bigquery/commit/7a256f734aab3a26a8290a66b11cbcb91fe05d7a))


### Documentation

* **samples:** Added UpdateTableDescription example. ([#360](https://www.github.com/googleapis/java-bigquery/issues/360)) ([96d2c87](https://www.github.com/googleapis/java-bigquery/commit/96d2c87bf087f980106f57ffaac0933274c84b96))

## [1.115.0](https://www.github.com/googleapis/java-bigquery/compare/v1.114.0...v1.115.0) (2020-05-13)


### Features

* add extract model for extractjobconfiguration ([#227](https://www.github.com/googleapis/java-bigquery/issues/227)) ([9e8cd76](https://www.github.com/googleapis/java-bigquery/commit/9e8cd76759e584d743a1d5c310d8cd7299b3a39d))
* add labels for writechannelconfiguration ([#347](https://www.github.com/googleapis/java-bigquery/issues/347)) ([7dbd0df](https://www.github.com/googleapis/java-bigquery/commit/7dbd0df6e46a0760c28925ea65eed9c306c22f21))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200429-1.30.9 ([#349](https://www.github.com/googleapis/java-bigquery/issues/349)) ([cf276d0](https://www.github.com/googleapis/java-bigquery/commit/cf276d02fe4006dc8b8e7fa3f6d062587bf626fa))
* update dependency com.google.auto.service:auto-service-annotations to v1.0-rc7 ([#352](https://www.github.com/googleapis/java-bigquery/issues/352)) ([f66c082](https://www.github.com/googleapis/java-bigquery/commit/f66c08200c1b7847bfe8b5036ae3c89f4ed9aefa))
* update dependency com.google.auto.value:auto-value to v1.7.2 ([#350](https://www.github.com/googleapis/java-bigquery/issues/350)) ([a6ae45f](https://www.github.com/googleapis/java-bigquery/commit/a6ae45f11a5fca33d066d08b0975e0b9c1c4fca9))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.3.1 ([#351](https://www.github.com/googleapis/java-bigquery/issues/351)) ([002d863](https://www.github.com/googleapis/java-bigquery/commit/002d863c88916f196685f06d16822f6824a7eb84))


### Documentation

* update CONTRIBUTING.md to include code formatting ([#534](https://www.github.com/googleapis/java-bigquery/issues/534)) ([#346](https://www.github.com/googleapis/java-bigquery/issues/346)) ([df0c3e6](https://www.github.com/googleapis/java-bigquery/commit/df0c3e6767890e1b1cc164a6d06ce4fabc8edd7a))

## [1.114.0](https://www.github.com/googleapis/java-bigquery/compare/v1.113.0...v1.114.0) (2020-05-11)


### Features

* add hourly partitioning support ([#336](https://www.github.com/googleapis/java-bigquery/issues/336)) ([90f9980](https://www.github.com/googleapis/java-bigquery/commit/90f998040bbca5882ac3dbcdb4b157f26f48eb01))

## [1.113.0](https://www.github.com/googleapis/java-bigquery/compare/v1.112.0...v1.113.0) (2020-05-05)


### Features

* switch to use java-shared-deps ([#323](https://www.github.com/googleapis/java-bigquery/issues/323)) ([091a6a9](https://www.github.com/googleapis/java-bigquery/commit/091a6a99a955ae116d61c9cc2663a63cee81e18c))

## [1.112.0](https://www.github.com/googleapis/java-bigquery/compare/v1.111.3...v1.112.0) (2020-05-05)


### Features

* add support connection properties for job and query ([#320](https://www.github.com/googleapis/java-bigquery/issues/320)) ([dcd3663](https://www.github.com/googleapis/java-bigquery/commit/dcd366373f5804da1e8226c110e89c3de5749926))


### Dependencies

* update dependency com.google.api.grpc:proto-google-common-protos to v1.18.0 ([#318](https://www.github.com/googleapis/java-bigquery/issues/318)) ([3dade31](https://www.github.com/googleapis/java-bigquery/commit/3dade31ce828322753dd40f90e2e019cad40f83a))
* update dependency com.google.cloud:google-cloud-storage to v1.108.0 ([#317](https://www.github.com/googleapis/java-bigquery/issues/317)) ([63563e6](https://www.github.com/googleapis/java-bigquery/commit/63563e646e85a6caa1eb28819be9fad0083100d7))

### [1.111.3](https://www.github.com/googleapis/java-bigquery/compare/v1.111.2...v1.111.3) (2020-05-04)


### Bug Fixes

* null type in timepartitioning frompb ([#305](https://www.github.com/googleapis/java-bigquery/issues/305)) ([6315842](https://www.github.com/googleapis/java-bigquery/commit/6315842dfa62a433a1ba507b861cf96a3d7cb03d))


### Dependencies

* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200415-1.30.9 ([#307](https://www.github.com/googleapis/java-bigquery/issues/307)) ([fccb0b4](https://www.github.com/googleapis/java-bigquery/commit/fccb0b4d08b41e4836ac9490befca47306f14afd))
* update dependency com.google.auto.value:auto-value to v1.7.1 ([#308](https://www.github.com/googleapis/java-bigquery/issues/308)) ([5a0ed06](https://www.github.com/googleapis/java-bigquery/commit/5a0ed060eb2c966092af66bfae2896ea8af70c7e))

### [1.111.2](https://www.github.com/googleapis/java-bigquery/compare/v1.111.1...v1.111.2) (2020-04-29)


### Dependencies

* update core transport dependencies to v1.35.0 ([#298](https://www.github.com/googleapis/java-bigquery/issues/298)) ([95f9443](https://www.github.com/googleapis/java-bigquery/commit/95f9443fad2f561df8f8108c3e323729d8195d46))
* update dependency org.threeten:threetenbp to v1.4.4 ([#293](https://www.github.com/googleapis/java-bigquery/issues/293)) ([21d0c58](https://www.github.com/googleapis/java-bigquery/commit/21d0c588d61ded31cb45ff10bf7824f8203c9314))

### [1.111.1](https://www.github.com/googleapis/java-bigquery/compare/v1.111.0...v1.111.1) (2020-04-22)


### Dependencies

* fix build errors ([#286](https://www.github.com/googleapis/java-bigquery/issues/286)) ([4b478b0](https://www.github.com/googleapis/java-bigquery/commit/4b478b0fc21d31472939dceece4ba059a8a0ea16))
* update dependency io.grpc:grpc-bom to v1.29.0 ([#284](https://www.github.com/googleapis/java-bigquery/issues/284)) ([e72a99f](https://www.github.com/googleapis/java-bigquery/commit/e72a99f225176d18d308bef2c8cc69a18390a3ce))

## [1.111.0](https://www.github.com/googleapis/java-bigquery/compare/v1.110.1...v1.111.0) (2020-04-16)


### Features

* add flatten plugin ([#276](https://www.github.com/googleapis/java-bigquery/issues/276)) ([f7e89ab](https://www.github.com/googleapis/java-bigquery/commit/f7e89abe440b27bf05adea7ec0a89d8eec6ceac5))


### Bug Fixes

* fieldvalue gettimestamp ([#279](https://www.github.com/googleapis/java-bigquery/issues/279)) ([4478a23](https://www.github.com/googleapis/java-bigquery/commit/4478a230a130cab45735e198a204fc9163b5a00e)), closes [#16](https://www.github.com/googleapis/java-bigquery/issues/16)


### Dependencies

* update dependency com.google.cloud:google-cloud-storage to v1.107.0 ([#273](https://www.github.com/googleapis/java-bigquery/issues/273)) ([6ef0502](https://www.github.com/googleapis/java-bigquery/commit/6ef0502ebb9ba56c896e028ca884efadbdce3303))
* update dependency com.google.guava:guava-bom to v29 ([#267](https://www.github.com/googleapis/java-bigquery/issues/267)) ([a115c6b](https://www.github.com/googleapis/java-bigquery/commit/a115c6b5ed2c391f4837936f28467b67f323900a))

### [1.110.1](https://www.github.com/googleapis/java-bigquery/compare/v1.110.0...v1.110.1) (2020-04-06)


### Dependencies

* update core dependencies to v1.55.0 ([#250](https://www.github.com/googleapis/java-bigquery/issues/250)) ([caeaebf](https://www.github.com/googleapis/java-bigquery/commit/caeaebfcaa804e70c9a13370339509d7a1b281c7))
* update core dependencies to v1.56.0 ([#258](https://www.github.com/googleapis/java-bigquery/issues/258)) ([1c85a6b](https://www.github.com/googleapis/java-bigquery/commit/1c85a6b3d7c64bd5d774b78a182baf728fc110b5))
* update core dependencies to v1.93.4 ([#259](https://www.github.com/googleapis/java-bigquery/issues/259)) ([07b3091](https://www.github.com/googleapis/java-bigquery/commit/07b30916f8ab2b8680eedea14f73c94a4329343c))
* update dependency com.google.api:api-common to v1.9.0 ([#246](https://www.github.com/googleapis/java-bigquery/issues/246)) ([783f1ad](https://www.github.com/googleapis/java-bigquery/commit/783f1ade581b3930f5585a30b4c1c278762e0d9d))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20200324-1.30.9 ([#252](https://www.github.com/googleapis/java-bigquery/issues/252)) ([0570d13](https://www.github.com/googleapis/java-bigquery/commit/0570d13c4c168842480b8f83c03d4b19ed88050d))
* update dependency com.google.cloud.samples:shared-configuration to v1.0.13 ([#243](https://www.github.com/googleapis/java-bigquery/issues/243)) ([4c62001](https://www.github.com/googleapis/java-bigquery/commit/4c620018288b36d7e8743c0ace37ef25397d1060))
* update dependency io.grpc:grpc-bom to v1.28.1 ([#254](https://www.github.com/googleapis/java-bigquery/issues/254)) ([546861d](https://www.github.com/googleapis/java-bigquery/commit/546861d5e73624efe18b6ca04286720ef74ceed5))
* update dependency org.threeten:threetenbp to v1.4.3 ([#256](https://www.github.com/googleapis/java-bigquery/issues/256)) ([b0457f0](https://www.github.com/googleapis/java-bigquery/commit/b0457f04bbf2a2528b2672d4ea5889d064a123b2))

## [1.110.0](https://www.github.com/googleapis/java-bigquery/compare/v1.109.0...v1.110.0) (2020-03-20)


### Features

* add support for Hive partitioning options when creating external tables ([#235](https://www.github.com/googleapis/java-bigquery/issues/235)) ([#236](https://www.github.com/googleapis/java-bigquery/issues/236)) ([ccc2bb3](https://www.github.com/googleapis/java-bigquery/commit/ccc2bb3de28a36e3791d5441c8bdea2333877ee8))

## [1.109.0](https://www.github.com/googleapis/java-bigquery/compare/v1.108.1...v1.109.0) (2020-03-20)


### Features

* add materialize view ([#174](https://www.github.com/googleapis/java-bigquery/issues/174)) ([d33b645](https://www.github.com/googleapis/java-bigquery/commit/d33b64594f9b3217b0fc89d255618b558a9d45e8))
* add struct query parameters ([#223](https://www.github.com/googleapis/java-bigquery/issues/223)) ([c1997dd](https://www.github.com/googleapis/java-bigquery/commit/c1997ddaca825acd94aafb15fef65c1c272d3284))
* expose hivepartitioningoptions ([#233](https://www.github.com/googleapis/java-bigquery/issues/233)) ([6213ea9](https://www.github.com/googleapis/java-bigquery/commit/6213ea98c7b58634c11ffd13e925482a3627c5dc))


### Dependencies

* update core dependencies ([#218](https://www.github.com/googleapis/java-bigquery/issues/218)) ([3573899](https://www.github.com/googleapis/java-bigquery/commit/3573899485431f57703c2dc1615df79a3a37d075))
* update core dependencies to v1.93.3 ([#224](https://www.github.com/googleapis/java-bigquery/issues/224)) ([0338e39](https://www.github.com/googleapis/java-bigquery/commit/0338e397f61fc87d048f2869e5ee5bba2e584caa))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20191211-1.30.9 ([#212](https://www.github.com/googleapis/java-bigquery/issues/212)) ([8475bd9](https://www.github.com/googleapis/java-bigquery/commit/8475bd9e39b5ec0ebbb43ab12beba43de3bff139))
* update dependency com.google.cloud:google-cloud-storage to v1.105.1 ([#216](https://www.github.com/googleapis/java-bigquery/issues/216)) ([f4a1199](https://www.github.com/googleapis/java-bigquery/commit/f4a11991ae129ef1da2764b163d82838e59737ac))
* update dependency com.google.cloud:google-cloud-storage to v1.105.2 ([#220](https://www.github.com/googleapis/java-bigquery/issues/220)) ([42f6529](https://www.github.com/googleapis/java-bigquery/commit/42f6529d54abdc91111187d026bd256905d7c83d))
* update dependency com.google.cloud:google-cloud-storage to v1.106.0 ([#226](https://www.github.com/googleapis/java-bigquery/issues/226)) ([b78aa00](https://www.github.com/googleapis/java-bigquery/commit/b78aa00519c8af7777ef9015364d6b0259296170))
* update dependency com.google.cloud.samples:shared-configuration to v1.0.12 ([#210](https://www.github.com/googleapis/java-bigquery/issues/210)) ([40a96a0](https://www.github.com/googleapis/java-bigquery/commit/40a96a0dcea2ec56e50479d92d02b58c8972ac36))
* update dependency org.threeten:threetenbp to v1.4.2 ([#237](https://www.github.com/googleapis/java-bigquery/issues/237)) ([ec6328e](https://www.github.com/googleapis/java-bigquery/commit/ec6328ec22e844a9db2a156a7c4e3e4f166cc2b6))

### [1.108.1](https://www.github.com/googleapis/java-bigquery/compare/v1.108.0...v1.108.1) (2020-03-03)


### Dependencies

* update core dependencies to v1.93.1 ([#208](https://www.github.com/googleapis/java-bigquery/issues/208)) ([cea38ba](https://www.github.com/googleapis/java-bigquery/commit/cea38bad185017fd27c4c1b43c17caa709519f8b))
* update dependency com.google.cloud:google-cloud-storage to v1.105.0 ([#201](https://www.github.com/googleapis/java-bigquery/issues/201)) ([1c64193](https://www.github.com/googleapis/java-bigquery/commit/1c641935a89d9702c688b1ba71964607d7f4e353))

## [1.108.0](https://www.github.com/googleapis/java-bigquery/compare/v1.107.0...v1.108.0) (2020-02-28)


### Features

* expose requirepartitionfilter field in table ([#158](https://www.github.com/googleapis/java-bigquery/issues/158)) ([3e51ea0](https://www.github.com/googleapis/java-bigquery/commit/3e51ea02bb9a40c4d20b31a5435954c4d087f26d))
* re-generated  to pick up changes in the API or client library generator. ([#188](https://www.github.com/googleapis/java-bigquery/issues/188)) ([2720b12](https://www.github.com/googleapis/java-bigquery/commit/2720b12f536ad363d9884b5082b7e238183a95e9))


### Dependencies

* update core dependencies ([#196](https://www.github.com/googleapis/java-bigquery/issues/196)) ([0c5bb7f](https://www.github.com/googleapis/java-bigquery/commit/0c5bb7feb6d24ffb2c87ab433c52aaf4b0aa1b91))

## [1.107.0](https://www.github.com/googleapis/java-bigquery/compare/v1.106.0...v1.107.0) (2020-02-19)


### Features

* expose location field of model ([#175](https://www.github.com/googleapis/java-bigquery/issues/175)) ([646c2b4](https://www.github.com/googleapis/java-bigquery/commit/646c2b43b2ccbc609e0d5b85a7e4fbf502bb1243))
* expose slotms field in querystage ([#172](https://www.github.com/googleapis/java-bigquery/issues/172)) ([4a82b3c](https://www.github.com/googleapis/java-bigquery/commit/4a82b3cd1aa821d72efc7046329db075c10ae344))


### Bug Fixes

* allUsers access ([#178](https://www.github.com/googleapis/java-bigquery/issues/178)) ([7464e23](https://www.github.com/googleapis/java-bigquery/commit/7464e234c00da047a06744eef6c7f281d90217cd))


### Dependencies

* update core dependencies to v1.92.5 ([#162](https://www.github.com/googleapis/java-bigquery/issues/162)) ([6ea4141](https://www.github.com/googleapis/java-bigquery/commit/6ea41413aed3d6cc81b9c4995a21f1017e268c74))
* update core transport dependencies to v1.34.2 ([#168](https://www.github.com/googleapis/java-bigquery/issues/168)) ([c35069d](https://www.github.com/googleapis/java-bigquery/commit/c35069d4e91939e51f2101f2b8f93d2f67c089c5))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20191211-1.30.8 ([#161](https://www.github.com/googleapis/java-bigquery/issues/161)) ([54872ba](https://www.github.com/googleapis/java-bigquery/commit/54872ba95ff0903817df217dfa6da883d43e6ace))
* update dependency com.google.cloud:libraries-bom to v4 ([#159](https://www.github.com/googleapis/java-bigquery/issues/159)) ([95e4ff0](https://www.github.com/googleapis/java-bigquery/commit/95e4ff068dd8650ec0acebbe23e958c6e361ed36))
* update dependency com.google.cloud:libraries-bom to v4.0.1 ([#167](https://www.github.com/googleapis/java-bigquery/issues/167)) ([633ea52](https://www.github.com/googleapis/java-bigquery/commit/633ea52ddc3677e8091c1f69283a864929227a17))
* update dependency com.google.cloud:libraries-bom to v4.1.0 ([#170](https://www.github.com/googleapis/java-bigquery/issues/170)) ([6acedda](https://www.github.com/googleapis/java-bigquery/commit/6aceddad33da3055b24a8ae0420c25d85cfb09fb))
* update dependency com.google.protobuf:protobuf-java to v3.11.4 ([#171](https://www.github.com/googleapis/java-bigquery/issues/171)) ([6f292f5](https://www.github.com/googleapis/java-bigquery/commit/6f292f52728992bfeb511b97b1dd778e1ef8db2c))
* update dependency io.grpc:grpc-bom to v1.27.1 ([#169](https://www.github.com/googleapis/java-bigquery/issues/169)) ([5212b2f](https://www.github.com/googleapis/java-bigquery/commit/5212b2f892074be36204fa9ef3e2dff7474828eb))


### Documentation

* broken links ([#154](https://www.github.com/googleapis/java-bigquery/issues/154)) ([e060aba](https://www.github.com/googleapis/java-bigquery/commit/e060aba2ed030a13e50f5e0f5597b3e04ad9c292))

## [1.106.0](https://www.github.com/googleapis/java-bigquery/compare/v1.105.0...v1.106.0) (2020-02-03)


### Features

* re-generated  to pick up changes in the API or client library generator. ([#146](https://www.github.com/googleapis/java-bigquery/issues/146)) ([8b5a2e2](https://www.github.com/googleapis/java-bigquery/commit/8b5a2e23fbc043d323ce1e07f40ceb2886ec7697))


### Bug Fixes

* missing fields in tablefield ([#143](https://www.github.com/googleapis/java-bigquery/issues/143)) ([1f719fb](https://www.github.com/googleapis/java-bigquery/commit/1f719fb5dda9bd0198004c9622614ab469d1b2ea))


### Dependencies

* bump hamcrest dep version and artifactId ([#136](https://www.github.com/googleapis/java-bigquery/issues/136)) ([fc255cd](https://www.github.com/googleapis/java-bigquery/commit/fc255cd320735b24b1105d0512d6e1d20f95d031))
* update core dependencies ([#122](https://www.github.com/googleapis/java-bigquery/issues/122)) ([41ec3a7](https://www.github.com/googleapis/java-bigquery/commit/41ec3a7773b546b49b9983a6fee73d7581b9b9d6))
* update core dependencies ([#144](https://www.github.com/googleapis/java-bigquery/issues/144)) ([c6622b8](https://www.github.com/googleapis/java-bigquery/commit/c6622b814a84e8b05ad35e87e9bf55611fb8bb28))
* update dependency com.google.cloud:google-cloud-storage to v1.103.1 ([#130](https://www.github.com/googleapis/java-bigquery/issues/130)) ([e30b3d7](https://www.github.com/googleapis/java-bigquery/commit/e30b3d7701d3d255fe5e32d6b25a5b28f7fd94e0))
* update dependency com.google.protobuf:protobuf-java to v3.11.3 ([#147](https://www.github.com/googleapis/java-bigquery/issues/147)) ([e619233](https://www.github.com/googleapis/java-bigquery/commit/e619233c9309a4b2f16f117017df53ec997b898e))

## [1.105.0](https://www.github.com/googleapis/java-bigquery/compare/v1.104.0...v1.105.0) (2020-01-28)


### Features

* add new sample - Load: Column Based Time Partitioning ([#119](https://www.github.com/googleapis/java-bigquery/issues/119)) ([6e1eef6](https://www.github.com/googleapis/java-bigquery/commit/6e1eef6124108371b89137529f1c42a1a1d16578))
* add new sample - Tables: Relax column query append ([#115](https://www.github.com/googleapis/java-bigquery/issues/115)) ([1a1480f](https://www.github.com/googleapis/java-bigquery/commit/1a1480f5079c964dd492126557742340e0b6ef6e))
* new sample - Get Model ([#124](https://www.github.com/googleapis/java-bigquery/issues/124)) ([a03670b](https://www.github.com/googleapis/java-bigquery/commit/a03670b3ba19c7805712f09754435e422228abd6))
* new sample - Models: List model resources contained in a dataset ([#125](https://www.github.com/googleapis/java-bigquery/issues/125)) ([3a62206](https://www.github.com/googleapis/java-bigquery/commit/3a62206639f50e9d4ae18cc407303cad0c4a6ddb))


### Bug Fixes

* **debug:** add debug statement to StandardTableDefinition ([#128](https://www.github.com/googleapis/java-bigquery/issues/128)) ([0d4092d](https://www.github.com/googleapis/java-bigquery/commit/0d4092d6ee864d84705819305d045ce89aba8149))


### Dependencies

* update core transport dependencies to v1.34.1 ([#129](https://www.github.com/googleapis/java-bigquery/issues/129)) ([fbbba31](https://www.github.com/googleapis/java-bigquery/commit/fbbba31d67b7670115333a123aabcba77dbd9ad3))

## [1.104.0](https://www.github.com/googleapis/java-bigquery/compare/v1.103.0...v1.104.0) (2020-01-23)


### Features

* add new sample - Table: Create clustered table ([#120](https://www.github.com/googleapis/java-bigquery/issues/120)) ([93f6cc2](https://www.github.com/googleapis/java-bigquery/commit/93f6cc24b77d3492361b4e026fbe6b639f373a12))
* add range partitioning field to tableslist ([#114](https://www.github.com/googleapis/java-bigquery/issues/114)) ([069240f](https://www.github.com/googleapis/java-bigquery/commit/069240fc4ebfc54d39d84fc3a9cc31d093cfa70a))
* new sample - load: GCS parquet replace existing table ([#101](https://www.github.com/googleapis/java-bigquery/issues/101)) ([c423c91](https://www.github.com/googleapis/java-bigquery/commit/c423c91f7689bfc29a94b452842077e2622c621a))
* new sample - Query: Clustered Table ([#121](https://www.github.com/googleapis/java-bigquery/issues/121)) ([df59cc7](https://www.github.com/googleapis/java-bigquery/commit/df59cc70c9507bf65781118a1938e5fd4701bb83))
* new sample - Table: Column Based Time Partitioning ([#118](https://www.github.com/googleapis/java-bigquery/issues/118)) ([eafa6ba](https://www.github.com/googleapis/java-bigquery/commit/eafa6ba8224aec093836e1a7d85ec32176ad7475))
* new sample - Tables: Delete table ([#90](https://www.github.com/googleapis/java-bigquery/issues/90)) ([8a1caa6](https://www.github.com/googleapis/java-bigquery/commit/8a1caa64d139c937e3e2d2dfc10a64e87c240ddc))
* new sample - Tables: Relax column ([#89](https://www.github.com/googleapis/java-bigquery/issues/89)) ([6f95631](https://www.github.com/googleapis/java-bigquery/commit/6f9563160670a7cd2a75afe9774e91180c867206))
* sample - add col load append ([#112](https://www.github.com/googleapis/java-bigquery/issues/112)) ([833b953](https://www.github.com/googleapis/java-bigquery/commit/833b953aad618e88089c7e3487416c5650cc2ccc))
* sample - Get dataset properties ([#98](https://www.github.com/googleapis/java-bigquery/issues/98)) ([743bc0a](https://www.github.com/googleapis/java-bigquery/commit/743bc0a552875b773becbd517a063e29193a6b49))
* sample - query with named params ([#116](https://www.github.com/googleapis/java-bigquery/issues/116)) ([ecec2f7](https://www.github.com/googleapis/java-bigquery/commit/ecec2f73fb43311538e92944341fed51c199cde0))
* sample - query with positional params ([#117](https://www.github.com/googleapis/java-bigquery/issues/117)) ([a5df219](https://www.github.com/googleapis/java-bigquery/commit/a5df219186d80e86d61c13aef6b052fe726a5df6))
* sample - run a legacy SQL query ([#97](https://www.github.com/googleapis/java-bigquery/issues/97)) ([7fedacd](https://www.github.com/googleapis/java-bigquery/commit/7fedacdc5c924de8b25aac59d00018704e0d5af8))


### Dependencies

* update core dependencies ([#107](https://www.github.com/googleapis/java-bigquery/issues/107)) ([bd3a862](https://www.github.com/googleapis/java-bigquery/commit/bd3a862c37b6d8d899ba3443e90a6eed53a70dd4))
* update core dependencies ([#93](https://www.github.com/googleapis/java-bigquery/issues/93)) ([f95b179](https://www.github.com/googleapis/java-bigquery/commit/f95b1798f6a09ff03b195ae7540f9395386c0ea5))
* update dependency com.google.apis:google-api-services-bigquery to v2-rev20191211-1.30.3 ([#105](https://www.github.com/googleapis/java-bigquery/issues/105)) ([8eedb54](https://www.github.com/googleapis/java-bigquery/commit/8eedb5490f78333c9af97279a68120850c057f2a))
* update dependency com.google.cloud:libraries-bom to v3.3.0 ([#108](https://www.github.com/googleapis/java-bigquery/issues/108)) ([c15afb9](https://www.github.com/googleapis/java-bigquery/commit/c15afb9459896790d11d4f3c7e5473104eb6bea8))
* update dependency com.google.cloud:libraries-bom to v3.4.0 ([#113](https://www.github.com/googleapis/java-bigquery/issues/113)) ([772516a](https://www.github.com/googleapis/java-bigquery/commit/772516ae174e75c93894a1283e446095bc1e398b))
* update dependency com.google.truth:truth to v1.0.1 ([#103](https://www.github.com/googleapis/java-bigquery/issues/103)) ([f41a53c](https://www.github.com/googleapis/java-bigquery/commit/f41a53c33942cba59242f515906ec57503549122))
* update dependency junit:junit to v4.13 ([#109](https://www.github.com/googleapis/java-bigquery/issues/109)) ([c36a547](https://www.github.com/googleapis/java-bigquery/commit/c36a547bd2c75da48571fd3f6f91d33a590f9744))
* update dependency org.threeten:threetenbp to v1.4.1 ([88b420e](https://www.github.com/googleapis/java-bigquery/commit/88b420ea817807bdbe25f803f98352fa5a7d6ba4))

## [1.103.0](https://www.github.com/googleapis/java-bigquery/compare/1.102.0...v1.103.0) (2020-01-08)


### Features

* add kokoro jobs for samples module ([#61](https://www.github.com/googleapis/java-bigquery/issues/61)) ([f59dbf4](https://www.github.com/googleapis/java-bigquery/commit/f59dbf439788137ae4fe5215687c47b287b64ab9))
* add samples ([#44](https://www.github.com/googleapis/java-bigquery/issues/44)) ([d3e5e12](https://www.github.com/googleapis/java-bigquery/commit/d3e5e12f2dfa6524ed2311df1449a5ea7a1fc2e1))
* add StandardSQLTypeName factory methods to Field ([#43](https://www.github.com/googleapis/java-bigquery/issues/43)) ([9b37941](https://www.github.com/googleapis/java-bigquery/commit/9b379413e9e5850060d0fbd02ab9797c574f9a44))
* migrate bigquery from google-cloud-java, add bom ([#3](https://www.github.com/googleapis/java-bigquery/issues/3)) ([91b79f6](https://www.github.com/googleapis/java-bigquery/commit/91b79f608ad4743f895c3f9324153cb70065a28c))
* migrate BQ Java samples from java-docs-samples to client lib ([#22](https://www.github.com/googleapis/java-bigquery/issues/22)) ([f0bdc4d](https://www.github.com/googleapis/java-bigquery/commit/f0bdc4dda5d2078dbf2ef84d7f7bbe09561504a8))
* new sample - Tables: Add empty column ([#85](https://www.github.com/googleapis/java-bigquery/issues/85)) ([b8e4c18](https://www.github.com/googleapis/java-bigquery/commit/b8e4c1845c43b96b40cbebb0016c987919f781fe))
* new sample - Tables: Copy multiple tables ([#76](https://www.github.com/googleapis/java-bigquery/issues/76)) ([2476419](https://www.github.com/googleapis/java-bigquery/commit/2476419df9be7b2f52cdd098383c0622c669d046))
* remove unused bom from project ([#37](https://www.github.com/googleapis/java-bigquery/issues/37)) ([c534e75](https://www.github.com/googleapis/java-bigquery/commit/c534e7588dcce120d413fce58794f8b31efce6ba))
* update samples ([#52](https://www.github.com/googleapis/java-bigquery/issues/52)) ([ac9f589](https://www.github.com/googleapis/java-bigquery/commit/ac9f5899ae44e81887e8b4b0d3f6229e942f8d54))
* use libraries-bom for samples ([#38](https://www.github.com/googleapis/java-bigquery/issues/38)) ([f519da2](https://www.github.com/googleapis/java-bigquery/commit/f519da2034586f28de87dbb01ee920d0eb737fa3))


### Bug Fixes

* parentjobid in listjobs ([#20](https://www.github.com/googleapis/java-bigquery/issues/20)) ([1b0b21b](https://www.github.com/googleapis/java-bigquery/commit/1b0b21b7dae97507bfcb449ed78fabff636747f5))


### Dependencies

* re-generated  to pick up changes in the API or client library generator. ([#36](https://www.github.com/googleapis/java-bigquery/issues/36)) ([1712195](https://www.github.com/googleapis/java-bigquery/commit/1712195900c65be051a94e3ab143e4289a287f34))
* update core dependencies to v1.92.1 ([#66](https://www.github.com/googleapis/java-bigquery/issues/66)) ([9c48bb6](https://www.github.com/googleapis/java-bigquery/commit/9c48bb6bc6ae78338e1b14e0508ab524c24978f3))
* update dependencies ([#46](https://www.github.com/googleapis/java-bigquery/issues/46)) ([fd8ce1a](https://www.github.com/googleapis/java-bigquery/commit/fd8ce1ad6fc8e485b568d65ff6f2cd404a0aec91)), closes [#31](https://www.github.com/googleapis/java-bigquery/issues/31) [#35](https://www.github.com/googleapis/java-bigquery/issues/35) [#30](https://www.github.com/googleapis/java-bigquery/issues/30)
* update dependency com.google.cloud:google-cloud-storage to v1.103.0 ([#80](https://www.github.com/googleapis/java-bigquery/issues/80)) ([70c2bbb](https://www.github.com/googleapis/java-bigquery/commit/70c2bbb9eba99e60b958c231e36e09436f9ec624))
* update dependency com.google.guava:guava-bom to v28.2-android ([866659a](https://www.github.com/googleapis/java-bigquery/commit/866659a6e6fd5ee87135552a5798b04b0ad4e87b))
* update dependency com.google.http-client:google-http-client to v1.33.0 ([#8](https://www.github.com/googleapis/java-bigquery/issues/8)) ([d4e28cf](https://www.github.com/googleapis/java-bigquery/commit/d4e28cfcbf71e0ca6037e420b84f7b9dfdcf3be2))
* update dependency com.google.http-client:google-http-client-jackson2 to v1.33.0 ([#9](https://www.github.com/googleapis/java-bigquery/issues/9)) ([ec4a6eb](https://www.github.com/googleapis/java-bigquery/commit/ec4a6ebbf03f1c6ac51027e63f0e198222a830b6))
* update dependency io.grpc:grpc-bom to v1.26.0 ([#49](https://www.github.com/googleapis/java-bigquery/issues/49)) ([3f213c2](https://www.github.com/googleapis/java-bigquery/commit/3f213c29ebc437ec79c04553db8b2675efb3aa54))
* update dependency junit:junit to v4.13 ([#63](https://www.github.com/googleapis/java-bigquery/issues/63)) ([f52e42e](https://www.github.com/googleapis/java-bigquery/commit/f52e42ec5cc55eaaa6b257fcea8eef99f15628cf))


### Documentation

* Update libraries-bom version ([#73](https://www.github.com/googleapis/java-bigquery/issues/73)) ([e967e10](https://www.github.com/googleapis/java-bigquery/commit/e967e10267514dfbac7013cac61f22b74d52b2b8))
