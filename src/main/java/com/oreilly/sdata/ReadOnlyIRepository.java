package com.oreilly.sdata;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Ilya 19.09.2017.
 */
@NoRepositoryBean
public interface ReadOnlyIRepository <T, ID extends Serializable> extends Repository <T, ID> {

    T findOne(ID id);

    Iterable<T> findAll();
}
