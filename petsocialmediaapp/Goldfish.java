package petsocialmediaapp;

public class Goldfish extends Pet{
	
	public Goldfish(String somename,int someage) {
		
		super(somename,someage, 10);
		
	}

	@Override public String selfDescribe() {
		return "Fun fish wanted to swim! " + super.selfDescribe();
	}

}
