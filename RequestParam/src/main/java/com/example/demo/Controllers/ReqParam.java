package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqParam {
	
	@GetMapping("/skcet")
	public String name(@RequestParam String name,@RequestParam String dept){
		return "I am "+name+" from "+dept+"!";
	}
	
	@GetMapping("/skcet/{name}/{clg}")
	public String path(@PathVariable("name") String name,@PathVariable("clg") String clg){
		return "I am "+name+" from "+clg+"!";
	}
}
