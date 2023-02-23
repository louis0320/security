package com.security.login.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.security.login.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
