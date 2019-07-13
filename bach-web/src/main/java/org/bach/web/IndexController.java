package org.bach.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(ModelMap modelMap) {
		modelMap.put("msg", "msg");
		List<String>list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add("item"+i);
		}
		modelMap.put("list", list);
		return "index";
	}

}
