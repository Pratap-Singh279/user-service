package com.flightapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.flightapp.entities.User;

public interface UserRepos extends CrudRepository<User, Integer> {
	User findByEmail(String email);
}
