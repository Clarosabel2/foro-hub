package alura.forohub.domain.topic;

import alura.forohub.domain.course.CourseRepository;
import alura.forohub.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private UserRepository userRepository;

    public Topic registerTopic(TopicData data){
        return topicRepository.save(new Topic(data,userRepository.getReferenceById(data.idUser()),courseRepository.getReferenceById(data.idCourse())));
    }

    public void deleteTopic(Long id) {
        Topic topic = topicRepository.getReferenceById(id);
        topic.changeStatus();
        topicRepository.save(topic);
    }

    public Topic getTopic(Long id) {
        return topicRepository.getReferenceById(id);
    }

    public Page<TopicDetails> toListTopics(Pageable p) {
        return topicRepository.findByStatusTrue(p).map(TopicDetails::new);
    }

    public Topic updateTopic(TopicDataModify data) {
        var topic = topicRepository.getReferenceById(data.id());
        topic.setMessage(data.message());
        return topicRepository.save(topic);
    }
}
