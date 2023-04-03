import java.util.ArrayList;

public interface ICreacion_heap<E> {
    /**
     * Permite tomar los datos recibidos y registrarlos en el heap, de acuerdo a la
     * prioridad dada y al formato de heap usado
     * 
     * @param a (datos por añadir al heap)
     */
    public void agregar_proceso_a_HEAP(ArrayList<E> a);

    /**
     * Permite la impresión ordenada de los datos dentro del heap
     */
    public void imprimir_HEAp();

}
