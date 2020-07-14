package com.frybitsinc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// URL Mapping
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi~";
	}
	
	@RequestMapping("/get/member")
	public Map<String, Object> getMemberList() throws Exception{
		List<Map<String, Object>> memList = new ArrayList<>();
		Map<String, Object> memInfo = new HashMap<>();
		
		memInfo.put("id", "1");
		memInfo.put("name", "스텔라");
		memInfo.put("imageURL", "https://www.smallticket.com/file/down/eG-DXSagqWqEYNmt44nsD_8oMYzy-UMIicMcIiQydVI");
		memInfo.put("isFamilyProfile", true);
		memInfo.put("isAddInfo", false); 
		memList.add(memInfo);
		
		return genMap(200, "msg", "data", memList);
	}
	
	@RequestMapping("/get/member/{member_id}")
	public Map<String, Object> getMember(@PathVariable("member_id") String memberId) throws Exception{
		return genMap(200, memberId);
	}
	
	// Mapping 함수
	public HashMap<String, Object> genMap(int status, String message) {
		HashMap<String, Object> ret = new HashMap<>();
		ret.put("status", status);
		ret.put("message", message);
		return ret;
	}
	
	public HashMap<String, Object> genMap(int status, String message, String key, Object value) {
		HashMap<String, Object> ret = new HashMap<>();
		ret.put("status", status);
		ret.put("message", message);
		ret.put(key, value);
		return ret;
	}
}