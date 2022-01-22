package de.uni.koeln.se.bookstore.repository;

import de.uni.koeln.se.bookstore.datamodel.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Integer> {

    public Optional<Book> findTopByOrderByYearAsc();

    public Optional<Book> findTopByOrderByYearDesc();

}
