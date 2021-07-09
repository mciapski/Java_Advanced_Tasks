package Enumerated.Workshop2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Package {
  private String description;
  private int packageNumber;
  private String status;
  PackageStatus packageStatus = PackageStatus.SENT;

  public Package(String description, int packageNumber) {
    this.description = description;
    this.packageNumber = packageNumber;
  }

  public String getDescription() {
    return description;
  }

  public int getPackageNumber() {
    return packageNumber;
  }

  public PackageStatus changeStatusByUser() {

    System.out.println("Zmień status paczki na: ");
    Scanner scanner = new Scanner(System.in);
    status = scanner.nextLine();
    List<PackageStatus> listOfStatuses = Arrays.asList(PackageStatus.values());

    if (listOfStatuses.contains(PackageStatus.valueOf(status)) &&
        packageStatus.getNextStatuses().contains(PackageStatus.valueOf(status))) {
      return packageStatus = PackageStatus.valueOf(status);
    } else {
      throw new IllegalArgumentException("Incorrect value");
    }
  }
}