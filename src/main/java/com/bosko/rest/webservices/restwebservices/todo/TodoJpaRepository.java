package com.bosko.rest.webservices.restwebservices.todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends CrudRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);
}
