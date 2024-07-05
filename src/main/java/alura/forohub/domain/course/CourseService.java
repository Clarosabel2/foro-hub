package alura.forohub.domain.course;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseDetails registerCourse(CourseData data){
        Course course = courseRepository.save(new Course(data));
        return new CourseDetails(course);
    }
    public List<CourseDetails> toListCourses(){
        return courseRepository.findAll().stream().map(c-> new CourseDetails(c)).collect(Collectors.toList());
    }
}
