package edu.poly.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TrangChuController {

	@GetMapping
	public String TrangChu() {
		return "home";
	}

	@RequestMapping("/dangnhap")
	public String dangNhap(Model model, @RequestParam(name = "tenDangNhap", required = true) String tenDangNhap) {
		model.addAttribute("tenDangNhap", tenDangNhap);
		return "home";
	}

	@RequestMapping("/demoParam/{duongDan1}/{duongDan2}")
	public String demoRequestParam(Model model, @RequestParam String ten, @RequestParam int a, @RequestParam int b,
			@PathVariable int duongDan1, @PathVariable int duongDan2) {
		model.addAttribute("duongDan1", duongDan1);
		model.addAttribute("duongDan2", duongDan2);
		model.addAttribute("giaTri", ten);
		model.addAttribute("tong", a + b);
		return "demoRequestParam";
	}

	@GetMapping("/demoGetMapping")
	public String demoGetMappingRequestParam(Model model, @RequestParam String ten) {
		model.addAttribute("giaTri", ten);
//		model.addAttribute("tong", a + b);
		return "demoRequestParam";
	}

	@RequestMapping("/edit/{id}")
	public String edit(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("tenDangNhap", id);
		return "home";
	}
}
