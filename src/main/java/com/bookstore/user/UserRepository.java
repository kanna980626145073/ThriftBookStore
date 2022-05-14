package com.bookstore.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    @Transactional
    @Modifying
    @Query

            (
                    value = "UPDATE authentication.user " +
                    "SET enabled = TRUE WHERE email = ?1",
                    nativeQuery = true
            )
    int enableUser(String email);


}
