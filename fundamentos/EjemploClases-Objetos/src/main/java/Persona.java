
public class Persona {

    String nombre;
    String apellido;
    int edad;
    String telefono;
    String correo;
    
    Persona(){
        this.correo = "";
        this.telefono = "";
        this.apellido = "";
        this.nombre = "";
    }

    Persona(String nombre, String apellido, int edad, String telefono, String correo) {
        this.correo = "";
        this.telefono = "";
        this.apellido = "";
        this.nombre = "";
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void printNombreCompleto() {
        System.out.println(this.nombre + " " + this.apellido);
    }
}
