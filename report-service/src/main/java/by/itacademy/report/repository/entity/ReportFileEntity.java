package by.itacademy.report.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "report_file", schema = "app")
public class ReportFileEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "data")
    private byte[] data;

    @Column(name = "\"user\"", nullable = false)
    private String user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class Builder {
        private ReportFileEntity entity;

        private Builder() {
            this.entity = new ReportFileEntity();
        }

        public Builder setId(UUID id) {
            this.entity.id = id;
            return this;
        }

        public Builder setData(byte[] data) {
            this.entity.data = data;
            return this;
        }

        public Builder setUser(String user) {
            this.entity.user = user;
            return this;
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public ReportFileEntity build() {
            return this.entity;
        }
    }
}
