import java.util.ArrayList;


import Heap_de_Moises.HeapUsingIterativeBinaryTree;
import Heap_de_Moises.ComparadorNumeros;

public class Controlador1 implements ICreacion_heap<proceso>{
    HeapUsingIterativeBinaryTree<Integer, proceso> heap1;
    Controlador1(){
        heap1 = new HeapUsingIterativeBinaryTree<>(new ComparadorNumeros<>());
    }

    @Override
    public void agregar_proceso_a_HEAP(ArrayList<proceso> procesos_registrados) {
        for (proceso pr: procesos_registrados) {
            int priority = pr.getPriority();
            String[] data = {pr.getNombre_proceso(), pr.getUsuario()};

            heap1.Insert(priority, pr);
        }
    }

    @Override
    public void imprimir_HEAp() {
        for (int i = 0; i < heap1.count(); i++) { //Imprime de manera ordenada los datos de cada proceso guardado en heap
            proceso temp = heap1.get();
            System.out.println(temp.toString());
            System.out.println("");
        }

        System.out.println("\nFormato como el dado en txt");
        while(!heap1.isEmpty()){ //Impresión de todos los datos con la estructura recibida en txt
            proceso temp = heap1.remove();
            System.out.println(temp.toString2());
        }
        System.out.println();

    }


}
