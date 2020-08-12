package com.wayter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wayter.demo.entities.User;

public interface Users extends JpaRepository<User, Long> {
	User findById(long id);
}
