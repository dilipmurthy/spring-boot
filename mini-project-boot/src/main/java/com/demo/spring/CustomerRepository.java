package com.demo.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
