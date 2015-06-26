package com.codetutr.controller;
 
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codetutr.domain.Shop;

@Controller
@RequestMapping("/kfc/brands")
public class JsonController {
 
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Map<String, String> getShopInJSON(@PathVariable String name) {
 
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
 
		//return shop;
		Map<String, String> maps = new HashMap<String, String>();
		
		maps.put("Dilip", "Ashwini");
		maps.put("Prakash", "Deepthi");
		return maps;

	}
 
}