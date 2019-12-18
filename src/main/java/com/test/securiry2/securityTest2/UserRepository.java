package com.test.securiry2.securityTest2;

import com.test.securiry2.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUserName(String userName);

}
