public class Main {

    public static void main(String[] args) {
        Bus primerBus = new Bus("XCD309",Marcas.CHEVROLET,150000.0);

        primerBus.setEmpresa(Empresa.BOLIVARIANO);

        System.out.println("Nombre de la empresa: "+primerBus.getEmpresa().nombre);
        primerBus.encender();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();
        primerBus.acelerar();



        primerBus.frenar();

        System.out.println("---------------------------------------------------");

        Camioneta primerCamioneta = new Camioneta("XDD123",Marcas.FORD,80000.0);
        primerCamioneta.setMarca(Marcas.BENTLEY);
        System.out.println();
        primerCamioneta.encender();
        primerCamioneta.acelerar();
        primerCamioneta.acelerar();
        primerCamioneta.acelerar();
        primerCamioneta.acelerar();
        primerCamioneta.acelerar();
        primerCamioneta.acelerar();

        primerCamioneta.frenar();


    }
}
