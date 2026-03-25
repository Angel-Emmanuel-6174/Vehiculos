public class Main {
    public static void main(String[] args) {
        PedirDatos pedir = new PedirDatos();
        int opc = 0;
        do{
            opc = pedir.pedirEntero("***MENU***\n1.Crear Auto\n2.Crear Camion\n3.Mostrar total de vehiculos\n4.Salir", 1, 4);
            switch(opc){
                case 1:
                    System.out.println("***Crear Auto***");
                    String marca = pedir.pedirCadena("Ingrese la marca: ");
                    String modelo =  pedir.pedirCadena("Ingrese la modelo: ");
                    String anio =  pedir.pedirCadena("Ingrese la anio: ");
                    double precio = pedir.pedirDecimalD("Ingrese la precio: ");
                    int puertas = pedir.pedirEntero("Ingrese el numero de puertas: ",0,5);
                    String tipoCom = pedir.pedirCadena("Ingrese el tipo de Combustible: ");
                    Auto auto1 = new Auto(marca, modelo, anio, precio, puertas, tipoCom);
                    auto1.
            }
        }while(opc!=4);


    }
}