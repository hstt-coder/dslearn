package com.hstt.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hstt.dslearnbds.dto.NotificationDTO;
import com.hstt.dslearnbds.entities.Notification;
import com.hstt.dslearnbds.entities.User;
import com.hstt.dslearnbds.repositories.NotificationRepository;

@Service
public class NotificationService {

	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.findByUser(user, pageable);
		
		return page.map(x -> new NotificationDTO(x));
	}
}
