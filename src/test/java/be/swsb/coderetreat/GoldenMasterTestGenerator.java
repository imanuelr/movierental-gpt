package be.swsb.coderetreat;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoldenMasterTestGenerator {

    private static final String GOLDEN_MASTER = "Rental Record for Alice\n" +
            "\tToy Story\t1.5\n" +
            "Amount owed is 1.5\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Bob\n" +
            "\tFinding Nemo\t3.0\n" +
            "Amount owed is 3.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Charlie\n" +
            "\tInterstellar\t3.0\n" +
            "Amount owed is 3.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Dana\n" +
            "\tJoker\t9.0\n" +
            "Amount owed is 9.0\n" +
            "You earned 2 frequent renter points\n" +
            "Rental Record for Evan\n" +
            "\tForrest Gump\t2.0\n" +
            "Amount owed is 2.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Fiona\n" +
            "\tThe Big Lebowski\t3.5\n" +
            "Amount owed is 3.5\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for George\n" +
            "\tToy Story\t1.5\n" +
            "\tAvengers: Endgame\t6.0\n" +
            "\tThe Godfather\t6.5\n" +
            "Amount owed is 14.0\n" +
            "You earned 4 frequent renter points\n" +
            "Rental Record for Hannah\n" +
            "Amount owed is 0.0\n" +
            "You earned 0 frequent renter points\n" +
            "Rental Record for Ian\n" +
            "\tCars\t1.5\n" +
            "Amount owed is 1.5\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Jill\n" +
            "\tGladiator\t2.0\n" +
            "Amount owed is 2.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Kyle\n" +
            "\tTenet\t30.0\n" +
            "Amount owed is 30.0\n" +
            "You earned 2 frequent renter points\n" +
            "Rental Record for Laura\n" +
            "\tFrozen\t12.0\n" +
            "Amount owed is 12.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Mike\n" +
            "\tThe Shawshank Redemption\t14.0\n" +
            "Amount owed is 14.0\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Nina\n" +
            "\tGroundhog Day\t2.0\n" +
            "\tGroundhog Day\t5.0\n" +
            "Amount owed is 7.0\n" +
            "You earned 2 frequent renter points\n" +
            "Rental Record for Oscar\n" +
            "\tA Bug's Life\t1.5\n" +
            "Amount owed is 1.5\n" +
            "You earned 1 frequent renter points\n" +
            "Rental Record for Patricia\n" +
            "\tMovie 0\t3.0\n" +
            "\tMovie 1\t6.0\n" +
            "\tMovie 2\t9.0\n" +
            "\tMovie 3\t3.0\n" +
            "\tMovie 4\t6.0\n" +
            "\tMovie 5\t9.0\n" +
            "\tMovie 6\t3.0\n" +
            "\tMovie 7\t6.0\n" +
            "\tMovie 8\t9.0\n" +
            "\tMovie 9\t3.0\n" +
            "\tMovie 10\t6.0\n" +
            "\tMovie 11\t9.0\n" +
            "\tMovie 12\t3.0\n" +
            "\tMovie 13\t6.0\n" +
            "\tMovie 14\t9.0\n" +
            "\tMovie 15\t3.0\n" +
            "\tMovie 16\t6.0\n" +
            "\tMovie 17\t9.0\n" +
            "\tMovie 18\t3.0\n" +
            "\tMovie 19\t6.0\n" +
            "\tMovie 20\t9.0\n" +
            "\tMovie 21\t3.0\n" +
            "\tMovie 22\t6.0\n" +
            "\tMovie 23\t9.0\n" +
            "\tMovie 24\t3.0\n" +
            "\tMovie 25\t6.0\n" +
            "\tMovie 26\t9.0\n" +
            "\tMovie 27\t3.0\n" +
            "\tMovie 28\t6.0\n" +
            "\tMovie 29\t9.0\n" +
            "\tMovie 30\t3.0\n" +
            "\tMovie 31\t6.0\n" +
            "\tMovie 32\t9.0\n" +
            "\tMovie 33\t3.0\n" +
            "\tMovie 34\t6.0\n" +
            "\tMovie 35\t9.0\n" +
            "\tMovie 36\t3.0\n" +
            "\tMovie 37\t6.0\n" +
            "\tMovie 38\t9.0\n" +
            "\tMovie 39\t3.0\n" +
            "\tMovie 40\t6.0\n" +
            "\tMovie 41\t9.0\n" +
            "\tMovie 42\t3.0\n" +
            "\tMovie 43\t6.0\n" +
            "\tMovie 44\t9.0\n" +
            "\tMovie 45\t3.0\n" +
            "\tMovie 46\t6.0\n" +
            "\tMovie 47\t9.0\n" +
            "\tMovie 48\t3.0\n" +
            "\tMovie 49\t6.0\n" +
            "\tMovie 50\t9.0\n" +
            "\tMovie 51\t3.0\n" +
            "\tMovie 52\t6.0\n" +
            "\tMovie 53\t9.0\n" +
            "\tMovie 54\t3.0\n" +
            "\tMovie 55\t6.0\n" +
            "\tMovie 56\t9.0\n" +
            "\tMovie 57\t3.0\n" +
            "\tMovie 58\t6.0\n" +
            "\tMovie 59\t9.0\n" +
            "\tMovie 60\t3.0\n" +
            "\tMovie 61\t6.0\n" +
            "\tMovie 62\t9.0\n" +
            "\tMovie 63\t3.0\n" +
            "\tMovie 64\t6.0\n" +
            "\tMovie 65\t9.0\n" +
            "\tMovie 66\t3.0\n" +
            "\tMovie 67\t6.0\n" +
            "\tMovie 68\t9.0\n" +
            "\tMovie 69\t3.0\n" +
            "\tMovie 70\t6.0\n" +
            "\tMovie 71\t9.0\n" +
            "\tMovie 72\t3.0\n" +
            "\tMovie 73\t6.0\n" +
            "\tMovie 74\t9.0\n" +
            "\tMovie 75\t3.0\n" +
            "\tMovie 76\t6.0\n" +
            "\tMovie 77\t9.0\n" +
            "\tMovie 78\t3.0\n" +
            "\tMovie 79\t6.0\n" +
            "\tMovie 80\t9.0\n" +
            "\tMovie 81\t3.0\n" +
            "\tMovie 82\t6.0\n" +
            "\tMovie 83\t9.0\n" +
            "\tMovie 84\t3.0\n" +
            "\tMovie 85\t6.0\n" +
            "\tMovie 86\t9.0\n" +
            "\tMovie 87\t3.0\n" +
            "\tMovie 88\t6.0\n" +
            "\tMovie 89\t9.0\n" +
            "\tMovie 90\t3.0\n" +
            "\tMovie 91\t6.0\n" +
            "\tMovie 92\t9.0\n" +
            "\tMovie 93\t3.0\n" +
            "\tMovie 94\t6.0\n" +
            "\tMovie 95\t9.0\n" +
            "\tMovie 96\t3.0\n" +
            "\tMovie 97\t6.0\n" +
            "\tMovie 98\t9.0\n" +
            "\tMovie 99\t3.0\n" +
            "Amount owed is 597.0\n" +
            "You earned 166 frequent renter points\n";
    
    @Test
    public void testAgainstGoldenMaster() {
        String generatedData = generateGoldenMaster();
        System.out.println(generatedData);
        assertThat(generatedData).isEqualTo(GOLDEN_MASTER);
    }

    public String generateGoldenMaster() {
        String result = "";
        // Children's Movie, Short Rental
        Customer customer1 = new Customer("Alice");
        customer1.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 1));
        result += customer1.statement() + "\n";

        // Children's Movie, Long Rental
        Customer customer2 = new Customer("Bob");
        customer2.addRental(new Rental(new Movie("Finding Nemo", Movie.CHILDRENS), 4));
        result += customer2.statement() + "\n";

        // New Release, Single Day
        Customer customer3 = new Customer("Charlie");
        customer3.addRental(new Rental(new Movie("Interstellar", Movie.NEW_RELEASE), 1));
        result += customer3.statement() + "\n";

        // New Release, Multiple Days
        Customer customer4 = new Customer("Dana");
        customer4.addRental(new Rental(new Movie("Joker", Movie.NEW_RELEASE), 3));
        result += customer4.statement() + "\n";

        // Regular Movie, Short Rental
        Customer customer5 = new Customer("Evan");
        customer5.addRental(new Rental(new Movie("Forrest Gump", Movie.REGULAR), 2));
        result += customer5.statement() + "\n";

        // Regular Movie, Long Rental
        Customer customer6 = new Customer("Fiona");
        customer6.addRental(new Rental(new Movie("The Big Lebowski", Movie.REGULAR), 3));
        result += customer6.statement() + "\n";

        // Mixed Categories, Various Days
        Customer customer7 = new Customer("George");
        customer7.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 3));
        customer7.addRental(new Rental(new Movie("Avengers: Endgame", Movie.NEW_RELEASE), 2));
        customer7.addRental(new Rental(new Movie("The Godfather", Movie.REGULAR), 5));
        result += customer7.statement() + "\n";

        // Customer with no rentals
        Customer customer8 = new Customer("Hannah");
        result += customer8.statement() + "\n";

        // Boundary condition tests
        // Children's movie exactly at pricing tier change (3 days)
        Customer customer9 = new Customer("Ian");
        customer9.addRental(new Rental(new Movie("Cars", Movie.CHILDRENS), 3));
        result += customer9.statement() + "\n";

        // Regular movie exactly at pricing tier change (2 days)
        Customer customer10 = new Customer("Jill");
        customer10.addRental(new Rental(new Movie("Gladiator", Movie.REGULAR), 2));
        result += customer10.statement() + "\n";

        // Very long rental (new release)
        Customer customer11 = new Customer("Kyle");
        customer11.addRental(new Rental(new Movie("Tenet", Movie.NEW_RELEASE), 10));
        result += customer11.statement() + "\n";

        // Very long rental (children's)
        Customer customer12 = new Customer("Laura");
        customer12.addRental(new Rental(new Movie("Frozen", Movie.CHILDRENS), 10));
        result += customer12.statement() + "\n";

        // Very long rental (regular)
        Customer customer13 = new Customer("Mike");
        customer13.addRental(new Rental(new Movie("The Shawshank Redemption", Movie.REGULAR), 10));
        result += customer13.statement() + "\n";

        // Multiple rentals of the same movie
        Customer customer14 = new Customer("Nina");
        Movie sharedMovie = new Movie("Groundhog Day", Movie.REGULAR);
        customer14.addRental(new Rental(sharedMovie, 2));
        customer14.addRental(new Rental(sharedMovie, 4));
        result += customer14.statement() + "\n";

        // Rental duration of 0 days
        Customer customer15 = new Customer("Oscar");
        customer15.addRental(new Rental(new Movie("A Bug's Life", Movie.CHILDRENS), 0));
        result += customer15.statement() + "\n";

        // High volume of rentals
        Customer customer16 = new Customer("Patricia");
        for (int i = 0; i < 100; i++) {
            customer16.addRental(new Rental(new Movie("Movie " + i, Movie.NEW_RELEASE), i % 3 + 1));
        }
        result += customer16.statement() + "\n";

        return result;
    }

}