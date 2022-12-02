package io.sankalp.mongodbspringbootproject.repository;

import io.sankalp.mongodbspringbootproject.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
