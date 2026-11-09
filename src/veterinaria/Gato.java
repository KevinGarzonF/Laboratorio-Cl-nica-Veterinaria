package veterinaria;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private int vacunasAplicadas = 0;
    private String numeroPoliza;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado, String numeroPoliza) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.numeroPoliza = numeroPoliza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
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
        return esEsterilizado ? 120000 : 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}

