package rvg.sots;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import org.postgresql.pljava.annotation.MappedUDT;
import rvg.Interchange;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charmingc0d3r on 4.11.16..
 */
@XmlRootElement
@Entity
@Table(name = "courses", schema = "public", catalog = "canvas_development")
@MappedUDT(name = "courses", schema = "public",structure = {"id bigint",
        "name character varying",
        "account_id bigint",
        "group_weighting_scheme character varying",
        "old_account_id bigint",
        "workflow_state character varying",
        "uuid character varying",
        "start_at timestamp without time zone",
        "conclude_at timestamp without time zone",
        "grading_standard_id bigint",
        "is_public boolean",
        "allow_student_wiki_edits boolean",
        "created_at timestamp without time zone",
        "updated_at timestamp without time zone",
        "show_public_context_messages boolean",
        "syllabus_body text",
        "allow_student_forum_attachments boolean",
        "default_wiki_editing_roles character varying",
        "wiki_id bigint",
        "allow_student_organized_groups boolean",
        "course_code character varying",
        "default_view character varying",
        "abstract_course_id bigint",
        "root_account_id bigint",
        "enrollment_term_id bigint",
        "sis_source_id character varying",
        "sis_batch_id bigint",
        "show_all_discussion_entries boolean",
        "open_enrollment boolean",
        "storage_quota bigint",
        "tab_configuration text",
        "allow_wiki_comments boolean",
        "turnitin_comments text",
        "self_enrollment boolean",
        "license character varying",
        "indexed boolean",
        "restrict_enrollments_to_course_dates boolean",
        "template_course_id bigint",
        "locale character varying",
        "settings text",
        "replacement_course_id bigint",
        "stuck_sis_fields text",
        "public_description text",
        "self_enrollment_code character varying",
        "self_enrollment_limit integer",
        "integration_id character varying",
        "time_zone character varying",
        "lti_context_id character varying",
        "turnitin_id bigint"
})
public class CoursesEntity {
    private long id;
    private String name;
    private String groupWeightingScheme;
    private Long oldAccountId;
    private String workflowState;
    private String uuid;
    private Timestamp startAt;
    private Timestamp concludeAt;
    private Long gradingStandardId;
    private Boolean isPublic;
    private Boolean allowStudentWikiEdits;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean showPublicContextMessages;
    private String syllabusBody;
    private Boolean allowStudentForumAttachments;
    private String defaultWikiEditingRoles;
    private Boolean allowStudentOrganizedGroups;
    private String courseCode;
    private String defaultView;
    private String sisSourceId;
    private Boolean showAllDiscussionEntries;
    private Boolean openEnrollment;
    private Long storageQuota;
    private String tabConfiguration;
    private Boolean allowWikiComments;
    private String turnitinComments;
    private Boolean selfEnrollment;
    private String license;
    private Boolean indexed;
    private Boolean restrictEnrollmentsToCourseDates;
    private String locale;
    private String settings;
    private Long replacementCourseId;
    private String stuckSisFields;
    private String publicDescription;
    private String selfEnrollmentCode;
    private Integer selfEnrollmentLimit;
    private String integrationId;
    private String timeZone;
    private String ltiContextId;
    private Long turnitinId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "group_weighting_scheme", nullable = true, length = 255)
    public String getGroupWeightingScheme() {
        return groupWeightingScheme;
    }

    public void setGroupWeightingScheme(String groupWeightingScheme) {
        this.groupWeightingScheme = groupWeightingScheme;
    }

    @Basic
    @Column(name = "old_account_id", nullable = true)
    public Long getOldAccountId() {
        return oldAccountId;
    }

    public void setOldAccountId(Long oldAccountId) {
        this.oldAccountId = oldAccountId;
    }

    @Basic
    @Column(name = "workflow_state", nullable = false, length = 255)
    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    @Basic
    @Column(name = "uuid", nullable = true, length = 255)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "start_at", nullable = true)
    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    @Basic
    @Column(name = "conclude_at", nullable = true)
    public Timestamp getConcludeAt() {
        return concludeAt;
    }

    public void setConcludeAt(Timestamp concludeAt) {
        this.concludeAt = concludeAt;
    }

    @Basic
    @Column(name = "grading_standard_id", nullable = true)
    public Long getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(Long gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    @Basic
    @Column(name = "is_public", nullable = true)
    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    @Basic
    @Column(name = "allow_student_wiki_edits", nullable = true)
    public Boolean getAllowStudentWikiEdits() {
        return allowStudentWikiEdits;
    }

    public void setAllowStudentWikiEdits(Boolean allowStudentWikiEdits) {
        this.allowStudentWikiEdits = allowStudentWikiEdits;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "show_public_context_messages", nullable = true)
    public Boolean getShowPublicContextMessages() {
        return showPublicContextMessages;
    }

    public void setShowPublicContextMessages(Boolean showPublicContextMessages) {
        this.showPublicContextMessages = showPublicContextMessages;
    }

    @Basic
    @Column(name = "syllabus_body", nullable = true, length = -1)
    public String getSyllabusBody() {
        return syllabusBody;
    }

    public void setSyllabusBody(String syllabusBody) {
        this.syllabusBody = syllabusBody;
    }

    @Basic
    @Column(name = "allow_student_forum_attachments", nullable = true)
    public Boolean getAllowStudentForumAttachments() {
        return allowStudentForumAttachments;
    }

    public void setAllowStudentForumAttachments(Boolean allowStudentForumAttachments) {
        this.allowStudentForumAttachments = allowStudentForumAttachments;
    }

    @Basic
    @Column(name = "default_wiki_editing_roles", nullable = true, length = 255)
    public String getDefaultWikiEditingRoles() {
        return defaultWikiEditingRoles;
    }

    public void setDefaultWikiEditingRoles(String defaultWikiEditingRoles) {
        this.defaultWikiEditingRoles = defaultWikiEditingRoles;
    }

    @Basic
    @Column(name = "allow_student_organized_groups", nullable = true)
    public Boolean getAllowStudentOrganizedGroups() {
        return allowStudentOrganizedGroups;
    }

    public void setAllowStudentOrganizedGroups(Boolean allowStudentOrganizedGroups) {
        this.allowStudentOrganizedGroups = allowStudentOrganizedGroups;
    }

    @Basic
    @Column(name = "course_code", nullable = true, length = 255)
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Basic
    @Column(name = "default_view", nullable = true, length = 255)
    public String getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    @Basic
    @Column(name = "sis_source_id", nullable = true, length = 255)
    public String getSisSourceId() {
        return sisSourceId;
    }

    public void setSisSourceId(String sisSourceId) {
        this.sisSourceId = sisSourceId;
    }

    @Basic
    @Column(name = "show_all_discussion_entries", nullable = true)
    public Boolean getShowAllDiscussionEntries() {
        return showAllDiscussionEntries;
    }

    public void setShowAllDiscussionEntries(Boolean showAllDiscussionEntries) {
        this.showAllDiscussionEntries = showAllDiscussionEntries;
    }

    @Basic
    @Column(name = "open_enrollment", nullable = true)
    public Boolean getOpenEnrollment() {
        return openEnrollment;
    }

    public void setOpenEnrollment(Boolean openEnrollment) {
        this.openEnrollment = openEnrollment;
    }

    @Basic
    @Column(name = "storage_quota", nullable = true)
    public Long getStorageQuota() {
        return storageQuota;
    }

    public void setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
    }

    @Basic
    @Column(name = "tab_configuration", nullable = true, length = -1)
    public String getTabConfiguration() {
        return tabConfiguration;
    }

    public void setTabConfiguration(String tabConfiguration) {
        this.tabConfiguration = tabConfiguration;
    }

    @Basic
    @Column(name = "allow_wiki_comments", nullable = true)
    public Boolean getAllowWikiComments() {
        return allowWikiComments;
    }

    public void setAllowWikiComments(Boolean allowWikiComments) {
        this.allowWikiComments = allowWikiComments;
    }

    @Basic
    @Column(name = "turnitin_comments", nullable = true, length = -1)
    public String getTurnitinComments() {
        return turnitinComments;
    }

    public void setTurnitinComments(String turnitinComments) {
        this.turnitinComments = turnitinComments;
    }

    @Basic
    @Column(name = "self_enrollment", nullable = true)
    public Boolean getSelfEnrollment() {
        return selfEnrollment;
    }

    public void setSelfEnrollment(Boolean selfEnrollment) {
        this.selfEnrollment = selfEnrollment;
    }

    @Basic
    @Column(name = "license", nullable = true, length = 255)
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Basic
    @Column(name = "indexed", nullable = true)
    public Boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(Boolean indexed) {
        this.indexed = indexed;
    }

    @Basic
    @Column(name = "restrict_enrollments_to_course_dates", nullable = true)
    public Boolean getRestrictEnrollmentsToCourseDates() {
        return restrictEnrollmentsToCourseDates;
    }

    public void setRestrictEnrollmentsToCourseDates(Boolean restrictEnrollmentsToCourseDates) {
        this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
    }

    @Basic
    @Column(name = "locale", nullable = true, length = 255)
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Basic
    @Column(name = "settings", nullable = true, length = -1)
    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Basic
    @Column(name = "replacement_course_id", nullable = true)
    public Long getReplacementCourseId() {
        return replacementCourseId;
    }

    public void setReplacementCourseId(Long replacementCourseId) {
        this.replacementCourseId = replacementCourseId;
    }

    @Basic
    @Column(name = "stuck_sis_fields", nullable = true, length = -1)
    public String getStuckSisFields() {
        return stuckSisFields;
    }

    public void setStuckSisFields(String stuckSisFields) {
        this.stuckSisFields = stuckSisFields;
    }

    @Basic
    @Column(name = "public_description", nullable = true, length = -1)
    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    @Basic
    @Column(name = "self_enrollment_code", nullable = true, length = 255)
    public String getSelfEnrollmentCode() {
        return selfEnrollmentCode;
    }

    public void setSelfEnrollmentCode(String selfEnrollmentCode) {
        this.selfEnrollmentCode = selfEnrollmentCode;
    }

    @Basic
    @Column(name = "self_enrollment_limit", nullable = true)
    public Integer getSelfEnrollmentLimit() {
        return selfEnrollmentLimit;
    }

    public void setSelfEnrollmentLimit(Integer selfEnrollmentLimit) {
        this.selfEnrollmentLimit = selfEnrollmentLimit;
    }

    @Basic
    @Column(name = "integration_id", nullable = true, length = 255)
    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    @Basic
    @Column(name = "time_zone", nullable = true, length = 255)
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Basic
    @Column(name = "lti_context_id", nullable = true, length = 255)
    public String getLtiContextId() {
        return ltiContextId;
    }

    public void setLtiContextId(String ltiContextId) {
        this.ltiContextId = ltiContextId;
    }

    @Basic
    @Column(name = "turnitin_id", nullable = true)
    public Long getTurnitinId() {
        return turnitinId;
    }

    public void setTurnitinId(Long turnitinId) {
        this.turnitinId = turnitinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursesEntity that = (CoursesEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (groupWeightingScheme != null ? !groupWeightingScheme.equals(that.groupWeightingScheme) : that.groupWeightingScheme != null)
            return false;
        if (oldAccountId != null ? !oldAccountId.equals(that.oldAccountId) : that.oldAccountId != null) return false;
        if (workflowState != null ? !workflowState.equals(that.workflowState) : that.workflowState != null)
            return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (startAt != null ? !startAt.equals(that.startAt) : that.startAt != null) return false;
        if (concludeAt != null ? !concludeAt.equals(that.concludeAt) : that.concludeAt != null) return false;
        if (gradingStandardId != null ? !gradingStandardId.equals(that.gradingStandardId) : that.gradingStandardId != null)
            return false;
        if (isPublic != null ? !isPublic.equals(that.isPublic) : that.isPublic != null) return false;
        if (allowStudentWikiEdits != null ? !allowStudentWikiEdits.equals(that.allowStudentWikiEdits) : that.allowStudentWikiEdits != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (showPublicContextMessages != null ? !showPublicContextMessages.equals(that.showPublicContextMessages) : that.showPublicContextMessages != null)
            return false;
        if (syllabusBody != null ? !syllabusBody.equals(that.syllabusBody) : that.syllabusBody != null) return false;
        if (allowStudentForumAttachments != null ? !allowStudentForumAttachments.equals(that.allowStudentForumAttachments) : that.allowStudentForumAttachments != null)
            return false;
        if (defaultWikiEditingRoles != null ? !defaultWikiEditingRoles.equals(that.defaultWikiEditingRoles) : that.defaultWikiEditingRoles != null)
            return false;
        if (allowStudentOrganizedGroups != null ? !allowStudentOrganizedGroups.equals(that.allowStudentOrganizedGroups) : that.allowStudentOrganizedGroups != null)
            return false;
        if (courseCode != null ? !courseCode.equals(that.courseCode) : that.courseCode != null) return false;
        if (defaultView != null ? !defaultView.equals(that.defaultView) : that.defaultView != null) return false;
        if (sisSourceId != null ? !sisSourceId.equals(that.sisSourceId) : that.sisSourceId != null) return false;
        if (showAllDiscussionEntries != null ? !showAllDiscussionEntries.equals(that.showAllDiscussionEntries) : that.showAllDiscussionEntries != null)
            return false;
        if (openEnrollment != null ? !openEnrollment.equals(that.openEnrollment) : that.openEnrollment != null)
            return false;
        if (storageQuota != null ? !storageQuota.equals(that.storageQuota) : that.storageQuota != null) return false;
        if (tabConfiguration != null ? !tabConfiguration.equals(that.tabConfiguration) : that.tabConfiguration != null)
            return false;
        if (allowWikiComments != null ? !allowWikiComments.equals(that.allowWikiComments) : that.allowWikiComments != null)
            return false;
        if (turnitinComments != null ? !turnitinComments.equals(that.turnitinComments) : that.turnitinComments != null)
            return false;
        if (selfEnrollment != null ? !selfEnrollment.equals(that.selfEnrollment) : that.selfEnrollment != null)
            return false;
        if (license != null ? !license.equals(that.license) : that.license != null) return false;
        if (indexed != null ? !indexed.equals(that.indexed) : that.indexed != null) return false;
        if (restrictEnrollmentsToCourseDates != null ? !restrictEnrollmentsToCourseDates.equals(that.restrictEnrollmentsToCourseDates) : that.restrictEnrollmentsToCourseDates != null)
            return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (settings != null ? !settings.equals(that.settings) : that.settings != null) return false;
        if (replacementCourseId != null ? !replacementCourseId.equals(that.replacementCourseId) : that.replacementCourseId != null)
            return false;
        if (stuckSisFields != null ? !stuckSisFields.equals(that.stuckSisFields) : that.stuckSisFields != null)
            return false;
        if (publicDescription != null ? !publicDescription.equals(that.publicDescription) : that.publicDescription != null)
            return false;
        if (selfEnrollmentCode != null ? !selfEnrollmentCode.equals(that.selfEnrollmentCode) : that.selfEnrollmentCode != null)
            return false;
        if (selfEnrollmentLimit != null ? !selfEnrollmentLimit.equals(that.selfEnrollmentLimit) : that.selfEnrollmentLimit != null)
            return false;
        if (integrationId != null ? !integrationId.equals(that.integrationId) : that.integrationId != null)
            return false;
        if (timeZone != null ? !timeZone.equals(that.timeZone) : that.timeZone != null) return false;
        if (ltiContextId != null ? !ltiContextId.equals(that.ltiContextId) : that.ltiContextId != null) return false;
        if (turnitinId != null ? !turnitinId.equals(that.turnitinId) : that.turnitinId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (groupWeightingScheme != null ? groupWeightingScheme.hashCode() : 0);
        result = 31 * result + (oldAccountId != null ? oldAccountId.hashCode() : 0);
        result = 31 * result + (workflowState != null ? workflowState.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (concludeAt != null ? concludeAt.hashCode() : 0);
        result = 31 * result + (gradingStandardId != null ? gradingStandardId.hashCode() : 0);
        result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
        result = 31 * result + (allowStudentWikiEdits != null ? allowStudentWikiEdits.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (showPublicContextMessages != null ? showPublicContextMessages.hashCode() : 0);
        result = 31 * result + (syllabusBody != null ? syllabusBody.hashCode() : 0);
        result = 31 * result + (allowStudentForumAttachments != null ? allowStudentForumAttachments.hashCode() : 0);
        result = 31 * result + (defaultWikiEditingRoles != null ? defaultWikiEditingRoles.hashCode() : 0);
        result = 31 * result + (allowStudentOrganizedGroups != null ? allowStudentOrganizedGroups.hashCode() : 0);
        result = 31 * result + (courseCode != null ? courseCode.hashCode() : 0);
        result = 31 * result + (defaultView != null ? defaultView.hashCode() : 0);
        result = 31 * result + (sisSourceId != null ? sisSourceId.hashCode() : 0);
        result = 31 * result + (showAllDiscussionEntries != null ? showAllDiscussionEntries.hashCode() : 0);
        result = 31 * result + (openEnrollment != null ? openEnrollment.hashCode() : 0);
        result = 31 * result + (storageQuota != null ? storageQuota.hashCode() : 0);
        result = 31 * result + (tabConfiguration != null ? tabConfiguration.hashCode() : 0);
        result = 31 * result + (allowWikiComments != null ? allowWikiComments.hashCode() : 0);
        result = 31 * result + (turnitinComments != null ? turnitinComments.hashCode() : 0);
        result = 31 * result + (selfEnrollment != null ? selfEnrollment.hashCode() : 0);
        result = 31 * result + (license != null ? license.hashCode() : 0);
        result = 31 * result + (indexed != null ? indexed.hashCode() : 0);
        result = 31 * result + (restrictEnrollmentsToCourseDates != null ? restrictEnrollmentsToCourseDates.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (settings != null ? settings.hashCode() : 0);
        result = 31 * result + (replacementCourseId != null ? replacementCourseId.hashCode() : 0);
        result = 31 * result + (stuckSisFields != null ? stuckSisFields.hashCode() : 0);
        result = 31 * result + (publicDescription != null ? publicDescription.hashCode() : 0);
        result = 31 * result + (selfEnrollmentCode != null ? selfEnrollmentCode.hashCode() : 0);
        result = 31 * result + (selfEnrollmentLimit != null ? selfEnrollmentLimit.hashCode() : 0);
        result = 31 * result + (integrationId != null ? integrationId.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (ltiContextId != null ? ltiContextId.hashCode() : 0);
        result = 31 * result + (turnitinId != null ? turnitinId.hashCode() : 0);
        return result;
    }

    public static CoursesEntity getById(Long id) {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        CoursesEntity result = null;
        result = session.get(CoursesEntity.class,id);
        session.close();
        factory.close();
        return result;
    }

    public static List<CoursesEntity> getAll() {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        org.hibernate.query.Query query = session.createQuery("from CoursesEntity");
        java.util.List<CoursesEntity> result = query.list();
        session.close();
        factory.close();
        return result;
    }
}
