package com.example.tarjetaGraficaJpa;

import com.example.tarjetaGraficaJpa.DAO.TarjetaGraficaDAO;
import com.example.tarjetaGraficaJpa.entity.TarjetaGrafica;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class TarjetaGraficaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetaGraficaJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TarjetaGraficaDAO tarjetaGraficaDAO) {
		//return args -> {
		//	System.out.println("Hola");
		return runner -> {
			//TarjetaGrafica tarjetaGrafica = TarjetaGraficaDAO.findById(1);
			//System.out.println("Estudiante encontrado: " + tarjetaGrafica.getId());
			for (TarjetaGrafica tarjetaGrafica1 : tarjetaGraficaDAO.findAll()) {
				System.out.println(tarjetaGrafica1);

				//crear objeto Scanner para leer
				Scanner scanner = new Scanner(System.in);

				while (true) {
					System.out.println("Seleccionar opcion:");
					System.out.println("1. Guardar una tarjeta grafica");
					System.out.println("2. Buscar tarjeta grafica por ID");
					System.out.println("3. Mostrar todas las tarjetas graficas");
					System.out.println("4. Actualizar una tarjeta grafica");
					System.out.println("5. Eliminar una tarjeta grafica");
					System.out.println("6. Salir");

					int opcion = scanner.nextInt();

					if (opcion == 1) {
						System.out.println("Guardando una tarjeta grafica....");
					} else if (opcion == 2) {
						System.out.println("Buscando una tarjeta grafica por ID...");
					} else if (opcion == 3) {
						System.out.println("Mostrando una tarjeta grafica....");
					} else if (opcion == 4) {
						System.out.println("Actualizando una tarjeta grafica....");
					} else if (opcion == 5) {
						System.out.println("Eliminando una tarjeta grafica");
					} else if (opcion == 6) {
						System.out.println("Saliendo del programa....");
						scanner.close();
						break;
					} else {
						System.out.println("Opción no valida. Intentelo de nuevo.");
					}
				}
			}
			;
		};
	}
}




