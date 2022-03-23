package com.akenge.vaadincrudproject.persistence;

import com.akenge.vaadincrudproject.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
