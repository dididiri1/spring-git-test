package egovframework.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = {"/", "/index"})
	public String home(Model model) {
		System.out.println("마스터 소스 수정 테스트 #2");
		model.addAttribute("message", "eGovFrame 프로젝트가 정상적으로 실행되었습니다.");
		return "index";
	}
}
