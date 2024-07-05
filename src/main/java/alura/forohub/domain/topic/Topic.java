package alura.forohub.domain.topic;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.ZoneOffset;

@Table(name = "topics")
@Entity(name = "Topic")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDate creationDate;
    private boolean status;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private User author;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courses_id")
    private Course course;

    public Topic(TopicData data, User user, Course course) {
        this.title = data.title();
        this.message = data.message();
        this.creationDate = LocalDate.now(ZoneOffset.of("-03:00"));
        this.status = true;
        this.author = user;
        this.course = course;
    }

    public void changeStatus() {
        status = false;
    }
}
