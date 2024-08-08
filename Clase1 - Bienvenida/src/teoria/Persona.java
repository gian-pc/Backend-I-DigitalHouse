package teoria;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo que devuelve si la persona es mayor de edad
    public boolean esMayorQue(){
        return edad >= 18; // por defecto, siempre va a ser true esa condición
    }

    public boolean checkEdad(){
        boolean resp = false;
        if(edad > 0 && edad <= 120){
            resp = true;
        }
        return resp;
    }

    public boolean cantidadDeLetras(){
        return nombre.length() >= 4;
    }

    public boolean checkAZ(){
        boolean resp = false;
        char[] arrayletras = nombre.toCharArray();
        for(char letra : arrayletras){
            if(Character.isLetter(letra)){
                resp = true;
            };
        }
        return resp;
    }


    public String getNombre() {
        return nombre;
    }
}
