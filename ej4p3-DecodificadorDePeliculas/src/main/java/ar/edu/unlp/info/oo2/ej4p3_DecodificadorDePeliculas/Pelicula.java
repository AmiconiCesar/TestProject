package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private int año;
	private double puntaje;
	private List<Pelicula> similares;

	public Pelicula(String titulo, int año, double puntaje) {
		super();
		this.titulo = titulo;
		this.año = año;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public void establecerSimilar(Pelicula pelicula) { 
	     this.agregarSimilar(pelicula);
	     pelicula.agregarSimilar(this);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	public double getPuntaje() {
		return puntaje;
	}

	private boolean agregarSimilar(Pelicula pelicula) {
        return this.similares.add(pelicula);          
	}
	
	public boolean soySimilarA(Pelicula pelicula) {
		return this.similares.contains(pelicula);
	    }

	public List<Pelicula> getSimilares() {
		return similares;
	}
	
	public String toString() {
		return this.titulo;
	}
	
	}
