package com.oreilly.sdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Ilya 13.09.2017.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
