package ru.intruder.event.constructor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.intruder.event.constructor.dto.Reward;

public interface RewardRepository extends JpaRepository<Reward, Long> {

}
