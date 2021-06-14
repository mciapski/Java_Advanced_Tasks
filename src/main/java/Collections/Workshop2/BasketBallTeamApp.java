package Collections.Workshop2;

import java.math.BigDecimal;
import java.util.*;

/*
1. Stwórz paczkę com.sda.basketball.
2. Zaimplementuj klasę: Player
        Niech wydatek ma pola:
        firstName czyli imię typu 	String
        lastName czyli nazwisko klasy 	String
        height	czyli wzrost typu 	int
3. Zaimplementuj klasę drużyny koszykarskiej: BasketballTeam.
4. Drużyna powinna zawierać graczy w kolekcji Set.
5. Do serwisu dodaj metody:
            void addPlayer(Player player)
            Set<Player> getPlayers()
            String toString()
6.Sprawdź aktualną sytuację związaną z klasą BasketballTeam.
   Czy aktualnie kolekcja klasy Set pozwala na przechowywanie duplikatów czyli graczy o tych samych danych?
7. Zaimplementuj metody equals() oraz hashCode() w klasie Player.
   Niech obiekty Player o tych samych cechach zostaną uznane za tych samych graczy.
8. Dodaj nową klasę wyjątku:InvalidPlayerException.
   Wyjątek powinien zostać rzucony gdy dodawany gracz:
           Ma wzrost mniejszy od 100 lub większy od 220.
           Ma puste imię lub zawierające same znaki białe.
           Ma puste nazwisko lub zawierające same znaki białe.
9. Dodaj metodę przekształcającą zbiór Set na listę List w klasie BasketBallTeam
10.  Spraw aby klasa Player implementowała interfejs Comparable.
    Z implementacji metody porównującej użyj wzrostu.
11. Do klasy Team dodaj metodę zwracającą graczy posortowanych według wzrostu.
    Pamiętaj, by zwrócić z metody pojemnik, który trzyma kolejność elementów.
12. Dodaj do metody możliwość wyspecyfikowania kierunku sortowania.
13. Do obiektów klasy Player dodaj zmienną BigDecimal earnings przechowującą zarobki danego gracza.
14. Zaimplementuj nową klasę EarningsComparator
    implementującą interfejs Comparator<Player> porównującą graczy według zarobków.
15. Do klasy Team dodaj metody:
          Metoda zwracająca listę graczy posortowaną według zarobków.
          Metoda zwracająca najlepiej zarabiającego gracza w drużynie.
          Metoda zwracająca graczy posortowanych według imion alfabetyczne.
          Obiekt klasy Comparator<Player> służący do posortowania alfabetycznie postaraj się zaimplementować wewnątrz metody za pomocą
          klasy anonimowej, lambdy lub referencji do metody (dwie ostatnie metody zostały opisane dalej w tej prezentacji).




 */
public class BasketBallTeamApp {

    public static void main(String[] args) throws InvalidPlayerException {

        BasketBallTeam basketBallTeam = new BasketBallTeam();
        List<Player> listPlayers = new ArrayList<>();
        basketBallTeam.addPlayer(new Player("Michael", "Jordan", 200, new BigDecimal(15000)));
        basketBallTeam.addPlayer(new Player("Thomas", "Edison", 180, new BigDecimal(30000)));
        basketBallTeam.addPlayer(new Player("Nicolasssss", "Tesla", 160, new BigDecimal(40000)));
        basketBallTeam.addPlayer(new Player("Nicolasssss", "Tesla", 160, new BigDecimal(20000)));
        basketBallTeam.addPlayer(new Player("Nico", "Tesla", 160, new BigDecimal(200000)));

        //Wyświetlanie obiektów kolekcji SET
        basketBallTeam.presentingList(basketBallTeam);

        //Wywołanie metody convertToList na obiekcie basketBallTeam i przypisanie stworzonej tak listy do listPlayer
        listPlayers = basketBallTeam.convertToList();
        System.out.println(listPlayers);

        //Wywyłanie metody sort z przesłoniętą metodą compareTo - sortowanie po długości firstName
        Collections.sort(listPlayers);

        //Wyświetlenie listy posortowanej po długości firstName
        System.out.println(listPlayers);

        //Metoda w klasie EarningsComparator przesłonięta w celu porównywania earnings
        //Wywołanie metody sortByEarnings
        listPlayers = basketBallTeam.sortByEarnings(listPlayers);
        //Wyświetlenie listy posortowanej po earnings
        System.out.println(listPlayers);

        //Utworzenie obiektu do przechowania informacji o graczu z maksymalnym wynagrodzeniem
        Player playerWithMax = basketBallTeam.MaxEarnings();
        //Wyświetlenie obiektu z maksymalnymi zarobkami
        System.out.println(playerWithMax);

        //Lista zawodników posortowana alfabetycznie po firstName przy użyciu klasy ANONIMOWEJ
        listPlayers = basketBallTeam.AlphabeticFirstNameComparator();
        System.out.println(listPlayers);

        //Lista zawodników posortowana alfabetycznie po lastName przy użyciu comparatowa byLastName (LAMBDA)
        listPlayers=basketBallTeam.AlphabeticLastNameByLambdaComparator();
        System.out.println(listPlayers);

    }

}