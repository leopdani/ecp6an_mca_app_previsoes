package exercicio8.eng2020_1_a08.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import exercicio8.eng2020_1_a08.model.Previsao;
import exercicio8.eng2020_1_a08.repository.PrevisoesRepository;
   

@Controller
public class PrevisoesController {
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		
		List<Previsao> previsoes = previsoesRepo.findAll();
		
		mv.addObject("previsoes", previsoes);
		
		mv.addObject(new Previsao());
		
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(Previsao previsoes){
		previsoesRepo.save(previsoes);
		return "redirect:/previsoes";
	}
}