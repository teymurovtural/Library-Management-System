package com.myproject.library.Repository;

import com.myproject.library.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

    @Query(value = "SELECT * FROM books WHERE name = :name", nativeQuery = true)
    List<Books> findByNameNative(@Param("name") String name);

    List<Books> findByNameContainingIgnoreCase(String namePart);

    List<Books> findByAuthorIgnoreCase(String author);
}
