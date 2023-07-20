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
 * OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner
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
    "actions"
})
@JsonTypeName("OrchestrationRouter_allOf_orchestration_path_sets_inner_rules_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner {

    @JsonProperty("actions")
    protected OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions actions;

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner}.
     *
     * @param spec the specification to process
     */
    public OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner(Consumer<OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner(Consumer)} instead.
     * @param actions var.name
     */
    @ApiStatus.Internal
    public OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInner(OrchestrationRouterAllOfOrchestrationPathSetsInnerRulesInnerActions actions) {
        this.actions = actions;
    }

}
