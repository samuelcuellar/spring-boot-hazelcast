package com.skynet.example.sbhazelcast;

import java.io.Serializable;

public class Resource implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String url;
    private String content;
    
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
