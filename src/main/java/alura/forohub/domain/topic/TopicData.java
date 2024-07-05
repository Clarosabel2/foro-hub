package alura.forohub.domain.topic;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.user.User;
import jakarta.validation.constraints.NotBlank;

public record TopicData(@NotBlank Long idUser,@NotBlank Long idCourse,@NotBlank String title,@NotBlank String message) {

}
