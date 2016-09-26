package Practica.Seguridad.Social;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
  Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashMap {

    private Map<String,Persona> personaMapDNI = new HashMap<>();
    private Map<String,Persona> personaMapnumSS = new HashMap<>();


    public void altaPersona(Persona persona){

        if(!personaMapDNI.containsKey(persona.getDNI()) && !personaMapnumSS.containsKey(persona.getNumSegSocial())){

        personaMapDNI.put(persona.getDNI(),persona);
        personaMapnumSS.put(persona.getNumSegSocial(),persona);
        }
    }
    public void bajaPersona(String dni){
           personaMapDNI.remove(dni);
    }
    public Persona obtenerPersonaPorDNI(String dni){
        // personaMapDNI.keySet();
        // personaMapDNI.values();
        // personaMapDNI.remove();
        return personaMapDNI.get(dni);
    }
    public Persona obtenerPersonaPorNumSS(String numSS){
        // personaMapnumSS.keySet();
        // personaMapnumSS.values();
        //  personaMapnumSS.remove();
        return personaMapnumSS.get(numSS);
    }
    public List<Persona> obtenerPersonasRangoSalarial (double min, double max) {
        //java 8
        return personaMapDNI.values().stream().filter(persona -> persona.getSalario()>min
                            && persona.getSalario()< max).collect(Collectors.toList());


    }



    public List<Persona> obtenerPersonasMayoresQue(int edad){
        //java8
        return personaMapDNI.values().stream().filter(persona-> persona.getEdad() > edad).collect(Collectors.toList());
    }

    public List<Persona> obtenerTodas(){

        return personaMapDNI.values().stream().collect(Collectors.toList());
    }{
    }

}


