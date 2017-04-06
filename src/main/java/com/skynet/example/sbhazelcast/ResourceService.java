package com.skynet.example.sbhazelcast;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResourceService {

	@Autowired
    RestTemplate restTemplate;
	
    @Cacheable("resources")
    public Resource getResource(String url) {
    	ResponseEntity<String> response =  restTemplate.getForEntity("http://" + url, String.class);
    	Resource resource = new Resource();
    	resource.setContent(response.getBody());
    	resource.setUrl(url);
    	resource.setDate(Calendar.getInstance().getTime());
    	return resource;
    }

}
