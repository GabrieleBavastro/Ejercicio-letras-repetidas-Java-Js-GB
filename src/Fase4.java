import java.util.ArrayList;
public class Fase4 {
  public static void main(String[] args) {
	
	  String firstName = "GABRIELE";
	  String surname = "BAVASTRO NAVONE";
	  String emptySpace = " "; 
            
      ArrayList<Character> fullNameArray = new ArrayList<Character>();
      for (char c : firstName.toCharArray()) {
    	  fullNameArray.add(c);
    	  }
      for (char c : emptySpace.toCharArray()) {
    	  fullNameArray.add(c);
    	  }
      for (char c : surname.toCharArray()) {
    	  fullNameArray.add(c);
    	  }
     
      System.out.println("Your full name is: " + fullNameArray); 
  }
}