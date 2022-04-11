package it.eb.segreteria.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import it.eb.segreteria.dao.UtenteDAO;
import it.eb.segreteria.model.Utente;


@Controller
public class DefaultController {

	@Autowired
	UtenteDAO utenteDAO;	
	
	@GetMapping("/")
	public String home(Model model){
		model.addAttribute("nome","Alessio");
		model.addAttribute("cognome","Speroni");
		return "home";
	}
	
		@GetMapping("/public")
	public String pubblico(Model model){
		return "test";
	}

	@GetMapping("/users")
	public String pagina1(Model model){
		Utente utente = new Utente();
		model.addAttribute("utente",utente);
		return "utenti";
	}

	@GetMapping("/usersList")
	public String pagina2(Model model){
		ArrayList<Utente> lista = utenteDAO.getAllUtente();
		model.addAttribute("utenti",lista);
		return "listautenti";
	}

	@GetMapping("/inserisciStud")
	public String paginaAddStudente(Model model) {
		model.addAttribute("studente",new Studente());
		return "inserisciStudenti";
	} 
	

	@GetMapping("/studenteList")
	public String paginaStudenti(Model model) {
		model.addAttribute("studenti",studenteDAO.getAllStudente());
		return "listaStudenti";
	} 
	@GetMapping("/studenteList2")
	public String paginaStudenti2(Model model) {
		model.addAttribute("studenti",studenteDAO.getAllStudente());
		return "StudentiLista";
	} 
	
	@PostMapping("/inserimentoStudenti")
	public String insStudenti(@ModelAttribute Studente studente , Model model) {
		
}
