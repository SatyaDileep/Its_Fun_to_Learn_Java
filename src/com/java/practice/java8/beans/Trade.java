package com.java.practice.java8.beans;

/**
 * Created by satyat on 13/07/16.
 */
public class Trade {
    private String issuer;
    private String status;
    private double quantity;

    public  Trade(){

    }
    public Trade(String issuer, String status, double quantity){
        this.issuer = issuer;
        this.status = status;
        this.quantity = quantity;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "issuer='" + issuer + '\'' +
                ", status='" + status + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
