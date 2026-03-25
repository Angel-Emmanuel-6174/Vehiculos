public class Main {
    public static void main(String[] args) {
        PedirDatos pedir = new PedirDatos();
        String marca, modelo, anio, tipoCom;
        double precio;
        int puertas, capacidad, numEjes, opc=0, totalV=0;
        do{
            opc = pedir.pedirEntero("***MENU***\n1.Crear Auto\n2.Crear Camion\n3.Mostrar total de vehiculos\n4.Salir", 1, 4);
            switch(opc){
                case 1:
                    System.out.println("***Crear Auto***");
                    marca = pedir.pedirCadena("Ingrese la marca: ");
                    modelo =  pedir.pedirCadena("Ingrese la modelo: ");
                    anio =  pedir.pedirCadena("Ingrese la anio: ");
                    precio = pedir.pedirDecimalD("Ingrese la precio: ");
                    puertas = pedir.pedirEntero("Ingrese el numero de puertas: ",1,5);
                    tipoCom = pedir.pedirCadena("Ingrese el tipo de Combustible: ");
                    Auto auto1 = new Auto(marca, modelo, anio, precio, puertas, tipoCom);
                    auto1.mostrarInfo();
                    auto1.encender();
                    auto1.aplicarDescuento();
                    auto1.tocarClaxon();
                    auto1.mostrarPuertas();
                    totalV++;
                    break;
                case 2:
                    System.out.println("***Crear Camion***");
                    marca = pedir.pedirCadena("Ingrese la marca: ");
                    modelo =  pedir.pedirCadena("Ingrese la modelo: ");
                    anio =  pedir.pedirCadena("Ingrese la anio: ");
                    precio = pedir.pedirDecimalD("Ingrese la precio: ");
                    capacidad = pedir.pedirEntero("Ingrese la capacidad: ",1,100000);
                    numEjes = pedir.pedirEntero("Ingrese el numero de ejes: ",1,100);
                    Camion camion1 = new Camion(marca, modelo, anio, precio, capacidad, numEjes);
                    camion1.mostrarInfo();
                    camion1.encender();
                    camion1.aplicarDescuento();
                    camion1.cargarMercancia();
                    camion1.mostrarCapacidad();
                    totalV++;
                    break;
                case 3:
                    System.out.println("***Mostrar total de vehiculos***");
                    System.out.println("TOTAL: "+totalV);
                    break;
            }
        }while(opc!=4);


    }
}