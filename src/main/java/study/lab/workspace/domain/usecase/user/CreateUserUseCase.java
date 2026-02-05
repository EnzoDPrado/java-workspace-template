package study.lab.workspace.domain.usecase.user;

import study.lab.workspace.application.dto.user.request.CreateUserInputDTO;

public interface CreateUserUseCase {
    void execute(CreateUserInputDTO input);
}
