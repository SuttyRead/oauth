package com.ua.sutty.oauth.repository;

import com.ua.sutty.oauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    User deleteUserById(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsById(Long id);

    Optional<User> findOneByUsername(String username);
}
