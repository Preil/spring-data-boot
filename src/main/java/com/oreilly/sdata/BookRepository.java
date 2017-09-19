package com.oreilly.sdata;

import org.springframework.stereotype.Repository;

/**
 * Ilya 13.09.2017.
 */
@Repository
public interface BookRepository extends ReadOnlyIRepository<Book, Long> {
}
