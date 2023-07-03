package com.juansenen.emilibase.repository;

import com.juansenen.emilibase.domain.Lorry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LorryRepository extends CrudRepository<Lorry, Long> {

    List<Lorry> findAll();

}
