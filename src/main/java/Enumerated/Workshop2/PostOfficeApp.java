package Enumerated.Workshop2;

public class PostOfficeApp {
  public static void main(String[] args) {
    Package packageOne = new Package("Zabawki",1234);

    System.out.println(packageOne.packageStatus);
    packageOne.changeStatus(PackageStatus.DELIVERED);
    System.out.println(packageOne.packageStatus);
  }
}
