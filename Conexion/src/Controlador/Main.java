package Controlador;

import ConexionBD.Conexion;
import ConexionBD.Dao_Fachada;
import Interfaz.VentanaPrincipal;
import Modelo.Fachada;
import Interfaz.ConsultarEmpleado;
import Interfaz.ConsultarProductos;
import Interfaz.ConsultarProveedor;
import Interfaz.CrearEmpleado;
import Interfaz.CrearProducto;

public class Main {
		
		public static void main(String[] args) {
			new Conexion();
			VentanaPrincipal login = new VentanaPrincipal();
			login.setVisible(true);
			ConsultarEmpleado empleado = new ConsultarEmpleado(null);
			ConsultarProductos producto = new ConsultarProductos(null);
			ConsultarProveedor proveedor = new ConsultarProveedor(null);
			CrearEmpleado empleado1 = new CrearEmpleado(null);
			CrearProducto producto1 = new CrearProducto(null);
			
		}
	}