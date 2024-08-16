import java.util.*;
public class Garage
{
	Scanner sc = new Scanner(System.in);
	Car[] spot = new Car[6];
	int current, countEmpty, minSpot = 0;
	void carIn(Car car)
	{
		System.out.print("Please select a parking spot: ");
		current = sc.nextInt();
		current--;
		countEmpty = 0;
		while(current < minSpot ||  spot.length <= current || spot[current] != null)
		{
			System.out.print("\nSelected spot is full, or not an appropriate value! \nPlease select another spot: ");
			current = sc.nextInt();
			current--;
		}
		spot[current] = car;
		System.out.println();
		for(int i = 0; i < spot.length; i++)// print visual representation of parking spots
		{
			if(spot[i] == null)
			{
				System.out.print("| |");
				countEmpty++;
			}
			else
				System.out.print("|"+ spot[i].name +"|");

			if(i == 2)
				System.out.println("\n");
			else
				System.out.print(" ");
		}
		System.out.println("\n\nYou've selected the spot " + (current+1) + " for your " + car.name);
		if(countEmpty != 0)
			System.out.println(countEmpty == 1 ? "There is " + countEmpty + " place available." : "There are " + countEmpty + " places available.");
	}
	int carOut()
	{
		System.out.print("\nDo you want to take your car?(y, n) ");
		char answ = sc.next().charAt(0);
		if(Character.toLowerCase(answ) == 'y')
		{
			System.out.print("Please select your parking spot: ");
			current = sc.nextInt();
			current--;
			while(current < minSpot || spot.length <= current || spot[current] == null)
			{
				System.out.println("Selected parking spot is already empty, or not an appropriate value! \nPlease select your parking spot: ");
				current = sc.nextInt();
				current--;
			}
			System.out.println("\nYou successfully took your " + spot[current].name + "\n");
			spot[current] = null;
			for(int i = 0; i < spot.length; i++)// print visual representation of parking spots
			{
				if(spot[i] == null)
					System.out.print("| |");
				else
					System.out.print("|"+ spot[i].name +"|");

				if(i == 2)
					System.out.println("\n");
				else
					System.out.print(" ");
			}
			return current;
		}
		else
		{
			return -1;
		}
	}
}