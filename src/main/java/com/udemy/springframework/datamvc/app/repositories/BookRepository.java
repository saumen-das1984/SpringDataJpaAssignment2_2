package com.udemy.springframework.datamvc.app.repositories;

import com.udemy.springframework.datamvc.app.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
