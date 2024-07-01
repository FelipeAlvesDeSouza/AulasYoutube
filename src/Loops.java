import java.util.Scanner;

public class Loops {
    public static void main(String [] args)
    {
        /* Leia qualquer quantidade de número de inteiros e veja quantos números impares estão entre 0
        * até o digito de entrada.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um número: ");

        int input = scanner.nextInt();
        int quantidadeTotalImpar = 0;




        for (int contador = 0; contador <= input; contador += 1)
        {
            if (contador % 2 == 1)
                quantidadeTotalImpar += 1;

        }


//        do
//        {
//            System.out.println("Entrou a primeira vez ");
//
//            if (contador % 2 == 1)
//                quantidadeTotalImpar += 1;
//
//
//            contador += 1;
//        }while(contador <= input);


        System.out.println("Total de impares entre 0 até " + input + " = " + quantidadeTotalImpar);
    }
}
