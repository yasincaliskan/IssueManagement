package com.yasincaliskan.issuemanagement.repository;

import com.yasincaliskan.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
