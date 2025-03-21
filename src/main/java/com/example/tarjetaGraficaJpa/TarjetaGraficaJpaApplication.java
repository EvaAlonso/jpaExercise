package com.example.tarjetaGraficaJpa;

import com.example.tarjetaGraficaJpa.DAO.TarjetaGraficaDAO;
import com.example.tarjetaGraficaJpa.entity.TarjetaGrafica;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TarjetaGraficaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetaGraficaJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TarjetaGraficaDAO tarjetaGraficaDAO) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccionar opcion:");
		System.out.println("1. Guardar una tarjeta grafica");
		System.out.println("2. Buscar tarjeta grafica por ID");
		System.out.println("3. Mostrar todas las tarjetas graficas");
		System.out.println("4. Actualizar una tarjeta grafica");
		System.out.println("5. Eliminar una tarjeta grafica");
		System.out.println("6. Salir");

		int opcion = scanner.nextInt();

			   switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre de la tarjeta gráfica:");
                        String name = scanner.next();
                        System.out.println("Ingrese el modelo:");
                        String model = scanner.next();

                        TarjetaGrafica nuevaTarjeta = new TarjetaGrafica();
                        nuevaTarjeta.setName(name);
                        nuevaTarjeta.setModel(model);

                        tarjetaGraficaDAO.save(nuevaTarjeta);
                        System.out.println("Tarjeta gráfica guardada con éxito.");
                        break;

                    case 2:

                        System.out.println("Ingrese el ID de la tarjeta gráfica a buscar:");
                        int idBuscar = scanner.nextInt();
                        TarjetaGrafica tarjeta = tarjetaGraficaDAO.findById(idBuscar);

                        if (tarjeta != null) {
                            System.out.println("Tarjeta gráfica encontrada: " + tarjeta);
                        } else {
                            System.out.println("No se encontró ninguna tarjeta gráfica con ese ID.");
                        }
                        break;

                    case 3:

                        List<TarjetaGrafica> tarjetas = tarjetaGraficaDAO.findAll();
                        if (tarjetas.isEmpty()) {
                            System.out.println("No hay tarjetas gráficas registradas.");
                        } else {
                            tarjetas.forEach(t -> System.out.println(t));
                        }
                        break;

                    case 4:

                        System.out.println("Ingrese el ID de la tarjeta gráfica a actualizar:");
                        int idActualizar = scanner.nextInt();
                        TarjetaGrafica tarjetaActualizar = tarjetaGraficaDAO.findById(idActualizar);

                        if (tarjetaActualizar != null) {
                            System.out.println("Ingrese el nuevo nombre:");
                            tarjetaActualizar.setName(scanner.next());
                            System.out.println("Ingrese el nuevo modelo:");
                            tarjetaActualizar.setModel(scanner.next());

                            tarjetaGraficaDAO.update(tarjetaActualizar);
                            System.out.println("Tarjeta gráfica actualizada con éxito.");
                        } else {
                            System.out.println("No se encontró ninguna tarjeta gráfica con ese ID.");
                        }
                        break;

                    case 5:

                        System.out.println("Ingrese el ID de la tarjeta gráfica a eliminar:");
                        int idEliminar = scanner.nextInt();

                        tarjetaGraficaDAO.delete(idEliminar);
                        System.out.println("Tarjeta gráfica eliminada con éxito.");
                        break;

                    case 6:

                        System.out.println("Saliendo...");
                        scanner.close();
                        return null;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        return commandLineRunner(tarjetaGraficaDAO);
               }
               return null;
    }



}



