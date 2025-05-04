public class Rectangulo {
    int base;
    int altura;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public double area() {
        return base*altura;
    }
    public double perimetro() {
        return (2*altura)+(2*base);
    }
}
