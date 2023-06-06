import static java.lang.Math. *;
public class piramide {
    float lado;

    public piramide(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public double VolumenPir(){
        double Mivolumen1 = Math.pow(lado,3);
        return Mivolumen1;
    }
    public String mostrar(){
        return  "El volumen del cubo es: " + lado;
    }

}
