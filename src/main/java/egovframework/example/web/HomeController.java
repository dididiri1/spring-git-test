package egovframework.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = {"/", "/index"})
	public String home(Model model) {
		System.out.println("work2 : 충돌 테스트!");
		System.out.println("work1 : 테스트!");
		System.out.println("work1 : 테스트!");
		System.out.println("work1 : 충돌 테스트!");
		System.out.println("work1 : git 테스트 #1");
		model.addAttribute("message", "eGovFrame 프로젝트가 정상적으로 실행되었습니다.");
		return "index";
	}
}
