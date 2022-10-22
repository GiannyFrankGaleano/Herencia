public class Vehiculo {

    private String Placa;
    private Marcas Marca;
    private double Valor;
    protected int velocidad = 0;
    protected boolean encendido = false;

    public void acelerar(){
        if (encendido) {
            velocidad = velocidad + 10;
            System.out.println("esta acelerando, "+velocidad+"KM/H");
        }else{
            System.out.println("el vehiculo se encuentra apagado");
        }
    }

    public void frenar (){
        if (velocidad > 0) {
            velocidad = velocidad - 25;
            System.out.println("su auto ha frenado, velocidad actual: " + velocidad + "KM/H");

        }else{
            System.out.println("el vehiculo no se encuentra en movimiento");
        }
    }

    public void encender(){

        encendido = true;
        System.out.println("se encendio su vehiculo, velocidad actual: "+velocidad+"KM/H");
    }

    public void apagar(){
        encendido = false;
        System.out.println("se auto se apagado");
    }

}
