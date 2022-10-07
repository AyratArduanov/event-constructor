package ru.intruder.event.constructor.dto;

import lombok.Data;

import java.util.List;

@Data
public class Event {

    private String title;
    private String description;
    private User author;
    private List<Comment> comments;
    private List<Like> likes;
}
