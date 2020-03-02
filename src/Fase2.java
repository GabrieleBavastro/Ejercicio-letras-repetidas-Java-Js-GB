public class Fase2 {
	  public static void main(String[] args) {
			String vowels = "Vowel.";
			String consonants = "Consonant.";
			String numbers = "People names do not contain numbers.";
			String space = "Empty space.";
			String fullName = new String("BAVASTRO GABRIELE NAVONE 1984");
		    char[] fullNameArray = fullName.toCharArray();
		    for (Character i : fullNameArray) { 
			if (i == 'A'|| i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'Y') System.out.println(vowels);
			else if (i == '1' || i == '2'|| i == '3' || i == '4' ||
			i == '5' || i == '6' || i == '7' || i == '8' || i == '9' || i == '0') System.out.println(numbers);
			else if (i == ' ') System.out.println(space); 
			else System.out.println(consonants);
		    }
		  }
		}