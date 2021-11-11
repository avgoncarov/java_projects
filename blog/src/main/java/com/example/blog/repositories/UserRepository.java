package com.example.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userm Long> {
    User findByUsername(String username);
}
