public class Vehiculo {
    private String marca, modelo, anio;
    private double precio;
    static int totalVehiculos = 0;
    public Vehiculo(){
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, String anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Anio: " + this.anio);
    }

    public void encender(){
        System.out.println("El vehiculo "+this.marca+" ha sido encendido");
    }

    public void aplicarDescuento(){
        double desc = 0.9;
        System.out.println("TOTAL CON DESCUENTO: "+(this.precio*desc));
    }

}
