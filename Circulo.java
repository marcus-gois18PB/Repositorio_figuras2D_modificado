public class Circulo implements FiguraGeometrica2D {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String tipo() {
        return "Círculo";
    }

    @Override
    public int compareTo(FiguraGeometrica2D outra) {
        return Double.compare(this.area(), outra.area());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{raio=" + raio + "}";
    }
}
