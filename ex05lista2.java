import java.util.Scanner;

public class ex05lista2 {

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota ");
        nota2 = teclado.nextDouble();

        teclado.close();

        media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println(" Aprovado com distinção ");
        } else if (media >= 7) {
            System.out.println("Aprovado ");
        } else {
            System.out.println(" Reprovado ");
        }

    }
}
