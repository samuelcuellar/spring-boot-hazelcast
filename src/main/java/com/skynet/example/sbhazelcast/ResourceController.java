package com.skynet.example.sbhazelcast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourceController {
	
    @Autowired
	ResourceService resourceService;
	
    /**
	 * usage: 
	 * http://localhost:8080/resource?url=httpbin.org/get
	 * 
	 * @param url
	 * @return
	 */
	@RequestMapping(value = "/resource", method = RequestMethod.GET)
	public @ResponseBody Resource getResource(@RequestParam String url) {
		return resourceService.getResource(url);
	}

}
