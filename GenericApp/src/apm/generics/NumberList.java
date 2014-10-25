package apm.generics;

public class NumberList<T> implements IList<T> {

	private int pos;
	private int size;
	private T datastore[];
	
	
	@SuppressWarnings("unchecked")
	public NumberList(int numElement) {
		size=numElement;
		pos=0;
		datastore=(T[]) new Object[size];
		
	}
	public void add(T element) {
		datastore[pos]=element;
		++pos;
		
		
	}

	public T get(int n) {
		
		return datastore[n];
	}

}
