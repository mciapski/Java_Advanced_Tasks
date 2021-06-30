package Enumerated.Workshop1;

public enum OperationStatus {
  NOT_STARTED("Operation not started yet"),
  STARTED("Operation started"),
  FINISHED("Operation finished"),
  FAILED("Operation failed");

  private String message;

  OperationStatus(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
