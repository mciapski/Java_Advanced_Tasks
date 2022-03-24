package Inheritance;

public class InheritanceExampleParent {
  private String name;
  private String surname;

  public InheritanceExampleParent(String name, String surname){
    this.name=name;
    this.surname=surname;
  }

  public void showMeYourID(){
    System.out.println(name+", "+surname+", ");
  }
}
