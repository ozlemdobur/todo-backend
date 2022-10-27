package org.itforus.todo.repository;

import org.itforus.todo.model.UserDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDB,Long> {

}
