package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LeerProvedoresController {
	@FXML
	public Label texto;
	BaseDeDatos datos= 	new BaseDeDatos();
	public void mostrar() {
		texto.setText(datos.Proveedores());
	}
}
