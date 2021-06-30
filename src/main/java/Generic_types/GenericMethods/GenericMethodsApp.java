package Generic_types.GenericMethods;
/*
1. Create two tables: Integer and String,
2. Create just one method to present values of each table,
3. Create method to show what kind of elements each table contains.
*/
public class GenericMethodsApp {
    public static void main(String[] args) {

        Integer[] countTable = {1,2,3,4,5,6};
        String[] wordsTable = {"One","Two","Three","Four","Five","Six"};

        showMeValues(countTable);
        showMeValues(wordsTable);
        showMeType(countTable[0]);
        showMeType(wordsTable[0]);
    }
    public static <T> void showMeValues(T[] table ){
        for (T element: table) {
            System.out.print(element);
        }
        System.out.println();
    }
    public static <T> void showMeType(T o){
        System.out.println("Type of table is: " + o.getClass().getName());
    }
}
