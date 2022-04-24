package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// ConcreteStrategyC   // TemplateMethod Concrete Class
public class Puntaje extends TipoDeSugerencia {

	

	@Override
	protected List<Pelicula> ordenarLista(List<Pelicula> listaPelicula) {
		listaPelicula.sort(Comparator.comparing(Pelicula::getPuntaje).reversed()
				.thenComparing(Comparator.comparing(Pelicula::getAño).reversed()));
		return listaPelicula;
	}

	@Override
	protected List<Pelicula> filtrarSimilares(List<Pelicula> result, List<Pelicula> vistas) {
		return result;
	}

}
