import java.util.ArrayList;
import Heap_de_Moises.HeapUsingIterativeBinaryTree;
import Heap_de_Moises.ComparadorNumeros;

/*
* Esta clase implementa la interfaz 'ICreacion_heap' haciendo uso de los métodos del heap empleado en clase.
* Se adapta al uso de esos métodos para el buen funcionamiento del programa.
*/

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
        ArrayList<String> cadenas_impresion = new ArrayList<>();
        while(!heap1.isEmpty()){ //Imprime de manera ordenada los datos de cada proceso guardado en heap
            proceso temp = heap1.remove();
            cadenas_impresion.add(temp.toString2());
            System.out.println(temp.toString());
        }

        System.out.println("\nFormato establecido en txt");
        for (String code: cadenas_impresion) {
            System.out.println(code);
        }
        System.out.println();

    }


}
