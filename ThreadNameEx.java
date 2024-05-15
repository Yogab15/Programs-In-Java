package forGit;
 
class MyThread extends Thread   //  MyThread class extending Thread
{
    @Override
    public void run()      // Override >---> run method inherited from Thread
    {
        System.out.println("Nik - This is my task!!!");
    }
}


class MyThread2 extends Thread      //  another MyThread2 class extending Thread
{
    @Override
    public void run()     // Override >---> run method inherited from Thread
    {
        System.out.println("This is my task!!!");
    }
}


public class ThreadNameEx     // Main class containing  main method and also a Thread
{

    
    public static void main(String[] args)        // Main method >---> entry point of the program
    {

    	 // Thread th creation 
    	
        MyThread th = new MyThread();        // Create an instance of MyThread
        th.start();           // Start the thread
        th.setName("Nik");                // Set thread name
        th.setPriority(1);     // Set thread priority
        String name = th.getName();        // Get thread name
        System.out.println(th.getId()); // Print thread ID
        System.out.println(th.getPriority()); // Print thread priority
        System.out.println(name); // Print thread name

        // Thread th1 creation 
        
        MyThread2 th1 = new MyThread2();    // Create an instance of MyThread2
        th1.setName("ROHIT"); // Set thread name
        System.out.println(th1.getName()); // Print thread name
        System.out.println(th1.getId()); // Print thread ID
        th1.start(); // Start the thread
    }
}
