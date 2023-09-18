package com.proconsul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proconsul.entity.UtenteHR;
import com.proconsul.entity.UtenteHRId;

public interface UtenteHRRepository extends JpaRepository<UtenteHR, UtenteHRId>{

}
