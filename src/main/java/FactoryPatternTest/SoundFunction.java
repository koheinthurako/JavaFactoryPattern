package FactoryPatternTest;

public class SoundFunction {
	
	public MakingSound makingSound(int input) {
		if(input == 1) return new DogSound();
		else return new CatSound();
	}

}
