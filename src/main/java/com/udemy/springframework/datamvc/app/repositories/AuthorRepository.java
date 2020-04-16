package com.udemy.springframework.datamvc.app.repositories;

import com.udemy.springframework.datamvc.app.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
