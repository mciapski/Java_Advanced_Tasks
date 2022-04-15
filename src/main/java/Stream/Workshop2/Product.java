package Stream.Workshop2;

import java.time.LocalDate;

public class Product {
  private String type;
  private String name;
  private Double price;
  private LocalDate dateOfRelease;

  public Product(String type, String name, Double price, LocalDate dateOfRelease) {
    this.type = type;
    this.name = name;
    this.price = price;
    this.dateOfRelease = dateOfRelease;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public LocalDate getDateOfRelease() {
    return dateOfRelease;
  }
}
