package ru.magnitom.scanpayment.entity;

import javax.persistence.*;




@Entity
public class PaymentFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String payment;

    public PaymentFile(String payment) {
        this.payment = payment;
    }

    public PaymentFile() {

    }
}
