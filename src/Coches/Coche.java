package Coches;

/**
 * Created by usu26 on 06/10/2016.
 */
public class Coche {
    private String Matricula;
    private String Marca;
    private String Modelo;
    private double Precio;



    public Coche(String Matricula, String Marca, String Modelo, double Precio) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (Double.compare(coche.Precio, Precio) != 0) return false;
        if (!Matricula.equals(coche.Matricula)) return false;
        if (!Marca.equals(coche.Marca)) return false;
        return Modelo.equals(coche.Modelo);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Matricula.hashCode();
        result = 31 * result + Marca.hashCode();
        result = 31 * result + Modelo.hashCode();
        temp = Double.doubleToLongBits(Precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}