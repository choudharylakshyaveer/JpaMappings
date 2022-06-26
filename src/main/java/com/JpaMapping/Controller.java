package com.JpaMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JpaMapping.entity.Photo;

import reactor.core.publisher.Mono;

@RestController
public class Controller {

	
	
	@PostMapping("/save")
	public Mono<Photo> savePhoto(@RequestBody Photo photo)
	{
		return null;
	}
}
