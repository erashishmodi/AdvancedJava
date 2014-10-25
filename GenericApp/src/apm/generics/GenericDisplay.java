//	This program shows the example of building the generic Method
package apm.generics;

public class GenericDisplay {
	
	static <T> void display(T[] array)
	{
		for(int i=0;i<array.length;++i)
		{
			if(array[i]!=null)
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="Ashish";
		names[1]="Bhautik";
		names[2]="Tejas";
		names[3]="Bhavesh";
		names[4]="Keyur";
		display(names);
		Integer numbers[]=new Integer[]{0,1,2,3,8,5,};
		display(numbers);

	}

}
