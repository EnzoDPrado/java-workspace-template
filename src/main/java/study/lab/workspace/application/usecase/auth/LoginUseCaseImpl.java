package study.lab.workspace.application.usecase.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import study.lab.workspace.application.dto.auth.request.AuthenticationDTO;
import study.lab.workspace.application.dto.auth.response.LoginResponseDTO;
import study.lab.workspace.domain.entity.User;
import study.lab.workspace.domain.usecase.auth.LoginUseCase;
import study.lab.workspace.infrastructure.security.TokenService;

@Service
@RequiredArgsConstructor
public class LoginUseCaseImpl implements LoginUseCase {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public LoginResponseDTO execute(AuthenticationDTO input) {
        final var userNamePassword = new UsernamePasswordAuthenticationToken(input.email(), input.password());
        final var auth = this.authenticationManager.authenticate(userNamePassword);

        final var token = this.tokenService.generateToken((User) auth.getPrincipal());

        return new LoginResponseDTO(token);
    }
}
