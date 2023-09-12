package exercicioLista;

import java.util.Scanner;

public class ExercicioAlturas {
	
	public static void main (String[] args) { 
	
		int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaAlturaH=0, mediaAlturaHomens=0, maior=0, menor= Float. MAX_VALUE;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.print("Escolha o sexo (1 - Mulher ou 2 - Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaAlturaH = somaAlturaH + altura;
            } else {
                System.out.println("Opção de sexo inválido!");
            }
            if (altura > maior) {
                maior = altura;
            }
            if (altura < menor){
                menor = altura;
            }
            
        }
        mediaAlturaHomens = somaAlturaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + " metros, e a menor é de " + menor + " metros.");
        System.out.println("A média de altura dos homens é " + mediaAlturaHomens + " metros.");
        System.out.println("O número de mulheres é " + qtMulheres + ".");

        entrada.close();
	}
	
}
