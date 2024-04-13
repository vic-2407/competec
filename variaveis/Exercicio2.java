/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner sc = new Scanner (System.in);
       /*  double precolaranja = sc.nextDouble();
        double precouva = sc.nextDouble();
        double soma = precolaranja+precouva;
        System.out.print(soma);   
        */
        // Recebam duas idades, faça a soma dela e imprima no terminal 
        int idade =  sc.nextInt();
        int idadeb = sc.nextInt();
        int soma = idade+idadeb;
        System.out.print(soma);
    }
}
