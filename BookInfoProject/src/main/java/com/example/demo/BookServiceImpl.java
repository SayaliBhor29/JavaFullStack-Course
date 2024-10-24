package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public BookEntity insertBook(BookEntity bookEntity) {
        return bookRepo.save(bookEntity);
    }

    @Override
    public Optional<BookEntity> getBookById(Long id) {
        return bookRepo.findById(id);
    }

    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }
}
