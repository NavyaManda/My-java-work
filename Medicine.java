package cernerPractice;
import java.util.List;
//import java.util.*;
import cernerPractice.Symptoms;

class Medicine
{
	int uniqueId;
	int minAgeLimit;
	int maxAgeLimit;
	List <Symptoms> applicableSymptoms;
	
	public Medicine(int uniqueId, int minAgeLimit, int maxAgeLimit, List<Symptoms> applicableSymptoms)
	{
		this.uniqueId=uniqueId;
		this.minAgeLimit=minAgeLimit;
		this.maxAgeLimit=maxAgeLimit;
		this.applicableSymptoms=applicableSymptoms;
	}
	
	
	public int getMinAgeLimit()
	{
		return minAgeLimit;
	}
	public int getMaxAgeLimit()
	{
		return maxAgeLimit;
	}
	public List<Symptoms> getApplicableSymptopms()
	{
		return applicableSymptoms;
	}
	
	
	
	
	public void setMinAgeLimit(int minAgeLimit)
	{
		this.minAgeLimit=minAgeLimit;
	}
	
	public void setMaxAgeLimit(int maxAgeLimit)
	{
		this.maxAgeLimit=maxAgeLimit;
	}
	
public static void main(String args[])
{
	Medicine obj= new Medicine(1, 12, 30, symptoms.applicableSymptoms.FEVER);
}
	
}