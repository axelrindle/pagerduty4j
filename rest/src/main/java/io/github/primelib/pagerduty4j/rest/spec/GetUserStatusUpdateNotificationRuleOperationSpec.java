package io.github.primelib.pagerduty4j.rest.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetUserStatusUpdateNotificationRuleSpec
 * <p>
 * Specification for the GetUserStatusUpdateNotificationRule operation.
 * <p>
 * Get a user's status update notification rule
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserStatusUpdateNotificationRuleOperationSpec {
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
     * The status update notification rule ID on the user.
     */
    @NotNull 
    private String statusUpdateNotificationRuleId;

    /**
     * Array of additional details to include.
     */
    @Nullable 
    private String include;

    /**
     * Constructs a validated instance of {@link GetUserStatusUpdateNotificationRuleOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUserStatusUpdateNotificationRuleOperationSpec(Consumer<GetUserStatusUpdateNotificationRuleOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetUserStatusUpdateNotificationRuleOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the resource.
     * @param statusUpdateNotificationRuleId The status update notification rule ID on the user.
     * @param include              Array of additional details to include.
     */
    @ApiStatus.Internal
    public GetUserStatusUpdateNotificationRuleOperationSpec(String id, String statusUpdateNotificationRuleId, String include) {
        this.id = id;
        this.statusUpdateNotificationRuleId = statusUpdateNotificationRuleId;
        this.include = include;

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
        Objects.requireNonNull(statusUpdateNotificationRuleId, "statusUpdateNotificationRuleId is a required parameter!");
    }
}
