package ru.magnitom.scanpayment.entity;

import javax.persistence.*;




@Entity
//@Table(name = "Paymentfile")
public class PaymentFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "payment")
    private String payment;

    public PaymentFile(String payment) {
        this.payment = payment;
    }

    public PaymentFile() {

    }
}
