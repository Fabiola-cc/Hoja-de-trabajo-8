import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    static readFile read = new readFile();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> total = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\nBienvenidos a la nueva distribución de Linux");
        System.out.println("\n CHICHICASTELINUX");
        System.out.println("En este momento se leera el archivo de código...");
        total = read._readfile("src\\procesos.txt");
        System.out.println("Se han guardado tus datos de procesos");
        boolean salir = false;
        System.out.println("\n\t El órden de las prioridades es el siguiente");
        System.out.println("Uso de árbol Heap creado por Catedrático");
        //Métódo de prioridades 
        System.out.println("Uso de árbol Heap creado Java Collection Framework");
        //Método de prioridades 

}
}