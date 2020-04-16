package com.udemy.springframework.datamvc.app.repositories;

import com.udemy.springframework.datamvc.app.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
