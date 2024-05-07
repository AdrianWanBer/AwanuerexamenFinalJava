package Controladores;
import Servicios.*;
import Dtos.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Dto.pedidoDto;

public class Inicio {

	public static void main(String[] args) {
		//Declaracion de variables y creacion de los objetos
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		FicherosInterfaz fi = new FicherosImplementacion();
		List<ClientesDtos> listaClientes = new ArrayList();
		List<CitasDtos> listaCitas = new ArrayList();
		List<String> registroLog = new ArrayList();
		
		//Primer registro
		registroLog.add("SE ABRE LA APLICACION");
		
		boolean cerrarAplicacion = false;
		
		while(!cerrarAplicacion) {
			int seleccion = mi.menuPrincipal();
			switch(seleccion) {
			case 0: //CERRAR APLICACION
				registroLog.add("SE CIERRA LA APLICACION");
				fi.ficheroLog(registroLog);
				cerrarAplicacion = true;
				break;
			case 1: //EMPLEADOS
				registroLog.add("SE ABRE EL MENU DE EMPLEADOS");
				int seleccionEmpleados = mi.menuEmpleados();
				switch(seleccionEmpleados) {
				case 0: //CERRAR
					registroLog.add("SE CIERRA EL MENU DE EMPLEADOS");
					break;
				case 1: //VALIDACION
					registroLog.add("SE VALIDA UN CLIENTE");
					oi.validacionCliente(listaClientes);
					break;
				case 2: //iMPRIMIR CITAS MEDIAS APARA UN DIA ESPECIFICO
					registroLog.add("SE IMPRIMEN LAS CITAS PARA UN DIA ESPECIFICO");
					fi.imprimirCitas(listaCitas, listaClientes);
					break;
				default: //DEFAULT
					break;
				}
				break;
			case 2: //CLIENTES
				registroLog.add("SE ABRE EL MENU DE CLIENTES");
				int seleccionClientes = mi.menuClientes(); 
				switch(seleccionClientes) {
				case 0: //CERRAR
					registroLog.add("SE CIERRA EL MENU DE CLIENTES");
					break;
				case 1: //REGISTRAR CLIENTE
					registroLog.add("SE REGISTRA UN NUEVO CLIENTE");
					oi.registroDeCliente(listaClientes);
					break;
				case 2: //SOLICITUD DE CITA MEDICA
					registroLog.add("SE SOLICITA UNA NUEVA CITA");
					oi.solicitudCitaMedica(listaClientes, listaCitas);
					break;
				case 3: // COLSULTA CITA MEDICA INTERVALO
					registroLog.add("SE COLSULTA UNA CITA PARA UN INTERVALO");
					break;
					
				default: //DEFAULT
						break;
				}
				break;
			default: //DEFAULT
				break;
			}
		}
	}

}
