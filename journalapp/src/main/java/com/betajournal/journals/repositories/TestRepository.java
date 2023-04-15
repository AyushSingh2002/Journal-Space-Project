package com.betajournal.journals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betajournal.journals.domain.Test;

public interface TestRepository extends JpaRepository<Test, Long> 
{
  
}
