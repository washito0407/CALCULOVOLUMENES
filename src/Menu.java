import java.util.Scanner;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion;

        System.out.println("   Menú de figuras geometricas   ");
        System.out.println("OPCIONES:");
        System.out.println("1) Calculo de un cubo");
        System.out.println("2) Calculo de una pirámide");
        System.out.println("3) Calculo de un cilindro");
        System.out.println("4) Calculo de un prisma rectangular");
        opcion=entrada.nextInt();

        if(opcion == 1){
            piramide piramide = new piramide();
        }



        Scanner entrada = new Scanner(System.in);
        float lado;
        System.out.println("Digite el lado del cubo: ");
        lado = entrada.nextFloat();


    }
}
