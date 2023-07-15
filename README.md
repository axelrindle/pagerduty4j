# *PagerDuty4J*

> A java client for the PagerDuty APIs.

## Module: REST

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/pagerduty4j-rest)](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-rest)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/pagerduty4j-rest/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/pagerduty4j-rest)

### Installation

```gradle
implementation("io.github.primelib:pagerduty4j-rest:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-rest).

### Usage

*Parameter-Style*

```java
PagerDutyRESTApi client = PagerDutyRESTFactory.create(spec -> {
    spec.baseUrl("https://api.pagerduty.com");
    spec.api(PagerDutyRESTApi.class);
});

client.listIncidentAlerts("15", 100, null, null, null, null, null, null);
```

*Spec-Style*

```java
PagerDutyRESTSpecApi client = PagerDutyRESTFactory.create(spec -> {
    spec.baseUrl("https://api.pagerduty.com");
    spec.api(PagerDutyRESTSpecApi.class);
});

client.listIncidentAlerts(spec -> {
    spec.id("15");
    spec.limit(100);
});
```

## Module: Events-V2

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/pagerduty4j-events-v2)](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-events-v2)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/pagerduty4j-events-v2/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/pagerduty4j-events-v2)


### Installation

```gradle
implementation("io.github.primelib:pagerduty4j-events-v2:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/pagerduty4j-events-v2).

### Usage

*Parameter-Style*

```java
PagerDutyEventsV2Api client = PagerDutyEventsV2Factory.create(spec -> {
    spec.baseUrl("https://events.pagerduty.com/v2");
    spec.api(PagerDutyEventsV2Api.class);
});

client.createChangeEvent(new CreateChangeEventRequest(new ChangeEventPayload(), "<routingKey>", null, null));
```

*Spec-Style*

```java
PagerDutyEventsV2SpecApi client = PagerDutyEventsV2Factory.create(spec -> {
    spec.baseUrl("https://events.pagerduty.com/v2");
    spec.api(PagerDutyEventsV2SpecApi.class);
});

client.createChangeEvent(spec -> spec.createChangeEventRequest(new CreateChangeEventRequest(new ChangeEventPayload(), "<routingKey>", null, null)));
```

## Contribution

### Generate

The `codegen.sh` script is used to:

- `codegen.sh update`: download and preprocess the openapi spec to resolve external issues if any.
- `codegen.sh generate`: generate the source code from the openapi spec.

### Template

All source code except for files listed in `.openapi-generator-ignore` is generated by our custom [OpenAPI Generator](https://github.com/primelib/primecodegen).
If you see any issues with the generated code related to the template, please open an issue in https://github.com/primelib/primecodegen.

## License

Released under the [MIT License](./LICENSE).
