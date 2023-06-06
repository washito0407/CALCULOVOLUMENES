import java.util.Scanner;
public class cilindro {
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    double height = input.nextDouble();

    double volume = Math.PI * radius * radius * height;

    System.out.println("El volumen del cilindro es: " + volume);
}
