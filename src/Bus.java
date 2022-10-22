public class Bus extends Vehiculo {
        private Empresa empresa;

        public Empresa getEmpresa() {
                return empresa;
        }

        public void setEmpresa(Empresa empresa) {
                this.empresa = empresa;
        }

        public Bus (String placa, Marcas marca, Double valor){

                super (placa,marca,valor);
        }

        @Override
        public void acelerar(){


                        if (encendido) {
                       super.acelerar();
                }

        }
}

