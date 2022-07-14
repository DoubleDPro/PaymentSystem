package ru.magnitom.parsefiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.magnitom.scanpayment.entity.Payments;

import java.util.List;

@Repository
public interface RepoGetPayment extends CrudRepository<Payments, Integer> {

    List<Payments> findByTypeFile(String typeFile);

}