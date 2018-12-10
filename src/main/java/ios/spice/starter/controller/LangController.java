package ios.spice.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LangController {

	@Autowired
	private LangService langService;

	@RequestMapping("/langs")
	public List<Lang> getAllTopics() {
		return langService.getAllLangs();
	}

	@RequestMapping("/langs/{id}")
	public Lang getTopic(@PathVariable String id) {
		return langService.getLang(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/langs")
	public String addTopic(@RequestBody Lang lang) {
		return langService.addLang(lang);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/langs/{id}")
	public String updateTopic(@RequestBody Lang lang, @PathVariable String id) {
		return langService.updateLang(id, lang);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/langs/{id}")
	public String deleteTopic(@PathVariable String id) {
		return langService.deleteLang(id);
	}

}
