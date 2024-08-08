package teoria;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersona {

    private List<Persona> listaPersona;

    public GrupoPersona() {
        listaPersona = new ArrayList<>();
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void agregarPersonas(Persona persona){
        if(persona.checkEdad() && persona.checkAZ() && persona.cantidadDeLetras() && persona.esMayorQue()){
            listaPersona.add(persona);
            System.out.println("Se ha agregado la persona " + persona.getNombre());
        }else{
            System.out.println("No se puede agregar la persona " + persona.getNombre());
        }

    }
}
