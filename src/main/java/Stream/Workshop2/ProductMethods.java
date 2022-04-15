package Stream.Workshop2;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMethods {

  public List<Product> filterMethod(List<Product> listOfProducts) {
    List<Product> filteredListOfProducts = listOfProducts.stream()
        .filter(x -> x.getType().equalsIgnoreCase("Book"))
        .filter(x -> x.getPrice() < 50).collect(Collectors.toList());
    return filteredListOfProducts;
  }

  public boolean anyMatchMethod(List<Product> listOfProducts) {
    boolean anyMatch;
    anyMatch = listOfProducts.stream()
        .anyMatch(x -> x.getType().equalsIgnoreCase("Shoes"));
    return anyMatch;
  }

  public List<Double> discountPerType(List<Product> listOfProducts) {
    List<Double> discountPerTypeList = listOfProducts.stream()
        .filter(x -> x.getType().equalsIgnoreCase("Book"))
        .map(x -> x.getPrice())
        .collect(Collectors.toList());
    return discountPerTypeList;
  }

  public List<String> flatMapMethods(List<Product> listOfProducts) {

    List<String> listOfNames = listOfProducts.stream()
        .map(x -> x.getName())
        .collect(Collectors.toList());

    List<String> listOfTypes = listOfProducts.stream()
        .map(x -> x.getType())
        .collect(Collectors.toList());

    List<List<String>> summaryList = List.of(listOfNames, listOfTypes);

    return summaryList.stream().flatMap(List::stream).collect(Collectors.toList());
  }
}
