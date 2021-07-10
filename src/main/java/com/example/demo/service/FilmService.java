package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Film;

public interface FilmService {
	List<Film> getAllFilms();
	void saveFilm(Film film);
	Film getFilmById(long id);
	 void deleteFilmById(long id);
}
