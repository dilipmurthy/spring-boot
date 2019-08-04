package com.demo.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.entity.Supp_Requests;

public interface SuppRepository extends JpaRepository<Supp_Requests, Integer>{

}
