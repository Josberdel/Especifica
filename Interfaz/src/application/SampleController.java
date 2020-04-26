package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController {
	private LeerFacturasController leerFacturasController;
	private LeerProvedoresController leerProvedoresController;
	@FXML
	private void Facturas() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LeerFacturas.fxml"));
			AnchorPane root =(AnchorPane)loader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root, 600, 600));
			stage.show();
			leerFacturasController =(LeerFacturasController) loader.getController();
			leerFacturasController.mostrar();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	private void Proveedores() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LeerProveedores.fxml"));
			AnchorPane root =(AnchorPane)loader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root, 600, 600));
			stage.show();
			leerProvedoresController= (LeerProvedoresController) loader.getController();
			leerProvedoresController.mostrar();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
