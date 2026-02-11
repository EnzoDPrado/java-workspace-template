package study.lab.workspace.application.usecase.user;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.lab.workspace.application.dto.user.request.CreateUserInputDTO;
import study.lab.workspace.domain.entity.User;
import study.lab.workspace.domain.enums.UserRole;
import study.lab.workspace.domain.repository.user.CreateUserRepository;
import study.lab.workspace.domain.repository.user.ExistsUserByEmailRepository;
import study.lab.workspace.domain.usecase.user.CreateUserUseCase;

@Service
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final ExistsUserByEmailRepository existsUserByEmailRepository;
    private final CreateUserRepository createUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void execute(CreateUserInputDTO input) {
        this.validateUniqueEmail(input.email());

        final var user = this.createUser(input);

        this.createUserRepository.create(user);
    }

    private User createUser(CreateUserInputDTO input) {
        return new User()
                .withName(input.name())
                .withEmail(input.email())
                .withPassword(bCryptPasswordEncoder.encode(input.password()))
                .withRole(UserRole.USER);
    }

    private void validateUniqueEmail(String email) {
        if (existsUserByEmailRepository.existsByEmail(email)) {
            throw new Error("Email already exists"); // todo - create a error handler
        }
    }
}
