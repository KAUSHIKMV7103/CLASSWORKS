package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
@RestController
public class messageController {
@GetMapping("/check")
public String checkApi() throws JsonProcessingException{
	msg response= new msg("Hello welcome to this page");
	ObjectMapper obj=new ObjectMapper();
	return obj.writeValueAsString(response);
	 
}
}
