package ru.magnitom.scanpayment.entity;


import javax.persistence.*;

@Entity
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String payment;

    public Payments(String payment) {
        this.payment = payment;
    }

    public Payments(Integer id, String payment) {
        this.id = id;
        this.payment = payment;
    }

    public Payments(Integer id) {
        this.id = id;
    }

    public Payments() {
    }

    @Override
    public String toString() {
        return "PaymentFile{" +
                "id=" + id +
                ", payment='" + payment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
