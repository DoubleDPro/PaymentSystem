package ru.magnitom.parsefiles.entity;


import javax.persistence.*;

@Entity
@Table(name = "parse_xml_payment")
public class ParseXmlPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "fromPay")
    String from;

    @Column(name = "toPay")
    String to;

    @Column(name = "amount")
    Integer amount;

    public ParseXmlPayment(String from, String to, Integer amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
