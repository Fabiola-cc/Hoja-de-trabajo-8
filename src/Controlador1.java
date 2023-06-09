import java.util.ArrayList;
import structure5.VectorHeap;

/*
* Esta clase implementa la interfaz 'ICreacion_heap' haciendo uso de los métodos del heap dado por el
* libro Java Structures. Se adapta al uso de esos métodos para el buen funcionamiento del programa.
*/

public class Controlador1 implements ICreacion_heap<proceso>{

    VectorHeap<proceso> heap1;
    Controlador1(){
        heap1 = new VectorHeap<>();
    }

    @Override
    public void agregar_proceso_a_HEAP(ArrayList<proceso> procesos_registrados) {
        for (proceso pr: procesos_registrados) {
            heap1.add(pr);
        }
    }

    @Override
    public void imprimir_HEAp() {
        ArrayList<String> cadenas_impresion = new ArrayList<>();
        while(!heap1.isEmpty()){ //Imprime de manera ordenada los datos de cada proceso guardado en heap
            proceso temp = heap1.remove();
            cadenas_impresion.add(temp.toString2());
            System.out.println(temp.toString());
        }

        System.out.println("\n\tFormato establecido en txt");
        for (String code: cadenas_impresion) {
            System.out.println("\t"+code);
        }
        System.out.println();

    }


}
