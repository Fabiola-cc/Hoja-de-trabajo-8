import Uso_alternativo.Using_PriorityQueue;
import java.util.ArrayList;

/*
 * Esta clase implementa la interfaz 'ICreacion_heap' haciendo uso de los métodos del heap empleando "PriorityQueue" de
 * Java Collection Framework. Se adapta al uso de esos métodos para el buen funcionamiento del programa.
 */
public class Controlador2 implements ICreacion_heap <proceso>{
    Using_PriorityQueue<proceso> heap2 = new Using_PriorityQueue<>();
    Controlador2(){
        heap2 = new Using_PriorityQueue<>();
    }

    @Override
    public void agregar_proceso_a_HEAP(ArrayList<proceso> procesos_registrados) {
        for (proceso pr: procesos_registrados) {
            heap2.add(pr);
        }
    }

    @Override
    public void imprimir_HEAp() {
        for (proceso pr: heap2) {
            System.out.println(pr);
        }

        System.out.println("\n\tFormato establecido en txt");
        for (proceso code: heap2) {
            System.out.println("\t"+ code.toString2());
        }
    }

}
