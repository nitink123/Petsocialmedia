package petsocialmediaapp;

public class Dog extends Pet{
	
	public Dog(String name,int age) {
		//we use abstraction here to hide the calculation
		//we put 7 because 1 dog year = 7 human years
		super(name,age,7);
	}
    //override selfDescribe from parent class
	// call selfDescribe()
	//add text
	@Override public String selfDescribe() {
		return "Fun dog looking to make friends! " + super.selfDescribe();
	}

}
