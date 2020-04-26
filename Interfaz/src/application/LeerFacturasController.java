package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class LeerFacturasController {
	@FXML
	public Label texto;
	BaseDeDatos datos= 	new BaseDeDatos();
	public void mostrar() {
		texto.setText(datos.Facturas());
	}
}
