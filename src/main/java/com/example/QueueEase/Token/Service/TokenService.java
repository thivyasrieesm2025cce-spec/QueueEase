package com.example.QueueEase.Token.Service;

import com.example.QueueEase.Token.Entity.TokenEntity;
import com.example.QueueEase.Token.Repository.TokenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {

    private final TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public List<TokenEntity> getAllTokens() {
        return tokenRepository.findAll();
    }

    public TokenEntity getTokenById(Long id) {
        return tokenRepository.findById(id).orElse(null);
    }

    public TokenEntity addToken(TokenEntity token) {
        return tokenRepository.save(token);
    }

    public TokenEntity updateToken(Long id, TokenEntity token) {

        TokenEntity existingToken =
                tokenRepository.findById(id).orElse(null);

        if (existingToken != null) {
            existingToken.setTokenNumber(token.getTokenNumber());
            existingToken.setPatientId(token.getPatientId());
            existingToken.setDoctorId(token.getDoctorId());
            existingToken.setStatus(token.getStatus());

            return tokenRepository.save(existingToken);
        }

        return null;
    }

    public void deleteToken(Long id) {
        tokenRepository.deleteById(id);
    }
}