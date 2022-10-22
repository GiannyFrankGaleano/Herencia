public class Main {

    public static void main(String[] args) {
        Bus primerBus = new Bus();

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

        Camioneta primerCamioneta = new Camioneta();
        primerCamioneta.setMarca(Marcas.BENTLEY);
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
