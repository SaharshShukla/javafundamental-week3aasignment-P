class Dog{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }
//methord is overriding object of equals
    public boolean equals(Object other)
    {
        // ADD CODE HERE
    	Dog d1 = (Dog) other;//methord will check current Dog and passed Dog have the same name
        return (this.name.equals(d1.name));//and will return value in boolean form
    	
    }
 }
public class Inheritance_2 {
	public static void main(String[] args)
    {
		    Dog d1 = new Dog("Rufus");
	        Dog d2 = new Dog("Sally");
	        Dog d3 = new Dog("Rufus");
	        Dog d4 = d3;
	        System.out.println(d1.equals(d2));
	        System.out.println(d2.equals(d3));
	        System.out.println(d1.equals(d3));
	        System.out.println(d3.equals(d4));
        
    }
}

/*
Add an equals method to this class that returns 
true if the current Dog and passed Dog have the same name. The code should print false twice then true twice.


public class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        // ADD CODE HERE
    }

    public static void main(String[] args)
    {
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}

 */