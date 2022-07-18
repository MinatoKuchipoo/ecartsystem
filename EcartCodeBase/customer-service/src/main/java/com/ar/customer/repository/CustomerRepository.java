package com.ar.customer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.customer.entity.CustomerMaster;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<CustomerMaster, String>{

}
