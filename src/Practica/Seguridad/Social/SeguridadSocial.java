package Practica.Seguridad.Social;

import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList;

    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        boolean repetida = false ;

        //Por cada persona 'PersonaActual'(variable) en personasList(ArrayList)'
        for (Persona personaActual : personasList){
            if(personaActual.getDNI().equals(persona.getDNI()) || personaActual.getNumSegSocial().equals(persona.getNumSegSocial())){
                repetida = true;
                break;
            }
        }

        if(!repetida){
            personasList.add(persona);
        }
    }


    public void bajaPersona(String dni) {

        Persona aux = null;

        for(Persona personaActual : personasList){
            if (personaActual.getDNI().equals(dni)){
                aux = personaActual;
                break;
            }
        }

        if(aux!=null){
            personasList.remove(aux);

            //  java 8      personasList.removeIf(persona -> persona.getDNI().equals(dni));
        }

    }

    public Persona obtenerPersonaPorDNI(String dni) {

        for (Persona personaActual : personasList) {
            if (personaActual.getDNI().equals(dni)) {

                return personaActual;
            }
        }
        return null;
    }


    public Persona obtenerPersonaPorNumSS(String numSS) {

        for (Persona personaActual : personasList) {
            if (personaActual.getNumSegSocial().equals(numSS)) {

                return personaActual;
            }
        }
        return null;
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getSalario() >= min && personaActual.getSalario() <= max) {
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getEdad()> edad) {
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas(){
        return personasList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
