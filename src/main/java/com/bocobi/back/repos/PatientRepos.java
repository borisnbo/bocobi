package com.bocobi.back.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bocobi.back.entity.Patient;

@Repository
@CrossOrigin("*")
public interface PatientRepos extends CrudRepository<Patient, Long> {

}
