public class Cuadrado {
    int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public double area() {
        return lado * lado;
    }
    public double perimetro(){
        return (4*lado);
    }
}
