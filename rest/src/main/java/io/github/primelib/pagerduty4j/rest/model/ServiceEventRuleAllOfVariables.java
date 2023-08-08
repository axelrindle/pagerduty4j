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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ServiceEventRuleAllOfVariables
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
    "name",
    "parameters"
})
@JsonTypeName("ServiceEventRule_allOf_variables")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceEventRuleAllOfVariables {

    /**
     * The type of operation to populate the variable.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The name of the variable.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("parameters")
    protected ServiceEventRuleAllOfParameters parameters;

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfVariables}.
     *
     * @param spec the specification to process
     */
    public ServiceEventRuleAllOfVariables(Consumer<ServiceEventRuleAllOfVariables> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceEventRuleAllOfVariables}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceEventRuleAllOfVariables(Consumer)} instead.
     * @param type The type of operation to populate the variable.
     * @param name The name of the variable.
     * @param parameters parameters
     */
    @ApiStatus.Internal
    public ServiceEventRuleAllOfVariables(TypeEnum type, String name, ServiceEventRuleAllOfParameters parameters) {
        this.type = type;
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The type of operation to populate the variable.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        REGEX("regex");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
