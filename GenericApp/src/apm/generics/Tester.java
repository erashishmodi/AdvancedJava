package apm.generics;

public class Tester {
	
	public static void main(String args[])
	{
		GenericPair<Integer,String> nameId=new GenericPair<Integer,String>(10,"Ashish");
		GenericPair<String,String> fullname=new GenericPair<String,String>("Ashish","Modi");
		GenericPair<Double,String> itemPrice=new GenericPair<Double,String>(10.00,"Cello Pin Point");
		System.out.println(nameId.first()+" "+nameId.second());
		System.out.println(fullname.first()+" "+fullname.second());
		System.out.println(itemPrice.first()+" "+itemPrice.second());
		
		System.out.println();
	}

	public static void main2(String args[])
	{
		NumberList<Integer> numbers=new NumberList<Integer>(3);
		StringList<String> items=new StringList<String>(3);
		numbers.add(1);
		numbers.add(2);
		items.add("Note Book");
		items.add("Pencil");
		System.out.println(numbers.get(0)+" "+items.get(0));
		System.out.println(numbers.get(1)+" "+items.get(1));
		
	}

	public static void main1(String[] args) {
		List <String> names=new List<String>(4);
		names.add("Ashish");
		names.add("Bhautik");
		names.add("Jayesh");
		System.out.print("\nElements :"+names.toString());
		List <Integer> numbers=new List<Integer>(4);
		numbers.add(23);
		numbers.add(32);
		numbers.add(4);
		System.out.print("\nElements :"+numbers.toString());

	}

}
