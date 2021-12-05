class Test1{
    public static void talk()
    {
          System.out.println("hello there!");
    }
//methordoverriding
    public static void talk(String name){
    	 System.out.println("Hello  "+name);
    }
}
public class Overriding3 {
	public static void main(String[] args){
     Test1 t=new Test1();
     t.talk("Matthew");
	}
}
/*
Overloading:
Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.

public class Test1
{
    public static void talk()
    {
          System.out.println("hello there!");
    }

    public static // FINISH THE METHOD HERE //

    public static void main(String[] args)
    {
          talk("Matthew");
    }
}





*/