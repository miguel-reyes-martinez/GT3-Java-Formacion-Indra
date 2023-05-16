public class Main {
    public static void main(String[] args) {
        UsuarioVista userView = new UsuarioVista();
        UsuarioControlador userController = new UsuarioControlador(userView);

        userController.registrarUsuario();
        userController.registrarUsuario();
        userController.registrarUsuario();
    }
}
