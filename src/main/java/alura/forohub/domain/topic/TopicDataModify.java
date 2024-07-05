package alura.forohub.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicDataModify(@NotNull Long id, @NotBlank String message) {
}
