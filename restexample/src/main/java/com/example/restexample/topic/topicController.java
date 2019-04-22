package com.example.restexample.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@RequestMapping("/topics")
	public List<Topic> getallTopics(){
		
		return Arrays.asList(
				new Topic("1", "topic1", "desc11"),
				new Topic("2", "topic2", "desc22"));
		
	}

}

