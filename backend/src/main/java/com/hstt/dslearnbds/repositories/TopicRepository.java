package com.hstt.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hstt.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
