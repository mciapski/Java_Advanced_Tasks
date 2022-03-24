package Inheritance;

public class InheritanceExampleChild extends InheritanceExampleParent{
  private String idNumber;

  public InheritanceExampleChild(String name, String surname, String idNumber) {
    super(name, surname);
    this.idNumber=idNumber;
  }

  @Override
  public void showMeYourID(){
    super.showMeYourID();
    System.out.println(idNumber);
  }
}
