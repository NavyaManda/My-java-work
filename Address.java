 package cernerPractice;

public class Address
{
	String addressLine1;
	String addressLine2;
	String city;
	int zipCode;
	
	public enum addressType{
		BUSINESS,
		RESIDENCE, 
		OTHER;
	}
	public addressType ADD;
	public Address(String addressLine1, String addressLine2, String city, int zipCode, addressType ADD)
	{
	    this. addressLine1=addressLine1;
	    this.addressLine2=addressLine2;
	    this.city= city;
	    this.zipCode=zipCode;
	    this.ADD=ADD;
	}
	public void setAddressType(addressType ADD)
	{
		this.ADD=ADD;
	}
	
	
	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1=addressLine1;
		
	}
	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2=addressLine2;
	}
	
	public void setCity( String city)
	{
		this.city=city;
	}
	public void setZipCode(int zipCode)
	{
		this.zipCode=zipCode;
	}
	public String getAddressLine1()
	{
		return addressLine1;
	}
	public String getAddressLine2()
	{
		return addressLine2;
	}
	public String getCity()
	{
		return city;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	public addressType getAddressType()
	{
		return ADD;
	}

}
