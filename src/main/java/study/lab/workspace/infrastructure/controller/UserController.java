package study.lab.workspace.infrastructure.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.lab.workspace.application.dto.user.request.CreateUserInputDTO;
import study.lab.workspace.domain.usecase.user.CreateUserUseCase;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public ResponseEntity createUser(@RequestBody CreateUserInputDTO input) {
        this.createUserUseCase.execute(input);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
