import java.util.Random;
import java.util.Scanner;
public class adivinacion {
    public static void main(String[] args) {
        Random numeroRandon = new Random();
        int numeroSecreto = numeroRandon.nextInt(100);
        System.out.println("el numero Secreto es "+numeroSecreto);
        Scanner adivina = new Scanner(System.in);
            int contador = 1;
            while (contador<=5){
                System.out.println("Avidina el numero Secreto : ");
                int numero = adivina.nextInt();
                    if (numero!=numeroSecreto) {
                        System.out.println("Fallaste el Intento numero :"+contador);
                        contador++;
                    }
                    else{
                        System.out.println("Feliciades Acertaste el numero secreto es: "+numero+" en el intento "+contador);
                        break;
                    }
            }
    }
}
