public class Rombo {
    int diagonal_mayor;
    int diagonal_menor;
    int lado;
    public Rombo(int diagonal_mayor, int diagonal_menor,int lado) {
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
        this.lado = lado;
    }
    public double area(){
        return (double)(diagonal_mayor*diagonal_menor)/2;
    }
    public double perimetro(){
        return 4*lado;
    }
}
