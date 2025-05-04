
public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo figura1=new Circulo(2);
        Rectangulo figura2=new Rectangulo(1,2);
        Cuadrado figura3=new Cuadrado(3);
        TrianguloRectangulo figura4=new TrianguloRectangulo(3,5);
        Rombo figura5=new Rombo(16,12,9);
        Trapecio figura6=new Trapecio(9,18,6,4,8);
        System.out.println("El area del círculo es: "+figura1.area());
        System.out.println("El perimetro del círculo es: "+figura1.perimetro());
        System.out.println();
        System.out.println("El area del rectangulo es: "+figura2.area());
        System.out.println("El perimeto del rectangulo es: "+figura2.perimetro());
        System.out.println();
        System.out.println("El area del cuadrado es: "+figura3.area());
        System.out.println("El perimetro del cuadrado es: "+figura3.perimetro());
        System.out.println();
        System.out.println("El area del triangulo es: "+figura4.area());
        System.out.println("EL perimetro del triangulo es: "+figura4.perimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El area del rombo es: "+figura5.area());
        System.out.println("El perimetro del rombo es: "+figura5.perimetro());
        System.out.println();
        System.out.println("El area del trapecio es: "+figura6.area());
        System.out.println("El perimetro del trapecio es: "+figura6.perimetro());
    }
}