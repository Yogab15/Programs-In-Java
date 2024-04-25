package MyGit;

public class AbstractDemo 
{ 
	// It is not compulsory that abstract class must have abstract methods. 
	// It may or may not have abstract methods. 
	// But the class which has at least one abstract method must be declared as abstract.
	// Abstract Class can be a combination of concrete and abstract methods.
	// Any class extending an abstract class must implement all abstract methods. 
	// If it does not implement, it must be declared as abstract.
	// Abstract method can not be private or Static.
	//Constructor & Field cannot be declare as abstract. 
 
	  
		    // Inner abstract class
	static abstract class Animal   
		    {
		        int i;
		        
		        public Animal() //constructor create
		        {
		             
		        }
		        
		        abstract void soundAnimal(); // Abstract method
		        
		        void display()   // Concrete method
		        {
		            
		        }
		        
		        void Yoga()
		        {
		            
		        }
		    } 

		    static class Dog extends Animal
		    {
		        @Override
		        void soundAnimal() {
		            System.out.println("Bho-Bhoo..");
		        }

		        void ABC() {
		            
		        }
		    }

		    static class Cat extends Animal
		    {
		        @Override
		        void soundAnimal() {
		            System.out.println("Mewww.. ");
		        }

		        void ABC() {
		            
		        }
		    }

		    public static class AbstractDemo1
		    {
		        public static void main(String[] args) {
		            Dog d1 = new Dog(); // Now this should work fine
		            Animal a1 = d1;  // reference variable 
		        }
		    }
}
	 