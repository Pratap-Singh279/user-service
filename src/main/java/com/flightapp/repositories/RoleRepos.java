package com.flightapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.flightapp.entities.Role;

public interface RoleRepos extends CrudRepository<Role, Integer> {

}
