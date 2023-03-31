package Heap_alternativo;
import java.util.PriorityQueue;
import structure5.Vector;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

/*
* Código original del libro JavaStructures librería bailey
* Adaptado para utilizar la clase 'PriorityQueue<E>' de Java Collection Framework
*/
public class Heap<E extends Comparable<E>> extends PriorityQueue<E> {
    protected PriorityQueue<E> data;

    public Heap() {
        this.data = new PriorityQueue<E>();
    }

    public Heap(Vector<E> v) {
        this.data = new PriorityQueue<E>(v.size());

        for(int i = 0; i < v.size(); ++i) {
            this.add((E) v.get(i));
        }

    }

    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    protected static int left(int i) {
        return 2 * i + 1;
    }

    protected static int right(int i) {
        return 2 * (i + 1);
    }

    public E getFirst() {
        return data.poll();
    }

    public String toString() {
        return "<Heap: " + this.data + ">";
    }
}
