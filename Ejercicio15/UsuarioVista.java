import java.util.Scanner;

public class UsuarioVista {
    private Scanner scanner;

    public UsuarioVista() {
        this.scanner = new Scanner(System.in);
    }

    public Usuario solicitarInformacionUsuario() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        return new Usuario(nombre, apellido, correo, nombreUsuario);
    }

    public void mostrarInformacionUsuario(Usuario user) {
        System.out.println("\nInformación del usuario:");
        System.out.println("Nombre: " + user.getNombre());
        System.out.println("Apellido: " + user.getApellido());
        System.out.println("Correo: " + user.getCorreo());
        System.out.println("Nombre de usuario: " + user.getNombreUsuario());
    }
}
