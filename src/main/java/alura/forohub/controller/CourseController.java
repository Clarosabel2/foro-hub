package alura.forohub.controller;

import alura.forohub.domain.course.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/courses")
@SecurityRequirement(name = "bearer-key")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseDetails> registerCourse(@RequestBody @Valid CourseData data){
        return ResponseEntity.ok(courseService.registerCourse(data));
    }
    @GetMapping
    public ResponseEntity<List<CourseDetails>> toListCourses(){
        return ResponseEntity.ok(courseService.toListCourses());
    }

}
