package study.lab.workspace.infrastructure.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.lab.workspace.application.dto.auth.request.AuthenticationDTO;
import study.lab.workspace.domain.usecase.auth.LoginUseCase;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final LoginUseCase loginUseCase;

    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO input){
        final var response = this.loginUseCase.execute(input);

        return ResponseEntity.ok(response);
    }
}
