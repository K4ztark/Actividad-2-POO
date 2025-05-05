package Actividad2_Ejercicio1;

public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int Nacimiento;
    String paisNacimiento;          //Ejercicio propuesto
    char genero;                    //Ejercicio propuesto


    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad,int Nacimiento,String paisNacimiento,char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.Nacimiento = Nacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + Nacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }
}