package ios.spice.starter.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LangService {

	private List<Lang> langs = new ArrayList<>(
			Arrays.asList(new Lang("Spring", "Spring Framework", "Spring Framework Description"),
					new Lang("Java", "Java Framework", "Java Framework Description"),
					new Lang("JS", "JS Framework", "Node Framework Description")));

	public List<Lang> getAllLangs() {
		return langs;
	}

	public Lang getLang(String id) {
		return langs.stream().filter(o -> o.getId().equals(id)).findFirst().get();
	}

	public String addLang(Lang lang) {
		langs.add(lang);
		return "Added";
	}

	public String updateLang(String id, Lang lang) {
		for (int i = 0; i < langs.size(); i++) {
			Lang t = langs.get(i);
			if (t.getId().equals(id)) {
				langs.set(i, lang);
			}
		}
		return "Updated";
	}

	public String deleteLang(String id) {
		langs.removeIf(t -> t.getId().equals(id));
		return "Deleted";
	}

}
