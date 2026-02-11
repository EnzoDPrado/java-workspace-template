package study.lab.workspace.domain.repository.user;

import org.springframework.security.core.userdetails.UserDetails;

public interface GetUserDetailsByEmailRepository {
    UserDetails getUserDetailsByEmail(String email);
}
