package Generic_types.Workshop1;

public class Book implements Thing{
    double weight;
    String information;

    public Book(double weight, String information) {
        this.weight = weight;
        this.information = information;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getInformation() {
        return this.information;
    }

    @Override
    public String toString() {
        return "Book{" +
                "weight=" + weight +
                ", information='" + information  +
                '}'+ "\n";
    }
}
