package com.multi.mvc01.dto;

public class ReplyDTO {
	private String id;
	private int oriid;
	private String content;
	private String writer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOriid() {
		return oriid;
	}
	public void setOriid(int oriid) {
		this.oriid = oriid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
