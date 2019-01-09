package edu.poly.manager.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import edu.poly.manager.entity.User;
import edu.poly.manager.model.UserDTO;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
//		kiểm tra đối tượng có phải là user hay không
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserDTO userDTO = (UserDTO) target;

		if (userDTO.getName() == null || userDTO.getName().length() == 0) {
			errors.rejectValue("name", "field.required");
		}

//		áp dụng cho password
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");

		if (userDTO.getPassword().length() < 6 || userDTO.getPassword().length() > 12) {
			errors.rejectValue("password", "password.invalid");
		}

	}

}
