package Collections.Workshop2;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class BasketBallTeam {
    Set<Player> team = new HashSet<>();
    List<Player> listFromSet = new ArrayList<>();

    //Metoda dodająca zawodników
    //Posiada obsługę wyjątku InvalidPlayerException
    void addPlayer(Player player) throws InvalidPlayerException {
        if (player.getHeight() < 100 ||
                player.getHeight() > 220 ||
                player.getFirstName().isEmpty() ||
                player.getFirstName().isBlank() ||
                player.getLastName().isEmpty() ||
                player.getLastName().isBlank()) {
            throw new InvalidPlayerException();
        }
        team.add(player);
    }

    // Metoda zwracająca zbiór obiektów
    Set<Player> getPlayers() {
        return team;
    }

    // Metoda odpowiedzialnia za wyświetlanie kolekcji - alternatywa do toString
    public static void presentingList(BasketBallTeam basketBallTeam) {
        StringBuilder sb = new StringBuilder();
        for (Player player : basketBallTeam.getPlayers()) {
            sb.append(player.getFirstName()).append(" ").
                    append(player.getLastName()).append(" ").
                    append(player.getHeight()).append(" ").append(player.getEarnings()).append("\n");
        }
        System.out.println(sb);
    }

    //Metoda konwertująca zbiór SET na List
    public List<Player> convertToList() {
        listFromSet = team.stream().collect(Collectors.toList());
        return listFromSet;
    }
    // Długie rozwiązanie
    //Metoda sortująca z wykorzystaniem komparatora EarningsComparator
    public List<Player> sortByEarnings(List<Player> listSortedByEarnings) {
        convertToList();
        EarningsComparator earningsComparator = new EarningsComparator();
        Collections.sort(listFromSet, earningsComparator);
        listSortedByEarnings = listFromSet;
        return listSortedByEarnings;
    }

    //Metoda wskazująca na obiekt z maksymalnymi zarobkami z wykorzystaniem komparatora EarningsComparator
    public Player MaxEarnings() {
        convertToList();
        EarningsComparator earningsComparator = new EarningsComparator();
        Player playerWithMax = Collections.max(listFromSet, earningsComparator);
        return playerWithMax;
    }
    //Metoda inicjująca KLASĘ ANONIMOWĄ w celu stworzenia AlphabeticComparatora
    public List<Player> AlphabeticFirstNameComparator() {
        class AlphabeticComparator implements Comparator<Player> {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        }
        AlphabeticComparator alphabeticComparator = new AlphabeticComparator();
        listFromSet.sort(alphabeticComparator);
        return listFromSet;
    }
    // 1. Dłuższa wersja
    // Metoda definiująca nowy komparator za pomocą LAMBDY "byLastName" i sortująca alfabetycznie po nazwiskach
    public List<Player> AlphabeticLastNameByLambdaComparator(){
     Comparator<Player> byLastName = (Player player1,Player player2)->player1.getLastName().compareTo(player2.getLastName());
     //byLastName.reversed(); - Jako alternatywa dla odwróconej kolejności
     listFromSet.sort(byLastName);
     return listFromSet;
    }
    // 2. Krótsza wersja
    //Metoda sortująca po lastName i odwracająca kolejność
    public List<Player>  AlphabeticLastNameByLambdaReverse(){
        listFromSet.sort((o1, o2) -> (o2.getLastName().compareTo(o1.getLastName())));
        return listFromSet;
    }


    @Override
    public String toString() {
        return "BasketBallTeam{" +
                "team=" + team +
                '}';
    }

}
