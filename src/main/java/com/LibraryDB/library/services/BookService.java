package com.LibraryDB.library.services;

import com.LibraryDB.library.dto.BookDTO;
import com.LibraryDB.library.entity.Book;
import com.LibraryDB.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    public List<BookDTO> findAllBooks(){
        return bookRepository.findAll();
    }
}
