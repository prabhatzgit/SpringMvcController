package com.pkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery/v2")
@PropertySource(value = "classpath:sample.properties")
public class SampleController {
	
	@Value("${GET_INFO}")
	private String getInfo;
	
	@GetMapping(value = "/getValues")
	public void getAttractionDetails() {
		System.out.println("printing @Value property from properties file ---------->"+getInfo);
	}

}