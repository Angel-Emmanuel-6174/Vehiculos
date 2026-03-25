public class Camion extends Vehiculo{
    protected int capacidadCarga, numeroEjes;
    public Camion(String marca, String modelo, String anio, double precio, int capacidadCarga, int numeroEjes){
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public void cargarMercancia(){
        System.out.println("El camion "+getMarca()+" esta cargando mercancia");
    }

    public void mostrarCapacidad(){
        System.out.println("La capacidad de carga es:"+this.capacidadCarga);
    }
}
