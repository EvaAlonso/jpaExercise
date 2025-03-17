package com.example.tarjetaGraficaJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TarjetaGraficaJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarjetaGraficaJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		Scanner sc
		/*hacer un scanner y pedir al usuario un número por cada función*/
		/*según el número devolvemos con return la función*/
		/*switch(respuesta){
			1 : delete
			2: findById
			 Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Guardar una tarjeta gráfica");
                System.out.println("2. Buscar tarjeta gráfica por ID");
                System.out.println("3. Mostrar todas las tarjetas gráficas");
                System.out.println("4. Actualizar una tarjeta gráfica");
                System.out.println("5. Eliminar una tarjeta gráfica");
                System.out.println("6. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Guardar tarjeta gráfica
                        System.out.println("Ingrese el nombre de la tarjeta gráfica:");
                        String nombre = scanner.next();
                        System.out.println("Ingrese el modelo:");
                        String modelo = scanner.next();

                        TarjetaGrafica nuevaTarjeta = new TarjetaGrafica();
                        nuevaTarjeta.setNombre(nombre);
                        nuevaTarjeta.setModelo(modelo);

                        tarjetaGraficaDAO.save(nuevaTarjeta);
                        System.out.println("Tarjeta gráfica guardada con éxito.");
                        break;

                    case 2:
                        // Buscar por ID
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
                        // Mostrar todas las tarjetas gráficas
                        List<TarjetaGrafica> tarjetas = tarjetaGraficaDAO.findAll();
                        if (tarjetas.isEmpty()) {
                            System.out.println("No hay tarjetas gráficas registradas.");
                        } else {
                            tarjetas.forEach(t -> System.out.println(t));
                        }
                        break;

                    case 4:
                        // Actualizar tarjeta gráfica
                        System.out.println("Ingrese el ID de la tarjeta gráfica a actualizar:");
                        int idActualizar = scanner.nextInt();
                        TarjetaGrafica tarjetaActualizar = tarjetaGraficaDAO.findById(idActualizar);

                        if (tarjetaActualizar != null) {
                            System.out.println("Ingrese el nuevo nombre:");
                            tarjetaActualizar.setNombre(scanner.next());
                            System.out.println("Ingrese el nuevo modelo:");
                            tarjetaActualizar.setModelo(scanner.next());

                            tarjetaGraficaDAO.update(tarjetaActualizar);
                            System.out.println("Tarjeta gráfica actualizada con éxito.");
                        } else {
                            System.out.println("No se encontró ninguna tarjeta gráfica con ese ID.");
                        }
                        break;

                    case 5:
                        // Eliminar tarjeta gráfica
                        System.out.println("Ingrese el ID de la tarjeta gráfica a eliminar:");
                        int idEliminar = scanner.nextInt();

                        tarjetaGraficaDAO.delete(idEliminar);
                        System.out.println("Tarjeta gráfica eliminada con éxito.");
                        break;

                    case 6:
                        // Salir
                        System.out.println("Saliendo...");
                        scanner.close();
                        return; // Termina el programa

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
		 */
		return runner -> {
			System.out.println("Hola");
		};
	}
}


