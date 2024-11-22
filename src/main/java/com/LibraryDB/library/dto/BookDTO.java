package com.LibraryDB.library.dto;

import com.LibraryDB.library.entity.Book;
import org.springframework.beans.BeanUtils;

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String category;
    private String pages;

    public BookDTO(){}

    public BookDTO(Book entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
