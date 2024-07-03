package alura.forohub.controller;

import alura.forohub.domain.course.Course;
import alura.forohub.domain.course.CourseData;
import alura.forohub.domain.course.CourseRepository;
import alura.forohub.domain.course.CourseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;


}
