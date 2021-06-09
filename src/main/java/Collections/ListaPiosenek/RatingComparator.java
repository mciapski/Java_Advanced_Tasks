package Collections.ListaPiosenek;

import java.util.Comparator;

public class RatingComparator implements Comparator<Piosenka> {
    @Override
    public int compare(Piosenka piosenka1, Piosenka piosenka2) {
        return piosenka1.getOcena().compareTo(piosenka2.getOcena());
    }
}