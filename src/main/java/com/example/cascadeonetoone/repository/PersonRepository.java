package com.example.cascadeonetoone.repository;

import com.example.cascadeonetoone.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity,Long> {
}
