package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrchestrationIntegration200Response
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "integration"
})
@JsonTypeName("getOrchestrationIntegration_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOrchestrationIntegration200Response {

    @JsonProperty("integration")
    protected OrchestrationIntegration integration;

    /**
     * Constructs a validated instance of {@link GetOrchestrationIntegration200Response}.
     *
     * @param spec the specification to process
     */
    public GetOrchestrationIntegration200Response(Consumer<GetOrchestrationIntegration200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetOrchestrationIntegration200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetOrchestrationIntegration200Response(Consumer)} instead.
     * @param integration var.name
     */
    @ApiStatus.Internal
    public GetOrchestrationIntegration200Response(OrchestrationIntegration integration) {
        this.integration = integration;
    }

}
