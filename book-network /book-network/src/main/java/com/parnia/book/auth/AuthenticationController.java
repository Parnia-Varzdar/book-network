package com.parnia.book.auth;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "authentication")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/auth")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(@RequestBody @Valid RegistrationRequest registrationRequest) {
        authenticationService.register(registrationRequest);
        return ResponseEntity.accepted().build();
    }
}
