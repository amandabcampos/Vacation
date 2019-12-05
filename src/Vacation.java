import java.util.Scanner;

public class Vacation {
	
   public static void main(String[] args) {
		
      Scanner scnr = new Scanner(System.in);
		
      String vacationType;
      int groupSize;
      String result;
      String destination;
      String travelSuggestion;
      boolean isAnInt;
      
      String pronoum = "a";
		
      System.out.print("What kind of trip would you like to go on, musical, tropical, or adventurous? ");
      vacationType = scnr.nextLine();
      
      vacationType = vacationType.toLowerCase();
		
      System.out.print("How many are in your group? ");
      isAnInt = scnr.hasNextInt();

      if (isAnInt) {
         groupSize = scnr.nextInt();
         if (((vacationType.equals("musical")) || (vacationType.equals("tropical")) || (vacationType.equals("adventurous"))) &&
				   (groupSize >=1)) {
            switch(vacationType) {
               case "musical": 
                  destination = "New Orleans"; 
                  break; 
               case "tropical":
                  destination = "a beach vacation in Mexico";
                  break;
               default:
                  destination = "whitewater raft the Grand Canyon";
                  pronoum = "an";
                  break;		
            }
            if (groupSize <= 2){ 
               travelSuggestion = "first class";
            }
            else if (groupSize <= 5) {
               travelSuggestion = "helicopter";
            }
            else {
               travelSuggestion = "charter flight";
            }
         result = "Since you're a group of " + groupSize + " going on " + pronoum + " " + vacationType + 
    		     " vacation, you\nshould take a " + travelSuggestion + " to " + destination + ".";
         System.out.println(result);
            } 
            else {
               System.out.println("Invalid entry");
            }   
      } else {
	   System.out.println("Invalid entry");  
      }
      scnr.close();
   }
}