package study.lab.workspace.infrastructure.persistence.repository.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import study.lab.workspace.domain.entity.User;
import study.lab.workspace.domain.repository.user.CreateUserRepository;
import study.lab.workspace.domain.repository.user.ExistsUserByEmailRepository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements ExistsUserByEmailRepository, CreateUserRepository {
    private final UserJpaRepository userRepository;

    public boolean existsByEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }

    public User create(User user) {
        return this.userRepository.save(user);
    }
}
