package Generic_types.Generic_Interfaces;

public class InformationIMPL<T extends Number, K extends String> implements InformationINT<T,K>{

    private T ID;
    private K secondName;

    public InformationIMPL(T ID, K secondName) {
        this.ID = ID;
        this.secondName = secondName;
    }



    @Override
    public T getID() {
        return ID;
    }

    @Override
    public K getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "InformationIMPL{" +
                "ID=" + ID +
                ", secondName=" + secondName +
                '}';
    }
}
