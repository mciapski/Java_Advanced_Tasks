package Collections.List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PalindromApp {

  public static void main(String[] args) {
    palindromCheck("OLO");

  }

  public static void palindromCheck(String wordInput) {
    char[] charactersFromWordInput = wordInput.toCharArray();
    char[] reversed = new char[charactersFromWordInput.length];
    int counterDown=0;

    for (int i=0 ; i<charactersFromWordInput.length;i++){
      counterDown=charactersFromWordInput.length-i-1;
      reversed[i]=charactersFromWordInput[counterDown];
    }
    String reversedWord = String.valueOf(reversed);
    boolean comparewordAndReverseWord = wordInput.equalsIgnoreCase(reversedWord);
    System.out.println(comparewordAndReverseWord);


  }

}
