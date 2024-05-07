package Servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Dtos.CitasDtos;
import Dtos.ClientesDtos;

/**
 * Implementacion encargada de todo lo relacionado con los ficheros awb
 */
public class FicherosImplementacion implements FicherosInterfaz {
	/**
	 * Metodo que se encargara de guardar las citas de un dia especifico en un
	 * fichero awb
	 */
	public void imprimirCitas(List<CitasDtos> listaCitas, List<ClientesDtos> listaClientes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para cuando quiere la busqueda (dd-MM-yyyy)");
		String fechaBuscar = sc.nextLine();
		try {
			FileWriter escritor = new FileWriter(
					"C:\\Users\\Adrian\\eclipse-workspace\\ED\\edu.AwanuerExamenFinalJava\\informe-"
							+ fechaBuscar.replace("-", "") + ".txt");
			
			//recorrido de la lista
			for (CitasDtos citas : listaCitas) {
				String[] temp = citas.getFechaHoraCita().split(" ");
				String fechaCita = temp[0];
				if (fechaCita.equals(fechaBuscar)) {
					escritor.write(citas.getDniCliente() + ";" + citas.getNombreCompletoCliente() + ";"
							+ citas.getEspecialidad());
					escritor.write("\n");
				}
			}

			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo encargado de la creacion del fichero log y la recogida de informacion
	 * de la listaLog awb
	 */
	public void ficheroLog(List<String> listaLog) {
		Date ahora = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("ddMMyyyy");
		String fechaAhora = formatoFecha.format(ahora);
		try {
			FileWriter escritor = new FileWriter(
					"C:\\Users\\Adrian\\eclipse-workspace\\ED\\edu.AwanuerExamenFinalJava\\log-" + fechaAhora + ".txt");
			for (int i = 0; i <= listaLog.size() - 1; i++) {
				escritor.write(listaLog.get(i) + ";");
				escritor.write("\n");
			}
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
