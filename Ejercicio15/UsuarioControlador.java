public class UsuarioControlador {
    private UsuarioVista userView;

    public UsuarioControlador(UsuarioVista userView) {
        this.userView = userView;
    }

    public void registrarUsuario() {
        Usuario user = userView.solicitarInformacionUsuario();
        userView.mostrarInformacionUsuario(user);
    }
}
