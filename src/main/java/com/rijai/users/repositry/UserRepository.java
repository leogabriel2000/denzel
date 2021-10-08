package com.rijai.users.repository;

import com.rijai.users.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>
{
}