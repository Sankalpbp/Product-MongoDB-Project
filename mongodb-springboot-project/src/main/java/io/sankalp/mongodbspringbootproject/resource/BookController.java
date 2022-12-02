package io.sankalp.mongodbspringbootproject.resource;

import io.sankalp.mongodbspringbootproject.model.Book;
import io.sankalp.mongodbspringbootproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping ( "/" )
    public Book saveBook ( @RequestBody  Book book ) {
        return repository.save ( book );
    }

    @GetMapping( "/" )
    public List<Book> getBooks ( ) {
        return repository.findAll ();
    }

    @GetMapping ( "/getBook/{id}" )
    public Book getBook (@PathVariable Integer id ) {
        return repository.findById ( id ).orElse ( null );
    }

    @DeleteMapping ( "/deleteBook/{id}" )
    public String deleteBook ( @PathVariable Integer id ) {
        repository.deleteById ( id );
        return "Book with id: " + id + " deleted.";
    }

}
