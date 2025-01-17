package ar.edu.info.unlp.balanzaElectronica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.balanzaElectronica.Persona;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Persona james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona();
		guido = new Persona();
		james.setApellido("Glosing");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
		
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Glosing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
}
