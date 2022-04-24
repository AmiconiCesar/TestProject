package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

// Strategy  // Template Method Abstract Class
public abstract class TipoDeSugerencia {
	
	
	//Template Method
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> vistas) {
		     //List<Pelicula> result;
		     return  this.limitarLista(
		    		 this.filtrarSimilares(
		  			 this.ordenarLista(
		  			 this.filtrarVistas(grilla, vistas)),vistas));
		     
		        
	}
	
	

	protected List<Pelicula> filtrarVistas(List<Pelicula> grilla, List<Pelicula> vistas) {
		     return grilla.stream().filter(p -> !vistas.contains(p))
	                      .collect(Collectors.toList());
	}
	
	protected abstract List<Pelicula> ordenarLista(List<Pelicula> listaPelicula);
	
	protected abstract List<Pelicula> filtrarSimilares(List<Pelicula> result, List<Pelicula> vistas);

	protected List<Pelicula> limitarLista(List<Pelicula> listaPelicula){
		    return listaPelicula.stream().limit(3).collect(Collectors.toList());
	}
	
}
