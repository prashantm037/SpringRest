package com.springRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
