import java.util.Scanner;

public class Reserva extends Kayac{
    private String fechaVuelo;
    private boolean tipoDeVuelo; 
    private int cantidadBoletos;
    private String aerolinea;
    private int numeroTarjeta;
    private int cuotas;
    private boolean claseVuelo; 
    private int numeroAsiento;
    private int cantidadMaletas;
    private Usuario usuario;
    Scanner scanner = new Scanner(System.in);

    //Valores iniciales
    public Reserva(){
        fechaVuelo = "";
        tipoDeVuelo = false;
        cantidadBoletos = 0;
        aerolinea = "";
        numeroTarjeta = 0;
        cuotas = 0;
        claseVuelo = false;
        numeroAsiento = 0;
        cantidadMaletas = 0;
        usuario = null;
        }


    // Constructor
    public Reserva(String fechaVuelo, boolean tipoDeVuelo, int cantidadBoletos, String aerolinea,
                   int numeroTarjeta, int cuotas, boolean claseVuelo, int numeroAsiento, int cantidadMaletas, Usuario usuario) {
        this.fechaVuelo = fechaVuelo;
        this.tipoDeVuelo = tipoDeVuelo;
        this.cantidadBoletos = cantidadBoletos;
        this.aerolinea = aerolinea;
        this.numeroTarjeta = numeroTarjeta;
        this.cuotas = cuotas;
        this.claseVuelo = claseVuelo;
        this.numeroAsiento = numeroAsiento;
        this.cantidadMaletas = cantidadMaletas;
        this.usuario = usuario;
    }

    //Get y setters
    public String getFechaVuelo() {
        return fechaVuelo;
    }
    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
    public boolean isTipoDeVuelo() {
        return tipoDeVuelo;
    }
    public void setTipoDeVuelo(boolean tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }
    public String getAerolinea() {
        return aerolinea;
    }
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public int getCuotas() {
        return cuotas;
    }
    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    public boolean isClaseVuelo() {
        return claseVuelo;
    }
    public void setClaseVuelo(boolean claseVuelo) {
        this.claseVuelo = claseVuelo;
    }
    public int getNumeroAsiento() {
        return numeroAsiento;
    }
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    public int getCantidadMaletas() {
        return cantidadMaletas;
    }
    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 

    public Reserva crearReserva() {

        System.out.println("Ingrese la fecha de vuelo:");
        this.setFechaVuelo(scanner.nextLine());

        System.out.println("¿Es un vuelo de ida y vuelta? (true/false):");
        this.setTipoDeVuelo(scanner.nextBoolean());

        System.out.println("Ingrese la cantidad de boletos:");
        this.setCantidadBoletos(scanner.nextInt());

        System.out.println("Ingrese la aerolínea:");
        scanner.nextLine(); 
        this.setAerolinea(scanner.nextLine());

        System.out.println("Datos almacenados");

        return this;
    }

    public void definirNumeroDeTargeta(){
        System.out.println("Ingrese el número de tarjeta:");
        int numeroTarjeta = scanner.nextInt();
        this.setNumeroTarjeta(numeroTarjeta);
    }

    public void definirCantidadCuotas(){
        String status = usuario.getTipo();
        if (status.equals("Regular") || status.equals("regular") && cuotas >= 0 && cuotas <= 24) {
            System.out.println("Ingrese la cantidad de cuotas:");
            int cuotast = scanner.nextInt();
            this.setCuotas(cuotast);
            System.out.println("Tus cuotas quedaron en " + this.getCuotas());
        }
            
        else if (status.equals("Premium") || status.equals("premium")) {
            System.out.println("Ingrese la cantidad de cuotas:");
            int cuotast2 = scanner.nextInt();
            this.setCuotas(cuotast2);
            System.out.println("Tus cuotas quedaron en " + this.getCuotas());}
        }


    public void imprimirItinerario(){
        System.out.println("===== Itinerario de Reserva =====");
        System.out.println("Fecha de vuelo: " + getFechaVuelo());
        System.out.println("Tipo de vuelo (ida y vuelta): " + isTipoDeVuelo());
        System.out.println("Cantidad de boletos: " + getCantidadBoletos());
        System.out.println("Aerolínea: " + getAerolinea());
        System.out.println("Número de tarjeta: " + getNumeroTarjeta());
        System.out.println("Cantidad de cuotas: " + getCuotas());
        System.out.println("Clase de vuelo (primera clase): " + isClaseVuelo());
        System.out.println("Número de asiento: " + getNumeroAsiento());
        System.out.println("Cantidad de maletas: " + getCantidadMaletas());
        System.out.println("================================");
    }
}
