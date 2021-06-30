package Generic_types.Workshop1;

public class Comics extends Book implements Thing{
    double weight;
    String information;

    public Comics(double weight, String information) {
        super(weight,information);
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
}
