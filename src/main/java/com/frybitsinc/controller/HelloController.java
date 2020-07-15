package com.frybitsinc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.frybitsinc.thymeleaf.model.Car;

//@RestController
@Controller
public class HelloController {
	
	// URL Mapping
	@RequestMapping("/")
	@GetMapping
	public String index(Model model) throws Exception{
	    model.addAttribute("car", new Car());
        return "index";
	}
	
	//@RequestMapping("/")
	//@PostMapping
	//public String save(Car car, Model model) throws Exception{
	//    model.addAttribute("car", car);
	//    return "saved";
	//}
	
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
		memInfo.put("imageURL", "https://www.test.com/file/down/test");
		memInfo.put("isFamilyProfile", true);
		memInfo.put("isAddInfo", false); 
		memList.add(memInfo);
		
		return genMap(200, "msg", "data", memList);
	}
	
	@RequestMapping("/get/member/{member_id}")
	public Map<String, Object> getMember(@PathVariable("member_id") String memberId) throws Exception{
		return genMap(200, memberId);
	}
	
	// HashMap
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
