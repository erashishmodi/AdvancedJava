package apm.generics;

public class StringList<T> implements IList<T> {
	private int pos;
	private T[] datastore;
	int size;
	
	@SuppressWarnings("unchecked")
	public StringList (int numElement)
	{
		size=numElement;
		pos=0;
		datastore=(T[]) new Object[size];
	}
	
	public void add(T element)
	{
		datastore[pos]=element;
		++pos;
		
	}
	
	public T get(int n)
	{
		return datastore[n];
	}

}
