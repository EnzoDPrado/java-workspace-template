package study.lab.workspace.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;
import study.lab.workspace.application.dto.user.request.CreateUserInputDTO;
import study.lab.workspace.domain.entity.User;

@Mapper(componentModel = "spring")
public interface UserStructMapper {
    User toUserEntity(CreateUserInputDTO createUserInputDTO);
}
