package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Modelos.ProductosModel;
import Vistas.LoginView;
import Vistas.PrincipalView;
import Vistas.ProductosView;
import Vistas.RegistroView;

public class PrincipalController {
    private PrincipalView principalView;

    public PrincipalController(PrincipalView principalView) {
        this.principalView = principalView;

        this.principalView.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginView loginView = new LoginView();
                new LoginController(loginView, PrincipalController.this);

                principalView.setVisible(false);
                loginView.setVisible(true);
            }
        });

        this.principalView.getRegistroButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroView registroView = new RegistroView();
                new RegistroController(registroView, PrincipalController.this);

                principalView.setVisible(false);
                registroView.setVisible(true);
            }
        });
    }

    public void mostrarVentanaProductos(boolean login) {
        ProductosView productosView = new ProductosView();
        ProductosModel productosModel = new ProductosModel();
        ProductosController productosController = new ProductosController(productosView, productosModel);

        if (login) {
            productosController.generarCargosAleatorios();
        }

        productosView.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                principalView.setVisible(true);
            }
        });

        principalView.setVisible(false);
        productosView.setVisible(true);
    }
}
