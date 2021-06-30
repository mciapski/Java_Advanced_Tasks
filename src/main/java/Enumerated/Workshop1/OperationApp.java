package Enumerated.Workshop1;

public class OperationApp {
  public static void main(String[] args) {
    OperationStatus operationStatus = OperationStatus.STARTED;
    printToUser(operationStatus);

  }

 public static void printToUser(OperationStatus operationStatus){
    switch (operationStatus){
      case NOT_STARTED -> System.out.println(operationStatus.getMessage());
      case STARTED -> System.out.println(operationStatus.getMessage());
      case FAILED -> System.out.println(operationStatus.getMessage());
      case FINISHED -> System.out.println(operationStatus.getMessage());
      default -> System.out.println("Operation not initiated");
    }
 }


}
