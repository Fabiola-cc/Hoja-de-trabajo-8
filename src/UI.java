import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    static readFile read = new readFile();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> total = new ArrayList<>();
    static Controlador1 cont1 = new Controlador1();
    static Controlador2 cont2 = new Controlador2();



    public static void main(String[] args) {
        System.out.println("\nBienvenidos a la nueva distribución de Linux");
        System.out.println("\n CHICHICASTELINUX");
        System.out.println("En este momento se leera el archivo de código...");
        //Le pasamos la dirección del archivo a la clase read la cual nos va a devolver una array que se usará en los controladores
        total = read._readfile("src\\procesos.txt");
        System.out.println("Se han guardado tus datos de procesos");
        System.out.println("\n\t El órden de las prioridades es el siguiente");
        //A los controladores le pasamos el array con el metodo agregar, lo que va hacer es guardar todos lo datos en el HEAP
        cont1.agregar_proceso_a_HEAP(total);
        cont2.agregar_proceso_a_HEAP(total);

        //Imprime los datos en orden del primer HEAP 
        System.out.println("Uso de árbol Heap creado por Catedrático");
        cont1.imprimir_HEAp();

        
        //Imprime los datos en orden del segundo HEAP 
        System.out.println("Uso de árbol Heap creado Java Collection Framework");
        cont2.imprimir_HEAp();
}
}