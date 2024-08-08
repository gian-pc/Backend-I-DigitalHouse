package teoria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrupoPersonaTest {

    @Test
    public void agregar2Personas(){
        // Dado
        GrupoPersona grupoPersona = new GrupoPersona();
        Persona persona1 = new Persona("Juan", 18);
        Persona persona2 = new Persona("Pedro", 17);
        Persona persona3 = new Persona("Ana", 22);
        Persona persona4 = new Persona("Luz", 14);
        Persona persona5 = new Persona("Julián", 32);

        // Cuando
        grupoPersona.agregarPersonas(persona1);
        grupoPersona.agregarPersonas(persona2);
        grupoPersona.agregarPersonas(persona3);
        grupoPersona.agregarPersonas(persona4);
        grupoPersona.agregarPersonas(persona5);

        // Entonces
        Assertions.assertTrue(grupoPersona.getListaPersona().size() == 2);

    }
}
