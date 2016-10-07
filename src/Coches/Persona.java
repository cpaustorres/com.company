package Coches;

/**
 * Created by usu26 on 19/09/2016.
 */

public class Persona {
    private String DNI;
    private String NumSegSocial;
    private String nombre;
    private String apellidos;
    private int edad;


    public Persona(String DNI, String numSegSocial, String nombre, String apellidos, int edad) {
        this.DNI = DNI;
        this.NumSegSocial = numSegSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNumSegSocial() {
        return NumSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        NumSegSocial = numSegSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", NumSegSocial='" + NumSegSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (DNI != null ? !DNI.equals(persona.DNI) : persona.DNI != null) return false;
        if (NumSegSocial != null ? !NumSegSocial.equals(persona.NumSegSocial) : persona.NumSegSocial != null)
            return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellidos != null ? apellidos.equals(persona.apellidos) : persona.apellidos == null;

    }

    @Override
    public int hashCode() {
        int result;

        result = DNI != null ? DNI.hashCode() : 0;
        result = 31 * result + (NumSegSocial != null ? NumSegSocial.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }
}

