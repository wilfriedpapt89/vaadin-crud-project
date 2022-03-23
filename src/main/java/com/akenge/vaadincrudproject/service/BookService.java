package com.akenge.vaadincrudproject.service;

import com.akenge.vaadincrudproject.domain.Book;
import com.akenge.vaadincrudproject.persistence.BookRepository;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
public class BookService implements CrudListener<Book> {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Collection<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
