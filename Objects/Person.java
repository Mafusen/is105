package Objects;

public class Person {
    private String firstName, lastName;
    private int age;
    private int hackerPoints;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHackerPoints(int hackerPoints) {
        this.hackerPoints = hackerPoints;
    }

    public int getHackerPoints() {
        return hackerPoints;
    }

    @Override
    public String toString() {
        return "Personinfo " + "\n" +
                "Navn: " + firstName + " " + lastName + "\n" +
                "Alder: " + age + "\n" +
                "Hackerpoeng: " + hackerPoints + "\n";
    }
}
