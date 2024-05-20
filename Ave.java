// Clase Ave
public class Ave {
    // Al menos tres propiedades dadas por encapsulamiento
    private String nombre;
    private String especie;
    private int edad;

    // Constructor de la clase Ave
    public Ave(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Al menos dos métodos distintos al constructor, setters y getters
    public void volar(int distancia) {
        System.out.println("El ave " + nombre + " ha volado " + distancia + " metros");
    }
    public void comer(String comida) {
        // La comida tiene que ser un sustantivo en plural
        System.out.println("El ave se ha comido " + comida);
    }

    // Setters y getters
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}