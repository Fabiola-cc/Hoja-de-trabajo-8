import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/*
* Pruebas unitarias para el proceso de adición al heap, desde la creación de un proceso, hasta la extracción de cada elemento en orden
*/
class Controlador1Test {
    ArrayList<proceso> arraylist_prueba = new ArrayList<>();
    Controlador1 cont = new Controlador1();
    proceso p1; proceso p2; proceso p3; proceso p4; proceso p5;

    public void negativos(){
        p1 = new proceso("p1", "juan16", -20);
        p2 = new proceso("p2", "gal221", -10);
        p3 = new proceso("p3", "sal23", -13);
        p4 = new proceso("p4", "tim12", -7);

        if (arraylist_prueba != null) {
            arraylist_prueba.clear();
            arraylist_prueba.add(p1);arraylist_prueba.add(p2);arraylist_prueba.add(p3);arraylist_prueba.add(p4);
        }
    }

    @Test
    void procesos_negativos() {
        negativos();
        cont.agregar_proceso_a_HEAP(arraylist_prueba);

        assertEquals(p1, cont.heap1.remove());
        assertEquals(p3, cont.heap1.remove());
        assertEquals(p2, cont.heap1.remove());
        assertEquals(p4, cont.heap1.remove());
    }

    public void positivos(){
        p1 = new proceso("p1", "juan16", 19);
        p2 = new proceso("p2", "gal221", 10);
        p3 = new proceso("p3", "sal23", 3);
        p4 = new proceso("p4", "tim12", 17);

        if (arraylist_prueba != null) {
            arraylist_prueba.clear();
            arraylist_prueba.add(p1);arraylist_prueba.add(p2);arraylist_prueba.add(p3);arraylist_prueba.add(p4);
        }
    }

    @Test
    void procesos_positivos() {
        positivos();
        cont.agregar_proceso_a_HEAP(arraylist_prueba);

        assertEquals(p3, cont.heap1.remove());
        assertEquals(p2, cont.heap1.remove());
        assertEquals(p4, cont.heap1.remove());
        assertEquals(p1, cont.heap1.remove());
    }

    public void iguales(){
        p1 = new proceso("p1", "juan16", 19);
        p2 = new proceso("p2", "gal221", 19);
        p3 = new proceso("p3", "sal23", 19);
        p4 = new proceso("p4", "tim12", 19);
        p5 = new proceso("p5", "abc34", 17);

        if (arraylist_prueba != null) {
            arraylist_prueba.clear();
            arraylist_prueba.add(p1);arraylist_prueba.add(p2);arraylist_prueba.add(p3);arraylist_prueba.add(p4);arraylist_prueba.add(p5);
        }
    }

    @Test
    void procesos_iguales() {
        iguales();
        cont.agregar_proceso_a_HEAP(arraylist_prueba);

        assertEquals(p5, cont.heap1.remove());
        assertEquals(p2, cont.heap1.remove());
        assertEquals(p4, cont.heap1.remove());
        assertEquals(p3, cont.heap1.remove());
        assertEquals(p1, cont.heap1.remove());
    }

    public void varios(){
        p1 = new proceso("p1", "juan16", 19);
        p2 = new proceso("p2", "gal221", 19);
        p3 = new proceso("p3", "sal23", -10);
        p4 = new proceso("p4", "tim12", -13);
        p5 = new proceso("p5", "abc34", 0);

        if (arraylist_prueba != null) {
            arraylist_prueba.clear();
            arraylist_prueba.add(p1);arraylist_prueba.add(p2);arraylist_prueba.add(p3);arraylist_prueba.add(p4);arraylist_prueba.add(p5);
        }
    }

    @Test
    void procesos_variados() {
        varios();
        cont.agregar_proceso_a_HEAP(arraylist_prueba);

        assertEquals(p4, cont.heap1.remove());
        assertEquals(p3, cont.heap1.remove());
        assertEquals(p5, cont.heap1.remove());
        assertEquals(p1, cont.heap1.remove());
        assertEquals(p2, cont.heap1.remove());
    }
}