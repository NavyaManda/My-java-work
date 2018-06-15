package cernerPractice;

class Vehicle{
	void run(){
	System.out.println("vehicle is running");
	}
}

class Bike extends Vehicle {
 void run(){
	 System.out.println("bike is running");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle obj= new Vehicle();
  obj.run();
	}

}
