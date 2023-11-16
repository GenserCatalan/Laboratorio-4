import java.util.ArrayList;
import java.util.Scanner;

public class Kayac {
    Scanner teclado = new Scanner(System.in);
    protected ArrayList<Usuario> usuarios;
    protected ArrayList<Reserva> reservas;

    public Kayac() {
        this.usuarios = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }


    /**Metodo para autenticar al usuario
     * @param usuario
     * @param contraseña
     * @return boolean
     */
    public boolean autenticarUsuario(String usuario, String contraseña) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                System.out.println("¡Usuario autenticado!");
                return true;
            }
        }
        System.out.println("Error: Usuario o contraseña incorrectos.");
        return false;
    }

    /**Metodo para registrar al usuario en el array
     * @param usuario
     * @param contraseña
     * @param tipo
     */
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    

    /**Metodo para modificar el Status del usuario (Premium/Regular)
     * @param usuario
     * return String
     */
    public void modificarTipoUsuario(Usuario usuario) {
        System.out.println("Tu Status de usuario actual es: " + usuario.getTipo());
        System.out.println("¿Deseas cambiar de Status? Si/No (Ingresa la primera inicial mayuscula)");
        String modificarStatus = teclado.nextLine();
        
        if (modificarStatus.equals("Si")){
            System.out.println("Ingresa al Status al que deseas pasar: Premium/Regular  (Ingresa la primera inicial mayuscula)");
            String respuestaModificacion = teclado.nextLine();
            usuario.setTipo(respuestaModificacion);
            System.out.println("Su nuevo Status es "+ usuario.getTipo());}

        else {
            System.out.println("Su Status de usuario se a quedado igual");
        }
    }
    
    /**Metodo para cambair contraseña
     * @param usuario
     */
    public void cambiarContraseña(Usuario usuario) {
        System.out.println("¿Deseas cambiar tu contraseña actual? (Si/No)");
        System.out.println("Aviso: Escribir con inicial mayuscula");

        String cambioContrasena = teclado.nextLine();
        if (cambioContrasena == "Si"){
            System.out.println("Tu contraseña actual es " + usuario.getContraseña());
            System.out.println("Ingresa tu nueva: ");
            String contrasenaNueva = teclado.nextLine();
            usuario.setContraseña(contrasenaNueva);
            System.out.println("Tu contraseña a sido cambiada con exito!");
            
        }
        
    }

    //En el diagrama compartido por Discord no pusieron atributos de precios en ninguna clase :(
    /**Metodo para aplicar cupon
     * return String
     */
    public void aplicarCupon() {
        System.out.println("Por ser tu primera vez aqui tienes un cupon por el 10% de descuento");
        System.out.println("Codigo de descuento: X5JD8G2B");
        System.out.println("\nDeseas aplicar el cupon ahora? Si/No");
        System.out.println("Aviso: Ingresar respuesta con inicial mayuscula");

        String respuestaCupon = teclado.nextLine();
        if (respuestaCupon == "Si"){
            System.out.println("Cupon canjeado!!!");
        }  

        else{
            System.out.println("Cupon no canjeado");
        }
            }

    public void realizarReserva(Reserva reserva) {
        reserva.crearReserva();
        reservas.add(reserva);
    }

    public void realizarConfirmacion(Reserva reserva) {
        reserva.definirNumeroDeTargeta();
        reserva
    }

    public void imprimirReserva(Reserva reserva) {
        // Implementar la impresión de la reserva aquí.
    }

    public void imprimirConfirmacion() {
        // Implementar la impresión de la confirmación aquí.
    }

    public void cargarCSV() {
        // Implementar la carga de datos desde CSV aquí.
    }
}
