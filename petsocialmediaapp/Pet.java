package petsocialmediaapp;

public class Pet {
	String name = "";
	int age = 0;
	//String color = "";
	//private String breed = "";
	
	private int Agemultiplier = 1;
	
	public Pet(String name,int age) {
		this.name = name;
		this.age = age;
		//this.color = color;
	//	this.breed = breed;	
	}
	
	public Pet(String name,int age,int Agemultiplier) {
		this.name = name;
		this.age = age;
	//	this.color = color;
	//	this.breed = breed;
		this.Agemultiplier = Agemultiplier;
		
	}

	public String selfDescribe() {
		// include the name and age  and other properties
		//calculate the real age and includw it into the string
		return "Hello, my name is " + name + ". I am " + calculaterealAge() + " in human year(s)";
}
	public int calculaterealAge() {
		
		return age*Agemultiplier;
		
	}
}
