package com.hstt.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hstt.dslearnbds.entities.Enrollment;
import com.hstt.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
