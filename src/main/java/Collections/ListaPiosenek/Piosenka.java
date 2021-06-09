package Collections.ListaPiosenek;

public class Piosenka implements Comparable<Piosenka> {
    String tytul;
    String artysta;
    String ocena;
    String bpm;

    public Piosenka(String tytul, String artysta, String ocena, String bpm) {
        this.tytul = tytul;
        this.artysta = artysta;
        this.ocena = ocena;
        this.bpm = bpm;
    }

    public String getTytul() {
        return tytul;
    }

    public String getArtysta() {
        return artysta;
    }

    public String getOcena() {
        return ocena;
    }

    public String getBpm() {
        return bpm;
    }



    @Override
    public String toString() {
        return "Piosenka{\n" +
                "  tytul='" + tytul + '\'' +
                ", artysta='" + artysta + '\'' +
                ", ocena='" + ocena + '\'' +
                ", bpm='" + bpm + '\'' +
                '}';
    }

    @Override
    public int compareTo(Piosenka o) {
        return tytul.compareTo(o.getTytul());
    }
}
