import java.util.Objects;

public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String tipo() {
        return "Quadrado";
    }

    @Override
    public int compareTo(FiguraGeometrica2D outra) {
        return Double.compare(this.area(), outra.area());
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{lado=" + lado + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quadrado quadrado = (Quadrado) o;
        return Double.compare(getLado(), quadrado.getLado()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLado());
    }
}
