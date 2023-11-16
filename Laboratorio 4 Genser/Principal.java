import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Kayac kayac = new Kayac();
        Usuario usuario = new Usuario();
        Reserva reserva = new Reserva();

        
        int inicio = 1;
        while (inicio == 1) {
            System.out.println("\n¡Bienvenido! ");
            System.out.println("Por favor, antes de empezar Crea tu usuario");

            usuario.CrearUsuario();  
            kayac.registrarUsuario(usuario);

            System.out.println("\n----------MENU----------\n");
            System.out.println("1. Modo Reserva");
            System.out.println("2. Modo Confirmacion");
            System.out.println("3. Perfil");
            System.out.println("4. Salir ");
            int menu = teclado.nextInt();
            
            switch (menu) {
                case 1:
                    kayac.realizarReserva(reserva);
                
                    break;

                case 2:

                    kayac.realizarConfirmacion(reserva);
                    break;

                case 3:
                    kayac.modificarTipoUsuario(usuario);
                    kayac.aplicarCupon();
                    kayac.cambiarContraseña(usuario);

                    break;

                case 4:
                    System.out.println("Gracias por usar este programa ;)");
                    break;
            
                default:
                    System.out.println("La opcion que a ingresado no se encuentra dentro de la lista de opciones");
                    break;
            }

            

        }


    }
    
}
