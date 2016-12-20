package Part_2;

public class ParkingCharge
{

	
	public static double calculateCharges(double hours)
	{

		double minFee = 2.00;
		double maxFee = 10.00;
		double minHoursParked = 3.00;
		double maxHoursParked = 24.00;
		double hourIncrementalFee = 0.50;
		double fee = minFee;
		
		if (hours > maxHoursParked)
		{
			fee = maxFee;
		}
		
		if (hours < minHoursParked)
		{
			fee = minFee;
		}
		if (hours > minHoursParked && hours < maxHoursParked)
		{
			fee = hourIncrementalFee * (Math.ceil(hours) - minHoursParked) + minFee;
			// Math.Ceil is a method used for rounding
			// Any number is rounded, so Math.Ceil(5.61) = 6.0 or Math.Ceil(-23.33) = -23.00	
		}
		return fee;
	}	
}
