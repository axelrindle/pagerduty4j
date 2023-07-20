package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.rest.model.CreateTeamNotificationSubscriptionsRequest;
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
 * CreateUserNotificationSubscriptionsSpec
 * <p>
 * Specification for the CreateUserNotificationSubscriptions operation.
 * <p>
 * Create Notification Subcriptions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateUserNotificationSubscriptionsOperationSpec {
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
     * The entities to subscribe to.
     */
    @Nullable 
    private CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest;

    /**
     * Constructs a validated instance of {@link CreateUserNotificationSubscriptionsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateUserNotificationSubscriptionsOperationSpec(Consumer<CreateUserNotificationSubscriptionsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateUserNotificationSubscriptionsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param createTeamNotificationSubscriptionsRequest The entities to subscribe to.
     */
    @ApiStatus.Internal
    public CreateUserNotificationSubscriptionsOperationSpec(String id, CreateTeamNotificationSubscriptionsRequest createTeamNotificationSubscriptionsRequest) {
        this.id = id;
        this.createTeamNotificationSubscriptionsRequest = createTeamNotificationSubscriptionsRequest;

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
    }
}
