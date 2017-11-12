package ui;
import java.util.*;

import business.Aligator;
import business.Animal;
import business.Countable;
import business.Sheep;
import business.Yew;
import util.Console;

public class AnimalCounterApp {
	
	public static void main(String[] args) {
//		anything that can call super and reach the animal class can enter this list
		List<? super Animal> allAnimals = new ArrayList<>();
		int gatrCount = Console.getInt("how many alligators should we add to our petting zoo?: ");
		System.out.println();
		for(int i=0; i<gatrCount; i++) {
			allAnimals.add(new Aligator("Gator"));
		}
		Yew baby = new Yew();
		baby.setName("bahbers");
		Sheep blackie = new Sheep();
		blackie.setName("blackie");
		Sheep dolly;
		try {
			dolly = (Sheep) blackie.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			dolly = null;
		}
		dolly.setName("Dolly");
		allAnimals.add(dolly);
		allAnimals.add(blackie);
		allAnimals.add(baby);
//		right side of for needs to be able to call super on left side? why?
		for (Object myValue : allAnimals) {
		    System.out.println(((Animal) myValue).getName());
		    if (myValue.getClass()==Yew.class) {
		    	((Yew) myValue).cry();
			}
		}
	}

}
