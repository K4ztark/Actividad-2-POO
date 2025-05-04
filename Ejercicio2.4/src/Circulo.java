public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }


    public double area(){
        return Math.PI * radio * radio;
    }

    public double perimetro(){
        return Math.PI*2*radio;
    }
}
