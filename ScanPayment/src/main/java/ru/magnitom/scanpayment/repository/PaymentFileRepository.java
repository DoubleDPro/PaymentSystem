package ru.magnitom.scanpayment.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.magnitom.scanpayment.entity.PaymentFile;


@Repository
public interface PaymentFileRepository extends CrudRepository<PaymentFile, Integer> {
}
