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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertGroupingParameters
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
    "type",
    "config"
})
@JsonTypeName("AlertGroupingParameters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertGroupingParameters {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("config")
    protected AlertGroupingParametersConfig config;

    /**
     * Constructs a validated instance of {@link AlertGroupingParameters}.
     *
     * @param spec the specification to process
     */
    public AlertGroupingParameters(Consumer<AlertGroupingParameters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertGroupingParameters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertGroupingParameters(Consumer)} instead.
     * @param type var.name
     * @param config var.name
     */
    @ApiStatus.Internal
    public AlertGroupingParameters(TypeEnum type, AlertGroupingParametersConfig config) {
        this.type = type;
        this.config = config;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TIME("time"),
        INTELLIGENT("intelligent"),
        CONTENT_BASED("content_based"),
        NULL("null");

        private final String value;
    }

}
