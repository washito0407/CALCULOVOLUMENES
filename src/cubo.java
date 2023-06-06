import static java.lang.Math. *;
public class cubo {
    float area;

    public cubo(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public double areaCubo(){
        double MIarea = 6 * (area * area);
        return  MIarea;
    }
    public double VolumenCubo(){
        double Mivolumen = Math.pow(area,3);
        return Mivolumen;
    }


}
