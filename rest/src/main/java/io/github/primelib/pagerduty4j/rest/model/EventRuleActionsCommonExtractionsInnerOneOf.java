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
 * EventRuleActionsCommonExtractionsInnerOneOf
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
    "target",
    "source",
    "regex"
})
@JsonTypeName("EventRuleActionsCommon_extractions_inner_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonExtractionsInnerOneOf {

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * The path to the event field where the regex will be applied to extract a value.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * A RE2 regular expression.
     * If it contains one or more capture groups, their values will be extracted and appended together.
     * If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("regex")
    protected String regex;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonExtractionsInnerOneOf}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonExtractionsInnerOneOf(Consumer<EventRuleActionsCommonExtractionsInnerOneOf> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonExtractionsInnerOneOf}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonExtractionsInnerOneOf(Consumer)} instead.
     * @param target The PD-CEF field that will be set with the value from the regex.
     * @param source The path to the event field where the regex will be applied to extract a value.
     * @param regex A RE2 regular expression.  If it contains one or more capture groups, their values will be extracted and appended together.  If it contains no capture groups, the whole match is used.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonExtractionsInnerOneOf(String target, String source, String regex) {
        this.target = target;
        this.source = source;
        this.regex = regex;
    }

}
