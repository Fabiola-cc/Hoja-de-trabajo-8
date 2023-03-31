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
        for (int i = 0; i < heap1.count(); i++) {
            proceso temp = heap1.get();
            System.out.println("temp.toString()");
            System.out.println("");
        }

        while(!heap1.isEmpty()){
            proceso temp = heap1.remove();
            System.out.println("");//toString 2
        }

    }


}
