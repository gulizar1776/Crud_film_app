package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Film;
import com.example.demo.repository.FilmRepository;
@Service
public class FilmServiceImpl implements FilmService {
@Autowired
private FilmRepository FilmRepository;
	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return FilmRepository.findAll();
	}
	@Override
	public void saveFilm(Film film) {
		// TODO Auto-generated method stub
		this.FilmRepository.save(film);
	}
    @Override
    public Film getFilmById(long id) {
        Optional < Film > optional = FilmRepository.findById(id);
        Film employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Film bulunamadı :: " + id);
        }
        return employee;
    }
    @Override
    public void deleteFilmById(long id) {
        this.FilmRepository.deleteById(id);
    }

}
