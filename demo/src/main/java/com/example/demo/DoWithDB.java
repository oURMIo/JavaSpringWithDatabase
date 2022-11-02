package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface DoWithDB extends CrudRepository<User, Long> {
}
