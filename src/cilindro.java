import java.util.Scanner;
public class cilindro {
    double radio;
    double altura;

    public cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double volcilindro(){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();

        double volume = calculateVolume(radius, height);

        System.out.println("El volumen del cilindro es: " + volume);
    }

    public static double calculateVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
}
