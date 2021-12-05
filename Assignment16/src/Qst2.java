public class Qst2 {}
//2. Modify the code below to add more constructors. Also modify the main method to test the new constructors
class Person{
// fields
   private String name;
   private String email;
   private String phoneNumber;

   // constructor
   public Person() {
	// this("Ram");//constructor channing
		System.out.println("Inside Default Constructor");
		System.out.println("Name is: "+this.name+" ,E-mail is: "+this.email+" ,Phone_Number is: "+this.phoneNumber);
	}
   public Person(String theName){
	//  this("Ram","Ram@gamil.com");//constructor channing
	   this.name = theName;
	   System.out.println("Inside one argumnet Constructor");
		System.out.println("Name is: "+this.name);
   }


public Person(String name, String email) {
this("Ram", "Ram@gamil.com","23167-349");
	this.name = name;
	this.email = email;
	 System.out.println("Inside two argumnet Constructor");
		System.out.println("Name is: "+this.name+" ,E-mail is: "+this.email);
}
public Person(String name, String email, String phoneNumber) {
	this.name = name;
	this.email = email;
	this.phoneNumber = phoneNumber;
	 System.out.println("Inside three argumnet Constructor");
	System.out.println("Name is: "+this.name+" ,E-mail is: "+this.email+" ,Phone_Number is: "+this.phoneNumber);
}
// methods - getters
   public String getName() { 
	   return this.name;}
   
   public String getEmail() {
	   return this.email;}
   
   public String getPhoneNumber() {
	   return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) {
	   this.name = theName;}
   
   public void setEmail(String theEmail) {
	   this.email = theEmail;}
   
   public void setPhoneNumber(String thePhoneNumber) {
	   this.phoneNumber = thePhoneNumber;}
   
   public String toString()
   {
      return (this.name + " " + this.email + " " + this.phoneNumber);
   }
public void display() {
	System.out.println("\"Inside display method\"");
	System.out.println("Name is: "+this.name+" ,E-mail is: "+this.email+" ,Phone_Number is: "+this.phoneNumber);
}
//main method for testing
public static void main(String[] args){
//   Person p1 = new Person("Sana");
//   System.out.println(p1);
//   Person p2 = new Person("Jean");
//   p2.setEmail("jean@gmail.com");
//   p2.setPhoneNumber("404 899-9955");
//   System.out.println(p2);
	Person p=new Person("Ramesh","Ramesh@udt.co.in","3487-32");
	p.display();
	System.out.println("\"Getters\"");
	System.out.println("Get name is "+p.getName());
	System.out.println("Get email is "+p.getEmail());
	System.out.println("Get phonenumber is "+p.phoneNumber);
	System.out.println("\"Setters\"");
	p.setName("Saharsh");
	p.setEmail("Saharshshukla@yahoo.com");
	p.setPhoneNumber("324-234");
	p.display();
   
	
	
}
}