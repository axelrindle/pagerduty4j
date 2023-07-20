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
 * TagsToRemove
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
    "type",
    "id"
})
@JsonTypeName("Tags_to_remove_")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class TagsToRemove {

    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The id of the tag
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link TagsToRemove}.
     *
     * @param spec the specification to process
     */
    public TagsToRemove(Consumer<TagsToRemove> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link TagsToRemove}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #TagsToRemove(Consumer)} instead.
     * @param type var.name
     * @param id The id of the tag
     */
    @ApiStatus.Internal
    public TagsToRemove(TypeEnum type, String id) {
        this.type = type;
        this.id = id;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        TAG_REFERENCE("tag_reference");

        private final String value;
    }

}
