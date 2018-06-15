
package cernerPractice;

import java.util.ArrayList;

import cernerPractice.Temperature.Location;
import cernerPractice.Temperature.units;

/*public class Temperature {

	 private float temp;
	 public enum units
	 {
		 CELSIUS,
		 KELVIN,
		 FARANHEIT;
		 
	 }
	 private units unitType;
	 public enum Location
	 {
		 ARMPIT,
		 MOUTH,
		 EAR;
		 
	 }
	 private Location location;
	 public units getUnitType()
	 {
		 return unitType;
	 }
	 public  void setunitType(units unitType)
	 {
		 this.unitType=unitType;
	 }
	 public Location getLocationType()
	 {
		 return location;
	 }
	 public void setLocationType(Location location)
	 {
		 this.location=location;
	 }
	 public Temperature(float temp, units unitType, Location location)
	 {
		 this.temp= temp;
		 this.unitType= unitType;
		 this.location= location;
		 System.out.println(temp);
		 
	 }
	 
	 public float getTempCelsius()
	 {
		 float result=0f;
		 if(getUnitType()== units.FARANHEIT)
		 {	 result= (temp-32f)*(5f/9f);
		 return(result);
		 
	 }
	 else if(getUnitType() == units.KELVIN)
	 {
		 result= (temp-273f);
		 return(result);
	 }
	 else
		 return temp;
	 
}
}*/

/* TemperatureTest
{
	public static void checkFever(Temperature ini_temp, Temperature first_record)
	{
		float currentTemp= ini_temp.getTempCelsius();
		float previousTemp= first_record.getTempCelsius();
		if((currentTemp-previousTemp)> 1f)
		{
			if(ini_temp.getLocationType()==first_record.getLocationType())
			{
				System.out.println("Might have fever temperature fluctuated");
				
			}
			
			else
			{
				if(currentTemp-previousTemp>2f)
				{
					System.out.println("Might have fever temperature fluctuated");
					
				}
				else
				{
					System.out.println("no fever");
				}
			}
		}
		else{
			
			System.out.println("no fever");
		}
		
	}*/
	

public class Controller{
	
	public static void main(String args[])
	{
		ArrayList <Temperature> TemperatureHistory= new ArrayList<Temperature>();
		Temperature ini_temp=new Temperature(98.12f, Temperature.units.FARANHEIT, Temperature.Location.ARMPIT);
		TemperatureHistory.add(ini_temp);
		Temperature first_Record=new Temperature(110.0f, Temperature.units.FARANHEIT, Temperature.Location.MOUTH);
		TemperatureHistory.add(first_Record);
		TemperatureTest.checkFever(ini_temp, first_Record);
		
	}
}
