package ru.intruder.event.constructor.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class Like {
    private User user;
    private Date date;
}
