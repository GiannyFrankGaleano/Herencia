public class Vehiculo {

    private String Placa;
    private Marcas Marca;
    private double Valor;
    protected int velocidad = 0;
    protected boolean encendido = false;

    public Vehiculo(String placa, Marcas marca, Double valor) {
        this.Placa = placa;
        this.Marca = marca;
        this.Valor = valor;
    }



    public void acelerar(){
        if (encendido) {
            velocidad = velocidad + 10;
            if (velocidad <= 80) {

                System.out.println("esta acelerando, velocidad actual: " + velocidad + "KM/H");
            }else{
                System.out.println("esta por encima del limite de velocidad permitido");
            }
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
        System.out.println("se encendio su vehiculo,DATOS: "+"Placa: "+Placa+"\n"+"Marca: "+Marca+"\n"+"Valor: "+Valor);
    }

    public void apagar(){
        encendido = false;
        System.out.println("se auto se apagado");
    }

}
