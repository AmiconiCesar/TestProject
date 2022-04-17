package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;


public class Decodificador {
	
	private List<Pelicula> grilla;
	private List<Pelicula> peliculasVistas;
	private TipoDeSugerencia criterio;
	
	
	public Decodificador(List<Pelicula> grilla, TipoDeSugerencia criterio) {
		this.grilla = new ArrayList<Pelicula>(grilla);
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.criterio = criterio;
		}
	
	
	void cambiarCriterio(TipoDeSugerencia nuevoCriterio) {
		this.criterio = nuevoCriterio;
	}
	
	public void reproducir(Pelicula pelicula) {
		if (!this.peliculasVistas.contains(pelicula)) 
			this.peliculasVistas.add(pelicula);
		}
    
	public List<Pelicula> sugerirPeliculas(){
		List<Pelicula> listaGrilla = new ArrayList<Pelicula>(this.grilla); 
		List<Pelicula> vistas = new ArrayList<Pelicula>(this.peliculasVistas);
		return criterio.sugerirPeliculas(listaGrilla, vistas);
		
	}
	
	
}
