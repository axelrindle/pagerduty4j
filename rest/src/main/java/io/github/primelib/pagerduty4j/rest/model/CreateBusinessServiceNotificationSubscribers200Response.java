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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBusinessServiceNotificationSubscribers200Response
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
    "subscriptions"
})
@JsonTypeName("createBusinessServiceNotificationSubscribers_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceNotificationSubscribers200Response {

    @JsonProperty("subscriptions")
    protected List<NotificationSubscriptionWithContext> subscriptions;

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribers200Response}.
     *
     * @param spec the specification to process
     */
    public CreateBusinessServiceNotificationSubscribers200Response(Consumer<CreateBusinessServiceNotificationSubscribers200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceNotificationSubscribers200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateBusinessServiceNotificationSubscribers200Response(Consumer)} instead.
     * @param subscriptions subscriptions
     */
    @ApiStatus.Internal
    public CreateBusinessServiceNotificationSubscribers200Response(List<NotificationSubscriptionWithContext> subscriptions) {
        this.subscriptions = subscriptions;
    }

}
