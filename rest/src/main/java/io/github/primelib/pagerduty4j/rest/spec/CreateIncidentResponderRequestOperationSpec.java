package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateIncidentResponderRequestRequest;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateIncidentResponderRequestSpec
 * <p>
 * Specification for the CreateIncidentResponderRequest operation.
 * <p>
 * Create a responder request for an incident
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIncidentResponderRequestOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the resource.
     */
    @NotNull 
    private String id;

    /**
     * The email address of a valid user associated with the account making the request.
     */
    @NotNull 
    private String from;

    /**
     */
    @Nullable 
    private CreateIncidentResponderRequestRequest createIncidentResponderRequestRequest;

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequestOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIncidentResponderRequestOperationSpec(Consumer<CreateIncidentResponderRequestOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateIncidentResponderRequestOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param from                 The email address of a valid user associated with the account making the request.
     * @param createIncidentResponderRequestRequest 
     */
    @ApiStatus.Internal
    public CreateIncidentResponderRequestOperationSpec(String id, String from, CreateIncidentResponderRequestRequest createIncidentResponderRequestRequest) {
        this.id = id;
        this.from = from;
        this.createIncidentResponderRequestRequest = createIncidentResponderRequestRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(from, "from is a required parameter!");
    }
}
