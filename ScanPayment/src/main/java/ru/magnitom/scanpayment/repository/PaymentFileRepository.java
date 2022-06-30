package ru.magnitom.scanpayment.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentFileRepository extends CrudRepository<String, Integer> {
}
