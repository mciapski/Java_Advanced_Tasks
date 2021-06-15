package Collections.Workshop2;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;

public class Player implements Comparable<Player>{
    private String firstName;
    private String lastName;
    private int height;
    private BigDecimal earnings;

    public Player(String firstName, String lastName, int height, BigDecimal earnings) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.earnings=earnings;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }

    // Nadpisanie metod equals oraz hashcode w celu porównywania obiektów
    // Zbiór Set uniemożliwia dodawanie duplikatów ale trzeba przesłonić equals() i hashcode() w tym celu
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return height == player.height && firstName.equals(player.firstName) && lastName.equals(player.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height);
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height + '\'' +
                ", salary=" + earnings +
                '}';
    }
// Nadpisana metoda compareTo dla Comparable
// Porównuje długości FirstName
    @Override
    public int compareTo(Player o) {

        return -1*this.getFirstName().length()-o.getFirstName().length();
    }



}
