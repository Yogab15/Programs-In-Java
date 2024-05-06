package forGit;

public class LampEx {


		  boolean isOn;

		  
		  void turnOn() {   // First method define for the turn on light
		    isOn = true;
		    System.out.println("Light ON? " + isOn);

		  }
		  
		  void turnOff()    // Second method define for the turn on light
		  {
			  isOn=false;
			  System.out.println("Light ON? " + isOn);
		  }
		  public static void main(String[] args) {
		    
			  
		    LampEx led1 = new LampEx();   // create object for Lamp

		    
		    led1.turnOn(); // Call a First function
		    
		    
		    LampEx led2 = new LampEx();
		    
		    led2.turnOff(); // call a second function
		    
		    
		  }
		}

	
