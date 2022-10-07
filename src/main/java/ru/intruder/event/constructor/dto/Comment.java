package ru.intruder.event.constructor.dto;

import lombok.Data;

import java.util.List;

@Data
public class Comment {

    private User user;
    private List<Comment> comments;
}
