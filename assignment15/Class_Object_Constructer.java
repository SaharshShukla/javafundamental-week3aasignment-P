package assignment15;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class Vehicle{
	Scanner sc=new Scanner(System.in);
    //data members
	String company;
	String model;
	String colour;
	int price;
	//constructor with zero argumnet
	public Vehicle() {
System.out.println("Inside constructor with zero argument");
	}
	//constructor with one argument
	public Vehicle(String company) {
		System.out.println("Inside constructor with one argument");
		System.out.println(company);
			}
	//constructor with two argument
	public Vehicle(String company,String model) {
		System.out.println("Inside constructor with two argument");
		System.out.println(company+" "+model);
			}
	//constructor with three argument
	public Vehicle(String company,String model,String colour) {
		System.out.println("Inside constructor with three argument");
		System.out.println(company+" "+model+" "+colour);
			}
	//constructor with four argument
	public Vehicle(String company,String model,String colour,int price) {
		System.out.println("Inside constructor with four argument");
		System.out.println(company+" "+model+" "+colour+" "+price);
			}
	public String getCompany() {
		System.out.println("Enter company name: ");
		company=sc.nextLine();
		return company;
	} 
	public void setCompany(String c) {
		company=c;
		System.out.println(" company value set to "+company);
	} 
	public String getModel() {
		System.out.println("Enter model name: ");
		model=sc.nextLine();
		return model;
	}
	public void setModel( String m) {
		model=m;
		System.out.println("model value set to "+model);
	}
	public String getColour() {
		System.out.println("Enter colour : ");
		colour=sc.nextLine();
		return colour;
	}
	public void setColour(String c) {
		colour=c;
		System.out.println(" colour value set to "+colour);
	}
	public int getPrice() {
		System.out.println("Enter price: ");
		price=sc.nextInt();
		return price;
	}
	public void setPrice(int p) {
		price=p;
		System.out.println(" price value set to "+price);
	}
	
	
	//member function
	public void horn() {
		System.out.println("pe po pe po");
	}
	public void breaks() {
		System.out.println("Breaks are applied");
	}
	public void acclerate() {
		System.out.println("Speed in increse");
	}
	
	
	//Displaying comapny ,model ,colour and price
	public  void Display() {
		System.out.println("Comapany is "+company);
		System.out.println("Model is "+model);
		System.out.println("Colour is "+colour);
		System.out.println("Price is "+price);
	}
}
public class Class_Object_Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 29-11-2021
		 * Classes, Objects, Constructor
		 * "- Create class named ""Vehicle"" with its basic characters as instance variables and basic functionalities as functions
		- create different objects like 1)bike 2)car, 3)trek
		- initilize instance varibales of bike with no arguemnt default constructor
		- initilize other objects using argument constructor
		- declare getters and setters for this class"
		 */
		Vehicle Bike=new Vehicle();//constructor with zero argument
		//member function
		Bike.horn();
		Bike.breaks();//member function
		Bike.acclerate();//member function

		//Getters
		Bike.getCompany();
		Bike.getModel();
		Bike.getColour();
		Bike.getPrice();
		Bike.Display();
		
			//setters
		Bike.setCompany("Honda");
		Bike.setModel("Plus");
		Bike.setColour("black");
		Bike.setPrice(31232);
		
		
	Vehicle Car=new Vehicle("Bmw");//constructor with one argument
	//Vehicle Car=new Vehicle("Tata","xuv");//constructor with two argument
	//Vehicle Car=new Vehicle("tesla","exu","red");//constructor with Three argument
	//Vehicle Car=new Vehicle("fiat","xrd","yellow",2734948);//constructor with four argument
	// member methords
	Car.horn();
	Car.breaks();
	Car.acclerate();
	
	//getters
	Car.getCompany();
	Car.getModel();
	Car.getColour();
	Car.getPrice();
	Car.Display();
	
	//setters
	Car.setCompany("Hero");
	Car.setModel("Bx67");
	Car.setColour("Kesari");
	Car.setPrice(128438);
	
	Vehicle Truck=new Vehicle("Tata","Hercules","Green",21378);//constructor with four argument
	// member methords
	Truck.horn();
	Truck.acclerate();
	Truck.breaks();
	//getters
	Truck.getColour();
	Truck.getModel();
	Truck.getColour();
	Truck.getPrice();
	Truck.Display();
	//setters
	Truck.setCompany("Ashok");
	Truck.setModel("SuperNova");
	Truck.setColour("Orange");
	Truck.setPrice(2388323);
	
	}

}

