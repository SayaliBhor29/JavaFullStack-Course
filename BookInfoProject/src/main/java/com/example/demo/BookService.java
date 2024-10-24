package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface BookService {
    BookEntity insertBook(BookEntity bookEntity);
    Optional<BookEntity> getBookById(Long id);
    List<BookEntity> getAllBooks();
    void deleteBookById(Long id);
}
