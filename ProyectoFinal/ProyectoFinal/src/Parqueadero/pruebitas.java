package Parqueadero;

import java.time.Duration;
/**
 * pruebas 05/07/2020
 */
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class pruebitas {

	public static void main(String[] args) {
		LocalDateTime horaEntrada;
		horaEntrada = LocalDateTime.of(2017, 07, 06, 23, 30, 00);
		LocalDateTime horaSalida;
		horaSalida = LocalDateTime.of(2017, 07, 07, 23, 35, 00);
		
					//Duration d1 = Duration.between(horaEntrada, horaSalida);
					System.out.println(ChronoUnit.MINUTES.between(horaEntrada, horaSalida));
					System.out.println("Prueba de cambios GIT");
				
			}

		}
	

