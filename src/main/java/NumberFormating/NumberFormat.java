package NumberFormating;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class NumberFormat {
  public static void main(String[] args) {

    Long numberTest = 2000000L;
    System.out.println(numberTest);
    DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
    symbols.setGroupingSeparator('.');
    DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);

    System.out.println(formatter.format(numberTest));
    

  }
}
