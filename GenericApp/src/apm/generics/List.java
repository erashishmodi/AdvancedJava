package apm.generics;

public class List <T> {
	private int pos;
	private int size;
	private T[] datastore;
	
	
	@SuppressWarnings("unchecked")
	public List(int numelElement)
	{
		pos=0;
		size=numelElement;
		datastore =(T[]) new Object[size];
	}
	
	public void add(T data)
	{
		datastore[pos]=data;
		++pos;
		
	}
	public String toString()
	{
		String element="";
		for(int i=0;i<pos;++i)
		{
			element+=datastore[i]+" ";
			
		}
		return element;
	}

}
