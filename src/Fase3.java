
public class Fase3 {
  public static void main(String[] args) {

	  String fullName = new String("Gabriele Bavastro Navone");
	  fullName = fullName.toUpperCase();
	
	  // Create an array of size 256 ASCII_SIZE
      int count[] = new int[256];
      int length = fullName.length();

      // Initialize count array index
      for (int i = 0; i < length; i++)
          count[fullName.charAt(i)]++;

      // Create an array of given String size
      char chars[] = new char[fullName.length()];
      for (int i = 0; i < length; i++) {
          chars[i] = fullName.charAt(i);
          int find = 0;
          for (int j = 0; j <= i; j++) {

      // If any matches found
              if (fullName.charAt(i) == chars[j])
                  find++;
          }

       if (find == 1) {
    	   System.out.println("Occurrence of " + fullName.charAt(i) 
             + " is:" + count[fullName.charAt(i)]);

          	}
      }
  }
}


