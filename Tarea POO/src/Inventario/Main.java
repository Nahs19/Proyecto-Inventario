package Inventario;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		
		public static void mostar(ArrayList<Libro> libro) {
			System.out.println("\n Estos son los libros disponibles en el Inventario");
			for (int i=0;i<libro.size();i++) {
				System.out.println(libro.get(i));
			}
		}
		
		public static void buscarcodigo(ArrayList<Libro> libro) {
			Scanner entrada = new Scanner (System.in);
			System.out.println("\n Ingrese el código del libro que desea: ");
			int codigoingresado = entrada.nextInt();
			for (int i=0;i<libro.size();i++) {
				if (codigoingresado == libro.get(i).getCodigo()) {
					System.out.println(libro.get(i));	
				}				
			}
		}
		
	       public static void comprarLibro (ArrayList<Libro> libro) {
			Scanner entrada = new Scanner (System.in);
			System.out.println("\n Ingrese el código del libro que desea comprar: ");
			int codigoingresado = entrada.nextInt();
			int cantidad;
			for (int i=0;i< libro.size();i++) {
				if (codigoingresado ==  libro.get(i).getCodigo()) {
					cantidad =  libro.get(i).getCantidadexistente();
					if(cantidad > 1) {
						cantidad -= 1;
						System.out.println("Ustes a comprado el libro: " + libro.get(i));
						System.out.println("Gracias por su compra");
						libro.get(i).setCantidadexistente(cantidad);
						
					}else {
						cantidad = 0;
						System.out.println("Gracias por elegir nuestra tienda");
						System.out.println("El libro se ha agotado");
						libro.get(i).setCantidadexistente(cantidad);
						actualizar(libro);
					}
				}
			}
		}
			
		public static void actualizar(ArrayList<Libro> libro) {
			
			for (int i=0;i< libro.size();i++) {
				System.out.println( libro.get(i));
			}
		}
			
		public static void librosCaros(ArrayList<Libro>  libro) {	
			System.out.println("Análisis de costos de los libros");	
			for (int i=0;i< libro.size();i++) {
				System.out.println( libro.get(i));
			}			   	
		}
		        public static void main(String[] args) {
				
				int opcion;	
		        Scanner in = new Scanner (System.in);
				ArrayList<Libro> libro = new ArrayList<Libro>();
				
				Libro libro1 = new Libro(1876, 1, "Tres Promesas","Lesslie Polinesia", 45.05);
				Libro libro2 = new Libro(1987, 2, "De Animales a Dioses","Yuval Noah", 35.15);
				Libro libro3 = new Libro(1289, 3, "La Metamorfosis","Frank Kafka",55.60);
				Libro libro4 = new Libro(1239, 4, "Paloma" ,"Jaime Homar",67.45);
				Libro libro5 = new Libro(1234, 5, " Las Catilinarias" ,"Juan Montalvo",34.50);
							
				libro.add(libro1);
				libro.add(libro2);
				libro.add(libro3); 
				libro.add(libro4);
				libro.add(libro5); 				
		      				    
			    do {

		            System.out.println("\n   Menu Principal   ");
		            System.out.println("*********************");
		            System.out.println("1. Mostrar lista de libros");
		            System.out.println("2. Buscar Código");
		            System.out.println("3. Comprar Libro");
		            System.out.println("4. Actualizar");
		            System.out.println("5. Libros más caros");
		            System.out.println("6. Salir");
		            System.out.println("Digite opcion (1/4): ");
		            opcion = in.nextInt();
		    			 
		            switch(opcion){
		                case 1: mostar(libro);break;
		                case 2: buscarcodigo(libro);break;
		                case 3: comprarLibro(libro);break;
		                case 4: actualizar(libro);break;
		                case 5: librosCaros(libro);break;
		                case 6: break;
		                default: System.out.println("Opcion no válida");//Mensaje de dato erróneo
		            }
		        }while (opcion != 6);
		      }
	}


