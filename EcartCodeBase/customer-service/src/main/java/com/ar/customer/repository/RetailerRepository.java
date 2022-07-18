package com.ar.customer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.customer.entity.CustomerMaster;
import com.ar.customer.entity.RetailerMaster;

@Repository
@Transactional
public interface RetailerRepository extends JpaRepository<RetailerMaster, String>{

}
