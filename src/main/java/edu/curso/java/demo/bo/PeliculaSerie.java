package edu.curso.java.demo.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class PeliculaSerie {
	
	
	
	
	public PeliculaSerie() {
		
	}
	public PeliculaSerie(Long idPelicula, String titulo, LocalDate fechaCreacion, Long calificacion,List<Personaje> personajeAsociados) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.calificacion = calificacion;
		this.personajeAsociados = personajeAsociados;
	}
	public Long getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Long getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Long calificacion) {
		this.calificacion = calificacion;
	}
	public List<Personaje> getPersonajeAsociados() {
		return personajeAsociados;
	}
	public void setPersonajeAsociados(List<Personaje> personajeAsociados) {
		this.personajeAsociados = personajeAsociados;
	}
	@Id
	@GeneratedValue
	private Long idPelicula;
	private String titulo;
	private LocalDate fechaCreacion;
	private Long calificacion;
	 private byte[] imagen;
	
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Personaje> personajeAsociados = new ArrayList<Personaje>();
	
}
