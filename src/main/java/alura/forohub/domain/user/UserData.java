package alura.forohub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record UserData(@NotBlank String email, @NotBlank String username, @NotBlank String password) {
}
