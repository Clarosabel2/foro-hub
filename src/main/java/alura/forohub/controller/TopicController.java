package alura.forohub.controller;

import alura.forohub.domain.course.CourseData;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class TopicController {
    @PostMapping
    public ResponseEntity<Object> registerTopic(@RequestBody CourseData data) {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<Object>> toListTopics(@PageableDefault(size = 10) Pageable pagination) {

        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity<Object> updateTopic() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTopic(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
