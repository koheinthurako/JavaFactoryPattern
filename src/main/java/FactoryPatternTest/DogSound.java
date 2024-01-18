package FactoryPatternTest;

public class DogSound implements MakingSound{
	
	@Override
	public void makeSound() {
		System.out.println("wof wof");
	}

}
