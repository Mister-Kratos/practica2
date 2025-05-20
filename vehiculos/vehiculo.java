class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected float precio_base;

    public Vehiculo(String marca, String modelo, int año, float precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.printf("Precio base: %.2f\n", precio_base);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
    public float getPrecio_base() { return precio_base; }
    public void setPrecio_base(float precio_base) { this.precio_base = precio_base; }
}

class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, float precio_base,
                 int num_puertas, String tipo_combustible) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Número de puertas: " + num_puertas);
        System.out.println("Tipo de combustible: " + tipo_combustible);
    }

    public int getNum_puertas() { return num_puertas; }
    public void setNum_puertas(int num_puertas) { this.num_puertas = num_puertas; }
    public String getTipo_combustible() { return tipo_combustible; }
    public void setTipo_combustible(String tipo_combustible) { this.tipo_combustible = tipo_combustible; }
}

class Moto extends Vehiculo {
    private int cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, float precio_base,
                int cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo de motor: " + tipo_motor);
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
    public String getTipo_motor() { return tipo_motor; }
    public void setTipo_motor(String tipo_motor) { this.tipo_motor = tipo_motor; }
}

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Ford", "Mustang", 2022, 45000, 2, "Gasolina");
        Moto moto1 = new Moto("Honda", "CBR600", 2021, 12000, 600, "4 tiempos");

        System.out.println("Información del coche 1");
        coche1.mostrar_info();

        System.out.println("\nInformación del coche 2");
        coche2.mostrar_info();

        System.out.println("\nInformación de la moto 1");
        moto1.mostrar_info();

        System.out.println("\nCoches con más de 4 puertas");
        Coche[] coches = {coche1, coche2};
        for (Coche c : coches) {
            if (c.getNum_puertas() > 4) {
                c.mostrar_info();
            }
        }

        System.out.println("\nVehículos de gestión 2025");
        Vehiculo[] vehiculos = {coche1, coche2, moto1};
        for (Vehiculo v : vehiculos) {
            if (v.getAño() == 2025) {
                v.mostrar_info();
            }
        }
    }
}