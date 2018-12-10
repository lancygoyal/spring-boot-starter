package ios.spice.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ios.spice.starter.beans.StudentRegistration;
import ios.spice.starter.beans.StudentRegistrationReply;
import ios.spice.starter.beans.Welcome;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome Mr. %s!";

	@GetMapping("/")
	@ResponseBody
	public Welcome welcomeUser(
			@RequestParam(name = "name", required = false, defaultValue = "Java Fan") String name) {
		return new Welcome(String.format(welcomemsg, name));
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	@ResponseBody
	StudentRegistrationReply registerStudent(
			@RequestBody StudentRegistration studentregd) {
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		stdregreply.setName(studentregd.getName());
		stdregreply.setAge(studentregd.getAge());
		stdregreply.setRegistrationNumber("12345678");
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;
	}
}
