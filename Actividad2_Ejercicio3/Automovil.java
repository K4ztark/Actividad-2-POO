package Actividad2_Ejercicio2;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    tipoCom TipoCombustible;
    tipoA TipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    tipoColor color;
    int velocidadActual = 0;
    String transmision;         //Ejercicio propuesto
    int multas = 0;
    String historial = "NO";
    int valormultas = 600000;

    public Automovil (String marca,int modelo,int motor,tipoCom TipoCombustible,tipoA TipoAutomovil,int numeroPuertas,int cantidadAsienos,int velocidadMaxima,tipoColor color,String transmision){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.TipoCombustible = TipoCombustible;
        this.TipoAutomovil = TipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsienos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.transmision = transmision;
    }

    String getMarca(){
        return marca;
    }

    int getModelo(){
        return modelo;
    }

    int getMotor(){
        return motor;
    }

    tipoCom getTipoCombustible(){
        return TipoCombustible;
    }

    tipoA getTipoAutomovil(){
        return TipoAutomovil;
    }

    int getNumeroPuertas(){
        return numeroPuertas;
    }

    int getCantidadAsientos(){
        return cantidadAsientos;
    }

    int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    tipoColor getColor(){
        return color;
    }

    String getTransmision(){
        return transmision;         //Ejercicio propuesto
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    void setModelo(int modelo){
        this.modelo = modelo;
    }

    void setMotor(int motor){
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom TipoCombustible){
        this.TipoCombustible = TipoCombustible;
    }

    void setTipoAutomovil(tipoA TipoAutomovil){
        this.TipoAutomovil = TipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos){
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelocidadMaxima(int velocidadMaxima){
        this.marca = marca;
    }

    void setColor(tipoColor color){
        this.color = color;
    }

    void setTransmision(String transmision){
        this.transmision = transmision;
    }

    void setVelocidadActual(int velocidadActual){
        this.velocidadActual = velocidadActual;
    }

    void acelerar (int incrementoVelocidad) {
        if(velocidadActual + incrementoVelocidad < velocidadMaxima){
            velocidadActual = velocidadActual + incrementoVelocidad;
        }else{
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            multas ++;             //Ejercicio propuesto
        }
    }

    void multa(){                               //Ejercicio propuesto
        if(multas > 0){
            historial = "SI";
        }else{
            historial = "NO";
        }
    }

    void valor_multa(){                         //Ejercicio propuesto
        valormultas = multas*valormultas;
    }

    void desaceleracion (int decrementoVelocidad){
        if (velocidadActual - decrementoVelocidad > 0){
            velocidadActual = velocidadActual - decrementoVelocidad;
        }else{
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar(){
        velocidadActual = 0;
    }

    double calcularTiempoLlegada (int distancia){
        return distancia/velocidadActual;
    }

    void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + TipoCombustible);
        System.out.println("Tipo de automóvil = " + TipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Transmisión = " + transmision);         //Ejercicio propuesto
    }

}
