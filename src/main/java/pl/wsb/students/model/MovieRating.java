package pl.wsb.students.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "movie_rating", schema = "movieapp_admin", catalog = "")
public class MovieRating {
    private int id;
    private Timestamp created;
    private Timestamp modified;
    private int userAccountId;
    private byte rate;

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
    @Column(name = "user_account_id")
    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    @Basic
    @Column(name = "rate")
    public byte getRate() {
        return rate;
    }

    public void setRate(byte rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieRating that = (MovieRating) o;

        if (id != that.id) return false;
        if (userAccountId != that.userAccountId) return false;
        if (rate != that.rate) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + userAccountId;
        result = 31 * result + (int) rate;
        return result;
    }
}
