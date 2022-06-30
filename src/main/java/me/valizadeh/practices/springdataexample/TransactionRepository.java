package me.valizadeh.practices.springdataexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository<T extends Transaction> extends JpaRepository<T, String>,
    JpaSpecificationExecutor<T> {

}
