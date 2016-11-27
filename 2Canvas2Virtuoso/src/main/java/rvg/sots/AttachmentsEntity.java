package rvg.sots;

import org.postgresql.pljava.annotation.Function;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import org.hibernate.query.Query;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by charmingc0d3r on 4.11.16..
 */
@XmlRootElement
@Entity
@Table(name = "attachments", schema = "public", catalog = "canvas_development")
public class AttachmentsEntity{
    private long id;
    private Long contextId;
    private String contextType;
    private Long size;
    private Long folderId;
    private String contentType;
    private String filename;
    private String uuid;
    private String displayName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String workflowState;
    private Long userId;
    private Boolean locked;
    private String fileState;
    private Timestamp deletedAt;
    private Integer position;
    private Timestamp lockAt;
    private Timestamp unlockAt;
    private Timestamp lastLockAt;
    private Timestamp lastUnlockAt;
    private Boolean couldBeLocked;
    private Long clonedItemId;
    private String migrationId;
    private String namespace;
    private String mediaEntryId;
    private String md5;
    private String encoding;
    private Boolean needNotify;
    private String uploadErrorMessage;
    private Timestamp modifiedAt;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "context_id", nullable = true)
    public Long getContextId() {
        return contextId;
    }

    public void setContextId(Long contextId) {
        this.contextId = contextId;
    }

    @Basic
    @Column(name = "context_type", nullable = true, length = 255)
    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Basic
    @Column(name = "folder_id", nullable = true)
    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    @Basic
    @Column(name = "content_type", nullable = true, length = 255)
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Basic
    @Column(name = "filename", nullable = true, length = -1)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
    @Column(name = "display_name", nullable = true, length = -1)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
    @Column(name = "workflow_state", nullable = true, length = 255)
    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "locked", nullable = true)
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Basic
    @Column(name = "file_state", nullable = true, length = 255)
    public String getFileState() {
        return fileState;
    }

    public void setFileState(String fileState) {
        this.fileState = fileState;
    }

    @Basic
    @Column(name = "deleted_at", nullable = true)
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Basic
    @Column(name = "position", nullable = true)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "lock_at", nullable = true)
    public Timestamp getLockAt() {
        return lockAt;
    }

    public void setLockAt(Timestamp lockAt) {
        this.lockAt = lockAt;
    }

    @Basic
    @Column(name = "unlock_at", nullable = true)
    public Timestamp getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(Timestamp unlockAt) {
        this.unlockAt = unlockAt;
    }

    @Basic
    @Column(name = "last_lock_at", nullable = true)
    public Timestamp getLastLockAt() {
        return lastLockAt;
    }

    public void setLastLockAt(Timestamp lastLockAt) {
        this.lastLockAt = lastLockAt;
    }

    @Basic
    @Column(name = "last_unlock_at", nullable = true)
    public Timestamp getLastUnlockAt() {
        return lastUnlockAt;
    }

    public void setLastUnlockAt(Timestamp lastUnlockAt) {
        this.lastUnlockAt = lastUnlockAt;
    }

    @Basic
    @Column(name = "could_be_locked", nullable = true)
    public Boolean getCouldBeLocked() {
        return couldBeLocked;
    }

    public void setCouldBeLocked(Boolean couldBeLocked) {
        this.couldBeLocked = couldBeLocked;
    }

    @Basic
    @Column(name = "cloned_item_id", nullable = true)
    public Long getClonedItemId() {
        return clonedItemId;
    }

    public void setClonedItemId(Long clonedItemId) {
        this.clonedItemId = clonedItemId;
    }

    @Basic
    @Column(name = "migration_id", nullable = true, length = 255)
    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Column(name = "namespace", nullable = true, length = 255)
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Basic
    @Column(name = "media_entry_id", nullable = true, length = 255)
    public String getMediaEntryId() {
        return mediaEntryId;
    }

    public void setMediaEntryId(String mediaEntryId) {
        this.mediaEntryId = mediaEntryId;
    }

    @Basic
    @Column(name = "md5", nullable = true, length = 255)
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Basic
    @Column(name = "encoding", nullable = true, length = 255)
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Basic
    @Column(name = "need_notify", nullable = true)
    public Boolean getNeedNotify() {
        return needNotify;
    }

    public void setNeedNotify(Boolean needNotify) {
        this.needNotify = needNotify;
    }

    @Basic
    @Column(name = "upload_error_message", nullable = true, length = 255)
    public String getUploadErrorMessage() {
        return uploadErrorMessage;
    }

    public void setUploadErrorMessage(String uploadErrorMessage) {
        this.uploadErrorMessage = uploadErrorMessage;
    }

    @Basic
    @Column(name = "modified_at", nullable = true)
    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttachmentsEntity that = (AttachmentsEntity) o;

        if (id != that.id) return false;
        if (contextId != null ? !contextId.equals(that.contextId) : that.contextId != null) return false;
        if (contextType != null ? !contextType.equals(that.contextType) : that.contextType != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (folderId != null ? !folderId.equals(that.folderId) : that.folderId != null) return false;
        if (contentType != null ? !contentType.equals(that.contentType) : that.contentType != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (workflowState != null ? !workflowState.equals(that.workflowState) : that.workflowState != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (locked != null ? !locked.equals(that.locked) : that.locked != null) return false;
        if (fileState != null ? !fileState.equals(that.fileState) : that.fileState != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (lockAt != null ? !lockAt.equals(that.lockAt) : that.lockAt != null) return false;
        if (unlockAt != null ? !unlockAt.equals(that.unlockAt) : that.unlockAt != null) return false;
        if (lastLockAt != null ? !lastLockAt.equals(that.lastLockAt) : that.lastLockAt != null) return false;
        if (lastUnlockAt != null ? !lastUnlockAt.equals(that.lastUnlockAt) : that.lastUnlockAt != null) return false;
        if (couldBeLocked != null ? !couldBeLocked.equals(that.couldBeLocked) : that.couldBeLocked != null)
            return false;
        if (clonedItemId != null ? !clonedItemId.equals(that.clonedItemId) : that.clonedItemId != null) return false;
        if (migrationId != null ? !migrationId.equals(that.migrationId) : that.migrationId != null) return false;
        if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null) return false;
        if (mediaEntryId != null ? !mediaEntryId.equals(that.mediaEntryId) : that.mediaEntryId != null) return false;
        if (md5 != null ? !md5.equals(that.md5) : that.md5 != null) return false;
        if (encoding != null ? !encoding.equals(that.encoding) : that.encoding != null) return false;
        if (needNotify != null ? !needNotify.equals(that.needNotify) : that.needNotify != null) return false;
        if (uploadErrorMessage != null ? !uploadErrorMessage.equals(that.uploadErrorMessage) : that.uploadErrorMessage != null)
            return false;
        if (modifiedAt != null ? !modifiedAt.equals(that.modifiedAt) : that.modifiedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (contextId != null ? contextId.hashCode() : 0);
        result = 31 * result + (contextType != null ? contextType.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (folderId != null ? folderId.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (workflowState != null ? workflowState.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (locked != null ? locked.hashCode() : 0);
        result = 31 * result + (fileState != null ? fileState.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (lockAt != null ? lockAt.hashCode() : 0);
        result = 31 * result + (unlockAt != null ? unlockAt.hashCode() : 0);
        result = 31 * result + (lastLockAt != null ? lastLockAt.hashCode() : 0);
        result = 31 * result + (lastUnlockAt != null ? lastUnlockAt.hashCode() : 0);
        result = 31 * result + (couldBeLocked != null ? couldBeLocked.hashCode() : 0);
        result = 31 * result + (clonedItemId != null ? clonedItemId.hashCode() : 0);
        result = 31 * result + (migrationId != null ? migrationId.hashCode() : 0);
        result = 31 * result + (namespace != null ? namespace.hashCode() : 0);
        result = 31 * result + (mediaEntryId != null ? mediaEntryId.hashCode() : 0);
        result = 31 * result + (md5 != null ? md5.hashCode() : 0);
        result = 31 * result + (encoding != null ? encoding.hashCode() : 0);
        result = 31 * result + (needNotify != null ? needNotify.hashCode() : 0);
        result = 31 * result + (uploadErrorMessage != null ? uploadErrorMessage.hashCode() : 0);
        result = 31 * result + (modifiedAt != null ? modifiedAt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AttachmentsEntity{" +
                "id=" + id +
                ", contextId=" + contextId +
                ", contextType='" + contextType + '\'' +
                ", size=" + size +
                ", folderId=" + folderId +
                ", contentType='" + contentType + '\'' +
                ", filename='" + filename + '\'' +
                ", uuid='" + uuid + '\'' +
                ", displayName='" + displayName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", workflowState='" + workflowState + '\'' +
                ", userId=" + userId +
                ", locked=" + locked +
                ", fileState='" + fileState + '\'' +
                ", deletedAt=" + deletedAt +
                ", position=" + position +
                ", lockAt=" + lockAt +
                ", unlockAt=" + unlockAt +
                ", lastLockAt=" + lastLockAt +
                ", lastUnlockAt=" + lastUnlockAt +
                ", couldBeLocked=" + couldBeLocked +
                ", clonedItemId=" + clonedItemId +
                ", migrationId='" + migrationId + '\'' +
                ", namespace='" + namespace + '\'' +
                ", mediaEntryId='" + mediaEntryId + '\'' +
                ", md5='" + md5 + '\'' +
                ", encoding='" + encoding + '\'' +
                ", needNotify=" + needNotify +
                ", uploadErrorMessage='" + uploadErrorMessage + '\'' +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    @Function
    public static String triggeredFunction(Long id) {
        try{
            //List<String> string = new ArrayList<String>();
            //string.add(new Date().toString() + " || id: " + id);
            //Files.write(Paths.get("/home/charmingc0d3r/sotsv.debug.txt"), string, UTF_8,APPEND, CREATE);
            AttachmentsEntity ae = AttachmentsEntity.getById(id);
            return ae.toString();
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Function
    public static String triggeredFunction(int id) {
        return triggeredFunction(new Long(id));
    }

    public static void triggeredFunction(AttachmentsEntity entity) {
        try{
            PrintWriter writer = new PrintWriter("~/debug.txt", "UTF-8");
            writer.println(new Date().toString() + " || entity: " + entity.toString());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static AttachmentsEntity getById(Long id) {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        AttachmentsEntity result = null;
        //result = session.get(AttachmentsEntity.class,id);
        Query query = session.createQuery("from AttachmentsEntity");
        java.util.List list = query.list();

        System.out.println(list);
        for (Object o: list
                ) {
            AttachmentsEntity ce = (AttachmentsEntity) o;
            if (ce.getId()==id) {
                result = ce;
                break;
            }
        }
        session.close();
        factory.close();
        return result;
    }


    public static void loadById(AttachmentsEntity entity, Long id) {

        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();
        session.load(entity,id);
        session.close();
        factory.close();
    }
}
