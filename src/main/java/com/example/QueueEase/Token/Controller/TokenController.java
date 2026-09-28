package com.example.QueueEase.Token.Controller;

import com.example.QueueEase.Token.Entity.TokenEntity;
import com.example.QueueEase.Token.Service.TokenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tokens")
public class TokenController {

    private final TokenService tokenService;

    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping
    public List<TokenEntity> getAllTokens() {
        return tokenService.getAllTokens();
    }

    @GetMapping("/{id}")
    public TokenEntity getTokenById(@PathVariable Long id) {
        return tokenService.getTokenById(id);
    }

    @PostMapping
    public TokenEntity addToken(@RequestBody TokenEntity token) {
        return tokenService.addToken(token);
    }

    @PutMapping("/{id}")
    public TokenEntity updateToken(
            @PathVariable Long id,
            @RequestBody TokenEntity token) {

        return tokenService.updateToken(id, token);
    }

    @DeleteMapping("/{id}")
    public String deleteToken(@PathVariable Long id) {
        tokenService.deleteToken(id);
        return "Token deleted successfully";
    }
}