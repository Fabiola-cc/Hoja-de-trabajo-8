package Uso_alternativo;
import java.util.PriorityQueue;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

/*
* Código original del libro JavaStructures librería bailey
* Adaptado para utilizar la clase 'PriorityQueue<E>' de Java Collection Framework
*/
public class Using_PriorityQueue<E extends Comparable<E>> extends PriorityQueue<E> {
    protected PriorityQueue<E> data;

    public Using_PriorityQueue() {
        this.data = new PriorityQueue<E>();
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
