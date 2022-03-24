import java.time.LocalDate;
import java.time.LocalTime;

public class DoUsuniecia {
  static void performAddition(String input){
    try{
      String[] parts = input.split(" ");
      int numA = Integer.parseInt(parts[0]);
      int numB = Integer.parseInt(parts[1]);
      System.out.println(numA+numB);
    }catch (NullPointerException exp){
      System.out.println("e1");
    }catch (ArrayIndexOutOfBoundsException exp){
      System.out.println("e2");
    }
  }
  public static void main(String[] args) {
   performAddition("1 2 3");
   performAddition("1");
   performAddition(null);
  }
}
