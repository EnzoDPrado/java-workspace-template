package study.lab.workspace.infrastructure.persistence.repository.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import study.lab.workspace.domain.entity.User;
import study.lab.workspace.domain.repository.user.CreateUserRepository;
import study.lab.workspace.domain.repository.user.ExistsUserByEmailRepository;
import study.lab.workspace.domain.repository.user.GetUserDetailsByEmailRepository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements ExistsUserByEmailRepository, CreateUserRepository, GetUserDetailsByEmailRepository {
    private final UserJpaRepository userRepository;

    public boolean existsByEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }

    public User create(User user) {
        return this.userRepository.save(user);
    }

    public UserDetails getUserDetailsByEmail(String email) {
        return this.getUserDetailsByEmail(email);
    }
}
