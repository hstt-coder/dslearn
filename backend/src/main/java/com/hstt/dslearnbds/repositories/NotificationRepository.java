package com.hstt.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hstt.dslearnbds.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}