package com.bookstore.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Book {

    private UUID id;
    private UUID userId;
    private String title;
    private String author;
    private String isbn;
    private String description;
    private String faculty;
    private String subject;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private BigDecimal price;

}
