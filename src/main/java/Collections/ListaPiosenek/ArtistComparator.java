package Collections.ListaPiosenek;

import java.util.Comparator;

public class ArtistComparator implements Comparator<Piosenka> {
    @Override
    public int compare(Piosenka piosenka1, Piosenka piosenka2) {
        return piosenka1.getArtysta().compareTo(piosenka2.getArtysta());
    }
}
