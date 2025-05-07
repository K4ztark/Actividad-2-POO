public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaSol;
    private double periodoOrbital;   // Nuevo atributo
    private double periodoRotacion;  // Nuevo atributo
    enum TipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    private TipoPlaneta tipo;
    private boolean observable;

    public Planeta(String nombre, int cantidadSatelites, double masa,
                   double volumen, int diametro, int distanciaSol,
                   double periodoOrbital, double periodoRotacion,
                   TipoPlaneta tipo, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
        this.tipo = tipo;
        this.observable = observable;
    }

    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de Satelites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Periodo orbital (años) = " + periodoOrbital);
        System.out.println("Periodo de rotación (días) = " + periodoRotacion);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + (observable ? "Sí" : "No"));
    }

    double calcularDensidad() {
        if (volumen == 0) {
            throw new ArithmeticException("El volumen no puede ser cero al calcular la densidad.");
        }
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        float limite = 149597870 * 3.4f;
        return distanciaSol > limite;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12,
                12742, 150000000, 1.0, 0.997,
                TipoPlaneta.TERRESTRE, true);
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());

        System.out.println();

        Planeta p2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15,
                139820, 750000000, 11.86, 0.41,
                TipoPlaneta.GASEOSO, true);
        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
    }
}
