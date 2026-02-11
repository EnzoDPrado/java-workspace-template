package study.lab.workspace.domain.usecase.auth;

import study.lab.workspace.application.dto.auth.request.AuthenticationDTO;
import study.lab.workspace.application.dto.auth.response.LoginResponseDTO;

public interface LoginUseCase {
    LoginResponseDTO execute(AuthenticationDTO input);
}
