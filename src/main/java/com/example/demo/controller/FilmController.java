package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Film;
import com.example.demo.service.FilmService;


@Controller
public class FilmController {
	@Autowired
	private FilmService FilmService;
	@GetMapping("/")
	public String viewHomePageString(Model model) {
		model.addAttribute("listFilms",FilmService.getAllFilms());
		return "index";
	}
	@GetMapping("/showNewFilmForm")
    public String showNewFilmForm(Model model) {

        Film film = new Film();
        model.addAttribute("film", film);
        return "new_film";
    }

    @PostMapping("/saveFilm")
    public String saveFilm(@ModelAttribute("film") Film film) {

        FilmService.saveFilm(film);
        return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {


        Film film = FilmService.getFilmById(id);


        model.addAttribute("film", film);
        return "update_film";
    }
    @GetMapping("/deleteFilm/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {

 
        this.FilmService.deleteFilmById(id);
        return "redirect:/";
    }
  

}
