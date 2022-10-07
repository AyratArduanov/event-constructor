package ru.intruder.event.constructor.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "reward")
public class Reward {

    @Id
    @GeneratedValue
    private Long id;

    private Integer total;
}
