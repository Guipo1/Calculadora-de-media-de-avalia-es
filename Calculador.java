import java.util.Scanner;
public class Calculador { ;
    public void calcularMedia(){
        float somador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de trabalhos que você tem para calcular a media");
         int numeroTrabalhos = scanner.nextInt();
        if(numeroTrabalhos <=0){
            System.out.println("valor invalido");
        }
        else{
            double[] numeros = new double[numeroTrabalhos];
            double soma = 0;


            for (int i = 0; i < numeroTrabalhos; i++) {
                System.out.println("Digite a nota do trabalho " + (i + 1));
                numeros[i] = scanner.nextDouble();
                soma += numeros[i];
            }

            int media = (int) Math.round(soma / numeroTrabalhos);
            System.out.println("A nota de seus " + numeroTrabalhos + " trabalhos ficou igual a: " + media);

        }
        scanner.close();
    }

}
