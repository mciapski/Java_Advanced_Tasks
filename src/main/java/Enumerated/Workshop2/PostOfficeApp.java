package Enumerated.Workshop2;

import java.util.Arrays;
import java.util.Scanner;
/*
1. Create enumerated type PackageStatus with statuses of package:
- SENT
- TRAVELLING
- COURIER
- DELIVERED
- LOST
- RETURNED
2. Create class Package including:
 - number of package,
 - description,
 - status wit default value as SENT.
3. In class Package define method which change status from default to another.
4. To each enum add description for example SENT("Package is sent")
5. In class PostOfficeApp include main and then define method to show all available statuses
6. In class Package add method which takes value of status from user.
   The same method has to recognise if status provided by user exist in PackageStatus.
   If not then should be thrown an exception.
7. For each enum in PackageStatus override new method getNextStatuses() which gives you possibility to change status.
   For example from SENT you can go to the DELIVERED or TRAVELLING.
   In some cases take care to return empty list, it means without possibilities of changes statuses.
8. Modify method responsible for changing status.
   Add additional condition to check if from one status you have access to another. Use in this case getNextStatuses().
 */
public class PostOfficeApp {
  public static void main(String[] args) {

    Package packageOne = new Package("Toys",1234);

    System.out.println("Current status is: " + packageOne.packageStatus);
    try {
      packageOne.changeStatusByUser();
    }catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Status after change made by user");
    System.out.println(packageOne.packageStatus);
    System.out.println("Showing all available statuses");
    showAllStatuses();
    System.out.println("Getting status from overrided method: " + packageOne.packageStatus);
    System.out.println(packageOne.packageStatus.getNextStatuses().get(0));
    System.out.println(packageOne.packageStatus.getNextStatuses().get(1));
  }
  public static void showAllStatuses(){
    PackageStatus[] allStatuses = PackageStatus.values();
    for (PackageStatus p: allStatuses) {
      System.out.println(p);
    }
  }

}
