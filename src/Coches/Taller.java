package Coches;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    private Map<Persona, Coche> reparaciones =

            new TreeMap<>(Comparator.comparing(Persona::getNumSegSocial));

    public Coche registrarReparacion(Persona persona, Coche coche) {

        //CARLOS ESTA MALAMENT

        if (!reparaciones.containsKey(persona.getDNI()) && !reparaciones.containsKey(coche.getMatricula())) {

            reparaciones.put(persona, coche);
        }
        return null;
    }

    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes(){

//CARLOS
    }

}
