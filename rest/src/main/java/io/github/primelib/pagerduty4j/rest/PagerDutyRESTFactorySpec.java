package io.github.primelib.pagerduty4j.rest;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.api.PagerDutyRESTApi;
import io.github.primelib.pagerduty4j.rest.auth.AuthMethod;
import io.github.primelib.pagerduty4j.rest.auth.ApiKeyAuthSpec;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * A specification to construct a {@link PagerDutyRESTApi} instance.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public final class PagerDutyRESTFactorySpec<T> {

    /**
     * The name of the backend to use
     */
    @NotNull
    private String backendName = "pagerduty4j-rest";

    /**
     * The API interface to use
     */
    @NotNull
    private Class<T> api;

    /**
     * The api base URL
     */
    @NotNull
    private String baseUrl = "https://api.pagerduty.com";

    /**
     * The authentication methods to use
     */
    @Nullable
    private List<AuthMethod> auth = new ArrayList<>(5);

    /**
     * The proxy server to use, if applicable
     * <p>
     * Defaults to {@code null}.
     * Set to {@code PagerDutyRESTProxySpec.detect()} to detect the proxy based on the os environment automatically.
     */
    @Nullable
    private PagerDutyRESTProxySpec proxy = null;

    /**
     * MeterRegistry to use for metrics
     */
    @NotNull
    private MeterRegistry meterRegistry = new CompositeMeterRegistry();

    /**
     * the feign log level
     * <p>
     * Defaults to {@code none}.
     * Allowed values are: {@code none}, {@code basic}, {@code headers}, {@code full}
     */
    @NotNull
    private String logLevel = "none";

    /**
     * Constructs a validated implementation of {@link PagerDutyRESTApi}.
     *
     * @param spec the specification to process
     */
    @NotNull
    public PagerDutyRESTFactorySpec(@NotNull Consumer<PagerDutyRESTFactorySpec<T>> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Ensures the configured specification is valid.
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(backendName, "backendName must not be null");
        Objects.requireNonNull(api, "api must not be null");
        Objects.requireNonNull(baseUrl, "baseUrl must not be null");
        if (baseUrl.isEmpty()) {
            throw new IllegalArgumentException("baseUrl must not be empty");
        }
        Objects.requireNonNull(logLevel, "logLevel must not be null");
    }

    public PagerDutyRESTProxySpec httpProxy(Consumer<PagerDutyRESTProxySpec> proxySpec) {
        PagerDutyRESTProxySpec proxy = new PagerDutyRESTProxySpec(proxySpec);
        proxy(proxy);
        return proxy;
    }

    public ApiKeyAuthSpec apiKeyAuth(Consumer<ApiKeyAuthSpec> spec) {
        ApiKeyAuthSpec method = new ApiKeyAuthSpec(spec);
        auth.add(method);
        return method;
    }

    public void applySpec(PagerDutyRESTFactorySpec<?> spec) {
        backendName(spec.backendName());
        baseUrl(spec.baseUrl());
        auth(spec.auth());
        proxy(spec.proxy());
        meterRegistry(spec.meterRegistry());
    }
}
