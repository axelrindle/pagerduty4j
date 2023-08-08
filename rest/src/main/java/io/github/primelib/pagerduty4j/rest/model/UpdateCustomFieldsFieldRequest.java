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
 * UpdateCustomFieldsFieldRequest
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
    "field"
})
@JsonTypeName("updateCustomFieldsField_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldsFieldRequest {

    @JsonProperty("field")
    protected CustomFieldsEditableField field;

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldsFieldRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateCustomFieldsFieldRequest(Consumer<UpdateCustomFieldsFieldRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldsFieldRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateCustomFieldsFieldRequest(Consumer)} instead.
     * @param field field
     */
    @ApiStatus.Internal
    public UpdateCustomFieldsFieldRequest(CustomFieldsEditableField field) {
        this.field = field;
    }

}
