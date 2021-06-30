package Abstract_class.Workshop1_Abs_Shape;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    // Konstruktor domyślny
    public TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
    // Konstruktor ze wszystkimi parametrami i bez założeń
    public TwoDShape(double w, double h, String n) {
        this.width = w;
        this.height = h;
        this.name = n;
    }
    // Konstruktor z dwoma parametrami i z założeniem, że wysokośc = szerokość
    public TwoDShape(double x, String n) {
        this.height = width = x;
        this.name = n;
    }
    //Konstruktor tworzący obiekt na podstawie innego obiektu
    public TwoDShape(TwoDShape ob) {
        width=ob.width;
        height=ob.height;
        name =ob.name;
    }
    //Settery i Gettery
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    void showDim(){
        System.out.println("Szerokość i wysokość: " + width + " i " + height);
    }
    //Metoda abstrakcyjna
    abstract double area();
}
