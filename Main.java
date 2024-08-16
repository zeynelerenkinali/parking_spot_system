public class Main {

	public static void main(String[] args) 
	{
		Garage garage = new Garage();
		Car[] cars = new Car[6];
		int counter = 0, spotNum = 6;
		boolean check = false;
		
		System.out.println("||Welcome to the Xone Park||");
		while(true)
		{
			for(counter = 0; counter < spotNum; counter++) // making sure finding empty spot with counting zero to full, if there is no null, break the while true that's mean all the empty places full.
			{
				if(cars[counter] == null)
				{
					check = true;
					break;
				}
				check = false;
			}
			if(check == false)
			{
				System.out.println("\nXone Park is full, please try another parking zone...");
				break;
			}
			else
			{
				cars[counter] = new Car();
				cars[counter].carBrand();
				garage.carIn(cars[counter]);
				int var = garage.carOut();
				if(var == -1)
					continue;
				else
					cars[var] = null;
			}
		}
	}
}