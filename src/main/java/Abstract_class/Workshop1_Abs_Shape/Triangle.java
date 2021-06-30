package Abstract_class.Workshop1_Abs_Shape;

public class Triangle extends TwoDShape {
    private String style;

    // Konstruktor domyślny
    public Triangle() {
        super();
        style = "nieokreślony";
    }

    // Konstruktor ze wszystkimi parametrami i bez założeń
    public Triangle(double w, double h, String style) {
        super(w, h, "Trójkąt");
       this.style=style;
    }

    // Konstruktor z jednym i z założeniem, że wysokośc = szerokość
    public Triangle(double x) {
        super(x, "Trójkąt");
        this.style="Wypełniony";
    }
    // Tworzy obiekt na podstawie innego obiektu
    public Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    @Override
    double area() {
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Trójkąt jest: " + style);
    }
}
