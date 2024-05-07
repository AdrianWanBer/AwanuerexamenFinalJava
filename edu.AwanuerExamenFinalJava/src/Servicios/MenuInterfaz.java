package Servicios;

/*
 * Interfaz que implementa los metodos relacionados con los menus
 */
public interface MenuInterfaz {
	
	/**
	 * Metodo que se encarga de mostrar el menu principal
	 * awb
	 * @param int
	 */
	public int menuPrincipal();
	
	/**
	 * metodo del menu de los empleados
	 * awb
	 * @return int
	 */
	public int menuEmpleados();
	
	/**
	 * metodo del menu de los clientes
	 * awb
	 * @return int
	 */
	public int menuClientes();
	
	/**
	 * Metodo encargado de mostrar y dar a elegir el menu de especialidades
	 * awb
	 * @return int seleccion
	 */
	public int menuEspecialidades();
}
