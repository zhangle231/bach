package org.bach.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weight")
public class WeightManagerController {
	
	@Autowired
	private List<WeightInfo> weightRepository;

	@RequestMapping("/list")
	public String list(ModelMap model) {
		model.put("list", weightRepository);
		return "weight/list";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "weight/add";
	}

	@RequestMapping("/save")
	public String save(WeightInfo info) {
		System.out.println(info);
		info.date = new Date();
		weightRepository.add(info);
		return "redirect:/weight/list";
	}
}
