package com.skynet.example.sbhazelcast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hazelcast.spring.cache.HazelcastCacheManager;

@Controller
public class ResourceController {
	
    @Autowired
	ResourceService resourceService;
    
    @Autowired
    HazelcastCacheManager hazelcastCacheManager;
	
    /**
	 * usage: 
	 * 
	 * http://localhost:8080/resource?url=httpbin.org/get
	 * http://localhost:8080/resource?url=jsonplaceholder.typicode.com/users/1
	 *  
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "/resource", method = RequestMethod.GET)
	public @ResponseBody Resource getResource(@RequestParam String url) {
		return resourceService.getResource(url);
	}

}
