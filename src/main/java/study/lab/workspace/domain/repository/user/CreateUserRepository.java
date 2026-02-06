package study.lab.workspace.domain.repository.user;

import study.lab.workspace.domain.entity.User;

public interface CreateUserRepository {
    User create(User user);
}
