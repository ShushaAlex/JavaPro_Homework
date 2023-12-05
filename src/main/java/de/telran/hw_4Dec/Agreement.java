package de.telran.hw_4Dec;

import java.sql.Timestamp;
import java.util.Objects;

public class Agreement {
    private int id;
    private int accountId;
    private int productId;
    private double interestRate;
    private byte status;
    private double sum;
    private Timestamp updatedAt;
    private Timestamp createdAt;

    public Agreement(int id, int accountId, int productId, double interestRate, byte status, double sum, Timestamp updatedAt, Timestamp createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.productId = productId;
        this.interestRate = interestRate;
        this.status = status;
        this.sum = sum;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agreement agreement = (Agreement) o;
        return id == agreement.id && accountId == agreement.accountId && productId == agreement.productId && Double.compare(interestRate, agreement.interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, productId, interestRate);
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", productId=" + productId +
                ", interestRate=" + interestRate +
                ", status=" + status +
                ", sum=" + sum +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
