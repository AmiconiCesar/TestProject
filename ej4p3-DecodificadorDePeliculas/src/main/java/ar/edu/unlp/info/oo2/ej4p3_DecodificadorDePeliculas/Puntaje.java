package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements TipoDeSugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, List<Pelicula> vistas) {
		 List<Pelicula> result = grilla.stream().filter(p -> !vistas.contains(p))
			           .collect(Collectors.toList());
		 result.sort(Comparator.comparing(Pelicula::getPuntaje).reversed()
				        .thenComparing(Comparator.comparing(Pelicula::getAño).reversed()));
				
		 if (result.size() > 3)  result = result.subList(0, 3);     		
		 return result;
	}

	
}


