package com.hstt.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hstt.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
