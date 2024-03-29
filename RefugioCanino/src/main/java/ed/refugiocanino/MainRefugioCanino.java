
package ed.refugiocanino;

public class MainRefugioCanino {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al Refugio");
        
        // Crear una instancia del refugio
        RefugioCanino refugio = new RefugioCanino();

        // Agregar algunos perros al refugio
        refugio.agregarPerro("Max", "GoldenRetriever");
        refugio.agregarPerro("Bella", "Pastor Alemán");
        refugio.agregarPerro("Pepito","Husky");

        // Mostrar la lista de perros en el refugio
        System.out.println("\nLista de perros en el refugio:");
        refugio.mostrarPerros();

        // Obtener y mostrar el número de perros en el refugio
        int numeroDePerros = refugio.obtenerNumeroDePerros();
        System.out.println("\nNúmero de perros en el refugio: " + numeroDePerros);

    }
}
