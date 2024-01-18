package FactoryPatternTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose animal sound that you want to hear \n 1: Dog \t 2: Cat");
		System.out.print("Enter number : ");
		int input = 0;
		while(true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				if(input > 2) System.out.println("Invalid Choice! Try again...");
				else break;
			} catch (NumberFormatException e) {
				System.out.println("Please try again! Type numbers only...");
			}
		}
		SoundFunction animalSound = new SoundFunction();
//		အောက်ကနေရာက အဓိကပဲ animalSound က return ပြန်လာတဲ့တန်ဖိုးက ဘာမှန်းမသိတော့ interface ကို PolymorPhism နည်းနဲ့ကြားခံသုံးလိုက်ပြီးတော့မှ
//		maingSound() method return type ကိုလည်းinterface ဖြစ်တဲ့ MakingSound ကိုပြောင်းပေးလိုက်တယ်
		MakingSound sound = animalSound.makingSound(input);
//		သဘောကတော့ အပေါ်က code ကို run လိုက်ရင် =>
//		MakingSound sound = new DogSound(); (OR) MakingSound sound = new CatSound(); ဆိုပြီးဖြစ်သွားတယ်
//		ဒါဆိုရင်တော့ return ပြန်လာတဲ့ object နှစ်ခုလုံးက interface ကို implements လုပ်ထားကြလို့ သူတို့ရဲ့ makeSound() method တွေကအလုပ်လုပ်သွားတယ်
		sound.makeSound();
		sc.close();
		
	}

}
