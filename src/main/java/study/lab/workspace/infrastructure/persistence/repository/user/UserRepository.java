package study.lab.workspace.infrastructure.persistence.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.lab.workspace.domain.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("""
            SELECT 1 from users u where u.email = :email
            """)
    boolean existsByEmail(@Param("email") String email);
}
