import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pesoa, pesob, pesoc, pesod;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoa = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesob = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoc = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        pesod = sc.nextDouble();

        if (pesoa == pesob && pesoa == pesoc){
            System.out.println("La esfera D es la diferente");
            if (pesod>pesoa){
                System.out.println("y es de mayor peso");
            }else{
                System.out.println("y es de menor peso");
            }
        }else if(pesoa == pesob && pesoa == pesod){
            System.out.println("La esfera C es la diferente");
            if (pesoc>pesoa){
                System.out.println("y es de mayor peso");
            }else{
                System.out.println("y es de menor peso");
            }
        }else if(pesoa == pesoc && pesoa == pesod){
            System.out.println("La esfera B es la diferente");
            if (pesob>pesod){
                System.out.println("y es de mayor peso");
            }else{
                System.out.println("y es de menor peso");
            }
        }else{
            System.out.println("La esfera A es la diferente");
            if (pesoa>pesob){
                System.out.println("y es de mayor peso");
            }else{
                System.out.println("y es de menor peso");
            }
        }

    }
}