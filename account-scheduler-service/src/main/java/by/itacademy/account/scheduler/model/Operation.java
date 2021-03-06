package by.itacademy.account.scheduler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Operation {
    @JsonProperty("account")
    private UUID account;

    @JsonProperty("description")
    private String description;

    @JsonProperty("value")
    private double value;

    @JsonProperty("currency")
    private UUID currency;

    @JsonProperty("category")
    private UUID category;

    @JsonIgnore
    private String user;

    public UUID getAccount() {
        return account;
    }

    public void setAccount(UUID account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public UUID getCategory() {
        return category;
    }

    public void setCategory(UUID category) {
        this.category = category;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static class Builder {
        private Operation operation;

        private Builder() {
            this.operation = new Operation();
        }

        public Builder setAccount(UUID account) {
            this.operation.account = account;
            return this;
        }

        public Builder setDescription(String description) {
            this.operation.description = description;
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

        public Builder setCategory(UUID category) {
            this.operation.category = category;
            return this;
        }

        public Builder setUser(String user) {
            this.operation.user = user;
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
