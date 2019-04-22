package com.example.restexample.topic;


import java.io.Console;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@RequestMapping("/topics")
	public List<Topic> getallTopics(){
		
		return Arrays.asList(
				new Topic("1", "topic1", "desc100"),
				new Topic("2", "topic2", "desc200"));
		
	}
	
	//<String>
	
	  @RequestMapping(value = "/topicInsert", method = RequestMethod.POST)
	  public ResponseEntity<Object> persistPerson(@RequestBody Topic topic) {
		  
//		  for (Topic top : topic) {
//			    System.out.println(top.getId()); 
//			    System.out.println(top.getName());
//			    System.out.println(top.getDescription());
//			}
		  
		  System.out.println("viene del post:" + topic.getId() +" "+  topic.getName() +" "+topic.getDescription() );
		
		  return ResponseEntity.ok(topic);
		
		
		//  return ResponseEntity.badRequest().body(topic);
		 
	    //  return ResponseEntity.status(HttpStatus.CREATED).build();
	   
//	    return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	  }

}

