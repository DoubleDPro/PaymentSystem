package ru.magnitom.scanpayment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String paymentFile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
