package atleta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        List<Atleta> atletas = new ArrayList<>();

	        System.out.print("Qual a quantidade de atletas? ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 1; i <= n; i++) {
	            System.out.println("\nDigite os dados do atleta número " + i + ":");

	            System.out.print("Nome: ");
	            String nome = sc.nextLine();

	            String sexo;
	            while (true) {
	                System.out.print("Sexo (F/M): ");
	                sexo = sc.nextLine().trim().toUpperCase();
	                if (sexo.equals("F") || sexo.equals("M")) {
	                    break;
	                }
	                System.out.println("Valor invalido! Favor digitar F ou M.");
	            }

	            double altura;
	            while (true) {
	                System.out.print("Altura: ");
	                altura = sc.nextDouble();
	                if (altura > 0) {
	                    break;
	                }
	                System.out.println("Valor invalido! Favor digitar um valor positivo.");
	            }

	            double peso;
	            while (true) {
	                System.out.print("Peso: ");
	                peso = sc.nextDouble();
	                if (peso > 0) {
	                    break;
	                }
	                System.out.println("Valor invalido! Favor digitar um valor positivo.");
	            }
	            sc.nextLine();

	            atletas.add(new Atleta(nome, sexo, altura, peso));
	        }
	        Relatorio relatorio = new Relatorio(atletas);
	        relatorio.gerarRelatorio();

	        sc.close();
	    }
}