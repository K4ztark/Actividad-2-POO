public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    tipo TipoCuenta;
    float saldo=0;
    double interes_mensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo TipoCuenta,double interes_mensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.TipoCuenta = TipoCuenta;
        this.interes_mensual = interes_mensual;

    }

    void imprimir(){
        System.out.println("Nombres del titular: "+nombresTitular);
        System.out.println("Apellidos del titular: "+apellidosTitular);
        System.out.println("Numero de Cuenta: "+numeroCuenta);
        System.out.println("Tipo de Cuenta: "+TipoCuenta);
        System.out.println("Saldo: "+saldo);
    }

    void consultarSaldo(){
        System.out.println("El saldo actual es: "+saldo);
    }

    public boolean consignar(int valor){
        if(valor>0){
            saldo+=valor;
            System.out.println("Se ha consignado $"+valor+" en la cuenta, el nuevo saldo es: "+saldo);
            return true;
        }
        else{
            System.out.println("El valor a consignar debe ser mayor a 0");
            return false;
        }

    }

    public boolean retirar(int valor){
        if(valor>0 && valor<=saldo){
            saldo-=valor;
            System.out.println("Se ha retirado $"+valor+" en la cuenta, el saldo actual es: "+saldo);
            return true;
        }
        else{
            System.out.println("El valor a retirar debe ser mayor a 0. O no tiene suficiente saldo");
            return false;
        }
    }

    public void calcular_saldo_interes(){
        double interes=saldo*(interes_mensual/100);
        saldo+=interes;
        System.out.println("El saldo actual con el interés aplicado actual es: "+saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta=new CuentaBancaria("Pedro","Perez",123456789,tipo.AHORROS,2.5);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.calcular_saldo_interes();
    }
}