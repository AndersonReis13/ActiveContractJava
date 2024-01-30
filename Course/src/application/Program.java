package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkedLevel;

public class Program {
	public static void main(String args[]) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Qual o departamento?");
		String Departamentname = sc.nextLine();
		System.out.println("Informações de úsuario: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Salario: ");
		Double basesalary = sc.nextDouble();
		
		
			Worker worker = new Worker(name,WorkedLevel.valueOf(level), basesalary, new Departament(Departamentname));
		
		System.out.print("Quantos contratos serão inserido?");
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			System.out.print("Contrato" + i + "info:");
			System.out.print("Data(DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valuePurHour = sc.nextDouble();
			System.out.print("Duração: ");
			int hour = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePurHour, hour);
			
			worker.addContract(contract);
		}

			System.out.println();
		System.out.print("Digite o mês para calcular o total (MM/yyyy: ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));// transformando uma string em um número, para assim consegui passar como data)
		int year = Integer.parseInt(monthAndYear.substring(3));
		
	
		
		sc.close();
	}
}
