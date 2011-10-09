package br.com.javamagazine.springsocial.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringController {
	@RequestMapping("/hello")
	public ModelAndView helloSpring() {
		String msg = "Olá, Spring!";
		return new ModelAndView("hello", "mensagem", msg);
	}
}
