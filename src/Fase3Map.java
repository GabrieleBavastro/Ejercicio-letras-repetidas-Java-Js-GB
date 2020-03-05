import java.util.HashMap;
public class Fase3Map {
  public static void main(String[] args) {
	  HashMap<Character, Integer> fullNameChar = new HashMap<Character, Integer>();
	  String fullName = new String("BAVASTRO GABRIELE NAVONE");
	  char letterA = 'A';
	  char letterB = 'B';
	  char letterC = 'C';
	  char letterD = 'D';
	  char letterE = 'E';
	  char letterF = 'F';
	  char letterG = 'G';
	  char letterH = 'H';
	  char letterI = 'I';
	  char letterJ = 'J';
	  char letterK = 'K';
	  char letterL = 'L';
	  char letterM = 'M';
	  char letterN = 'N';
	  char letterO = 'O';
	  char letterP = 'P';
	  char letterQ = 'Q';
	  char letterR = 'R';
	  char letterS = 'S';
	  char letterT = 'T';
	  char letterU = 'U';
	  char letterV = 'V';
	  char letterW = 'W';
	  char letterX = 'X';
	  char letterY = 'Y';
	  char letterZ = 'Z';
	  int countA = 0;
	  int countB = 0;
	  int countC = 0;
	  int countD = 0;
	  int countE = 0;
	  int countF = 0;
	  int countG = 0;
	  int countH = 0;
	  int countI = 0;
	  int countJ = 0;
	  int countK = 0;
	  int countL = 0;
	  int countM = 0;
	  int countN = 0;
	  int countO = 0;
	  int countP = 0;
	  int countQ = 0;
	  int countR = 0;
	  int countS = 0;
	  int countT = 0;
	  int countU = 0;
	  int countV = 0;
	  int countW = 0;
	  int countX = 0;
	  int countY = 0;
	  int countZ = 0;
	  for (int i = 0; i < fullName.length(); i++) {
		    if (fullName.charAt(i) == letterA) {countA++;}
		    else if (fullName.charAt(i) == letterB) {countB++;}
		    else if (fullName.charAt(i) == letterC) {countC++;}
		    else if (fullName.charAt(i) == letterD) {countD++;}
		    else if (fullName.charAt(i) == letterE) {countE++;}
		    else if (fullName.charAt(i) == letterF) {countF++;}
		    else if (fullName.charAt(i) == letterG) {countG++;}
		    else if (fullName.charAt(i) == letterH) {countH++;}
		    else if (fullName.charAt(i) == letterI) {countI++;}
		    else if (fullName.charAt(i) == letterJ) {countJ++;}
		    else if (fullName.charAt(i) == letterK) {countK++;}
		    else if (fullName.charAt(i) == letterL) {countL++;}
		    else if (fullName.charAt(i) == letterM) {countM++;}
		    else if (fullName.charAt(i) == letterN) {countN++;}
		    else if (fullName.charAt(i) == letterO) {countO++;}
		    else if (fullName.charAt(i) == letterP) {countP++;}
		    else if (fullName.charAt(i) == letterQ) {countQ++;}
		    else if (fullName.charAt(i) == letterR) {countR++;}
		    else if (fullName.charAt(i) == letterS) {countS++;}
		    else if (fullName.charAt(i) == letterT) {countT++;}
		    else if (fullName.charAt(i) == letterU) {countU++;}
		    else if (fullName.charAt(i) == letterV) {countV++;}
		    else if (fullName.charAt(i) == letterW) {countW++;}
		    else if (fullName.charAt(i) == letterX) {countX++;}
		    else if (fullName.charAt(i) == letterY) {countY++;}
		    else if (fullName.charAt(i) == letterZ) {countZ++;}		    
	  }
	  		fullNameChar.put(letterA, countA);
	  		fullNameChar.put(letterB, countB);
	  		fullNameChar.put(letterC, countC);
	  		fullNameChar.put(letterD, countD);
	  		fullNameChar.put(letterE, countE);
	  		fullNameChar.put(letterF, countF);
	  		fullNameChar.put(letterG, countG);
	  		fullNameChar.put(letterH, countH);
	  		fullNameChar.put(letterI, countI);
	  		fullNameChar.put(letterJ, countJ);
	  		fullNameChar.put(letterK, countK);
	  		fullNameChar.put(letterL, countL);
	  		fullNameChar.put(letterM, countM);
	  		fullNameChar.put(letterN, countN);
	  		fullNameChar.put(letterO, countO);
	  		fullNameChar.put(letterP, countP);
	  		fullNameChar.put(letterQ, countQ);
	  		fullNameChar.put(letterR, countR);
	  		fullNameChar.put(letterS, countS);
	  		fullNameChar.put(letterT, countT);
	  		fullNameChar.put(letterU, countU);
	  		fullNameChar.put(letterV, countV);
	  		fullNameChar.put(letterW, countW);
	  		fullNameChar.put(letterX, countX);
	  		fullNameChar.put(letterY, countY);
	  		fullNameChar.put(letterZ, countZ);
	  		System.out.println("Your name contain the following number of letters:");
	  		System.out.println(fullNameChar);}
    	}