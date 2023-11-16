import java.util.Scanner;

public class Usuario extends Kayac{
    private String usuario;
    private String contraseña;
    private String tipo;
    Scanner teclado = new Scanner(System.in);
    
    //Valores iniciales
    public Usuario(){
        usuario = " ";
        contraseña = " ";
        tipo = " ";
    }

    //Contructor
    public Usuario(String usuario, String contraseña, String tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }
    
    //Get y setters
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**Metodo para crear usuario
     * return String
     */
    public Usuario CrearUsuario() {
        System.out.println("Ingrese su nombre de usuario");
        String usuario = teclado.nextLine();
        this.setUsuario(usuario);
    
        System.out.println("\nIngrese su nueva contraseña");
        String contraseña = teclado.nextLine();
        this.setContraseña(contraseña);
    
        System.out.println("\n¿Qué status deseas tener? Regular/Premium (Escribir con inicial mayúscula)\n---------------------------------------------------------");
        System.out.println("¡¡¡AVISO!!!");
        System.out.println("Al ser un usuario premium desbloqueas nuevas funcionalidades a las que los\n" +
                "usuarios (Regulares) no tienen acceso");
        String tipo = teclado.nextLine();
        this.setTipo(tipo);
    
        return this;  
    }
}


    


