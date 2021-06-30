package Generic_types.Generic_Interfaces;

import java.util.ArrayList;

/*
1. Create parametric interface with methods: getID and getSecondName,
2. In implementation class create parametric fields: ID, secondName,
3. Create first object with ID as String and secondName as String,
4. Create second object with ID as Integer and secondName as Char,
5. Print these objects,
6. Restrict generic parameters to Number class and String class and look at the result,
7. Create object with correct type of values.
8. Create additional class inherit after Information IMPL and create class inherit after previous one,
8. Create ArrayList and restrict her generic parameters to classes above from bottom and from top by using WILDCARD
*/
public class InformationAPP {
    public static void main(String[] args) {

        //InformationIMPL personFirst = new InformationIMPL("123456","Kowalski");

        //InformationINT personSecond =new InformationIMPL(1234567,'K');

        InformationINT personThird = new InformationIMPL(12345, "Kowalski");

        ArrayList<? extends BottomBoundaryClass> listWithBottomRestriction = new ArrayList<>();
        ArrayList<? super TopBoundaryClass> listWithTopRestriction = new ArrayList<>();

        //System.out.println(personFirst);
        //System.out.println(personSecond);
        System.out.println(personThird);

    }
}
