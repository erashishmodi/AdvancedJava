//	This program shows the example of creating pairs of argument to class
package apm.generics;

public class GenericPair<A,P> {
	private A firstItem;
	private P secondItem;
	
	public GenericPair(A first,P second)
	{
		firstItem=first;
		secondItem=second;
	}
	
	public A first()
	{
		return firstItem;
	}
	public P second()
	{
		return secondItem;
	}

}
