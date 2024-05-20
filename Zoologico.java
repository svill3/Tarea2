import java.util.ArrayList;

// Creación de una clase nueva (en este caso clase Zoológico)
public class Zoologico {
    // Propiedades de la clase Zoológico
    private ArrayList<Ave> aves;

    // Constructor de la clase Zoológico
    public Zoologico() {
        aves = new ArrayList<>();
    }

    // Método para agregar aves
    public void agregarAve(Ave ave) {
        aves.add(ave);
    }

    // Método que muestra aplicaciones del POO en la terminal
    public static void main(String[] args) {
        // Crear objetos (instancias) de varias aves
        Ave ave1 = new Ave("Ciro", "Loro", 1);
        Ave ave2 = new Ave("Nigel", "Pájaro Carpintero", 3);
        Ave ave3 = new Ave("Shadow", "Colibrí", 10);
        Ave ave4 = new Ave("Michael", "Avestruz", 4);
        Ave ave5 = new Ave("Pablo", "Paloma", 6);
    
        // Simular la creación de un zoológico
        Zoologico zoologico = new Zoologico();
        zoologico.agregarAve(ave1);
        zoologico.agregarAve(ave2);
        zoologico.agregarAve(ave3);
        zoologico.agregarAve(ave4);
        zoologico.agregarAve(ave5);
    
        // Ejemplo del uso del POO para el ave 1
        System.out.println("-------------------------------------------");
        System.out.println("Información ave #1:");
        System.out.println("Nombre: " + ave1.getNombre());
        System.out.println("Especie: " + ave1.getEspecie());
        System.out.println("Edad: " + String.valueOf(ave1.getEdad()) + " año/s\n");
        ave1.volar(10);
    
        ave1.setNombre("Martín");
        System.out.println("\nEl ave #1 ha sido renombrado a: " + ave1.getNombre() + "\n");
        ave1.volar(3);
        System.out.println();
    }
}