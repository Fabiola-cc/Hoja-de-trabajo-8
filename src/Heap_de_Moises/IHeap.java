package Heap_de_Moises;
/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
public interface IHeap<P, V> {

	void Insert(P priority, V value);
	
	V get();
	
	V remove();
	
	int count();
	
	boolean isEmpty();
	
}
