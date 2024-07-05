package alura.forohub.domain.topic;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.course.CourseDetails;
import alura.forohub.domain.user.User;
import alura.forohub.domain.user.UserDetails;
import jakarta.persistence.*;

import java.time.LocalDate;

public record TopicDetails(Long id, String title, String description, Boolean status, String course, String user_email) {
    public TopicDetails(Topic topic) {
        this(topic.getId(),topic.getTitle(), topic.getMessage(), topic.isStatus(),topic.getCourse().getName(),topic.getAuthor().getEmail());
    }
}