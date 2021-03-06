package by.itacademy.account.model;

import by.itacademy.account.model.api.serializer.CustomLocalDateTimeDeserializer;
import by.itacademy.account.model.api.serializer.CustomLocalDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
import java.util.UUID;

public class Operation {
    @JsonProperty("uuid")
    private UUID id;

    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    @JsonProperty("dt_create")
    private LocalDateTime dtCreate;

    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    @JsonProperty("dt_update")
    private LocalDateTime dtUpdate;

    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDeserializer.class)
    @JsonProperty("date")
    private LocalDateTime date;

    @JsonProperty("description")
    private String description;

    @JsonProperty("category")
    private UUID category;

    @JsonProperty("value")
    private double value;

    @JsonProperty("currency")
    private UUID currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("account")
    private Account account;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public LocalDateTime getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDateTime dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getCategory() {
        return category;
    }

    public void setCategory(UUID category) {
        this.category = category;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public UUID getCurrency() {
        return currency;
    }

    public void setCurrency(UUID currency) {
        this.currency = currency;
    }

    public Account getAccount() {
        return account;
    }

    public Operation setAccount(Account account) {
        this.account = account;
        return this;
    }

    public static class Builder {
        private Operation operation;

        private Builder() {
            this.operation = new Operation();
        }

        public Builder setId(UUID id) {
            this.operation.id = id;
            return this;
        }

        public Builder setDtCreate(LocalDateTime dtCreate) {
            this.operation.dtCreate = dtCreate;
            return this;
        }

        public Builder setDtUpdate(LocalDateTime dtUpdate) {
            this.operation.dtUpdate = dtUpdate;
            return this;
        }

        public Builder setDate(LocalDateTime date) {
            this.operation.date = date;
            return this;
        }

        public Builder setDescription(String description) {
            this.operation.description = description;
            return this;
        }

        public Builder setCategory(UUID category) {
            this.operation.category = category;
            return this;
        }

        public Builder setValue(double value) {
            this.operation.value = value;
            return this;
        }

        public Builder setCurrency(UUID currency) {
            this.operation.currency = currency;
            return this;
        }

        public Builder setAccount(Account account) {
            this.operation.account = account;
            return this;
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public Operation build() {
            return this.operation;
        }
    }
}
