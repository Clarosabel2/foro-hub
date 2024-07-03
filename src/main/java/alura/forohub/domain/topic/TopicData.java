package alura.forohub.domain.topic;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.user.User;

public record TopicData(Long id, Long idUser, Long idCourse, String description) {
}
