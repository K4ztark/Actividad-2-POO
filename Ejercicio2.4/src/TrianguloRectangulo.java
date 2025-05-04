public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double hipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public double perimetro() {
        return (base + altura + hipotenusa());
    }

    void determinarTipoTriangulo(){
        if(base==altura && base==hipotenusa()){
            System.out.println("El triangulo es equilatero");
        }
        else if(base==altura){
            System.out.println("El triangulo es isósceles");
        }
        else if((base != hipotenusa()) && (altura != hipotenusa()) && (base != altura)){
            System.out.println("El triangulo es escaleno");
        }
    }
}
