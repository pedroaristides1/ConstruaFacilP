// 1 - Pacote
package devcalc;
// 2 - Bibliotecas


import java.util.Scanner;

// 3 - Classe
public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.2 - M�todos e Fun��es
    public static void main(String[] args){
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("Escolha o Calculo Desejado");

        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        if (opcao >= 1 && opcao <= 4) {


            System.out.println("Entre o 1o numero: ");
            num1 = entrada.nextInt();
            System.out.println("Entre o 2o numero: ");
            num2 = entrada.nextInt();
            System.out.print("Resultado: ");
        }
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1,num2));
                break;
            default:
                System.out.println("Opcao Invalida");
        }

    }

    public static int somarDoisNumeros(int num1, int num2){
        return num1 + num2;
    }
}
