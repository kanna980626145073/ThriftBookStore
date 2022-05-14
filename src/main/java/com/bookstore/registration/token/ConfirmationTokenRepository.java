package com.bookstore.registration.token;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {

    Optional<ConfirmationToken> findByToken(String token);

    @Transactional
    @Modifying
    @Query(
            value = "UPDATE authentication.confirmation_token c " +
            "SET confirmed_at = ?2 " +
            "WHERE token = ?1", nativeQuery = true
    )
    void updateConfirmedAt(String token, LocalDateTime confirmedAt);

}
