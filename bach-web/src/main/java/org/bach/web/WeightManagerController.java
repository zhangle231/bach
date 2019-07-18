package org.bach.web;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.bach.domain.WeightInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Validated
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
	public String add(Model model) {
		WeightInfo info = new WeightInfo();
		info.setDate(new Date());
		info.setWeight(0.0);
		model.addAttribute("info", info);
		return "weight/add";
	}

	@RequestMapping("/save")
	public String save(@Valid WeightInfo info) {
		System.out.println(info);
		info.setDate(new Date());
		weightRepository.add(info);
		return "redirect:/weight/list";
	}
}
