import Heap_alternativo.Heap;
import java.util.ArrayList;
import java.util.Stack;

public class Controlador2 implements ICreacion_heap <proceso>{
    Heap<proceso> heap2 = new Heap<>();
    Controlador2(){
        heap2 = new Heap<>();
    }

    @Override
    public void agregar_proceso_a_HEAP(ArrayList<proceso> procesos_registrados) {
        for (proceso pr: procesos_registrados) {
            heap2.add(pr);
        }
    }

    @Override
    public void imprimir_HEAp() {
        for (proceso pr:heap2) {
            System.out.println(pr);
        }

        System.out.println("\n\tFormato establecido en txt");
        for (proceso code: heap2) {
            System.out.println("\t"+ code.toString2());
        }
    }

}
