package Collections.ListaPiosenek;

import Exceptions.FileNotExistException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class ListaMetody implements ListaInt {
    //List<String> listaPiosenek=new ArrayList<>();
    ArrayList<Piosenka> listaPiosenek = new ArrayList<>();

    @Override
    public void sortByArtist() {
        ArtistComparator komparator = new ArtistComparator();
        pobierzPiosenki();
        System.out.println(listaPiosenek);
        Collections.sort(listaPiosenek,komparator);
        System.out.println(listaPiosenek);
    }

    @Override
    public void sortBySong() {
        pobierzPiosenki();
        System.out.println(listaPiosenek);
        Collections.sort(listaPiosenek);
        System.out.println(listaPiosenek);
    }

    @Override
    public void sortByRating() {
        RatingComparator ratingComparator = new RatingComparator();
        pobierzPiosenki();
        Collections.sort(listaPiosenek,ratingComparator);
        System.out.println(listaPiosenek);
    }

    @Override
    public void pobierzPiosenki() {
        try {
            File plik = new File("C:\\Users\\mciap\\OneDrive\\Pulpit\\Java Zaawansowana\\PodsumowanieJavZaaw\\text.txt");
            BufferedReader reader = new BufferedReader(new FileReader(plik));
            String wiersz=null;
            while((wiersz= reader.readLine()) != null){
                dodajPiosenke(wiersz);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dodajPiosenke(String wierszDoAnalizy) {
        String[] elementy = wierszDoAnalizy.split("/");
        Piosenka nastepnaPiosenka = new Piosenka(elementy[0],elementy[1], elementy[2], elementy[3]);
        listaPiosenek.add(nastepnaPiosenka);
    }



}
