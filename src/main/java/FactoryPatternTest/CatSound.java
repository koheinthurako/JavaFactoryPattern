package FactoryPatternTest;

public class CatSound implements MakingSound{
	
	@Override
	public void makeSound() {
		System.out.println("meow meow");
	}

}
