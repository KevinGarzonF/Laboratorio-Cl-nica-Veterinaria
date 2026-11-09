package veterinaria;

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private int vacunasAplicadas = 0;
    private String numeroPoliza;

    public Perro(String nombre, int edad, String nombreDueno, String raza, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.numeroPoliza = numeroPoliza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}
