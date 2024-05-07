package Servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Dtos.CitasDtos;
import Dtos.ClientesDtos;

/**
 * Implementacion encargada de la operativa de la aplicacion awb
 */
public class OperativaImplementacion implements OperativaInterfaz {
	// Declaracion de ids y formatos de fechas...etc
	SimpleDateFormat formatoFechaConHoras = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	int idCliente = 0;
	Scanner sc = new Scanner(System.in);
	MenuInterfaz mi = new MenuImplementacion();

	/**
	 * metodo encargado de la creacion de los clientes awb
	 */
	public void registroDeCliente(List<ClientesDtos> listaClientes) {

		// hora
		Date ahora = new Date();

		System.out.println("Cual es su dni (minusculas)");
		String dniCompleto = sc.nextLine();
		System.out.println("Cual es su nombre");
		String nombre = sc.nextLine();
		System.out.println("Cuales son sus apellido");
		String apellidos = sc.nextLine();
		
		idCliente = idCliente++;
		boolean validacion = false;
		ClientesDtos nuevoCliente = new ClientesDtos(idCliente, dniCompleto, apellidos + ", " + nombre, validacion, ahora);
		listaClientes.add(nuevoCliente);

		System.out.println("¡Creado con exito el nuevo cliente!");

	}

	/**
	 * Metodo de la validacion de los clientes (Menu empleados) awb
	 */
	public void validacionCliente(List<ClientesDtos> listaClientes) {
		System.out.println("Listado de los clientes sin validar");
		for (ClientesDtos cliente : listaClientes) {
			if (cliente.isValidado() == false) {
				System.out.println(cliente.getDni() + " - " + cliente.getNombreCompleto());
			}
				}
		System.out.println("Que Dni desea validar");
		String dniAValidar = sc.nextLine();
		for (ClientesDtos clientee : listaClientes) {
			if (clientee.getDni().equals(dniAValidar)) {
				clientee.setValidado(true);
				System.out.println("¡Cliente validado!");
			}
		}
	}

	/**
	 * Metodo que se encargara de realizar la pedida de cita al sistema con
	 * validacion de usuario y seleccion de especialidad awb
	 */
	public void solicitudCitaMedica(List<ClientesDtos> listaClientes, List<CitasDtos> listaCitas) {
		CitasDtos nuevaCita = new CitasDtos();
		String especialidad = "";
		System.out.println("Cual es su dni (minusculas)");
		String dniDado = sc.nextLine();
		for (ClientesDtos cliente : listaClientes) {
			if (cliente.getDni().equals(dniDado.toLowerCase()) && cliente.isValidado() == true) {
				int seleccion = mi.menuEspecialidades();
				switch (seleccion) {
				case 1: // Psicologia
					especialidad = "Psicologia";
					break;
				case 2: // Traumatología
					especialidad = "Traumatología";
					break;
				case 3: // Fisioterapia
					especialidad = "Fisioterapia";
					break;
				}
				System.out.println("Para cuando quiere la cita (dd-MM-yyyy hh:mm)");
				String fechaCita = sc.nextLine();
				String nombreCompletoCliente = "";
				nuevaCita.setDniCliente(dniDado);
				
				//Asignacion del nombre completo extraido de la lista de clientes
				for(ClientesDtos clientes : listaClientes) {
					if(clientes.getDni().equals(dniDado)) {
						nombreCompletoCliente = clientes.getNombreCompleto();
					}
				}
				nuevaCita.setNombreCompletoCliente(nombreCompletoCliente);
				nuevaCita.setEspecialidad(especialidad);
				nuevaCita.setFechaHoraCita(fechaCita);
				listaCitas.add(nuevaCita);
				System.out.println("¡Cita reservada!");
			}
		}
	}
}
