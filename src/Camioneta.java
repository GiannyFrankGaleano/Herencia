public class Camioneta extends Vehiculo {

    private Marcas marca;

    public Camioneta(String placa, Marcas marca, Double valor) {
        super(placa, marca, valor);
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }
}
