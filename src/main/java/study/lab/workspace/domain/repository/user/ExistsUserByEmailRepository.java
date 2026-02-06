package study.lab.workspace.domain.repository.user;

public interface ExistsUserByEmailRepository {
    boolean existsByEmail(String email);
}
