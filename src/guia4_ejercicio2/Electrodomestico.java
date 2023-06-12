package guia4_ejercicio2;

abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo_energetico;
    protected Double peso;

    public Electrodomestico( String color, char consumo_energetico, Double peso) {
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.comprobarConsumoEnergetico(consumo_energetico);
        this.comprobarColor(color);
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {
            this.consumo_energetico = 'F';
        }else{
            this.consumo_energetico=letra;
        }
        System.out.println("Tu consumo energetico es de tipo: " + this.consumo_energetico);
    }

    private void comprobarColor(String color) {
        if (color != "blanco" || color != "negro" || color != "rojo" || color != "azul" || color != "gris") {
            this.color = "blanco";
        }
    }

    protected void precioFinal() {
        int A = 1000;
        int B = 800;
        int C = 600;
        int D = 500;
        int E = 300;
        int F = 100;
        int peso_liviano = 100;
        int peso_mediano = 500;
        int peso_pesado = 800;
        int peso_extra_pesado = 1000;

        if (this.consumo_energetico == 'A') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = A + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = A + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = A + peso_pesado;
            } else {
                precio = A + peso_extra_pesado;
            }
        }

        if (this.consumo_energetico == 'B') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = B + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = B + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = B + peso_pesado;
            } else {
                precio = B + peso_extra_pesado;
            }
        }

        if (this.consumo_energetico == 'C') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = C + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = C + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = C + peso_pesado;
            } else {
                precio = C + peso_extra_pesado;
            }
        }

        if (this.consumo_energetico == 'D') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = D + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = D + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = D + peso_pesado;
            } else {
                precio = D + peso_extra_pesado;
            }
        }

        if (this.consumo_energetico == 'E') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = E + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = E + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = E + peso_pesado;
            } else {
                precio = E + peso_extra_pesado;
            }
        }
        if (this.consumo_energetico == 'F') {
            if (this.peso < 1) {
                System.out.println("El peso debe ser mayor a 0");
            }

            if (this.peso >= 1 && this.peso <= 19) {
                precio = F + peso_liviano;
            } else if (this.peso >= 20 && this.peso <= 49) {
                precio = F + peso_mediano;
            } else if (this.peso >= 50 && this.peso <= 79) {
                precio = F + peso_pesado;
            } else {
                precio = F + peso_extra_pesado;
            }
        }
        
        
        
    }
}
