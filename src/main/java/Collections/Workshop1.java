package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Workshop1 {
    public static void main(String[] args) {
        List<String> listaUtworow = new ArrayList<>();

        listaUtworow.add("Nothing else matters");
        listaUtworow.add("Unforvigen");
        listaUtworow.add("Unforvigen2");
        listaUtworow.add("Unforvigen3");
        listaUtworow.add("Astra");

        System.out.println(listaUtworow.get(0));
        Collections.sort(listaUtworow);
        System.out.println(listaUtworow);
        System.out.println(listaUtworow.get(0));
//        for (String list:listaUtworow) {
//            if(listaUtworow.get(0) == "Astra"){
//                System.out.println("Astra");
//            }
//        }
    }
}
