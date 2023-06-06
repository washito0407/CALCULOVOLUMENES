import static java.lang.Math. *;
public class cubo {
    float lado;

    public cubo(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return lado;
    }

    public void setArea(float lado) {
        this.lado = lado;
    }

    public double VolumenCubo(){
        double Mivolumen = Math.pow(lado,3);
        return Mivolumen;
    }
    public String mostrar(){
        return  "El volumen del cubo es: " + lado;




    }


}
