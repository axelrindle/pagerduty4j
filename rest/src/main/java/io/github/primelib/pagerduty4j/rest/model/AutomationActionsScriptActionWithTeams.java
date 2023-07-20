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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsScriptActionWithTeams
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
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "description",
    "action_type",
    "action_classification",
    "runner",
    "runner_type",
    "services",
    "privileges",
    "metadata",
    "creation_time",
    "modify_time",
    "last_run",
    "last_run_by",
    "action_data_reference",
    "teams"
})
@JsonTypeName("AutomationActionsScriptActionWithTeams")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsScriptActionWithTeams {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    @JsonProperty("action_classification")
    protected AutomationActionsActionClassificationEnum actionClassification;

    @JsonProperty("runner")
    protected String runner;

    @JsonProperty("runner_type")
    protected AutomationActionsRunnerTypeEnum runnerType;

    @JsonProperty("services")
    protected List<ServiceReference> services;

    @JsonProperty("privileges")
    protected AutomationActionsUserPermissions privileges;

    @JsonProperty("metadata")
    protected Object metadata;

    /**
     * The date/time
     */
    @JsonProperty("creation_time")
    protected OffsetDateTime creationTime;

    /**
     * The date/time
     */
    @JsonProperty("modify_time")
    protected OffsetDateTime modifyTime;

    /**
     * The date/time
     */
    @JsonProperty("last_run")
    protected OffsetDateTime lastRun;

    @JsonProperty("last_run_by")
    protected AutomationActionsAbstractActionAllOfLastRunBy lastRunBy;

    @JsonProperty("action_data_reference")
    protected AutomationActionsScriptActionDataReference actionDataReference;

    @JsonProperty("teams")
    protected List<TeamReference> teams;

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionWithTeams}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsScriptActionWithTeams(Consumer<AutomationActionsScriptActionWithTeams> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionWithTeams}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsScriptActionWithTeams(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name var.name
     * @param description var.name
     * @param actionType var.name
     * @param actionClassification var.name
     * @param runner var.name
     * @param runnerType var.name
     * @param services var.name
     * @param privileges var.name
     * @param metadata var.name
     * @param creationTime The date/time
     * @param modifyTime The date/time
     * @param lastRun The date/time
     * @param lastRunBy var.name
     * @param actionDataReference var.name
     * @param teams var.name
     */
    @ApiStatus.Internal
    public AutomationActionsScriptActionWithTeams(String id, String summary, String type, String self, String htmlUrl, String name, String description, ActionTypeEnum actionType, AutomationActionsActionClassificationEnum actionClassification, String runner, AutomationActionsRunnerTypeEnum runnerType, List<ServiceReference> services, AutomationActionsUserPermissions privileges, Object metadata, OffsetDateTime creationTime, OffsetDateTime modifyTime, OffsetDateTime lastRun, AutomationActionsAbstractActionAllOfLastRunBy lastRunBy, AutomationActionsScriptActionDataReference actionDataReference, List<TeamReference> teams) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.actionType = actionType;
        this.actionClassification = actionClassification;
        this.runner = runner;
        this.runnerType = runnerType;
        this.services = services;
        this.privileges = privileges;
        this.metadata = metadata;
        this.creationTime = creationTime;
        this.modifyTime = modifyTime;
        this.lastRun = lastRun;
        this.lastRunBy = lastRunBy;
        this.actionDataReference = actionDataReference;
        this.teams = teams;
    }

    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
