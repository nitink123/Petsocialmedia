package petsocialmediaapp;

public class Cat extends Pet {
	
	public Cat(String name,int age) {
		// we use abstraction to hide the calculation
		// we put 8 because 1 cat year = 8 human years
		super(name,age,8);
	}

	
	//override selfDescribe function from parent class
	// using super keyword to call selfDescribe()
	// add test whichever you want
	@Override public String selfDescribe() {
		return "Fun cat ready to party! " + super.selfDescribe();
	}

}
