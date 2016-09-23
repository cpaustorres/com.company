package Practica.Seguridad.Social;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
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
        //  personaMapDNI.remove();
        return personaMapDNI.get(dni);
    }
    public Persona obtenerPersonaPorNumSS(String numSS){
        // personaMapnumSS.keySet();
        // personaMapnumSS.values();
        //  personaMapnumSS.remove();

        return personaMapDNI.get(numSS);
    }

    public List<Persona>  obtenerPersonasRangoSalarial (double min, double max , String dni , List Persona ) {


        personaMapDNI.get(Persona);

        return null;
    }


}


