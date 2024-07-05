package alura.forohub.domain.course;

public record CourseDetails(Long id, String title, String categoryCourse, Boolean active) {
    public CourseDetails(Course course) {
        this(course.getId(), course.getName(), course.getCategory().toString(),course.isActive());
    }
}
