package edu.poly.manager.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import edu.poly.manager.model.UserDTO;
import edu.poly.manager.validator.UserValidator;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private UserValidator userValidator;

	@GetMapping
	@ResponseBody
	public String defaultController() {
		return "User manager";
	}

	@GetMapping("/them-nguoi-dung")
	public String addUser(Model model) {
		UserDTO userDTO = new UserDTO();
		userDTO.setName("Spring");
		userDTO.setId(0);
		userDTO.setPassword("123");
		model.addAttribute("userDTO", userDTO);
		return "addUser";
	}

	@PostMapping("/them-nguoi-dung")
	public String addUser(Model model, @ModelAttribute UserDTO userDTO, BindingResult bindingResult) {
//		validator model
		userValidator.validate(userDTO, bindingResult);

		if (bindingResult.hasErrors()) {
			return "addUser";
		}

		model.addAttribute("user", userDTO);
		return "viewUser";
	}

	@PostMapping("/upload-file")
	public String uploadFile(HttpServletRequest request, Model model, @RequestParam MultipartFile file) {
		if (file.isEmpty() || file == null) {
			model.addAttribute("info", "Vui long chon file");
			return "upload";
		} else {
//				Lưu vào ổ đĩa ở máy
			File uploadRootDir = new File("D:/fileDemoUploadDemo1");
			if (!uploadRootDir.exists()) {
				uploadRootDir.mkdirs();
			}

			try {
				String fileName = file.getOriginalFilename();
				File newFile = new File(uploadRootDir, fileName);

				file.transferTo(newFile);
			} catch (Exception e) {
				model.addAttribute("info", "Error: " + e.toString());
				return "upload";
			}
			model.addAttribute("file", file);
		}
		return "viewFile";
	}

	@GetMapping("/upload-file")
	public String upload() {
		return "upload";
	}
}
