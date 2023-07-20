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
 * IncidentUrgencyRule
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
    "urgency",
    "during_support_hours",
    "outside_support_hours"
})
@JsonTypeName("IncidentUrgencyRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentUrgencyRule {

    /**
     * The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The incidents' urgency, if type is constant.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;

    @JsonProperty("during_support_hours")
    protected IncidentUrgencyType duringSupportHours;

    @JsonProperty("outside_support_hours")
    protected IncidentUrgencyType outsideSupportHours;

    /**
     * Constructs a validated instance of {@link IncidentUrgencyRule}.
     *
     * @param spec the specification to process
     */
    public IncidentUrgencyRule(Consumer<IncidentUrgencyRule> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentUrgencyRule}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentUrgencyRule(Consumer)} instead.
     * @param type The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     * @param urgency The incidents' urgency, if type is constant.
     * @param duringSupportHours var.name
     * @param outsideSupportHours var.name
     */
    @ApiStatus.Internal
    public IncidentUrgencyRule(TypeEnum type, UrgencyEnum urgency, IncidentUrgencyType duringSupportHours, IncidentUrgencyType outsideSupportHours) {
        this.type = type;
        this.urgency = urgency;
        this.duringSupportHours = duringSupportHours;
        this.outsideSupportHours = outsideSupportHours;
    }

    /**
     * The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        CONSTANT("constant"),
        USE_SUPPORT_HOURS("use_support_hours");

        private final String value;
    }

    /**
     * The incidents' urgency, if type is constant.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        LOW("low"),
        HIGH("high"),
        SEVERITY_BASED("severity_based");

        private final String value;
    }

}
