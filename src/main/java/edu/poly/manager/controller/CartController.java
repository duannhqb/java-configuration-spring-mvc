package edu.poly.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Cart")
public class CartController {

	@RequestMapping("/hello")
	public String ahello(Model model) {
		model.addAttribute("msg", "hello");
		return "1";
	}

	@RequestMapping(value = { "/hello1", "Hello1" }, method = RequestMethod.GET)
//	chỉ cho phép phương thức GET chạy vào phương thức
	public String ahello1(ModelMap model) {
		model.addAttribute("msg", "hello1");
		return "1";
	}

//	@RequestMapping("/hello2")
//	public ModelAndView ahello2() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("msg");
//		modelAndView.addObject("hello2");
//		return modelAndView;
//	}
//
//	@RequestMapping("/hello3")
//	public ModelAndView ahello3(HttpServletRequest request) {
//		request.setAttribute("msg", "hello3");
//		return new ModelAndView("msg");
//	}
}
