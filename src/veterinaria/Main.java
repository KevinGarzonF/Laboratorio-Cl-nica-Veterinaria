package veterinaria;

public class Main {
    public static void main(String[] args) {

        Perro scott     = new Perro("scott", 3, "Javier", "Labrador", "POL-PERRO-SCOTT");
        Gato dante    = new Gato("dante", 2, "Karol", true, "POL-GATO-DANTE");
        Ave pepe    = new Ave("dante", 1, "Melisa", 35.0);

        Conejo canelita = new Conejo("canelita", 1, "Arturo");

        Animal[] animales = { scott, dante, dante, canelita };

        System.out.println("Ficha del animal");
        for (Animal a : animales) {
            a.mostrarFicha();
            System.out.println();
        }

        System.out.println("Medida de vacunacion");
        scott.registrarVacuna("Rabia");
        scott.registrarVacuna("Parvovirus");
        dante.registrarVacuna("Rabia");

        System.out.println("Vacunas del perro: " + scott.getVacunasAplicadas());
        System.out.println("Vacunas del gato: " + dante.getVacunasAplicadas());
        System.out.println();

        Clinica vetCare = new Clinica("VetCare Centro", "Calle 10 #5-20");
        Asegurable[] asegurables = { scott, dante, vetCare };

        System.out.println("Seguro");
        for (Asegurable s : asegurables) {
            System.out.println("Póliza: " + s.obtenerNumeroPoliza()
                    + " | Prima: $" + s.calcularPrimaSeguro());
        }
        System.out.println();

        System.out.println("Vetrificacion conejo");
        canelita.mostrarFicha();
    }
}
