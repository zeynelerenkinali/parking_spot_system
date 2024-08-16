import java.util.*;

public class Car 
{
	Scanner sc = new Scanner(System.in);
	String name;
	
	String carBrand()
	{
		System.out.print("\nPlease enter brand of your car: ");
		name = sc.next();
		return name;
	}
}