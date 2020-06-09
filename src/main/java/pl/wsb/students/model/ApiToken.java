package pl.wsb.students.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "api_token", schema = "movieapp_admin", catalog = "")
public class ApiToken {
    private int id;
    private Timestamp created;
    private Timestamp modified;
    private String accessToken;
    private String refreshToken;
    private Timestamp validTo;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "modified")
    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    @Basic
    @Column(name = "access_token")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Basic
    @Column(name = "valid_to")
    public Timestamp getValidTo() {
        return validTo;
    }

    public void setValidTo(Timestamp validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiToken apiToken = (ApiToken) o;

        if (id != apiToken.id) return false;
        if (created != null ? !created.equals(apiToken.created) : apiToken.created != null) return false;
        if (modified != null ? !modified.equals(apiToken.modified) : apiToken.modified != null) return false;
        if (accessToken != null ? !accessToken.equals(apiToken.accessToken) : apiToken.accessToken != null)
            return false;
        if (refreshToken != null ? !refreshToken.equals(apiToken.refreshToken) : apiToken.refreshToken != null)
            return false;
        if (validTo != null ? !validTo.equals(apiToken.validTo) : apiToken.validTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        result = 31 * result + (validTo != null ? validTo.hashCode() : 0);
        return result;
    }
}
