package com.Ashi.Roshan.repository;

import com.Ashi.Roshan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
