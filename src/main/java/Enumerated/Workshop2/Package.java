package Enumerated.Workshop2;

public class Package {
  private String description;
  private int packageNumber;
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
  public PackageStatus changeStatus(PackageStatus packageStatus){
    return this.packageStatus=packageStatus;
  }
}
