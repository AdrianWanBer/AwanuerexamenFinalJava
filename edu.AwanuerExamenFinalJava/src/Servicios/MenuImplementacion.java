package Servicios;

import java.util.Scanner;

/**
 * Implementacion de los metodos de los menus
 */
public class MenuImplementacion implements MenuInterfaz {

	// Importacion del Scanner
	Scanner sc = new Scanner(System.in);

	/**
	 * Metodo de mostrar y recopilar datos del menu principal awb
	 * 
	 * @param int
	 */
	public int menuPrincipal() {
		int seleccion;
		System.out.println("MENU PRINCIPAL");
		System.out.println("0. CERRAR");
		System.out.println("1. EMPLEADO");
		System.out.println("2. CLIENTE");
		seleccion = sc.nextInt();
		return seleccion;
	}

	/**
	 * Metodo de mostrar y recopilar datos del menu de los empleados awb
	 * 
	 * @param int
	 */
	public int menuEmpleados() {
		int seleccion;
		System.out.println("MENU EMPLEADOS");
		System.out.println("0. ATRAS");
		System.out.println("1. VALIDAR NUEVO CLIENTE");
		System.out.println("2. IMPRIMIR CITAS MEDICAS");
		seleccion = sc.nextInt();
		return seleccion;
	}

	/**
	 * Metodo de mostrar y recopilar datos del menu clientes awb
	 * 
	 * @param int
	 */
	public int menuClientes() {
		int seleccion;
		System.out.println("MENU EMPLEADOS");
		System.out.println("0. ATRAS");
		System.out.println("1. REGISTRO DE CLIENTE");
		System.out.println("2. SOLICITUD DE CITA MEDICA");
		System.out.println("3. CONSULATAR CITAS PARA UN INTERVALO");
		seleccion = sc.nextInt();
		return seleccion;
	}

	/**
	 * Metodo que mostrara el menu de las especialidades (usado en OperativaImplementacion)
	 */
	public int menuEspecialidades() {

		System.out.println("De que quiere su cita");
		System.out.println("1. Psicologia");
		System.out.println("2. Traumatología");
		System.out.println("3. Fisioterapia");
		int seleccion = sc.nextInt();
		return seleccion;
	}
}
