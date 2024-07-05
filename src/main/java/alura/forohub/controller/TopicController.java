package alura.forohub.controller;

import alura.forohub.domain.topic.TopicData;
import alura.forohub.domain.topic.TopicDataModify;
import alura.forohub.domain.topic.TopicDetails;
import alura.forohub.domain.topic.TopicService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@ResponseBody
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    public ResponseEntity<TopicDetails> registerTopic(@RequestBody @Valid TopicData data, UriComponentsBuilder uri) {
        //return 201 created
        var topicS = topicService.registerTopic(data);
        URI url = uri.path("/topics/{id}").buildAndExpand(topicS.getId()).toUri();
        return ResponseEntity.created(url).body(new TopicDetails(topicS));
    }

    @GetMapping
    public ResponseEntity<Page<TopicDetails>> toListTopics(@PageableDefault(size = 10) Pageable p) {
        return ResponseEntity.ok(topicService.toListTopics(p));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicDetails> getTopic(@PathVariable Long id) {
        return ResponseEntity.ok(new TopicDetails(topicService.getTopic(id)));
    }

    @PutMapping
    @Transactional
    public ResponseEntity<TopicDetails> updateTopic(@RequestBody TopicDataModify data) {
        return ResponseEntity.ok(new TopicDetails(topicService.updateTopic(data)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
        return ResponseEntity.noContent().build();
    }
}
