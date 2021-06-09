package Exceptions;

public class ExceptionApp2 {
    public static void main(String[] args) {
        try{
            System.out.println(divide(10,0));
        }catch (ArithmeticException e){
            System.out.println("Nie dzielimy przez 0");
        }

    }
    private static int divide (int a, int b) throws ArithmeticException{  // "rzucanie" nie jest wymagane w przypadku użycia try, catch
       return a/b;

    }
}
