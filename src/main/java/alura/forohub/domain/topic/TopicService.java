package alura.forohub.domain.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public TopicDetails registerTopic(TopicData data){
        return null;
    }
}
