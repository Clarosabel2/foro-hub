package alura.forohub.domain.course;

import jakarta.validation.constraints.NotBlank;

public record CourseData(@NotBlank String title, CategoryCourse categoryCourse) {

}
