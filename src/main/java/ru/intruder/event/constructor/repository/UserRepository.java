package ru.intruder.event.constructor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.intruder.event.constructor.dto.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
