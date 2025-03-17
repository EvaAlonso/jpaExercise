package com.example.tarjetaGraficaJpa;

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
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Hola");
		};
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
			}
		}
	}



