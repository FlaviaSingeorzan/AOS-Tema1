package com.unitbv.lab.Tema2.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Tema2")
public class ControllerClass
{
        
    @RequestMapping(value = "/{name}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello(@PathVariable String name) {
		return "Hello, " + name;
	}
    

}
