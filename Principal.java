import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ExerFor1 e1 = new ExerFor1();
        ExerFor2 e2 = new ExerFor2();
        ExerFor3 e3 = new ExerFor3();
        ExerFor4 e4 = new ExerFor4();
        ExerFor5 e5 = new ExerFor5();
        int opcao;
        System.out.println("Digite 1 para imprimir");
        System.out.println("Digite 2 para Somar");
        System.out.println("Digite 3 para Multiplo");
        System.out.println("Digite 4 para Fatorial");
        System.out.println("Digite 5 para Par ou Impar");
        Scanner input  = new Scanner(System.in);
        opcao = input.nextInt();
        if (opcao == 1) {
            e1.imprimir();
            e2.soma();
            e3.multiplo();
            e4.fatorial();
            e5.par_impar();

        }

    }
}