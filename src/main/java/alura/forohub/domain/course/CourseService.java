package alura.forohub.domain.course;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    public CourseDetails registerCourse(CourseData data){
        return new CourseDetails();
    }
}
