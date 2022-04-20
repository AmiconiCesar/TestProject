package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements TipoDeSugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> vistas) {
		   List<Pelicula> result = grilla.stream().filter(p -> !vistas.contains(p))
				   .sorted((Pelicula p1, Pelicula p2) -> Integer.compare(p2.getAño(),p1.getAño()))
				   .filter(p -> vistas.stream().anyMatch(pv -> pv.soySimilarA(p)))
				   .collect(Collectors.toList());
		   if (result.size() > 3)  result = result.subList(0, 3);     		
			 return result;		    
				  
				  
	   	                   }
	

}
