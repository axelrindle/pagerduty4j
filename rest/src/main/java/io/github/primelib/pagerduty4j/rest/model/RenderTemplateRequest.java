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
 * RenderTemplateRequest
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
    "incident_id",
    "status_update",
    "external"
})
@JsonTypeName("renderTemplate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RenderTemplateRequest {

    /**
     * The incident id to render the template for
     */
    @JsonProperty("incident_id")
    protected String incidentId;

    @JsonProperty("status_update")
    protected StatusUpdateTemplateInputStatusUpdate statusUpdate;

    /**
     * An optional object collection that can be referenced in the template.
     */
    @JsonProperty("external")
    protected Object external;

    /**
     * Constructs a validated instance of {@link RenderTemplateRequest}.
     *
     * @param spec the specification to process
     */
    public RenderTemplateRequest(Consumer<RenderTemplateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RenderTemplateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RenderTemplateRequest(Consumer)} instead.
     * @param incidentId The incident id to render the template for
     * @param statusUpdate statusUpdate
     * @param external An optional object collection that can be referenced in the template.
     */
    @ApiStatus.Internal
    public RenderTemplateRequest(String incidentId, StatusUpdateTemplateInputStatusUpdate statusUpdate, Object external) {
        this.incidentId = incidentId;
        this.statusUpdate = statusUpdate;
        this.external = external;
    }

}
