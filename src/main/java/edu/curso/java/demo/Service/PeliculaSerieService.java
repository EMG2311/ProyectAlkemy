package edu.curso.java.demo.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.multipart.MultipartFile;

import edu.curso.java.demo.bo.PeliculaSerie;



public interface PeliculaSerieService {
	Long agregarPeliculaSerie(PeliculaSerie peliculaSerie) throws PeliculaSerieException;
	void actualizarPeliculaSerie(PeliculaSerie pelicula);
	void eliminarPeliculaSeriePorId(Long id);
	PeliculaSerie buscarPeliculaSeriePorId(Long id);
	List<PeliculaSerie> buscarPeliculaSeriePorNombre(String nombre);
	//List<PeliculaSerie> filtrarPeliculaSeriePorGenero(Long idGenero);
	List<PeliculaSerie> Ordenar(String orden);
	
	
	List<PeliculaSerie> recuperarPeliculaSerie();


}
