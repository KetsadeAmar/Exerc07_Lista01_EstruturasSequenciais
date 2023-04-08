import java.util.Scanner;

public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double area;
        double lado;
        double dobroarea;

        // Solicitação de Dados

        Scanner input = new Scanner (System.in);
        System.out.println ("Informe o valor do lado do quadrado: ");
        lado = input.nextDouble();
        
        //Fazer o Calculo do Lado do Quadrado e o Calculo do Dobro
        area = lado * lado;
        dobroarea = 2 * area;

        // Exibir a Resposta Para o Usuário
        System.out.println ("O dobro da área do quadrado é: " + dobroarea);
      
    }
}
