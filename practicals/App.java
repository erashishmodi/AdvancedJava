//package App;
class SuperClass
{
    void Display()
    {
        System.out.print("This is the Display() of SuperClass");
    }
      
}

class BaseClass extends SuperClass
{
    void Display()
    {
	System.out.print("Display() Of the SubClass");
	super.Display();
	}        
    
    
}
class App
{
    public static void main(String[] args) {
        BaseClass obj=new BaseClass();
        obj.Display();
    }

}

