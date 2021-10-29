package com.example.demo.myauto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.myauto.domain.OwnerDetails;

public interface OwnerRepo extends JpaRepository<OwnerDetails, Long>{

}
