package main;

import entrada.Entrada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("User: " + Entrada.llegirByte("Introdueixi la seva edat:"));

		System.out.println("User: " + Entrada.llegirInt("Introdueixi la seva alçada:"));

		System.out.println("User: " + Entrada.llegirInt("Introdueixi el seu pes:"));

		System.out.println("User: " + Entrada.llegirDouble("Introdueixi el seu número preferit"));

		System.out.println("User: " + Entrada.llegirChar("Introdueixi el seu caràcter preferit:"));

		System.out.println("User: " + Entrada.llegirString("Introdueixi la seva paraula preferida:"));

		System.out.println("User: " + Entrada.llegirSiNo("T'agrada programar?"));

	}// closes main
	
}// closes class
