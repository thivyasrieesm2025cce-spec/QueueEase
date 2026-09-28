package com.example.QueueEase.Token.Repository;

import com.example.QueueEase.Token.Entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
}