import Vistas.*;
import Controladores.*;

import javax.swing.*;

public class HomebankingApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			PrincipalView principalView = new PrincipalView();
			PrincipalController principalController = new PrincipalController(principalView);

			principalView.setVisible(true);
		});
	}
}
