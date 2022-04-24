package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	  private Decodificador deco;
	  private Pelicula thor, capAmerica, ironMan, dunkirk, rocky, rambo;
	  private List<Pelicula> grilla;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		    thor = new Pelicula("Thor", 2007, 7.9);
			capAmerica = new Pelicula("Capitan America",2016,7.8);
			ironMan = new Pelicula("Iron Man",2010,7.9);
			dunkirk= new Pelicula("Dunkirk",2017,7.9);
			rocky = new Pelicula("Rocky",1976,8.1);
			rambo = new Pelicula("Rambo",1979,7.8);
			
			thor.establecerSimilar(capAmerica);
			thor.establecerSimilar(ironMan);
			ironMan.establecerSimilar(capAmerica);
			rocky.establecerSimilar(rambo);
			
			grilla = new ArrayList<Pelicula>(List.of(thor,capAmerica,ironMan,dunkirk,rocky,rambo));
			
			deco = new Decodificador(grilla,new Novedad());
			

			deco.reproducir(thor);
			deco.reproducir(rocky);
			
		
		
	}
    @Test
    public void testSimilaridad() {
    	deco.cambiarCriterio(new Similaridad());
    	List<Pelicula> sugerencias = deco.sugerirPeliculas();
    	List<Pelicula> resultado = new ArrayList<Pelicula>(List.of(capAmerica,ironMan,rambo));
    	assertEquals(resultado,sugerencias);
               
     }

    @Test
    public void testPuntaje() {
    	deco.cambiarCriterio(new Puntaje());
    	List<Pelicula> sugerencias = deco.sugerirPeliculas();
    	List<Pelicula> resultado = new ArrayList<Pelicula>(List.of(dunkirk,ironMan,capAmerica));
    	assertEquals(resultado,sugerencias);
               
     }
    
    @Test
    public void testNovedad() {
    	deco.cambiarCriterio(new Novedad());
    	List<Pelicula> sugerencias = deco.sugerirPeliculas();
    	List<Pelicula> resultado = new ArrayList<Pelicula>(List.of(dunkirk,capAmerica,ironMan));
    	assertEquals(resultado,sugerencias);
               
     }
    
    
}
