package Coches;

import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {

        List<Coche> ListaCoches = new ArrayList<>();
        for (Coche Coche : coches){
            if (Coche.getMatricula() == matricula){
                return Coche;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String matricula) {

        for (Coche Coche : coches){
            if (Coche.getMatricula() == matricula){
                coches.remove(Coche);
            }
        }
    }

    public Coche obtenerVehiculoPrecioMax() {
    Coche cochemax = null ;
        double preciomax= 0;
        for (Coche Coche : coches){
            if (Coche.getPrecio() > preciomax){
                preciomax = Coche.getPrecio();
                cochemax = Coche;
            }
        }
        return cochemax;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> ListaCoches = new ArrayList<>();
        for (Coche Coche : coches){
            if (Coche.getMarca() == marca){
                ListaCoches.add(Coche);
            }
        }
        return ListaCoches;
    }

    public List<Coche> obtenerTodos() {
        List<Coche> ListaCoches = new ArrayList<>();
        for (Coche Coche : coches) {
                ListaCoches.add(Coche);
        }
        return ListaCoches;
    }
}