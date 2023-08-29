package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListServiceEventRules200ResponseAllOfMigratedTo
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
    "id",
    "type",
    "self"
})
@JsonTypeName("listServiceEventRules_200_response_allOf_migrated_to")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListServiceEventRules200ResponseAllOfMigratedTo {

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link ListServiceEventRules200ResponseAllOfMigratedTo}.
     *
     * @param spec the specification to process
     */
    public ListServiceEventRules200ResponseAllOfMigratedTo(Consumer<ListServiceEventRules200ResponseAllOfMigratedTo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListServiceEventRules200ResponseAllOfMigratedTo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListServiceEventRules200ResponseAllOfMigratedTo(Consumer)} instead.
     * @param id id
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self The API show URL at which the object is accessible
     */
    @ApiStatus.Internal
    public ListServiceEventRules200ResponseAllOfMigratedTo(String id, String type, String self) {
        this.id = id;
        this.type = type;
        this.self = self;
    }

}
