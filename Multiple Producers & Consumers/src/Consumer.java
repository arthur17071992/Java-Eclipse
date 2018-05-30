// Fig. 23.11: Consumer.java
// Consumer with a run method that loops, reading 10 values from buffer.
import java.security.SecureRandom;

public class Consumer implements Runnable
{ 
   private static final SecureRandom generator = new SecureRandom();
   private final Buffer sharedLocation; // reference to shared object
   public String name;
   public int sleepTime;
   public int startProducing;
   public int stopProducing;

   // constructor
   public Consumer(Buffer sharedLocation, String name, 
		   int sleepTime, int startProducing, int stopProducing)
   {
      this.sharedLocation = sharedLocation;
      this.name = name;
      this.sleepTime = sleepTime;
      this.startProducing = startProducing;
      this.stopProducing = stopProducing;
   }

   // read sharedLocation's value 10 times and sum the values
   public void run()                                           
   {
      int sum = 0;

      for (startProducing = 1; startProducing <= stopProducing; startProducing++) 
      {
         // sleep 0 to 3 seconds, read value from buffer and add to sum
         try 
         {
            Thread.sleep(generator.nextInt(sleepTime*1000));
            sum += sharedLocation.blockingGet(name);
         } 
         catch (InterruptedException exception) 
         {
            Thread.currentThread().interrupt(); 
         } 
      } 

      System.out.printf("%n%s %d%n%s%n", 
         "Consumer C1 read values totaling", sum, "Terminating Consumer C1");
   } 
} // end class Consumer


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/