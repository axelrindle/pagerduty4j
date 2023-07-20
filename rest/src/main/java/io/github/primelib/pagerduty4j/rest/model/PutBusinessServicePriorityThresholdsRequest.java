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
 * PutBusinessServicePriorityThresholdsRequest
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
    "global_threshold"
})
@JsonTypeName("putBusinessServicePriorityThresholds_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutBusinessServicePriorityThresholdsRequest {

    @JsonProperty("global_threshold")
    protected PutBusinessServicePriorityThresholdsRequestGlobalThreshold globalThreshold;

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholdsRequest}.
     *
     * @param spec the specification to process
     */
    public PutBusinessServicePriorityThresholdsRequest(Consumer<PutBusinessServicePriorityThresholdsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PutBusinessServicePriorityThresholdsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PutBusinessServicePriorityThresholdsRequest(Consumer)} instead.
     * @param globalThreshold var.name
     */
    @ApiStatus.Internal
    public PutBusinessServicePriorityThresholdsRequest(PutBusinessServicePriorityThresholdsRequestGlobalThreshold globalThreshold) {
        this.globalThreshold = globalThreshold;
    }

}
