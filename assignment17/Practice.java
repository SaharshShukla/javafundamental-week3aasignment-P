package assignment17;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal();
		dog.landAnimal="Germanshaffered";//apporach for assigning value
		System.out.println("Dog breed is "+dog.landAnimal);
		dog.getLandAnimal("WildCat");//apporach 2 for asigning value
		dog.setLandAnimal("Bull");//apporach 3 for assigning values
		dog.canRun();
		Animal.age=6;
		Animal.incrementAge();
		Animal cat=new Animal();
		cat.canSwiming();
		cat.getWaterAnimal();
		cat.setWaterAnimal("swatcat");
		Animal.age=34;
		Animal.incrementAge();
		Animal cow=new Animal();
		cow.canRun();
		cow.setLandAnimal("buffalo");
		Animal.age=14;
		Animal.incrementAge();
		Animal Elephent=new Animal();
	}
}
/*
1-12-2021
practice
"- create class Animal with various variables and methods in it to demonstrate //done
- create multiples objects like dog, cat, cow, elephant etc and demomnstrate various approches to assign values to variables//
- auto generate getters and setters//done
- demonstrate constructor chanining and create objects by passing no values, lesser value and more values//done
-create static variable age and create a static method inside class named incrementAge() and inside//done
increment the age 
 whenever this method called (please
  keep break pointer and check what happens and value inside this method when you call from different objects
 "
*/
class Animal{
//data member
	static int count=0;
	static int age;
	protected String landAnimal;
	protected String waterAnimal;
	protected String landAndWaterAnimal;
	//constructor
	public Animal() {
		this("Dog", "Shark");//constructor chaning
	}
	public Animal(String landAnimal, String waterAnimal) {
		this("Dog", "Shark", "Turtel");
		this.landAnimal = landAnimal;
		this.waterAnimal = waterAnimal;
	}
	protected Animal(String landAnimal, String waterAnimal, String landAndWaterAnimal) {
		this.landAnimal = landAnimal;
		this.waterAnimal = waterAnimal;
		this.landAndWaterAnimal = landAndWaterAnimal;
		System.out.println("landAnimal: "+landAnimal+" waterAnimal: "+waterAnimal+" landAndWaterAnimal: "+landAndWaterAnimal);
	}
	
	//getters and setters
	
	public String getLandAnimal(String la) {
		this.landAnimal=la;
		System.out.println("landAnimal is "+landAnimal);
		return landAnimal;
	}
	public void setLandAnimal(String landAnimal) {
		this.landAnimal = landAnimal;
		System.out.println("landAnimal is "+landAnimal);
	}
	public String getWaterAnimal() {
		return waterAnimal;
	}
	public void setWaterAnimal(String waterAnimal) {
		this.waterAnimal = waterAnimal;
		System.out.println("waterAnimal is "+waterAnimal);
	}
	public String getLandAndWaterAnimal() {
		return landAndWaterAnimal;
	}
	public void setLandAndWaterAnimal(String landAndWaterAnimal) {
		this.landAndWaterAnimal = landAndWaterAnimal;
		System.out.println("landAndWaterAnimal is "+landAndWaterAnimal);
	}
	//member methods
	public void canRun() {
		System.out.println("Animal can run");
	}
	public void canFly() {
		System.out.println("Animal can fly ");
	}
	public void canSwiming() {
		System.out.println("Animal can Swming ");
	}
	//static memthord for counting as a break point
	public static void incrementAge() {
		System.out.println("age is "+age+" count is "+count);
		count++;//break point to check
	}

}

