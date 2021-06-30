package Abstract_class.Workshop1_Abs_Shape;

public class Rectangle extends TwoDShape {

    // Konstruktor domyślny
    public Rectangle() {
        super();
    }

    // Konstruktor ze wszystkimi parametrami i bez założeń
    public Rectangle(double w, double h) {
        super(w, h, "Prostokąt");
    }

    // Konstruktor z jednym i z założeniem, że wysokośc = szerokość
    public Rectangle(double x) {
        super(x, "Prostokąt");
    }

    //Konstruktor tworzący obiekt na podstawie innego obiektu
    public Rectangle(Rectangle ob) {
        super(ob);
    }

    //Metoda sprawdzająca warunek na kwadrat
    boolean isSquare(){
        if(getHeight()==getWidth()) return true;
        return false;
    }

    @Override
    double area() {
        return getHeight()*getWidth();
    }


}
