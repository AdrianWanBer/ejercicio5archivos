package edu.ejercicio6archivo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean cerrarMenu = false;
		File archivo = new File("Archivo.txt");
		PrintWriter escritor = null;
		
		
		while(!cerrarMenu) {
			System.out.println("0.Cerrar");
			System.out.println("1.Modificar");
			System.out.println("2.Insertar");
			
			int seleccion = sc.nextInt();
			
			switch(seleccion) {
			case 0:
				cerrarMenu = true;
				break;
			case 1:
				
				System.out.println("Linea: ");
				int lineaM = sc.nextInt();
				
				System.out.println("Posicion: ");
				int posicionM = sc.nextInt();
				
				System.out.print("Texto: ");
				String textoM = sc.nextLine();
				textoM = sc.nextLine();
				
				
				
				try {
					escritor = new PrintWriter(archivo);
					for(int i = 0; i < lineaM ; i++) {
						escritor.println();
					}
					for(int j = 0; j < posicionM ; j++) {
						escritor.print(" ");
					}
					escritor.println(textoM);
				} catch (IOException e){
					
				}
				
				break;
			case 2:
				
				System.out.println("Linea: ");
				int lineaI = sc.nextInt();
				
				System.out.println("Posicion: ");
				int posicionI = sc.nextInt();
				
				System.out.print("Texto: ");
				String textoI = sc.nextLine();
				textoI = sc.nextLine();
				
				try {
					escritor = new PrintWriter(archivo);
					for(int i = 0; i < lineaI ; i++) {
						escritor.println();
					}
					for(int j = 0; j < posicionI ; j++) {
						escritor.print(" ");
					}
					escritor.println(textoI);
				} catch (IOException e){
					
				}
				
				break;
			}
		}
		escritor.close();
		
		
		

	}

}
