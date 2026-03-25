public class Auto extends Vehiculo{
    protected int numeroPuertas;
    protected String tipoCombustible;

    public Auto(String marca, String modelo, String anio, double precio, int numeroPuertas, String tipoCombustible){
        super(marca, modelo, anio, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public void tocarClaxon(){
        System.out.println("El auto "+getMarca()+" toca claxon");
    }

    public void mostrarPuertas(){
        System.out.println("El auto tiene "+this.numeroPuertas+" de puertas");
    }

}
