package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the start amount?");
		double startAmount= scan.nextDouble();
		System.out.println("What is the win chance?");
		double winChance= scan.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit= scan.nextDouble();		


		double moneyAmount = startAmount;

		//	for(double i = startAmount; i < winLimit; i++) 
		System.out.println("How many times do you want to play?");	
		int totalStimulations = scan.nextInt();
		for(int i = 1; i < totalStimulations; i++) {

			while (moneyAmount<winLimit && moneyAmount>0)
			{
				boolean winPlayer = Math.random() > winChance;

				if (winPlayer ==true) {
					moneyAmount = moneyAmount +1;

				}
				else {
					moneyAmount = moneyAmount -1;


				}


			}
			if (moneyAmount==winLimit) 
			{
				System.out.println("Day" + i);
				System.out.println("Day was a success");

			}

			if (moneyAmount==0) 
			{
				System.out.println("Day " + i);
				System.out.println("Day was a ruin");
			}
		}














	}

}
