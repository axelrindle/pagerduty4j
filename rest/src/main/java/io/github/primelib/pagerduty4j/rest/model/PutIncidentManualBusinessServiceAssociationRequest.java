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
 * PutIncidentManualBusinessServiceAssociationRequest
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
    "relation"
})
@JsonTypeName("putIncidentManualBusinessServiceAssociation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PutIncidentManualBusinessServiceAssociationRequest {

    @JsonProperty("relation")
    protected RelationEnum relation;

    /**
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociationRequest}.
     *
     * @param spec the specification to process
     */
    public PutIncidentManualBusinessServiceAssociationRequest(Consumer<PutIncidentManualBusinessServiceAssociationRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PutIncidentManualBusinessServiceAssociationRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PutIncidentManualBusinessServiceAssociationRequest(Consumer)} instead.
     * @param relation var.name
     */
    @ApiStatus.Internal
    public PutIncidentManualBusinessServiceAssociationRequest(RelationEnum relation) {
        this.relation = relation;
    }

    @AllArgsConstructor
    public enum RelationEnum {
        IMPACTED("impacted"),
        NOT_IMPACTED("not_impacted");

        private final String value;
    }

}
