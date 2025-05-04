public class Trapecio {
    int base_menor;
    int base_mayor;
    int altura;
    int lado_1;
    int lado_2;
    public Trapecio(int base_menor, int base_mayor, int altura, int lado_1, int lado_2) {
        this.base_menor = base_menor;
        this.base_mayor = base_mayor;
        this.altura = altura;
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }
    public double area(){
        return (double)((base_menor+base_mayor)*altura)/2;
    }
    public double perimetro(){
        return (base_menor+base_mayor+altura+lado_1+lado_2);
    }
}
