package study.lab.workspace.infrastructure.persistence.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import study.lab.workspace.domain.entity.User;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<User, UUID> {

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM users u WHERE u.email = :email")
    boolean existsByEmail(@Param("email") String email);

    UserDetails findByEmail(String email);
}
