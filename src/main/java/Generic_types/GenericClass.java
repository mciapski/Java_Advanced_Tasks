package Generic_types;

public class GenericClass <T>{

    private T genericArea;

    public GenericClass() {
    }

    public GenericClass(T genericArea) {
        this.genericArea = genericArea;
    }

    public T getGenericArea() {
        return genericArea;
    }

    public void setGenericArea(T genericArea) {
        this.genericArea = genericArea;
    }

//Wyswietlanie typu
    public void nameOfGenericType(){
        System.out.println(" T is: " + genericArea.getClass().getName());
    }
}
