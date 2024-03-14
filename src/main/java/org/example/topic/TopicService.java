package org.example.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

//    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "spring framework", "spring framework description"),
//            new Topic("java", "java framework", "java framework description"),
//            new Topic("javascript", "javascript framework", "javascript framework description"),
//            new Topic("c++", "c++ framework", "c++ framework description")
//    ));


    public List<Topic> getAllTopics() {
        List<Topic> listData = new ArrayList<>();
        topicRepository.findAll().forEach(listData::add);
        return listData;
    }


    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }

        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }


}
