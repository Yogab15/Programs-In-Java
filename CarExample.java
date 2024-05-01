package MyGit;
 

//INHERITANCE Example
//IS-A relationship
//eg. car IS A Vehicle

class Vehicle1
{
	String brand="Land Rover";  // vehicle Attribute
	
	public void horn() // Vehicle Method
	{
		System.out.println("Beep Beep ......");
	}
}


public class CarExample extends Vehicle1 {

	String modelName="Range Rover";  // Car attribute
	
	public static void main(String[] args) {

		CarExample  myCar = new CarExample(); // Create myCar object name
				
		myCar.horn();  // calling horn method  from Vehicle class
		
		// For display records
		
		System.out.println(myCar.brand+" "+myCar.modelName);
	}

}
