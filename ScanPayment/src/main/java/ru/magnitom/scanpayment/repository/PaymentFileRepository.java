package ru.magnitom.scanpayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;

@Repository
public interface PaymentFileRepository extends JpaRepository<String, Integer> {
}
