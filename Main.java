import Objects.Person;
import Utils.HackerCheck;

class Main {
    public static void main(String args[]) {
        Person marius = init("Marius", "Sørensen", 24);
        Person sindre = init("Sindre", "Haavaldsen", 25);

        marius.setHackerPoints(13);
        sindre.setHackerPoints(9);

        printInfo(marius);
        checkIfHacker(marius);

        printInfo(sindre);
        checkIfHacker(sindre);
    }

    private static Person init(String firstname, String lastName, int age) {
        return new Person(firstname, lastName, age);
    }

    private static void printInfo(Person person) {
        System.out.println(person.toString());
    }

    private static void checkIfHacker(Person person) {
        HackerCheck hackerCheck = new HackerCheck();

        System.out.println(
                hackerCheck.ishacker(person.getHackerPoints())
                        ? person.getFirstName() + " er en hackerboi" + "\n" + "\n"
                        : person.getFirstName() + " er ikke en hackerboi" + "\n" + "\n"
        );
    }
}
