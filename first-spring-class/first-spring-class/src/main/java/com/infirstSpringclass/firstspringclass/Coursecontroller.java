package com.infirstSpringclass.firstspringclass;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroller {

	@RequestMapping("/course")
	public List<Course> reteriveall(){
		return Arrays.asList(new Course(1,"java","kunal"),
				new Course(2,"deveops","ranjit"),
				new Course(3,"webdev","seshastri"),
				new Course(5,"deveops","ranjit"));
	}
}
