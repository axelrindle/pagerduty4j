package io.github.primelib.pagerduty4j.rest.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
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
 * GetTemplatesSpec
 * <p>
 * Specification for the GetTemplates operation.
 * <p>
 * List templates
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetTemplatesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The number of results per page.
     */
    @Nullable 
    private Integer limit;

    /**
     * Offset to start pagination search results.
     */
    @Nullable 
    private Integer offset;

    /**
     * By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.
     * See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     */
    @Nullable 
    private Boolean total;

    /**
     * Template name or description to search
     */
    @Nullable 
    private String query;

    /**
     * Filters templates by type.
     */
    @Nullable 
    private String templateType;

    /**
     * Used to specify both the field you wish to sort the results on (name/created_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. Sort direction defaults to ascending.
     */
    @Nullable 
    private String sortBy;

    /**
     * Constructs a validated instance of {@link GetTemplatesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetTemplatesOperationSpec(Consumer<GetTemplatesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetTemplatesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param limit                The number of results per page.
     * @param offset               Offset to start pagination search results.
     * @param total                By default the {@code total} field in pagination responses is set to {@code null} to provide the fastest possible response times. Set {@code total} to {@code true} for this field to be populated.  See our [Pagination Docs](https://developer.pagerduty.com/docs/rest-api-v2/pagination/) for more information. 
     * @param query                Template name or description to search
     * @param templateType         Filters templates by type.
     * @param sortBy               Used to specify both the field you wish to sort the results on (name/created_at), as well as the direction (asc/desc) of the results. The sort_by field and direction should be separated by a colon. Sort direction defaults to ascending.
     */
    @ApiStatus.Internal
    public GetTemplatesOperationSpec(Integer limit, Integer offset, Boolean total, String query, String templateType, String sortBy) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
        this.query = query;
        this.templateType = templateType;
        this.sortBy = sortBy;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
