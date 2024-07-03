package alura.forohub.domain.topic;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.course.CourseDetails;
import alura.forohub.domain.user.User;
import alura.forohub.domain.user.UserDetails;
import jakarta.persistence.*;

import java.time.LocalDate;

public record TopicDetails(Long id, String description, Boolean status, CourseDetails course, UserDetails user) {
}