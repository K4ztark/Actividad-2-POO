package Actividad2_Ejercicio2;

public class Main {
    public static void main(String[] args){
        Automovil auto1 = new Automovil("Ford", 2018, 3, tipoCom.DIESEL, tipoA.EJECUTIVO, 5, 6, 250, tipoColor.NEGRO,"Mecánica");
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        auto1.desaceleracion(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desaceleracion(20);
        System.out.println("Multas = " + auto1.multas);                     //Ejercicio propuesto
        auto1.multa();                                                      //Ejercicio propuesto
        System.out.println("Multa = " + auto1.historial);                   //Ejercicio propuesto
        auto1.valor_multa();                                                //Ejercicio propuesto
        System.out.println("Valor de las multas = " + auto1.valormultas);   //Ejercicio propuesto

    }
}
