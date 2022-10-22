public class Bus extends Vehiculo {
        private Empresa empresa;

        public Empresa getEmpresa() {
                return empresa;
        }

        public void setEmpresa(Empresa empresa) {
                this.empresa = empresa;
        }

        @Override
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

        }

